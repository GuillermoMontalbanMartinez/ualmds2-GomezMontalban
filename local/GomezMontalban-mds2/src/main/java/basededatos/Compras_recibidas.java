package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Compra_recibida;
import interfaz.Acceder_al_catalogo;
import interfaz.Banner_registrado;
import interfaz.Producto;

public class Compras_recibidas  {
	public BDPrincipal _db_main_compras_recibidas;
	public Vector<Compra_recibida> _contiene_compras_enviadas = new Vector<Compra_recibida>();
	

	public Compra_recibida[] cargar_compras() {
		throw new UnsupportedOperationException();
	}

	public Compra_recibida[] cargar_pedidos_entregados() {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargar_lista_compras_admin() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_compra(int aId_compra) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		
//		Compra compra = basededatos.CompraDAO.loadCompraByORMID(aId_compra);
//		Compra_pendiente c = basededatos.Compra_pendienteDAO.createCompra_pendiente();
//		compra.setEstado_compra(1);
//		c.setFecha_compra(compra.getFecha_compra());
//		c.setTiene_asociado_un_cibernauta_registrado(compra.getTiene_asociado_un_cibernauta_registrado());
//		c.setPrecio_compra(compra.getPrecio_compra());
//		c.setTiene_item(compra.getTiene_item());
//		c.setTotal_productos(compra.getTotal_productos());
//		c.setEstado_compra(1);
//		c.setFecha_envio(compra.getFecha_compra());

		try {
			Compra_pendiente comprasPendiente = basededatos.Compra_pendienteDAO.loadCompra_pendienteByORMID(aId_compra);
			System.out.println(comprasPendiente.getORMID() + "compraPendiente");
			Compra_recibida compraRecibida = basededatos.Compra_recibidaDAO.createCompra_recibida();
			System.out.println(compraRecibida.getORMID() + "compraRecibida");
			comprasPendiente.setEstado_compra(2);
			compraRecibida.setFecha_compra(comprasPendiente.getFecha_compra());
			compraRecibida.setTiene_asociado_un_cibernauta_registrado(
					comprasPendiente.getTiene_asociado_un_cibernauta_registrado());
			compraRecibida.setPrecio_compra(comprasPendiente.getPrecio_compra());
			compraRecibida.setTiene_item(comprasPendiente.getTiene_item());
			compraRecibida.setTotal_productos(comprasPendiente.getTotal_productos());
			compraRecibida.setEstado_compra(2);
			compraRecibida.setFecha_envio(comprasPendiente.getFecha_compra());

			basededatos.Compra_recibidaDAO.save(compraRecibida);
			basededatos.Compra_pendienteDAO.deleteAndDissociate(comprasPendiente);
			t.commit();

		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public Compra[] cargar_listado_de_compras_admin() {
		throw new UnsupportedOperationException();
	}
}