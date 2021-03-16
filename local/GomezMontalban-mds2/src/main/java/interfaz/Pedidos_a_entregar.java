package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPedidosAEntregar;

public class Pedidos_a_entregar extends VistaPedidosAEntregar {
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
	
	public Pedidos_a_entregar() {
		this.getVaadinButtonProductosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos entregados");
				layout_pedidos_a_entregar.removeAll();
				layout_pedidos_a_entregar.add(pedidos_entregados);
			}
		});
		
		// this.getVaadinButtonProductosAEntregar().isDisableOnClick();
		this.getVaadinButtonProductosAEntregar().setDisableOnClick(true);
	}
	
}