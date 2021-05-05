package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Oferta;

public class Ofertas {
	public BDPrincipal _db_main_ofertas;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_categoria(int aId_categoria, int aDescuento, String aFechaLimite) {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_producto(int aId_producto, int aDescuento, String aFechaLimite) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Oferta oferta = basededatos.OfertaDAO.createOferta();
			Producto producto = basededatos.ProductoDAO.loadProductoByORMID(aId_producto);
			oferta.setEsta_asociada_a_un_producto(producto);
			oferta.getEsta_asociada_a_un_producto().setPrecio(oferta.getEsta_asociada_a_un_producto().getPrecio()*((double)aDescuento/100));
			oferta.setPrecio_oferta(aDescuento);
			oferta.setFecha(aFechaLimite);
			basededatos.OfertaDAO.save(oferta);
			pt.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
}