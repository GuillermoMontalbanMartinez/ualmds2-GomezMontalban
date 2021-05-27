package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
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
	public TextField  textPrecio = getTextPrecio();
	ArrayList<basededatos.Producto> productos;
	double precio=0;
	public Carrito_registrado() {
		
		listaProductos = this.getVistaProductosSeleccionados().getListaProductosSeleccionadosLAyout()
				.as(VerticalLayout.class);
		vista_productos = new ArrayList<interfaz.Producto_seleccionado>();

		this.getTextPrecio().setValue(String.valueOf(precio));
		this.getComprarButton().addClickListener(e -> {
			try {
				confirmar_compra();
			} catch (PersistentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}

	public void cargar_productos_seleccionados() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		ArrayList<Item> items = bd.cargar_productos_seleccionados(id);
		if (!(items == null)) {
			for (Item i : items) {
				productos.add(i.getEsta_asociado_a_un_producto());
			}

		}

	}

	public void mostrar_productos() throws PersistentException {
		productos = new ArrayList();
		cargar_productos_seleccionados();
		for (Producto p : productos) {
			interfaz.Producto_seleccionado producto = new interfaz.Producto_seleccionado(p.getNombre(),
					p.getDescripción(), String.valueOf(p.getPrecio()), p.tiene_fotos.toArray()[0].getLink_foto(),id, p.getORMID());/******/
			precio+=p.getPrecio();			
			listaProductos.add(producto);
			vista_productos.add(producto);
			
		}
		textPrecio.setValue(String.valueOf(precio));

	}

	public void eliminar_productos() {
		listaProductos.removeAll();
		vista_productos.clear();
		precio=0;
		textPrecio.setValue(String.valueOf(precio));

	}

	public void confirmar_compra() throws PersistentException {
		BDPrincipal bd = new BDPrincipal();
		for (Producto p : productos) {
			bd.confirmar_compra(p.getTiene_item().getEsta_asociado_a_una_compra().getORMID());
		}
		vista_productos.clear();
	}

	public void setUsuario(int id) throws PersistentException {
		this.id = id;
	}
}