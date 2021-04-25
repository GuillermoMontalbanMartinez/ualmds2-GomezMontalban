package basededatos;

public interface iItem {

	public void anadir_al_carrito(int aId_item);

	public void aumentar_unidad_producto(int aId_item);

	public void decrementar_unidad_producto(int aId_item);

	public void eliminar_producto(int aId_item);

	public Item[] cargar_productos_seleccionados(int aId_usuario);
}