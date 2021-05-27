package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Correo;
import vistas.VistaCorreoAdmin;

public class Correo_admin extends VistaCorreoAdmin {
	public Banner_admin _banner_admin;
	public Lista_emails_admin _lista_emails_admin;
	public Redactar_correo_admin _redactar_correo_admin;
	public Button redactar_correo;
	public VerticalLayout layout_correo_administrador;
	private ArrayList<Correo> correos = new ArrayList<Correo>();
	public ArrayList<Email> emails = new ArrayList<Email>();
	public VerticalLayout listaEmails;

	public Correo_admin() {
		listaEmails = this.getVistaListaEmails().getVaadinVerticalLayout().as(VerticalLayout.class);
		_redactar_correo_admin = new Redactar_correo_admin();
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
	
	public void cargar_lista_de_emails_admin() throws PersistentException {

		BDPrincipal bd = new BDPrincipal();
		Correo[] co = bd.cargar_lista_de_emails_admin();
		for (Correo c : co) {
			correos.add(c);
		}
	}
	
	public void mostra_correos() throws PersistentException {
		cargar_lista_de_emails_admin();
		
		for (Correo c : correos) {
			Email email = new Email(c.getAutor(), c.getAsunto(), c.getContenido());

			emails.add(email);
			listaEmails.add(email);
		}

	}

	public void eliminar_correos() {

		listaEmails.removeAll();
		emails.clear();
		correos.clear();
	}
}