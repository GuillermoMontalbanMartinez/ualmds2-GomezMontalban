package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Producto;
public class Productos {
	public BDPrincipal _db_main_productos;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public Producto[] cargar_lista_productos_admin() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_catalogo() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		List idsProductos = null;
		Producto producto[] = null;
		try {
			idsProductos =  basededatos.CategoriaDAO.queryCategoria(null, null);
			producto = new Producto[idsProductos.size()];
			
			for(int i = 0; i < producto.length; i++) {
				producto[i] = (Producto) idsProductos.get(i);
			}
			pt.commit();
		} catch(Exception e) {
			pt.rollback();
		}

		return producto;
	}

	public Producto[] cargar_productos_mas_vendidos() {
		throw new UnsupportedOperationException();
	}

	
	public void Baja_producto(String nombreProducto) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
			for (Producto producto : productos) {
				if (producto.getNombre().equals(nombreProducto)) {
					if(producto.getTiene_una_oferta()==null) {
						basededatos.ProductoDAO.delete(producto);
						pt.commit();
					} else {
						Oferta oferta = producto.getTiene_una_oferta();
						basededatos.OfertaDAO.delete(oferta);
						basededatos.ProductoDAO.delete(producto);
						pt.commit();						
					}
					
				}
			}
			
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, int aId_producto, String aFoto1, String aFoto2, String aFoto3, String aFoto4_, String aFoto5) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Producto producto = basededatos.ProductoDAO.createProducto();
			producto.setNombre(aNombre);
			producto.setDescripción(aDescripcion);
			producto.setPrecio(aPrecio);
			basededatos.ProductoDAO.save(producto);
			pt.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();	
	}

	public Producto[] cargar_productos() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		List nombreProductos = null;
		Producto producto[] = null;
		try {
			nombreProductos =  basededatos.ProductoDAO.queryProducto(null, null);
			producto = new Producto[nombreProductos.size()];
			
			for(int i = 0; i < producto.length; i++) {
				producto[i] = (Producto) nombreProductos.get(i);
			}
			pt.commit();
		} catch(Exception e) {
			pt.rollback();
		}
		return producto;
		
	}
	
}