package basededatos;

import org.orm.PersistentException;

public interface iCibernauta extends iCibernauta_común {

	public String recuperar_contrasena();

	public boolean Registro(String aNombre, String aApellidos, String aCorreo, String aContrasena, String aContrasena_rep, String aTelefono, String aPais, String aLocalidad, String aCalle, String aPortal, String aProvincia, int aCodigo_postal, String aN_tarjeta, String aTitular, String aFecha_caducidad, int aCvv, String aFoto_perfil) throws PersistentException;
}