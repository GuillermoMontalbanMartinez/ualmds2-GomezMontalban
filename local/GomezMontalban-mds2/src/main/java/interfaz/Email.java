package interfaz;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import vistas.VistaEmail;

public class Email extends VistaEmail{
	public Lista_de_emails _lista_de_emails;
	public Contestar_email _contestar_email;

	
	public Email(String autor, String asunto) {
		
		this.getAsuntoText().setValue(asunto);
		this.getVaadinTextField().setValue(autor);
	}
	
	
}