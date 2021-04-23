package basededatos;

import java.util.List;

public interface iCibernauta_registrado {

	/**
	 * 
	 * @param foto
	 */
	void adjuntar_nueva_foto_de_perfil(String foto);

	java.util.List cargar_categorias_catalogo();

	/**
	 * 
	 * @param id_usuario
	 */
	FichaCliente cargar_ficha_cliente(int id_usuario);

	List cargar_ofertas();

	List cargar_productos_catalogo();

	/**
	 * 
	 * @param respuesta
	 */
	void confirmar(boolean respuesta);

	/**
	 * 
	 * @param respuesta
	 */
	void confirmar_cambios(boolean respuesta);

	/**
	 * 
	 * @param destinatario
	 * @param asunto
	 * @param correo
	 */
	void enviar(String destinatario, String asunto, String correo);

	/**
	 * 
	 * @param id_usuario
	 * @param foto
	 */
	void adjuntar_nueva_foto_de_perfil(int id_usuario, String foto);

	/**
	 * 
	 * @param id_item
	 */
	void añadir_al_carrito(int id_item);

	/**
	 * 
	 * @param id_item
	 */
	void aumentar_unidad_producto(int id_item);

	/**
	 * 
	 * @param id_compra
	 */
	void cancelarPedido(int id_compra);

	/**
	 * 
	 * @param id_item
	 */
	void decrementar_unidad_producto(int id_item);

	/**
	 * 
	 * @param id_item
	 */
	void eliminar_producto(int id_item);

	/**
	 * 
	 * @param valoracion
	 * @param cuerpo
	 */
	void publicar(int valoracion, String cuerpo);

	/**
	 * 
	 * @param valoracion
	 * @param cuerpo
	 * @param id_producto
	 */
	void publicar(int valoracion, String cuerpo, int id_producto);

	/**
	 * 
	 * @param id_compra
	 */
	void confirmar_compra(int id_compra);

}