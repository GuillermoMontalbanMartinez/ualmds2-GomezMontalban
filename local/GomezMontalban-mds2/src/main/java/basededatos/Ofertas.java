package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Oferta;

public class Ofertas {
	public BDPrincipal _db_main_ofertas;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public Oferta[] cargar_ofertas() throws PersistentException {
//		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
//		List nombreProductosOfertados = null;
//		Oferta oferta[] = null;
//		try {
//			nombreProductosOfertados = basededatos.OfertaDAO.queryOferta(null, null);
//			oferta = new Oferta[nombreProductosOfertados.size()];
//			
//			for (int i = 0; i < oferta.length; i++) {
//				oferta[i].get = (Oferta) nombreProductosOfertados.
//			}
//			
//			pt.commit();
//		} catch(Exception e) {
//			pt.rollback();
//		}
//		
//		return oferta;
		throw new UnsupportedOperationException();
	}
	

	public void Alta_oferta_producto(int aId_producto, int aDescuento, String aFechaLimite) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Oferta oferta = basededatos.OfertaDAO.createOferta();
			Producto producto = basededatos.ProductoDAO.loadProductoByORMID(aId_producto);
			oferta.setEsta_asociada_a_un_producto(producto);
			oferta.getEsta_asociada_a_un_producto().setPrecio(oferta.getEsta_asociada_a_un_producto().getPrecio() - (oferta.getEsta_asociada_a_un_producto().getPrecio()*((double)aDescuento/100)));
			oferta.setPrecio_oferta(aDescuento);
			oferta.setFecha(aFechaLimite);
			basededatos.OfertaDAO.save(oferta);
			pt.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
	
	public void Baja_oferta_producto(String nombreProducto) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
			for (Producto producto : productos) {
				if (producto.getNombre().equals(nombreProducto) && producto.getTiene_una_oferta() != null) {
					basededatos.OfertaDAO.delete(producto.getTiene_una_oferta());
					pt.commit();
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	
//	public void Baja_producto(String nombreProducto) throws PersistentException {
//		try {
//			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
//			Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
//			for (Producto producto : productos) {
//				if (producto.getNombre().equals(nombreProducto)) {
//					if(producto.getTiene_una_oferta()==null) {
//						basededatos.ProductoDAO.delete(producto);
//						pt.commit();
//					} else {
//						Oferta oferta = producto.getTiene_una_oferta();
//						basededatos.OfertaDAO.delete(oferta);
//						basededatos.ProductoDAO.delete(producto);
//						pt.commit();						
//					}
//					
//				}
//			}
//			
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
//	}
	
}