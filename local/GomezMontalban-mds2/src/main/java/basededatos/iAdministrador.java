package basededatos;

import org.orm.PersistentException;

public interface iAdministrador {

	public void baja_categoria(String nombreCategoria);

	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, int aId_producto, String aFoto1, String aFoto2, String aFoto3, String aFoto4, String aFoto5) throws PersistentException;

	public void alta_categorias(String aNombreCategoria) throws PersistentException;

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario, String aApellidos) throws PersistentException;

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario ) throws PersistentException;;

	public Categoria[] cargar_lista_categorias();

	public Producto[] cargar_lista_productos_admin();

	public Resena[] cargar_resenas();

	public void enviar(String aDestinatario, String aAsunto, String aCorreo);

	public void Alta_oferta_categoria(int aId_categoria, int aDescuento, String aFechaLimite);

	public void Alta_oferta_producto(int aId_producto, int aDescuento, String aFechaLimite) throws PersistentException;

	public Compra[] cargar_listado_de_compras_admin();

	public void Baja_producto(String nombreProducto) throws PersistentException;
	
	public Categoria[] cargar_categoria() throws PersistentException;
}