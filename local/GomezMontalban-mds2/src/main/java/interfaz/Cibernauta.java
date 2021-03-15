package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cibernauta extends Cibernauta_común {
	public Banner_no_registrado _banner_no_registrado;
	// public Registro _registro;
	public VerticalLayout layout;
	public Iniciar_sesion inicio_sesion;
	
	public Cibernauta() {
		super();
		_banner_no_registrado = new Banner_no_registrado();
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		layout.addComponentAsFirst(_banner_no_registrado);
		inicio_sesion = new Iniciar_sesion();
	}
	
	
}