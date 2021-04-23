package basededatos;

import java.util.List;

public interface ICompra {

	/**
	 * 
	 * @param id_compra
	 */
	void cancelarPedido(int id_compra);

	java.util.List cargar_compras();

	java.util.List cargar_compras_enviadas();

	/**
	 * 
	 * @param id_usuario
	 */
	List cargar_pedidos_encargados(int id_usuario);

	List cargar_pedidos_a_entregar();

	/**
	 * 
	 * @param id_usuario
	 */
	List cargar_productos_comprados_recientemente(int id_usuario);

	List cargar_pedidos_entregados();

	List cargar_lista_compras_admin();

	/**
	 * 
	 * @param id_compra
	 */
	void Enviar_compra(int id_compra);

	/**
	 * 
	 * @param id_compra
	 */
	void Enviar_producto(int id_compra);

	/**
	 * 
	 * @param id_compra
	 */
	void confirmar_compra(int id_compra);

}