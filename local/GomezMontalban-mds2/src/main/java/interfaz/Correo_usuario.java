package interfaz;

import java.util.ArrayList;

import org.orm.PersistentException;

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
	public Lista_de_emails _lista_de_emails;
	public Redactar_correo _redactar_correo;
	public HorizontalLayout layout;
	public VerticalLayout listaEmais;
	private String usuario;
	int id;
	private BDPrincipal bd;
	private ArrayList<Correo> correos;

	public Correo_usuario() {
		listaEmais = this.getLayoutEmails().as(VerticalLayout.class);
		
	}
	
	
	public void cargar_lista_de_emails(int id_usuario) throws PersistentException {
		Correo[] emails = basededatos.CorreoDAO.listCorreoByQuery(null, null);
		
		for(Correo c : emails) {
			if(c.getPertenece_a_un_cibernauta_registrado().equals(basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(id))) {
				correos.add(c);
			}
		}
	}
	
	public void mostra_correos() throws PersistentException {
		correos= new ArrayList<Correo>();
		
		cargar_lista_de_emails(id);
		for(Correo c : correos)  {
			Email e = new Email(c.getAutor(), c.getAsunto());
			listaEmais.add(e);		

		}
		
	}
	
	


	public void setUsuario(String usuario) throws PersistentException {
		this.usuario = usuario;			
		Cibernauta_registrado[] cb = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
		for(Cibernauta_registrado c : cb) {
			if(c.getNombre().equals(usuario)) {
				id = c.getORMID();
			}
		}
		
			mostra_correos();
	}
}