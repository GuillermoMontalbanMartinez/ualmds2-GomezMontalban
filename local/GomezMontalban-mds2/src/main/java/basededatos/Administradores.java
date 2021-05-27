package basededatos;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;

public class Administradores {
	public BDPrincipal _bd_main_administradores;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario, String apellidos)
			throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		Date fecha = new Date();

		try {

			switch (aTipoDeUsuario) {

			case 0:
				Administrador ad = basededatos.AdministradorDAO.createAdministrador();
				ad.setNombre(aNombre);
				ad.setCorreo_electronico(aCorreo);
				ad.setContrasena(aContrasena);
				ad.setFecha_creacion_usuario(fecha.toString());
				ad.setApellidos(apellidos);
				basededatos.AdministradorDAO.save(ad);

				break;

			case 1:
				Empresa_de_transportes et = basededatos.Empresa_de_transportesDAO.createEmpresa_de_transportes();
				et.setNombre(aNombre);
				et.setCorreo_electronico(aCorreo);
				et.setContrasena(aContrasena);
				et.setFecha_creacion_usuario(fecha.toString());
				et.setApellidos(apellidos);
				basededatos.Empresa_de_transportesDAO.save(et);
				break;

			case 2:
				Encargado_de_compras ec = basededatos.Encargado_de_comprasDAO.createEncargado_de_compras();
				ec.setNombre(aNombre);
				ec.setCorreo_electronico(aCorreo);
				ec.setContrasena(aContrasena);
				ec.setFecha_creacion_usuario(fecha.toString());
				ec.setApellidos(apellidos);
				basededatos.Encargado_de_comprasDAO.save(ec);
				break;

			case 3:
				Cibernauta_registrado cr = basededatos.Cibernauta_registradoDAO.createCibernauta_registrado();
				cr.setNombre(aNombre);
				cr.setCorreo_electronico(aCorreo);
				cr.setContrasena(aContrasena);
				cr.setFecha_creacion_usuario(fecha.toString());
				cr.setApellidos(apellidos);
				basededatos.Cibernauta_registradoDAO.save(cr);
				break;

			default:
				break;
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			switch (aTipoDeUsuario) {

			case 0:
				Administrador[] ad = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
				for (Administrador a : ad) {
					if (a.getCorreo_electronico().toString().equals(aCorreo)) {
						basededatos.AdministradorDAO.delete(a);
						t.commit();
					}
				}

				break;

			case 1:
				Empresa_de_transportes[] et = basededatos.Empresa_de_transportesDAO
						.listEmpresa_de_transportesByQuery(null, null);
				for (Empresa_de_transportes e : et) {
					if (e.getCorreo_electronico().toString().equals(aCorreo)) {
						basededatos.Empresa_de_transportesDAO.delete(e);
						t.commit();
					}
				}

				break;

			case 2:
				Encargado_de_compras[] ec = basededatos.Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null,
						null);
				for (Encargado_de_compras e : ec) {
					if (e.getCorreo_electronico().toString().equals(aCorreo)) {
						basededatos.Encargado_de_comprasDAO.delete(e);
						t.commit();
					}
				}
				break;

			case 3:
				Cibernauta_registrado[] cb = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null,
						null);
				for (Cibernauta_registrado c : cb) {
					if (c.getCorreo_electronico().toString().equals(aCorreo)) {
						basededatos.Cibernauta_registradoDAO.delete(c);
						t.commit();
					}
				}
				break;

			default:
				break;
			}

		} catch (Exception e) {
			t.rollback();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public Compra[] cargar_listado_compras_admin() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		Compra compras[] = null;
		try {

			compras = basededatos.CompraDAO.listCompraByQuery(null, null);

			pt.commit();
		} catch (Exception e) {
			pt.rollback();
			e.printStackTrace();
		}

		return compras;
	}

}