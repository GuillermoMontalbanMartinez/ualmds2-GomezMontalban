package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import vistas.VistaPedidosAEntregar;

public class Pedidos_a_entregar extends VistaPedidosAEntregar {
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	
	public Pedidos_a_entregar() {
		this.getVaadinButtonProductosAEntregar().setVisible(false);
	}
	
}