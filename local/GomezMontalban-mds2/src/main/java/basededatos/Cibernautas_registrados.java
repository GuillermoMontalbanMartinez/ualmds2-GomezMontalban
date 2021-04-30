package basededatos;

import java.util.Vector;
import basededatos.Cibernauta_registrado;

public class Cibernautas_registrados {
	public BDPrincipal _bd_main_cibernautas_registrados;
	public Vector<Cibernauta_registrado> _contiene_cibernauta_registrados = new Vector<Cibernauta_registrado>();

	public void adjuntar_nueva_foto_de_perfil(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_registrado cargar_ficha_cliente(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void adjuntar_nueva_foto_de_perfil(int aId_usuario, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void Registro(String aNombre, String aApellidos, String aCorreo, String aContrasena, String aContrasena_rep, int aTelefono, String aPais, String aLocalidad, String aCalle, String aPortal, String aProvincia, int aCodigo_postal, int aN_tarjeta, String aTitular, String aFecha_caducidad, int aCvv, String aFoto_perfil) {
		throw new UnsupportedOperationException();
	}
}