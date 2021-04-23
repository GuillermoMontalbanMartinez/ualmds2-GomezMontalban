package basededatos;

public interface iCorreo {

	/**
	 * 
	 * @param id_usuario
	 */
	java.util.List cargar_lista_de_emails(int id_usuario);

	/**
	 * 
	 * @param mensaje
	 * @param destiantario
	 */
	void correo_de_verificacion(String mensaje, String destiantario);

	/**
	 * 
	 * @param correo
	 */
	void recuperar_contrasena(String correo);

}