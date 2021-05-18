package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Producto;
import vistas.VistaAccederAlCatalogoAdmin;

public class Acceder_al_catalogo_admin extends VistaAccederAlCatalogoAdmin {
	public Buscar_producto_admin _buscar_producto_admin;
	public Categorias_admiin _categorias_admin;
	public Productos_catalogo_admin _productos_catalogo_admin;
	public VerticalLayout listaProductos;
	ArrayList<Producto> productos;
	ArrayList<interfaz.Producto> vista_productos;
	private String usuario;

	public Acceder_al_catalogo_admin() {
		listaProductos = this.getLayoutProductosCatalogoAdmin();
		vista_productos = new ArrayList<interfaz.Producto>();

		try {
			mostrar_productos_admin();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrar_productos_admin() throws PersistentException {
		productos = new ArrayList<Producto>();
		cargar_productos_admin();
		for (Producto p : productos) {
			interfaz.Producto producto = new interfaz.Producto(p.getNombre(), p.getDescripción(),
					String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
			listaProductos.add(producto);
			vista_productos.add(producto);
		}

	}

	public void cargar_productos_admin() throws PersistentException {
		Producto[] productosArray = basededatos.ProductoDAO.listProductoByQuery(null, null);

		for (Producto p : productosArray) {
			productos.add(p);

		}

	}
	
	public void eliminar_producto() {
		listaProductos.removeAll();
		vista_productos.clear();
	}

	public void setUsuario(String usuario) throws PersistentException {
		this.usuario = usuario;
		for (interfaz.Producto producto : vista_productos) {
			producto.setUsuario(usuario);
		}
	}

}