package basededatos;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import interfaz.Cibernauta;

public class BDPrincipal implements iAdministrador, iCibernauta, iCibernauta_común, iCibernauta_registrado, iCorreo,
		iEmpresa_de_transportes, iEncargado_de_compras, ICompra, iItem, iBanco {
	public Correos _db_correo = new Correos();
	public Administradores _db_administradores = new Administradores();
	public Cibernautas_registrados _db_cibernautas_registrados = new Cibernautas_registrados();
	public Encargados_de_compras _db_encargado_de_compras;
	public Empresas_de_transportes _db_empresas_de_transporte;
	public Productos _db_productos = new Productos();
	public Resenas _db_resena = new Resenas();
	public Ofertas _db_ofertas = new Ofertas();
	public Categorias _db_categorias = new Categorias();
	public Compras_pendientes _db_compras_pendientes = new Compras_pendientes();
	public Compras_enviadas _db_compras_enviadas = new Compras_enviadas();
	public Compras_recibidas _db_compras_recibidas = new Compras_recibidas();

	public Fotos _db_fotos;
	public Items _db_item = new Items();

	public void baja_categoria(String nombreCategoria) {
		_db_categorias.baja_categoria(nombreCategoria);
	}

	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, String aFoto1, String aFoto2,
			String aFoto3, String aFoto4, String aFoto5, String categoria) throws PersistentException {
		_db_productos.Alta_producto(aNombre, aDescripcion, aPrecio, aFoto1, aFoto2, aFoto3, aFoto4, aFoto5, categoria);
	}

	public void alta_categorias(String aNombreCategoria) throws PersistentException {
		_db_categorias.alta_categorias(aNombreCategoria);
	}

	public void Alta_cuenta(String aNombre, String aCorreo, String aContrasena, int aTipoDeUsuario, String aApellidos)
			throws PersistentException {
		_db_administradores.Alta_cuenta(aNombre, aCorreo, aContrasena, aTipoDeUsuario, aApellidos);
	}

	public void adjuntar_nueva_foto_de_perfil(String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void Baja_cuenta(String aCorreo, int id_usuario) throws PersistentException {
		_db_administradores.Baja_cuenta(aCorreo, id_usuario);
	}

	public void Baja_oferta_producto(String nombreProducto) throws PersistentException {
		_db_ofertas.Baja_oferta_producto(nombreProducto);
	}

	public Categoria[] cargar_lista_categorias() {
		throw new UnsupportedOperationException();
	}

	public Producto[] cargar_lista_productos_admin() {
		throw new UnsupportedOperationException();
	}

	public Resena[] cargar_resenas(int idProducto) throws PersistentException {
		return _db_resena.cargar_resenas(idProducto);
	}

	public void enviar_admin(String aDestinatario, String aAsunto, String aCorreo) {
		try {
			_db_correo.enviar_admin(aDestinatario, aAsunto, aCorreo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public ArrayList<Producto> cargar_productos_catalogo() throws PersistentException {
		return _db_productos.cargar_productos_catalogo();
	}

	public Producto[] cargar_productos() throws PersistentException {
		return _db_productos.cargar_productos();
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
	
	public Compra[] cargar_productos_comprados_recientemente(int aId_usuario) throws PersistentException {
		return _db_compras_enviadas.cargar_productos_comprados_recientemente(aId_usuario); 
	}
	
	public Compra[] cargar_lista_compras_admin() {
		throw new UnsupportedOperationException();
	}

	public void Enviar_compra(int aId_compra) throws PersistentException {
		_db_compras_recibidas.Enviar_compra(aId_compra);
	}

	public void aumentar_unidad_producto(int aId_item) throws PersistentException {
		_db_item.aumentar_unidad_producto(aId_item);
	}

	public void decrementar_unidad_producto(int aId_item) throws PersistentException {
		_db_item.decrementar_unidad_producto(aId_item);
	}

	public void eliminar_producto(int aId_item) throws PersistentException {
		_db_item.eliminar_producto(aId_item);
	}

	public void Alta_oferta_producto(int aId_producto, int aDescuento, String aFechaLimite) throws PersistentException {
		_db_ofertas.Alta_oferta_producto(aId_producto, aDescuento, aFechaLimite);
	}

	public void recuperar_contrasena(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void Enviar_producto(int aId_compra) {
		throw new UnsupportedOperationException();
	}

	public void Baja_producto(String nombreProducto) throws PersistentException {
		_db_productos.Baja_producto(nombreProducto);
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

	public void confirmar_compra(int aId_compra) throws PersistentException {
		_db_compras_pendientes.confirmar_compra(aId_compra);
	}

	public Compra[] cargar_listado_de_compras_admin() {
		throw new UnsupportedOperationException();
	}

	public boolean Registro(String aNombre, String aApellidos, String aCorreo, String aContrasena,
			String aContrasena_rep, String aTelefono, String aPais, String aLocalidad, String aCalle, String aPortal,
			String aProvincia, int aCodigo_postal, String aN_tarjeta, String aTitular, String aFecha_caducidad,
			int aCvv, String aFoto_perfil) throws PersistentException {
		if (aNombre.isEmpty() || aContrasena.isEmpty() || aContrasena_rep.isEmpty() || aCorreo.isEmpty()
				|| !aContrasena.equals(aContrasena_rep)) {
			return false;
		} else {
			_db_cibernautas_registrados.Registro(aNombre, aApellidos, aCorreo, aContrasena, aContrasena_rep, aTelefono,
					aPais, aLocalidad, aCalle, aPortal, aProvincia, aCodigo_postal, aN_tarjeta, aTitular,
					aFecha_caducidad, aCvv, aFoto_perfil);
			return true;
		}
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

	public ArrayList<Item> cargar_productos_seleccionados(int aId_usuario) throws PersistentException {
		return _db_item.cargar_productos_seleccionados(aId_usuario);
	}

	public Categoria[] cargar_categoria() throws PersistentException {
		return _db_categorias.cargar_categoria();
	}

	@Override
	public int login(String user, String password) throws PersistentException {
		return _db_cibernautas_registrados.login(user, password);
	}

	@Override
	public void enviar(String aDestinatario, String aAsunto, String aCorreo, String aAutor) {
		try {
			_db_correo.enviar(aDestinatario, aAsunto, aCorreo, aAutor);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void modificar_datos_personales(String nombreUsuario, String apellidos, String correo, String contrasena,
			String repetirContrasena, String telefono, String Pais, String localidad, String calle, String portal,
			String provincia, int codigoPostal, String numeroTarjeta, String titularTarjeta, String fechaCaducidad,
			int cvv, String img, int id) throws PersistentException {
		_db_cibernautas_registrados.modificar_datos_personales(nombreUsuario, apellidos, correo, contrasena,
				repetirContrasena, telefono, Pais, localidad, calle, portal, provincia, codigoPostal, numeroTarjeta,
				titularTarjeta, fechaCaducidad, cvv, img, id);

	}

	public void BajaCuentaCibernautaRegistrado(int idUsuario) throws PersistentException {
		_db_cibernautas_registrados.BajaCuentaCibernautaRegistrado(idUsuario);

	}

	@Override
	public void anadir_al_carrito(int aIdProducto, int aIdUsuario) throws PersistentException {
		// TODO Auto-generated method stub

	}

	public Producto[] buscarProductos(String string) throws PersistentException {
		return _db_productos.buscarProductos(string);
	}

	
	public void volver_a_comprar(int idProducto, int idUsuario) throws PersistentException {
		 _db_item.anadir_al_carrito(idProducto, idUsuario);
	}

	@Override
	public void publicar(int aValoracion, String aCuerpo, int aId_producto, int aId_usuario)
			throws PersistentException {
		_db_resena.publicar(aValoracion, aCuerpo, aId_producto, aId_usuario);
		
	}

	@Override
	public Producto[] cargar_oferta_producto() throws PersistentException {
		return _db_ofertas.cargar_oferta_producto();
	}

}