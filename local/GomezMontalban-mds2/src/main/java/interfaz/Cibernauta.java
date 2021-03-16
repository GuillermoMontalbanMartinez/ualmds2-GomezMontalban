package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import ch.qos.logback.core.rolling.helper.ArchiveRemover;

public class Cibernauta extends Cibernauta_común {
	public Banner_no_registrado _banner_no_registrado;
	public HorizontalLayout banner;
	public VerticalLayout layout;

	public Iniciar_sesion inicio_sesion;
	
	public Cibernauta() {
		
		_banner_no_registrado = new Banner_no_registrado();
		banner = this.getBanner();
		banner.add(_banner_no_registrado);
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		inicio_sesion = new Iniciar_sesion();
		
		_banner_no_registrado.getVaadinButton().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				 
				
				//layout.setVisible(false);
				layout.removeAll();
				layout.add(_banner_no_registrado);
				layout.add(inicio_sesion);
				
			}
		});
		
	}
	
	
	
	
}