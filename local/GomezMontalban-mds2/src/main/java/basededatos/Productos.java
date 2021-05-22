package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.hibernate.tuple.entity.AbstractEntityBasedAttribute;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Producto;

public class Productos {
	public BDPrincipal _db_main_productos;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public Producto[] cargar_lista_productos_admin() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Producto> cargar_productos_catalogo() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		Producto[] products = basededatos.ProductoDAO.listProductoByQuery(null, null);
		ArrayList<Producto> producto = new ArrayList<Producto>();
		try {

			if (producto.size() == 0) {
				producto.add(products[0]);

			}
			boolean repe = false;
			for (Producto p : products) {
				for (int i = 0; i < producto.size(); i++) {
					if (p.getNombre().equals(producto.get(i).getNombre())
							&& (p.getPrecio() == producto.get(i).getPrecio()
									&& p.getDescripción().equals(producto.get(i).getDescripción()))) {
						repe = true;

					}

				}
				if (!repe)
					producto.add(p);
				repe = false;
			}

			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}

		return producto;
	}

	public Producto[] cargar_productos_mas_vendidos() {
		throw new UnsupportedOperationException();
	}

	public void Baja_producto(String nombreProducto) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();
			Producto productos[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
			for (Producto producto : productos) {
				if (producto.getNombre().equals(nombreProducto)) {
					if (producto.getTiene_una_oferta() == null) {
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

	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, String aFoto1, String aFoto2,
			String aFoto3, String aFoto4, String aFoto5, String categoria) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();

			Producto producto = basededatos.ProductoDAO.createProducto();
			Categoria[] categorias = basededatos.CategoriaDAO.listCategoriaByQuery(null, null);

			for (Categoria cat : categorias) {
				if (cat.getNombre().equals(categoria)) {
					producto.setCategoria(cat);
				}
			}

			producto.setNombre(aNombre);
			producto.setDescripción(aDescripcion);
			producto.setPrecio(aPrecio);

			basededatos.ProductoDAO.save(producto);

			asociar_foto(producto, aFoto1);
			asociar_foto(producto, aFoto2);
			asociar_foto(producto, aFoto3);
			asociar_foto(producto, aFoto4);
			asociar_foto(producto, aFoto5);
			pt.commit();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public Producto[] cargar_productos() throws PersistentException {
		PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		List nombreProductos = null;
		Producto producto[] = null;
		try {
			nombreProductos = basededatos.ProductoDAO.queryProducto(null, null);
			producto = new Producto[nombreProductos.size()];

			for (int i = 0; i < producto.length; i++) {
				producto[i] = (Producto) nombreProductos.get(i);
			}
			pt.commit();
		} catch (Exception e) {
			pt.rollback();
		}
		return producto;

	}

	public void asociar_foto(Producto producto, String link) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();

			Foto foto =  basededatos.FotoDAO.createFoto();
			foto.setLink_foto(link);
			foto.setEsta_asociada_a_un_producto(basededatos.ProductoDAO.getProductoByORMID(producto.getORMID()));
			basededatos.FotoDAO.save(foto);
			pt.commit();
			System.out.println("si");

		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
}