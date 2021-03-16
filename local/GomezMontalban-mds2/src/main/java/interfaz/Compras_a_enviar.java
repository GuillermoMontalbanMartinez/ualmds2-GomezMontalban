package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComprasAEnviar;

public class Compras_a_enviar extends VistaComprasAEnviar {
	public Listado_de_compras _listado_de_compras;
	public VerticalLayout layout;
	
	public Compras_a_enviar() {
		
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		
		this.getBoton_compras_enviadas().addClickListener(new ComponentEventListener() {
			
			

			@Override
			public void onComponentEvent(ComponentEvent event) {
				Compras_enviadas _compras_enviadas = new Compras_enviadas();
				layout.removeAll();
				
				layout.addComponentAtIndex(0, _compras_enviadas);
				_compras_enviadas = null;
			}
			
		});
		
		
	}
}