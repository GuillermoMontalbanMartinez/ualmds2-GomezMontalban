package interfaz;

import vistas.VistaEmailAdmin;

public class Email_admin extends VistaEmailAdmin{
	public Lista_emails_admin _lista_emails_admin;
	public Contestar_email_admin _contestar_email_admin;
	public VerEmail _ver_email = new VerEmail();

	public Email_admin(String autor, String asunto, String cuerpo) {

		if (asunto != null && autor != null) {
			this.getAsuntoText().setValue(asunto);
			this.getAutorText().setValue(autor);
			_ver_email.getAsuntoText().setValue(asunto);
			_ver_email.getAutorText().setValue(autor);
			_ver_email.getCuerpoText().setValue(cuerpo);
		}
	}

}