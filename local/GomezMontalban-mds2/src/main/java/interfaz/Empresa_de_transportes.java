package interfaz;

import java.awt.Component;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEmpresaDeTransportes;

public class Empresa_de_transportes extends VistaEmpresaDeTransportes {
	public Compras_a_enviar _compras_a_enviar;
	public Compras_enviadas _compras_enviadas;
	public VerticalLayout layout_pedidos_entregado;
	public VerticalLayout layout_pedidos_enviados;
	public VerticalLayout layout_empresa_de_transportes;
	
	public Empresa_de_transportes() {
		_compras_a_enviar = new Compras_a_enviar();
		_compras_enviadas = new Compras_enviadas();
		
		layout_empresa_de_transportes = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout_pedidos_entregado = this.getVaadinVerticalLayoutPedidosEntregados().as(VerticalLayout.class);
		layout_pedidos_enviados = this.getVaadinVerticalLayoutPedidosEntregar().as(VerticalLayout.class);
		
		
		this.getVaadinButtonPedidosAEntregar().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				 Notification.show("Acceso a compras a enviar");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(_compras_a_enviar);
			}
		});
		
		this.getVaadinButtonPedidosEntregados().addClickListener(new ComponentEventListener() {
			public void onComponentEvent(ComponentEvent event) {
				Notification.show("Acceso a compras enviadas");
				layout_empresa_de_transportes.removeAll();
				layout_empresa_de_transportes.add(_compras_enviadas);
			}
		});
		
	}
	
	
}