package basededatos;

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

	public Producto[] cargar_productos_catalogo() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_mas_vendidos() {
		throw new UnsupportedOperationException();
	}

	public void Baja_producto(int aId_producto) {
		throw new UnsupportedOperationException();
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
}