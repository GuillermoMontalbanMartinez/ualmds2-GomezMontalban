package interfaz;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.BDPrincipal;
import basededatos.Categoria;
import basededatos.Cibernauta_registrado;
import basededatos.Correo;
import basededatos.Foto;
import basededatos.Producto;
import vistas.VistaAccederAlCatalogoAdmin;
import vistas.VistaAccederCatalogo;

public class Acceder_al_catalogo extends VistaAccederCatalogo {
	public Buscar_producto _buscar_producto;
	public Categorias _categorias;
	public Productos _productos;
	public VerticalLayout listaProductos;
	ArrayList<Producto> productos;
	ArrayList<interfaz.Producto> vista_productos;
	private String usuario;
	 String value=null;
	 
	public Acceder_al_catalogo() {
		Select<Categoria> select = new Select<Categoria>();
		listaProductos = this.getLayoutProductosCatalogo();
		vista_productos = new ArrayList<interfaz.Producto>();

		try {
			mostrar_productos();
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
		this.getSelectLayout().add(select);

		
		 select.addValueChangeListener(event -> {
			    if (event.getValue() != null) {
			    	value = event.getValue().getNombre().toString();
			    	try {
			    		eliminar_producto();
						mostrar_productos();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    } 
			});
		
	}

	public void cargar_productos_catalogo() throws PersistentException {

		BDPrincipal bd = new BDPrincipal();
		ArrayList<Producto> productosArray = bd.cargar_productos_catalogo();

		for (Producto p : productosArray) {
			productos.add(p);

		}

	}

	public void mostrar_productos() throws PersistentException {
		productos = new ArrayList<Producto>();
		cargar_productos_catalogo();
		for (Producto p : productos) {
			if(value!=null) {
				if(p.getCategoria().getNombre().equals(value)) {
					interfaz.Producto producto = new interfaz.Producto(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
					listaProductos.add(producto);
					vista_productos.add(producto);
				}
			} else {
				interfaz.Producto producto = new interfaz.Producto(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
				listaProductos.add(producto);
				vista_productos.add(producto);
			}
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

	public Categoria[] cargar_categoria() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		return bd.cargar_categoria();
	}
	
	public void buscarProducto(String string) throws PersistentException  {
		BDPrincipal bd = new BDPrincipal();
		Producto[] aux =  bd.buscarProductos(string);
		
		
		for (Producto p : aux) {
			System.out.println(p.getNombre());
			for (Foto f : basededatos.FotoDAO.listFotoByQuery(null, null)) {
				System.out.println(f.getEsta_asociada_a_un_producto().getNombre());
				if (f.getEsta_asociada_a_un_producto().getORMID() == p.getORMID()) {
					interfaz.Producto producto = new interfaz.Producto(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), f.getLink_foto());
					listaProductos.add(producto);
					vista_productos.add(producto);
					break;
				}
//				System.out.println(f.getLink_foto());
			}
			//interfaz.Producto producto = new interfaz.Producto(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
//			listaProductos.add(producto);
//			vista_productos.add(producto);
		}

	}
}