package basededatos;

public class BDPrincipal implements iAdministrador, iCibernauta, iCibernauta_común, iCibernauta_registrado, iCorreo, iEmpresa_de_transportes, iEncargado_de_compras, ICompra, iItem, iBanco {
	public Correos _db_correo;
	public Administradores _db_administradores;
	public Cibernautas_registrados _db_cibernautas_registrados;
	public Encargados_de_compras _db_encargado_de_compras;
	public Empresas_de_transportes _db_empresas_de_transporte;
	public Productos _db_productos;
	public Resenas _db_resena;
	public Ofertas _db_ofertas;
	public Categorias _db_categorias;
	public Compras_pendientes _db_compras_pendientes;
	public Compras_enviadas _db_compras_enviadas;
	public Compras_recibidas _db_compras_recibidas;
	public Fotos _db_fotos;
	public Items _db_item;

	public void baja_categoria(int aId_categoria) {
		throw new UnsupportedOperationException();
	}

	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, int aId_producto, String aFoto1, String aFoto2, String aFoto3, String aFoto4, String aFoto5) {
		throw new UnsupportedOperationException();
	}

	public void alta_categorias(String aNombreCategoria) {
		throw new UnsupportedOperationException();
	}

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario) {
		throw new UnsupportedOperationException();
	}

	public void adjuntar_nueva_foto_de_perfil(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void Baja_cuenta(String aCorreo, int aTipoDeUsuario, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_lista_categorias() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_lista_productos_admin() {
		throw new UnsupportedOperationException();
	}

	public Resena[] cargar_resenas() {
		throw new UnsupportedOperationException();
	}

	public void enviar(String aDestinatario, String aAsunto, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_mas_vendidos() {
		throw new UnsupportedOperationException();
	}

	public Categoria[] cargar_categorias_catalogo() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_registrado cargar_ficha_cliente(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] cargar_ofertas() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_productos_catalogo() {
		throw new UnsupportedOperationException();
	}

	public void confirmar(boolean aRespuesta) {
		throw new UnsupportedOperationException();
	}

	public void confirmar_cambios(boolean aRespuesta) {
		throw new UnsupportedOperationException();
	}

	public Correo[] cargar_lista_de_emails(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void correo_de_verificacion(String aMensaje, String aDestiantario) {
		throw new UnsupportedOperationException();
	}

	public void cancelarPedido(int aId_compra) {
		throw new UnsupportedOperationException();
	}

	public Compra_recibida[] cargar_compras() {
		throw new UnsupportedOperationException();
	}

	public Compra_enviada[] cargar_compras_enviadas() {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargar_pedidos_encargados(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Compra_pendiente[] cargar_pedidos_a_entregar() {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargar_productos_comprados_recientemente(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargar_lista_compras_admin() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_compra(int aId_compra) {
		throw new UnsupportedOperationException();
	}

	public void aumentar_unidad_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public void decrementar_unidad_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_categoria(int aId_categoria, double aDescuento, String aFechaLimite) {
		throw new UnsupportedOperationException();
	}

	public void Alta_oferta_producto(int aId_producto, double aDescuento, String aFechaLimite) {
		throw new UnsupportedOperationException();
	}

	public void recuperar_contrasena(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Enviar_producto(int aId_compra) {
		throw new UnsupportedOperationException();
	}

	public void Baja_producto(int aId_producto) {
		throw new UnsupportedOperationException();
	}

	public String recuperar_contrasena() {
		throw new UnsupportedOperationException();
	}

	public void adjuntar_nueva_foto_de_perfil(int aId_usuario, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void anadir_al_carrito(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public void publicar(int aValoracion, String aCuerpo, int aId_producto) {
		throw new UnsupportedOperationException();
	}

	public void confirmar_compra(int aId_compra) {
		throw new UnsupportedOperationException();
	}

	public Compra[] cargar_listado_de_compras_admin() {
		throw new UnsupportedOperationException();
	}

	public void publicar(int aValoracion, String aCuerpo) {
		throw new UnsupportedOperationException();
	}

	public Compra_recibida[] cargar_pedidos_entregados() {
		throw new UnsupportedOperationException();
	}

	public void confirmar_compra(Object aId_compra) {
		throw new UnsupportedOperationException();
	}

	public Item[] cargar_productos_seleccionados(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	
}