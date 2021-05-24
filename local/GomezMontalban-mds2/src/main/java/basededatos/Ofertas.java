package basededatos;

import java.util.ArrayList;
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
					basededatos.ProductoDAO.getProductoByORMID(producto.getORMID()).setPrecio(producto.getPrecio() * 100 / (100 - producto.getTiene_una_oferta().getPrecio_oferta()));
					int idOferta = producto.getTiene_una_oferta().getORMID();
					basededatos.ProductoDAO.getProductoByORMID(producto.getORMID()).setTiene_una_oferta(null);;
					basededatos.OfertaDAO.delete(OfertaDAO.getOfertaByORMID(idOferta));
					pt.commit();
				}
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}


	public Producto[] cargar_oferta_producto() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();

		try {
			ArrayList<Producto> productos_con_oferta = new ArrayList<Producto>();
			Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
			for (Producto producto : productos) {
				if (producto.getTiene_una_oferta() != null) {
					productos_con_oferta.add(producto);

					pt.commit();
				}
			}
			
			Producto[] resultado = new Producto[productos_con_oferta.size()];
			for(int i = 0; i < productos_con_oferta.size(); i++) {
				resultado[i] = productos_con_oferta.get(i);
			}
			return resultado;
		} catch (PersistentException e) {
			pt.rollback();
			e.printStackTrace();
			return null;
		}
		
	}
}