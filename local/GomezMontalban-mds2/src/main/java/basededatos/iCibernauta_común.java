package basededatos;

import org.orm.PersistentException;

public interface iCibernauta_común {

	public Producto[] cargar_productos_mas_vendidos()throws PersistentException;
	public Resena[] cargar_resenas(int idProducto) throws PersistentException;
	public Producto[] cargar_oferta_producto() throws PersistentException;
}