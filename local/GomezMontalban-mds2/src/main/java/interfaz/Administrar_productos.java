package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrarProductos;

public class Administrar_productos extends VistaAdministrarProductos {
	public Banner_admin _banner_admin;
	public Dar_alta_producto _dar_alta_producto;
	public Dar_baja_producto _dar_baja_producto;
	public VerticalLayout layout_administrar_productos;
	public Button agregarProducto;
	public Button eliminarProducto;
	
	public Administrar_productos() {
		_dar_alta_producto = new Dar_alta_producto();
		_dar_baja_producto = new Dar_baja_producto();
	}
}