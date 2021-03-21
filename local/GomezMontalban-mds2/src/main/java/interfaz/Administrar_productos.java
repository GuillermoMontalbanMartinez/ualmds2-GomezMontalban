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
		layout_administrar_productos = this.getVaadinVerticalLayoutAdministrarProductos().as(VerticalLayout.class);
		
		agregarProducto = this.getVaadinButtonAnadirProductos();
		agregarProducto.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_productos.removeAll();
//				layout_administrar_productos.add(new Dar_alta_producto());
			}
		});
		
		eliminarProducto = this.getVaadinButtonEliminarProducto();
		eliminarProducto.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_administrar_productos.removeAll();
//				layout_administrar_productos.add(new Dar_baja_producto());
			}
		});
	}
}