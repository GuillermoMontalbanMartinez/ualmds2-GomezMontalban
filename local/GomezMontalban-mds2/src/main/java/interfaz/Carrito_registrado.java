package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cibernauta_registrado;
import basededatos.Foto;
import basededatos.Item;
import basededatos.Producto;

public class Carrito_registrado extends Carrito {
	public Banner_registrado _banner_registrado;
	public Banco _banco;
	public Modificar_datos_personales _modificar_datos_personales;
	int id;
	public VerticalLayout listaProductos;
	ArrayList<interfaz.Producto_seleccionado> vista_productos;
	
	ArrayList<basededatos.Producto> productos = new ArrayList();
	public Carrito_registrado() {
		listaProductos = this.getVistaProductosSeleccionados().getListaProductosSeleccionadosLAyout().as(VerticalLayout.class);
		vista_productos = new ArrayList<interfaz.Producto_seleccionado> ();
		
	}
	
	
	public void cargar_productos_catalogo() throws PersistentException{
		
 		basededatos.Compra compras [] = basededatos.CompraDAO.listCompraByQuery(null, null);
 		basededatos.Producto pro [] = basededatos.ProductoDAO.listProductoByQuery(null, null);
 		for(basededatos.Compra c : compras) {
 			
 			
 			for(basededatos.Producto p : pro) {
 				if(p.getTiene_item().getORMID() == c.getTiene_item().getORMID()) {
 					if(id == c.getTiene_asociado_un_cibernauta_registrado().getORMID()) {
 		 				productos.add(c.getTiene_item().getEsta_asociado_a_un_producto()); 	
 		 			}
 				}
 			}
 			
 			
 			
 		}
	}
	
	public void mostrar_productos() throws PersistentException {
		cargar_productos_catalogo();
		for (Producto p : productos) {
			interfaz.Producto_seleccionado producto = new interfaz.Producto_seleccionado(p.getNombre(), p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto());
			listaProductos.add(producto);
			vista_productos.add(producto);
		}
	}
	
	public void eliminar_producto() {
		listaProductos.removeAll();
	}

	public void realizar_compra() {
		throw new UnsupportedOperationException();
	}

	public void confirmar_compra() {
		throw new UnsupportedOperationException();
	}
	
	
	public void setUsuario(String usuario) throws PersistentException {
		Cibernauta_registrado cb[] = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
		
		for (Cibernauta_registrado cib : cb) {
			if (cib.getNombre().equals(usuario)) {
				id = cib.getORMID();
			}
		}
	}
}