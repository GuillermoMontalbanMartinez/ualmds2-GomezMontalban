package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCorreoAdmin;

public class Correo_admin extends VistaCorreoAdmin {
	public Banner_admin _banner_admin;
	public Lista_emails_admin _lista_emails_admin;
	public Redactar_correo_admin _redactar_correo_admin;
	public Button redactar_correo;
	public VerticalLayout layout_correo_administrador;
	
	public Correo_admin() {
		layout_correo_administrador = this.getVaadinVerticalLayout();
		redactar_correo = this.getVaadinButton();
		redactar_correo.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_correo_administrador.removeAll();
				layout_correo_administrador.add(new Redactar_correo_admin());
			}
		});
	}
}