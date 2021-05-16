package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Correo;
import basededatos.Producto;
import vistas.VistaAccederAlCatalogoAdmin;
import vistas.VistaAccederCatalogo;

public class Acceder_al_catalogo extends VistaAccederCatalogo {
	public Buscar_producto _buscar_producto;
	public Categorias _categorias;
	public Productos _productos;
	public VerticalLayout listaProductos;
	private ArrayList<Producto> productos;
	
	public Acceder_al_catalogo() {
		listaProductos = this.getLayoutProductosCatalogo();
		try {
			mostrar_productos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cargar_productos() throws PersistentException {
		Producto[] productosArray = basededatos.ProductoDAO.listProductoByQuery(null, null);
		
		for (Producto p : productosArray) {
			productos.add(p);
		}
	}
	
	public void mostrar_productos() throws PersistentException {
		productos = new ArrayList<Producto>();	
		cargar_productos();
		for (Producto p : productos) {
			interfaz.Producto producto = new interfaz.Producto();
			listaProductos.add(producto);
		}
	}
	
	public void eliminar_producto() {
		listaProductos.removeAll();
	}
	

}