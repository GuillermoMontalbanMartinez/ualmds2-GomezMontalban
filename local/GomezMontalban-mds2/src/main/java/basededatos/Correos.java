package basededatos;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Correo;

public class Correos {
	public BDPrincipal _db_main_correo;
	public Vector<Correo> _contiene_correo = new Vector<Correo>();

	public Correo[] cargar_lista_de_emails(int aId_usuario) throws PersistentException {

		Correo[] correo = basededatos.CorreoDAO.listCorreoByQuery(null, null);
		Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(aId_usuario);
		ArrayList<Correo> aux = new ArrayList<Correo>();
		for (Correo c : correo) {
			if (c.getPertenece_a_un_cibernauta_registrado().getORMID() == cb.getORMID())
				aux.add(c);
		}
		Correo resultado[] = new Correo[aux.size()];
		return aux.toArray(resultado);

	}

	public void enviar_admin(String aDestinatario, String aAsunto, String aCorreo) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Correo correo = basededatos.CorreoDAO.createCorreo();
			correo.setAutor("Administrador");
			correo.setAsunto(aAsunto);
			correo.setDestinatario(aDestinatario);
			correo.setContenido(aCorreo);
			correo.setLeido(false);

			Cibernauta_registrado[] listCr = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null,
					null);

			for (Cibernauta_registrado c : listCr) {
				if (c.getCorreo_electronico().equals(aDestinatario)) {
					System.out.println(c.getCorreo_electronico());
					correo.setPertenece_a_un_cibernauta_registrado(c);
					basededatos.CorreoDAO.save(correo);

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

	public void enviar(String aDestinatario, String aAsunto, String aCorreo, String aAutor) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		try {

			Correo correo = basededatos.CorreoDAO.createCorreo();
			correo.setAsunto(aAsunto);
			correo.setDestinatario(aDestinatario);
			correo.setContenido(aCorreo);
			correo.setLeido(false);

			Cibernauta_registrado[] listCr = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null,
					null);

			for (Cibernauta_registrado c : listCr) {
				if (aDestinatario.equals("Administrador")) {
					correo.setPertenece_a_un_cibernauta_registrado(null);
					basededatos.CorreoDAO.save(correo);
				} else if (c.getCorreo_electronico().equals(aDestinatario)) {
					correo.setPertenece_a_un_cibernauta_registrado(c);
					basededatos.CorreoDAO.save(correo);

				}
				if (c.getNombre().equals(aAutor)) {
					correo.setAutor(c.getCorreo_electronico());

				}
			}
			basededatos.CorreoDAO.save(correo);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		}

	}

	public Correo[] cargar_lista_de_emails_admin() throws PersistentException {

		Correo[] correo = basededatos.CorreoDAO.listCorreoByQuery(null, null);
		ArrayList<Correo> aux = new ArrayList<Correo>();
		for (Correo c : correo) {
			if (c.getPertenece_a_un_cibernauta_registrado()==null) {
				aux.add(c);
			}
		}
		Correo resultado[] = new Correo[aux.size()];
		return aux.toArray(resultado);

	}

}