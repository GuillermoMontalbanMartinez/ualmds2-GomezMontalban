package basededatos;

import java.util.List;

public interface iAdministrador {

	/**
	 * 
	 * @param id_categoria
	 */
	void baja_categoria(int id_categoria);

	/**
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param id_producto
	 * @param foto1
	 * @param foto2
	 * @param foto3
	 * @param foto4
	 * @param foto5
	 */
	void Alta_producto(String nombre, String descripcion, double precio, int id_producto, String foto1, String foto2, String foto3, String foto4, String foto5);

	/**
	 * 
	 * @param nombreCategoria
	 */
	void alta_categorias(String nombreCategoria);

	/**
	 * 
	 * @param nombre
	 * @param correo
	 * @param contrasena
	 * @param tipoDeUsuario
	 */
	void Alta_cuenta(String nombre, String correo, String contrasena, int tipoDeUsuario);

	/**
	 * 
	 * @param correo
	 * @param tipoDeUsuario
	 * @param id_usuario
	 */
	void Baja_cuenta(String correo, int tipoDeUsuario, int id_usuario);

	java.util.List cargar_lista_categorias();

	List cargar_lista_productos_admin();

	List cargar_resenas();

	/**
	 * 
	 * @param destinatario
	 * @param asunto
	 * @param correo
	 */
	void enviar(String destinatario, String asunto, String correo);

	/**
	 * 
	 * @param id_categoria
	 * @param descuento
	 * @param fechaLimite
	 */
	void Alta_oferta_categoria(int id_categoria, double descuento, String fechaLimite);

	/**
	 * 
	 * @param id_producto
	 * @param descuento
	 * @param fechaLimite
	 */
	void Alta_oferta_producto(int id_producto, double descuento, String fechaLimite);

	List cargar_listado_de_compras_admin();

	/**
	 * 
	 * @param id_producto
	 */
	void Baja_producto(int id_producto);

}