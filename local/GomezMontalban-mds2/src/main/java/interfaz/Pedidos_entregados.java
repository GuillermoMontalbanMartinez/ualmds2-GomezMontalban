package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidosEntregados;

public class Pedidos_entregados extends VistaPedidosEntregados {
	public Pedidos_a_entregar pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
//	public Pedidos_entregados() {
//		this.getVaadinButton1().setVisible(false);
//	}

	public Pedidos_a_entregar getPedidos_a_entregar() {
		return pedidos_a_entregar;
	}

	public void setPedidos_a_entregar(Pedidos_a_entregar pedidos_a_entregar) {
		this.pedidos_a_entregar = pedidos_a_entregar;
	}

	public VerticalLayout getLayout_pedidos_entregados() {
		return layout_pedidos_entregados;
	}

	public void setLayout_pedidos_entregados(VerticalLayout layout_pedidos_entregados) {
		this.layout_pedidos_entregados = layout_pedidos_entregados;
	}
}