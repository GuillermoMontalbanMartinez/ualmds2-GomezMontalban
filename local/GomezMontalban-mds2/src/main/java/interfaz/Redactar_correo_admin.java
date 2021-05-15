package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaRedactarCorreo;
import vistas.VistaRedactarCorreoAdministrador;

public class Redactar_correo_admin extends VistaRedactarCorreoAdministrador {
	public Correo_admin _correo_admin;
	public VerticalLayout layout_redactar_correo_admin;
	public Button cancelar;
	public Button enviar; 
	String cuerpo, destinatario, asunto;
	BDPrincipal bd;
	public Redactar_correo_admin() {
		layout_redactar_correo_admin = this.getVaadinVerticalLayoutRedactarCorreoAdministrador().as(VerticalLayout.class);
		cancelar = this.getVaadinButtonCancelar();
		cancelar.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				layout_redactar_correo_admin.removeAll();
				layout_redactar_correo_admin.add(new Correo_admin());
			}
		});
		
		enviar = this.getVaadinButtonAceptar();
		enviar.addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				layout_redactar_correo_admin.removeAll();
				layout_redactar_correo_admin.add(new Correo_admin());
			}
		});
	}
	
	

	public void enviar() throws PersistentException{
		bd = new BDPrincipal();
		cuerpo = this.getTextCuerpo().getValue();
		destinatario = this.getTextDestinatario().getValue();
		asunto = this.getTextAsunto().getValue();
		
		bd.enviar_admin(destinatario, asunto, cuerpo);
		
	}
}