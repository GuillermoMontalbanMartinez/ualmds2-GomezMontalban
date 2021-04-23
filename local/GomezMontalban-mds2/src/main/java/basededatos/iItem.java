package basededatos;

public interface iItem {

	/**
	 * 
	 * @param id_item
	 */
	void anadir_al_carrito(int id_item);

	/**
	 * 
	 * @param id_item
	 */
	void aumentar_unidad_producto(int id_item);

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

}