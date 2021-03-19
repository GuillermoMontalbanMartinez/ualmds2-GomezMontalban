package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidosEntregados;

public class Pedidos_entregados extends VistaPedidosEntregados {
	public Pedidos_a_entregar pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	public Pedidos_entregados() {
		this.getVaadinButton1().setVisible(false);
	}
}