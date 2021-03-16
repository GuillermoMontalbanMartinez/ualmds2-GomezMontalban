package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEncargadoDeCompras;


public class Encargado_de_compras extends VistaEncargadoDeCompras {
	public Pedidos_entregados _pedidos_entregados;
	public Pedidos_a_entregar _pedidos_a_entregar;
	public VerticalLayout layout;
	
	
	public Encargado_de_compras() {
		_pedidos_entregados = new Pedidos_entregados();
		_pedidos_a_entregar = new Pedidos_a_entregar();
		layout = this.getLayout_encargado_de_compras().as(VerticalLayout.class);
		
		this.getButton_compras_enviadas().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				
				layout.removeAll();
				layout.add(_pedidos_entregados);
				
			}
		});
		
		
		
		this.getButton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				
				layout.removeAll();
				layout.add(_pedidos_a_entregar);
				
			}
		});
	}
}