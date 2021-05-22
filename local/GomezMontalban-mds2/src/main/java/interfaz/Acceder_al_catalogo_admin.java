package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Producto;
import vistas.VistaAccederAlCatalogoAdmin;
import basededatos.Categoria;
import com.vaadin.flow.component.select.Select;




public class Acceder_al_catalogo_admin extends VistaAccederAlCatalogoAdmin {
	public Buscar_producto_admin _buscar_producto_admin;
	public Categorias_admiin _categorias_admin;
	public Productos_catalogo_admin _productos_catalogo_admin;
	public VerticalLayout listaProductos;
	ArrayList<Producto> productos;
	ArrayList<interfaz.Producto_admin> vista_productos;
	private String usuario;
	 String value=null;
	 
	public Acceder_al_catalogo_admin() {
		Select<Categoria> select = new Select<Categoria>();
		_categorias_admin = new Categorias_admiin();
		listaProductos = this.getLayoutProductosCatalogoAdmin();
		vista_productos = new ArrayList<interfaz.Producto_admin>();

		try {
			mostrar_productos_admin();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select.setItemLabelGenerator(Categoria::getNombre);
		try {
			select.setItems(this.cargar_categoria());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getLayoutProductosCatalogoAdmin().add(select);
		this.getLayoutSelect().add(select);

		
		 select.addValueChangeListener(event -> {
			    if (event.getValue() != null) {
			    	value = event.getValue().getNombre().toString();
			    	try {
			    		eliminar_producto();
						mostrar_productos_admin();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    } 
			});
		
	}

	public void mostrar_productos_admin() throws PersistentException {
		productos = new ArrayList<Producto>();
		cargar_productos_admin();
		for (Producto p : productos) {
//			interfaz.Producto_admin producto = new interfaz.Producto_admin(p.getNombre(), p.getDescripción(),
//					String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
			if(value!=null) {
				if(p.getCategoria().getNombre().equals(value)) {
					interfaz.Producto_admin producto = new interfaz.Producto_admin(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
					listaProductos.add(producto);
					vista_productos.add(producto);
				}
			} else {
				interfaz.Producto_admin producto = new interfaz.Producto_admin(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
				listaProductos.add(producto);
				vista_productos.add(producto);
			}
			
			
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
	
	public Categoria[] cargar_categoria() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_categoria();
	}

//	public void setUsuario(String usuario) throws PersistentException {
//		this.usuario = usuario;
//		for (interfaz.Producto_admin producto : vista_productos) {
//			producto.setUsuario(usuario);
//		}
//	}

}