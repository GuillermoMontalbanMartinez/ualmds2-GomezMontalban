package basededatos;

public interface iCibernauta_registrado {

	public void adjuntar_nueva_foto_de_perfil(String aFoto);

	public Categoria[] cargar_categorias_catalogo();

	public Cibernauta_registrado cargar_ficha_cliente(int aId_usuario);

	public Oferta[] cargar_ofertas();

	public Producto[] cargar_productos_catalogo();

	public void confirmar(boolean aRespuesta);

	public void confirmar_cambios(boolean aRespuesta);

	public void enviar(String aDestinatario, String aAsunto, String aCorreo);

	public void adjuntar_nueva_foto_de_perfil(int aId_usuario, String aFoto);

	public void anadir_al_carrito(int aId_item);

	public void aumentar_unidad_producto(int aId_item);

	public void cancelarPedido(int aId_compra);

	public void decrementar_unidad_producto(int aId_item);

	public void eliminar_producto(int aId_item);

	public void publicar(int aValoracion, String aCuerpo);

	public void publicar(int aValoracion, String aCuerpo, int aId_producto);

	public void confirmar_compra(int aId_compra);
}