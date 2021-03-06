package basededatos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cibernauta_registrado;

public class Cibernautas_registrados {
	public BDPrincipal _bd_main_cibernautas_registrados;
	public Vector<Cibernauta_registrado> _contiene_cibernauta_registrados = new Vector<Cibernauta_registrado>();

	public Cibernauta_registrado cargar_ficha_cliente(int aId_usuario) throws PersistentException {
		return basededatos.Cibernauta_registradoDAO.loadCibernauta_registradoByORMID(aId_usuario);
	}

	public void Registro(String aNombre, String aApellidos, String aCorreo, String aContrasena, String aContrasena_rep,
			String aTelefono, String aPais, String aLocalidad, String aCalle, String aPortal, String aProvincia,
			int aCodigo_postal, String aN_tarjeta, String aTitular, String aFecha_caducidad, int aCvv,
			String aFoto_perfil) throws PersistentException {
		Date fecha = new Date();
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Cibernauta_registrado cibernautaRegistrado = basededatos.Cibernauta_registradoDAO
					.createCibernauta_registrado();
			cibernautaRegistrado.setNombre(aNombre);
			cibernautaRegistrado.setApellidos(aApellidos);
			cibernautaRegistrado.setCorreo_electronico(aCorreo);
			cibernautaRegistrado.setContrasena(aContrasena);
			cibernautaRegistrado.setTelefono(aTelefono);
			cibernautaRegistrado.setPais(aPais);
			cibernautaRegistrado.setLocalidad(aLocalidad);
			cibernautaRegistrado.setCalle(aCalle);
			cibernautaRegistrado.setPortal(aPortal);
			cibernautaRegistrado.setProvincia(aProvincia);
			cibernautaRegistrado.setCp(aCodigo_postal);
			cibernautaRegistrado.setNumero_tarjeta_credito(aN_tarjeta);
			cibernautaRegistrado.setNombre_titular_tarjeta(aTitular);
			cibernautaRegistrado.setFecha_caducidad(aFecha_caducidad);
			cibernautaRegistrado.setCvv(aCvv);
			cibernautaRegistrado.setFecha_creacion_usuario(fecha.toString());
			basededatos.Cibernauta_registradoDAO.save(cibernautaRegistrado);
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public int login(String user, String password) throws PersistentException {
		int id = -1;
		List<Cibernauta_registrado> registrados = basededatos.Cibernauta_registradoDAO.queryCibernauta_registrado(null,
				null);
		for (Cibernauta_registrado c : registrados) {
			if (c.getNombre().toString().equals(user) && c.getContrasena().toString().equals(password)) {
				id = 3;
			}
		}
		List<Empresa_de_transportes> transportes = basededatos.Empresa_de_transportesDAO
				.queryEmpresa_de_transportes(null, null);
		for (Empresa_de_transportes a : transportes) {
			if (a.getNombre().toString().equals(user) && a.getContrasena().toString().equals(password)) {
				id = 1;
			}
		}
		List<Encargado_de_compras> compras = basededatos.Encargado_de_comprasDAO.queryEncargado_de_compras(null, null);
		for (Encargado_de_compras c : compras) {
			if (c.getNombre().toString().equals(user) && c.getContrasena().toString().equals(password)) {
				id = 2;
			}
		}
		List<Administrador> admin = basededatos.AdministradorDAO.queryAdministrador(null, null);
		for (Administrador a : admin) {
			if (a.getNombre().toString().equals(user) && a.getContrasena().toString().equals(password)) {
				id = 0;
			}
		}

		return id;
	}

	public void modificar_datos_personales(String nombreUsuario, String apellidos, String correo, String contrasena,
			String repetirContrasena, String telefono, String Pais, String localidad, String calle, String portal,
			String provincia, int codigoPostal, String numeroTarjeta, String titularTarjeta, String fechaCaducidad,
			int cvv, String img, int id) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			System.out.println(id);
			Cibernauta_registrado cb = Cibernauta_registradoDAO.loadCibernauta_registradoByORMID(id);

			if (contrasena.equals(repetirContrasena)) {
				cb.setNombre(nombreUsuario);
				cb.setApellidos(apellidos);
				cb.setCorreo_electronico(correo);
				cb.setContrasena(contrasena);
				cb.setTelefono(telefono);
				cb.setPais(Pais);
				cb.setLocalidad(localidad);
				cb.setCalle(calle);
				cb.setPortal(portal);
				cb.setProvincia(provincia);
				cb.setCp(codigoPostal);
				cb.setNumero_tarjeta_credito(numeroTarjeta);
				cb.setNombre_titular_tarjeta(titularTarjeta);
				if (fechaCaducidad != null)
					cb.setFecha_caducidad(fechaCaducidad);
				cb.setCvv(cvv);
				basededatos.Cibernauta_registradoDAO.save(cb);
			}
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public void BajaCuentaCibernautaRegistrado(int idUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();

		try {
			List<Compra> compras = basededatos.CompraDAO.queryCompra(null, null);

			for (Compra c : compras) {
				if (idUsuario == c.getTiene_asociado_un_cibernauta_registrado().getORMID()) {
					int count = 0;
					Item item = c.getTiene_item();

					Producto p = item.getEsta_asociado_a_un_producto();

					for (Foto f : basededatos.FotoDAO.listFotoByQuery(null, null)) {
						if (f.getEsta_asociada_a_un_producto().equals(p)) {
							basededatos.FotoDAO.deleteAndDissociate(f);
						}
					}
					ProductoDAO.deleteAndDissociate(p);
					basededatos.CompraDAO.deleteAndDissociate(c);
					basededatos.ItemDAO.deleteAndDissociate(item);

				}
			}

			basededatos.Cibernauta_registradoDAO.deleteAndDissociate(
					basededatos.Cibernauta_registradoDAO.loadCibernauta_registradoByORMID(idUsuario));

			t.commit();

		} catch (PersistentException e) {
			t.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public Compra[] cargar_seguimiento_de_pedido(int idUsuario) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Cibernauta_registrado cibernautaRegistrado = basededatos.Cibernauta_registradoDAO
					.loadCibernauta_registradoByORMID(idUsuario);

			Compra c[] = basededatos.CompraDAO.listCompraByQuery(null, null);
			ArrayList<Compra> aux = new ArrayList<Compra>();
			for (Compra compra : c) {
				if (compra.getTiene_asociado_un_cibernauta_registrado().equals(cibernautaRegistrado)) {
					aux.add(compra);
				}
			}

			Compra resultado[] = new Compra[aux.size()];
			for (int i = 0; i < aux.size(); i++) {
				resultado[i] = aux.get(i);
			}
			pt.commit();
			return resultado;
		} catch (Exception e) {
			pt.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
		return null;
	}

	public void cancelarPedido(int aId_compra) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Producto p = basededatos.ProductoDAO.loadProductoByORMID(aId_compra);

			Compra c = basededatos.CompraDAO
					.loadCompraByORMID(p.getTiene_item().getEsta_asociado_a_una_compra().getORMID());
			if (c.getEstado_compra() < 2) {

				for (Foto f : basededatos.FotoDAO.listFotoByQuery(null, null)) {
					if (f.getEsta_asociada_a_un_producto().getORMID() == p.getORMID()) {

						basededatos.FotoDAO.deleteAndDissociate(f);
					}
				}
				Item item = c.getTiene_item();

				basededatos.ProductoDAO.deleteAndDissociate(p);
				basededatos.CompraDAO.deleteAndDissociate(c);
				basededatos.ItemDAO.deleteAndDissociate(item);

				pt.commit();
			}
		} catch (Exception e) {
			pt.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

}