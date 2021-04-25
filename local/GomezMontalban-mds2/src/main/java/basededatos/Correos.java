package basededatos;

import java.util.Vector;
import basededatos.Correo;

public class Correos {
	public BDPrincipal _db_main_correo;
	public Vector<Correo> _contiene_correo = new Vector<Correo>();

	public Correo[] cargar_lista_de_emails(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void correo_de_verificacion(String aMensaje, String aDestinatario) {
		throw new UnsupportedOperationException();
	}

	public void enviar(String aDestinatario, String aAsunto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena() {
		throw new UnsupportedOperationException();
	}
}