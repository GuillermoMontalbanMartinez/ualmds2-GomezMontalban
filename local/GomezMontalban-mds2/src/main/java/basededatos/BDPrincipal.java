package basededatos;
import java.util.List;
public class BDPrincipal implements iAdministrador, iCibernauta, iCibernauta_común, iCibernauta_registrado, iCorreo, iEmpresa_de_transportes, iEncargado_de_compras, ICompra, iItem, iBanco {

	Correos db_correo;
	Administradores db_administradores;
	Cibernautas_registrados db_cibernautas_registrados;
	Encargados_de_compras db_encargado_de_compras;
	Empresas_de_transportes db_empresas_de_transporte;
	Productos db_productos;
	Reseñas db_reseña;
	Ofertas db_ofertas;
	Categorias db_categorias;
	Compras_pendientes db_compras_pendientes;
	Compras_enviadas db_compras_enviadas;
	Compras_recibidas db_compras_recibidas;
	Fotos db_fotos;
	Items db_item;

	/**
	 * 
	 * @param id_categoria
	 */
	public void baja_categoria(int id_categoria) {
		// TODO - implement BDPrincipal.baja_categoria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param id_producto
	 * @param foto1
	 * @param foto2
	 * @param foto3
	 * @param foto4
	 * @param foto5
	 */
	public void Alta_producto(String nombre, String descripcion, double precio, int id_producto, String foto1, String foto2, String foto3, String foto4, String foto5) {
		// TODO - implement BDPrincipal.Alta_producto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombreCategoria
	 */
	public void alta_categorias(String nombreCategoria) {
		// TODO - implement BDPrincipal.alta_categorias
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param correo
	 * @param contrasena
	 * @param tipoDeUsuario
	 */
	public void Alta_cuenta(String nombre, String correo, String contrasena, int tipoDeUsuario) {
		// TODO - implement BDPrincipal.Alta_cuenta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param foto
	 */
	public void adjuntar_nueva_foto_de_perfil(String foto) {
		// TODO - implement BDPrincipal.adjuntar_nueva_foto_de_perfil
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param correo
	 * @param tipoDeUsuario
	 * @param id_usuario
	 */
	public void Baja_cuenta(String correo, int tipoDeUsuario, int id_usuario) {
		// TODO - implement BDPrincipal.Baja_cuenta
		throw new UnsupportedOperationException();
	}

	public List cargar_lista_categorias() {
		// TODO - implement BDPrincipal.cargar_lista_categorias
		throw new UnsupportedOperationException();
	}

	public List cargar_lista_productos_admin() {
		// TODO - implement BDPrincipal.cargar_lista_productos_admin
		throw new UnsupportedOperationException();
	}

	public List cargar_resenas() {
		// TODO - implement BDPrincipal.cargar_resenas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param destinatario
	 * @param asunto
	 * @param correo
	 */
	public void enviar(String destinatario, String asunto, String correo) {
		// TODO - implement BDPrincipal.enviar
		throw new UnsupportedOperationException();
	}

	public List cargar_productos_mas_vendidos() {
		// TODO - implement BDPrincipal.cargar_productos_mas_vendidos
		throw new UnsupportedOperationException();
	}

	public java.util.List cargar_categorias_catalogo() {
		// TODO - implement BDPrincipal.cargar_categorias_catalogo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_usuario
	 */
	public FichaCliente cargar_ficha_cliente(int id_usuario) {
		// TODO - implement BDPrincipal.cargar_ficha_cliente
		throw new UnsupportedOperationException();
	}

	public List cargar_ofertas() {
		// TODO - implement BDPrincipal.cargar_ofertas
		throw new UnsupportedOperationException();
	}

	public List cargar_productos_catalogo() {
		// TODO - implement BDPrincipal.cargar_productos_catalogo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param respuesta
	 */
	public void confirmar(boolean respuesta) {
		// TODO - implement BDPrincipal.confirmar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param respuesta
	 */
	public void confirmar_cambios(boolean respuesta) {
		// TODO - implement BDPrincipal.confirmar_cambios
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_usuario
	 */
	public java.util.List cargar_lista_de_emails(int id_usuario) {
		// TODO - implement BDPrincipal.cargar_lista_de_emails
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mensaje
	 * @param destiantario
	 */
	public void correo_de_verificacion(String mensaje, String destiantario) {
		// TODO - implement BDPrincipal.correo_de_verificacion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_compra
	 */
	public void cancelarPedido(int id_compra) {
		// TODO - implement BDPrincipal.cancelarPedido
		throw new UnsupportedOperationException();
	}

	public java.util.List cargar_compras() {
		// TODO - implement BDPrincipal.cargar_compras
		throw new UnsupportedOperationException();
	}

	public java.util.List cargar_compras_enviadas() {
		// TODO - implement BDPrincipal.cargar_compras_enviadas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_usuario
	 */
	public List cargar_pedidos_encargados(int id_usuario) {
		// TODO - implement BDPrincipal.cargar_pedidos_encargados
		throw new UnsupportedOperationException();
	}

	public List cargar_pedidos_a_entregar() {
		// TODO - implement BDPrincipal.cargar_pedidos_a_entregar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_usuario
	 */
	public List cargar_productos_comprados_recientemente(int id_usuario) {
		// TODO - implement BDPrincipal.cargar_productos_comprados_recientemente
		throw new UnsupportedOperationException();
	}

	public List cargar_pedidos_entregados() {
		// TODO - implement BDPrincipal.cargar_pedidos_entregados
		throw new UnsupportedOperationException();
	}

	public List cargar_lista_compras_admin() {
		// TODO - implement BDPrincipal.cargar_lista_compras_admin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_compra
	 */
	public void Enviar_compra(int id_compra) {
		// TODO - implement BDPrincipal.Enviar_compra
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_item
	 */
	public void anadir_al_carrito(int id_item) {
		// TODO - implement BDPrincipal.anadir_al_carrito
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_item
	 */
	public void aumentar_unidad_producto(int id_item) {
		// TODO - implement BDPrincipal.aumentar_unidad_producto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_item
	 */
	public void decrementar_unidad_producto(int id_item) {
		// TODO - implement BDPrincipal.decrementar_unidad_producto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_item
	 */
	public void eliminar_producto(int id_item) {
		// TODO - implement BDPrincipal.eliminar_producto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_categoria
	 * @param descuento
	 * @param fechaLimite
	 */
	public void Alta_oferta_categoria(int id_categoria, double descuento, String fechaLimite) {
		// TODO - implement BDPrincipal.Alta_oferta_categoria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_producto
	 * @param descuento
	 * @param fechaLimite
	 */
	public void Alta_oferta_producto(int id_producto, double descuento, String fechaLimite) {
		// TODO - implement BDPrincipal.Alta_oferta_producto
		throw new UnsupportedOperationException();
	}

	public List cargar_listado_de_compras_admin() {
		// TODO - implement BDPrincipal.cargar_listado_de_compras_admin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param correo
	 */
	public void recuperar_contrasena(String correo) {
		// TODO - implement BDPrincipal.recuperar_contrasena
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_compra
	 */
	public void Enviar_producto(int id_compra) {
		// TODO - implement BDPrincipal.Enviar_producto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_producto
	 */
	public void Baja_producto(int id_producto) {
		// TODO - implement BDPrincipal.Baja_producto
		throw new UnsupportedOperationException();
	}

	public String recuperar_contraseña() {
		// TODO - implement BDPrincipal.recuperar_contrasena
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_usuario
	 * @param foto
	 */
	public void adjuntar_nueva_foto_de_perfil(int id_usuario, String foto) {
		// TODO - implement BDPrincipal.adjuntar_nueva_foto_de_perfil
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_item
	 */
	public void añadir_al_carrito(int id_item) {
		// TODO - implement BDPrincipal.a�adir_al_carrito
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valoracion
	 * @param cuerpo
	 * @param id_producto
	 */
	public void publicar(int valoracion, String cuerpo, int id_producto) {
		// TODO - implement BDPrincipal.publicar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id_compra
	 */
	public void confirmar_compra(int id_compra) {
		// TODO - implement BDPrincipal.confirmar_compra
		throw new UnsupportedOperationException();
	}

}