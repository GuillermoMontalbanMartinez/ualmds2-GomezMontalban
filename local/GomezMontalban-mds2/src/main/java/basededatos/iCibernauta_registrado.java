package basededatos;

import java.util.ArrayList;

import org.orm.PersistentException;

public interface iCibernauta_registrado {

	public void adjuntar_nueva_foto_de_perfil(String aFoto);

	public Categoria[] cargar_categorias_catalogo();

	public Cibernauta_registrado cargar_ficha_cliente(int aId_usuario);

	public Oferta[] cargar_ofertas();

	public ArrayList<Producto> cargar_productos_catalogo() throws PersistentException;

	public void confirmar(boolean aRespuesta);

	public void confirmar_cambios(boolean aRespuesta);

	public void enviar(String aDestinatario, String aAsunto, String aCorreo, String aAutor);

	public void adjuntar_nueva_foto_de_perfil(int aId_usuario, String aFoto);

	public void anadir_al_carrito(int aIdProducto, int aIdUsuario) throws PersistentException;

	public void aumentar_unidad_producto(int aId_item) throws PersistentException;

	public void cancelarPedido(int aId_compra);

	public void decrementar_unidad_producto(int aId_item) throws PersistentException;

	public void eliminar_producto(int aId_item);

	public void publicar(int aValoracion, String aCuerpo);

	public void publicar(int aValoracion, String aCuerpo, int aId_producto);

	public void confirmar_compra(int aId_compra);

	public void modificar_datos_personales(String nombreUsuario, String apellidos, String correo, String contrasena,
			String repetirContrasena, String telefono, String Pais, String localidad, String calle, String portal,
			String provincia, int codigoPostal, String numeroTarjeta, String titularTarjeta, String fechaCaducidad,
			int cvv, String img,int id) throws PersistentException;
}