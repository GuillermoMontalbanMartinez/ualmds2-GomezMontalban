package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Compra_enviada;

public class Compras_enviadas {
	public BDPrincipal _db_main_compras_enviadas;
	public Vector<Compra_enviada> _contiene_compras_enviadas = new Vector<Compra_enviada>();

	public Compra_enviada[] cargar_compras_enviadas() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		List idsComprasEnviadas = null;
		Compra_enviada[] comprasEnviadas = null;
		try {
			idsComprasEnviadas = basededatos.Compra_enviadaDAO.queryCompra_enviada(null, null);
			comprasEnviadas = new Compra_enviada[idsComprasEnviadas.size()];

			for (int i = 0; i < comprasEnviadas.length; i++) {
				comprasEnviadas[i] = (Compra_enviada) idsComprasEnviadas.get(i);
			}
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}

		return comprasEnviadas;
	}

	public void Enviar_producto(int aId_compra) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Compra_recibida compraRecibida = basededatos.Compra_recibidaDAO.loadCompra_recibidaByORMID(aId_compra);
			Compra_enviada compraEnviada = basededatos.Compra_enviadaDAO.createCompra_enviada();
			compraRecibida.setEstado_compra(3);
			compraEnviada.setFecha_compra(compraRecibida.getFecha_compra());
			compraEnviada.setTiene_asociado_un_cibernauta_registrado(compraRecibida.getTiene_asociado_un_cibernauta_registrado());
			System.out.println(compraRecibida.getTiene_item());
			compraEnviada.setPrecio_compra(compraRecibida.getPrecio_compra());
			compraEnviada.setTiene_item(compraRecibida.getTiene_item());
			compraEnviada.setTotal_productos(compraRecibida.getTotal_productos());
			compraEnviada.setEstado_compra(3);
			compraEnviada.setFecha_envio(compraRecibida.getFecha_compra());
			
			basededatos.Compra_enviadaDAO.save(compraEnviada);
			basededatos.Compra_recibidaDAO.deleteAndDissociate(compraRecibida);

			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public basededatos.Compra[] cargar_productos_comprados_recientemente(int id_usuario) throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		Compra[] resultado = null;
		try {
			Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO
					.loadCibernauta_registradoByORMID(id_usuario);
			Compra compras[] = basededatos.CompraDAO.listCompraByQuery(null, null);
			ArrayList<Compra> comprasAsociadas = new ArrayList<Compra>();
			
			for (Compra c : compras) {
				if (c.getTiene_asociado_un_cibernauta_registrado().equals(cb)) {
					if (c.getEstado_compra() ==2) {
						comprasAsociadas.add(c);
					}
				}

			}
			resultado = new Compra[comprasAsociadas.size()];
			for (int i = 0; i < comprasAsociadas.size(); i++) {
				resultado[i] =comprasAsociadas.get(i);
			}
			pt.commit();
			return resultado;
		} catch (Exception e) {
			pt.rollback();
			e.printStackTrace();
			return null;
		}

		
	}

}