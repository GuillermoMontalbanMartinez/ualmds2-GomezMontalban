package interfaz;

import java.awt.Component;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEmpresaDeTransportes;

public class Empresa_de_transportes extends VistaEmpresaDeTransportes {
	public Pedidos_a_entregar pedidos_a_entregar;
	public Pedidos_entregados pedidos_entregados;
	public VerticalLayout layout_empresa_de_transportes;
	public VerticalLayout layout_pedidos_a_entregar;
	public VerticalLayout layout_pedidos_entregados;
	
	public Empresa_de_transportes() {
		pedidos_a_entregar = new Pedidos_a_entregar();
		pedidos_entregados = new Pedidos_entregados();
		layout_empresa_de_transportes = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout_pedidos_a_entregar = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		// layout_pedidos_entregados = this.getVaadinVerticalLayoutPedidosEntregados().as(VerticalLayout.class);
		

		this.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				 Notification.show("Acceso a pedidos a entregar");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_a_entregar);
			}
		});
		
		this.getVaadinButtonPedidosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos entregados");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_entregados);
			}
		});
		
		
		pedidos_a_entregar.getVaadinButtonProductosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a pedidos entregados");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_entregados);
				
			}
		});
		
		
		pedidos_entregados.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				 Notification.show("Acceso a pedidos a entregar");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(pedidos_a_entregar);

			}
		});
		
		
	}	
	
	
}