package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComprasEnviadas;

public class Compras_enviadas extends VistaComprasEnviadas {
	public Listado_de_compras_enviadas _listado_de_compras_enviadas;
	public VerticalLayout layout;
	
	
	public Compras_enviadas() {
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		
		this.getBoton_compras_a_enviar().addClickListener(new ComponentEventListener() {
			

			@Override
			public void onComponentEvent(ComponentEvent event) {
				Compras_a_enviar _compras_a_enviar = new Compras_a_enviar();
				layout.removeAll();
				layout.addComponentAtIndex(0, _compras_a_enviar);
				_compras_a_enviar=null;
			}
		});
		
	}
}