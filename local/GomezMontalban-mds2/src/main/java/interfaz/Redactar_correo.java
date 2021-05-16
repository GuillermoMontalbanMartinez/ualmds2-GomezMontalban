package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import vistas.VistaRedactarCorreo;

public class Redactar_correo extends VistaRedactarCorreo{
	public Correo_usuario _correo_usuario;
	public VerticalLayout layout_redactar_correo;
	private String cuerpo="", destinatario="", asunto="", autor="";
	public Redactar_correo() {
		
		
		this.getEnviar().addClickListener(new ComponentEventListener() {
			
			@Override
			public void onComponentEvent(ComponentEvent event) {
				try {
					enviar();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	public void enviar() throws PersistentException{
		BDPrincipal bd = new BDPrincipal();
		cuerpo = this.getCuerpoText().getValue();
		destinatario = this.getDestinatarioText().getValue();
		asunto = this.getAsuntoText().getValue();
		
		bd.enviar(destinatario, asunto, cuerpo, autor);
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
}