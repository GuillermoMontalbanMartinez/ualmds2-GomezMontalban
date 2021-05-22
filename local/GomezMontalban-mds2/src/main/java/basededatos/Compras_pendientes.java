package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Compra_pendiente;

public class Compras_pendientes {
	public BDPrincipal _db_main_compras_pendientes;
	public Vector<Compra_pendiente> _contiene_compras_pendientes = new Vector<Compra_pendiente>();
	
	public Compra_pendiente[] cargar_pedidos_a_entregar() {
		throw new UnsupportedOperationException();
	}

	public void confirmar_compra(int aId_compra) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Compra compra = basededatos.CompraDAO.loadCompraByORMID(aId_compra);
			Compra_pendiente c = basededatos.Compra_pendienteDAO.createCompra_pendiente();
			compra.setEstado_compra(1);
			c.setFecha_compra(compra.getFecha_compra());
			c.setTiene_asociado_un_cibernauta_registrado(compra.getTiene_asociado_un_cibernauta_registrado());
			c.setPrecio_compra(compra.getPrecio_compra());
			c.setTiene_item(compra.getTiene_item());
			c.setTotal_productos(compra.getTotal_productos());
			c.setEstado_compra(1);
			c.setFecha_envio(compra.getFecha_compra());
			
			basededatos.Compra_pendienteDAO.save(c);
			basededatos.CompraDAO.deleteAndDissociate(compra);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
		
		
	}
}