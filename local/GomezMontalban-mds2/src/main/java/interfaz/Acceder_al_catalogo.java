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
		listaProductos = this.getLayoutCatalogo().as(VerticalLayout.class);
	}
	
	public void cargar_productos() throws PersistentException {
		Producto[] productosArray = basededatos.ProductoDAO.listProductoByQuery(null, null);
		
		for (Producto p : productosArray) {
			productos.add(p);
		}
	}
	
//	public void mostrar_productos() throws PersistentException {
//		productos = new ArrayList<Producto>();	
//		cargar_productos();
//		for (Producto p : productos) {
//			Producto producto = new Producto(p.);
//			listaProductos.add(producto);
//		}
//	}
	
//	public void mostra_correos() throws PersistentException {
//		correos= new ArrayList<Correo>();
//		
//		cargar_lista_de_emails(id);
//		for(Correo c : correos)  {
//			Email e = new Email(c.getAutor(), c.getAsunto());
//			listaEmais.add(e);		
//
//		}
//		
//	}
}