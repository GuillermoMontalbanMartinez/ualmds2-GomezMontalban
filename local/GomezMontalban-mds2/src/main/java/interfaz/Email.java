package interfaz;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;

import vistas.VistaEmail;

public class Email extends VistaEmail {
	public Lista_de_emails _lista_de_emails;
	public Contestar_email _contestar_email;
	public VerEmail _ver_email = new VerEmail();

	public Email(String autor, String asunto, String cuerpo) {

		if (asunto != null && autor != null) {
			this.getAsuntoText().setValue(asunto);
			this.getVaadinTextField().setValue(autor);
			_ver_email.getAsuntoText().setValue(asunto);
			_ver_email.getAutorText().setValue(autor);
			_ver_email.getCuerpoText().setValue(cuerpo);
		}
	}

}