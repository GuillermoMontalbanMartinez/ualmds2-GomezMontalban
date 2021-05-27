package basededatos;

import org.orm.PersistentException;

public interface iCorreo {

//	public Correo[] cargar_lista_de_emails(int aId_usuario);

//	public void correo_de_verificacion(String aMensaje, String aDestiantario);

//	public void recuperar_contrasena(String aCorreo);
	
	public Correo[] cargar_lista_de_emails(int id_usuario) throws PersistentException ;
	public Correo[] cargar_lista_de_emails_admin() throws PersistentException ;

}