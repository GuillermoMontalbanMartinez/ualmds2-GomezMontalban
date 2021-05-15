package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

	public void enviar_admin(String aDestinatario, String aAsunto, String aCorreo) throws PersistentException{
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Correo correo = basededatos.CorreoDAO.createCorreo();
			correo.setAutor("Administrador");
			correo.setAsunto(aAsunto);
			correo.setDestinatario(aDestinatario);
			correo.setContenido(aCorreo);
			correo.setLeido(false);
			
			Cibernauta_registrado[] listCr = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
			
			for(Cibernauta_registrado c : listCr) {
				if(c.getCorreo_electronico().equals(aDestinatario)) {
					System.out.println(c.getCorreo_electronico());
					correo.setPertenece_a_un_cibernauta_registrado(c);
					basededatos.CorreoDAO.save(correo);
					correo.setRemitente(correo);
					correo.setReceptor(correo);
				}
			}
			basededatos.CorreoDAO.save(correo);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}
		
	}

	public String recuperar_contrasena() {
		throw new UnsupportedOperationException();
	}
}