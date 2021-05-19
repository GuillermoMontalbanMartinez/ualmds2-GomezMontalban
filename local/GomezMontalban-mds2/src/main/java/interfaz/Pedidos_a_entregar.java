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
	
	
//	public Pedidos_a_entregar() {
//		this.getVaadinButtonProductosAEntregar().setVisible(false);
//	}


	public Pedidos_entregados getPedidos_entregados() {
		return pedidos_entregados;
	}


	public void setPedidos_entregados(Pedidos_entregados pedidos_entregados) {
		this.pedidos_entregados = pedidos_entregados;
	}


	public VerticalLayout getLayout_pedidos_a_entregar() {
		return layout_pedidos_a_entregar;
	}


	public void setLayout_pedidos_a_entregar(VerticalLayout layout_pedidos_a_entregar) {
		this.layout_pedidos_a_entregar = layout_pedidos_a_entregar;
	}
	
}