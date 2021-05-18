package basededatos;

import org.orm.PersistentException;

public interface iItem {
	public void aumentar_unidad_producto(int aId_item);

	public void decrementar_unidad_producto(int aId_item);

	public void eliminar_producto(int aId_item);

	public Item[] cargar_productos_seleccionados(int aId_usuario);
}