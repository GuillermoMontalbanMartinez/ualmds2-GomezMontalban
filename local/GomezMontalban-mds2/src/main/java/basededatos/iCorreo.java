package basededatos;

public interface iCorreo {

	public Correo[] cargar_lista_de_emails(int aId_usuario);

	public void correo_de_verificacion(String aMensaje, String aDestiantario);

	public void recuperar_contrasena(String aCorreo);
}