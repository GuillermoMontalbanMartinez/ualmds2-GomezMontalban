package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;

import basededatos.BDPrincipal;
import basededatos.Cibernauta_registrado;
import basededatos.Correo;
import vistas.VistaCorreoUsuario;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Correo_usuario extends VistaCorreoUsuario {
	public Banner_registrado _banner_registrado;
	public Lista_de_emails _lista_de_emails = new Lista_de_emails();
	public Redactar_correo _redactar_correo = new Redactar_correo();
	public HorizontalLayout layout = this.getLayout();
	public VerticalLayout listaEmails;
	private String usuario;
	int id;
	private BDPrincipal bd;
	private ArrayList<Correo> correos = new ArrayList<Correo>();
	public ArrayList<Email> emails = new ArrayList<Email>();;

	public Correo_usuario() {
		listaEmails = this.getLayoutEmails().as(VerticalLayout.class);

	}

	public void cargar_lista_de_emails(int id_usuario) throws PersistentException {
		try{Correo[] co = basededatos.CorreoDAO.listCorreoByQuery(null, null);

		for (Correo c : co) {
			if (c.getPertenece_a_un_cibernauta_registrado()
					.equals(basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(id))) {
				correos.add(c);
			}
		}
		}catch(Exception e) {
			System.out.println("yikes");
		}
	}

	public void mostra_correos() throws PersistentException {

		for (Correo c : correos) {
			Email email = new Email(c.getAutor(), c.getAsunto(), c.getContenido());

			emails.add(email);
			listaEmails.add(email);
		}

	}

	public void eliminar_correos() {


		listaEmails.removeAll();

	}

	public void setUsuario(int id) throws PersistentException {
		this.id = id;
		cargar_lista_de_emails(id);

	}
}