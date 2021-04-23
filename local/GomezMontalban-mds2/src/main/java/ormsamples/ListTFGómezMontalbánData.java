/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListTFGómezMontalbánData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Correo...");
		basededatos.Correo[] basededatosCorreos = basededatos.CorreoDAO.listCorreoByQuery(null, null);
		int length = Math.min(basededatosCorreos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCorreos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuarios...");
		basededatos.Usuarios[] basededatosUsuarioses = basededatos.UsuariosDAO.listUsuariosByQuery(null, null);
		length = Math.min(basededatosUsuarioses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarioses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cibernauta_registrado...");
		basededatos.Cibernauta_registrado[] basededatosCibernauta_registrados = basededatos.Cibernauta_registradoDAO.listCibernauta_registradoByQuery(null, null);
		length = Math.min(basededatosCibernauta_registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCibernauta_registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado_de_compras...");
		basededatos.Encargado_de_compras[] basededatosEncargado_de_comprases = basededatos.Encargado_de_comprasDAO.listEncargado_de_comprasByQuery(null, null);
		length = Math.min(basededatosEncargado_de_comprases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empresa_de_transportes...");
		basededatos.Empresa_de_transportes[] basededatosEmpresa_de_transporteses = basededatos.Empresa_de_transportesDAO.listEmpresa_de_transportesByQuery(null, null);
		length = Math.min(basededatosEmpresa_de_transporteses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEmpresa_de_transporteses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		basededatos.Producto[] basededatosProductos = basededatos.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(basededatosProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reseña...");
		basededatos.Reseña[] basededatosReseñas = basededatos.ReseñaDAO.listReseñaByQuery(null, null);
		length = Math.min(basededatosReseñas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosReseñas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		basededatos.Oferta[] basededatosOfertas = basededatos.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(basededatosOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		basededatos.Categoria[] basededatosCategorias = basededatos.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(basededatosCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra...");
		basededatos.Compra[] basededatosCompras = basededatos.CompraDAO.listCompraByQuery(null, null);
		length = Math.min(basededatosCompras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCompras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra_pendiente...");
		basededatos.Compra_pendiente[] basededatosCompra_pendientes = basededatos.Compra_pendienteDAO.listCompra_pendienteByQuery(null, null);
		length = Math.min(basededatosCompra_pendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCompra_pendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra_enviada...");
		basededatos.Compra_enviada[] basededatosCompra_enviadas = basededatos.Compra_enviadaDAO.listCompra_enviadaByQuery(null, null);
		length = Math.min(basededatosCompra_enviadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCompra_enviadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compra_recibida...");
		basededatos.Compra_recibida[] basededatosCompra_recibidas = basededatos.Compra_recibidaDAO.listCompra_recibidaByQuery(null, null);
		length = Math.min(basededatosCompra_recibidas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCompra_recibidas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		basededatos.Foto[] basededatosFotos = basededatos.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(basededatosFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Item...");
		basededatos.Item[] basededatosItems = basededatos.ItemDAO.listItemByQuery(null, null);
		length = Math.min(basededatosItems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosItems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Correo by Criteria...");
		basededatos.CorreoCriteria lbasededatosCorreoCriteria = new basededatos.CorreoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCorreoCriteria.id_correo.eq();
		lbasededatosCorreoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Correo[] basededatosCorreos = lbasededatosCorreoCriteria.listCorreo();
		int length =basededatosCorreos== null ? 0 : Math.min(basededatosCorreos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCorreos[i]);
		}
		System.out.println(length + " Correo record(s) retrieved."); 
		
		System.out.println("Listing Usuarios by Criteria...");
		basededatos.UsuariosCriteria lbasededatosUsuariosCriteria = new basededatos.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuariosCriteria.id_usuario.eq();
		lbasededatosUsuariosCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuarios[] basededatosUsuarioses = lbasededatosUsuariosCriteria.listUsuarios();
		length =basededatosUsuarioses== null ? 0 : Math.min(basededatosUsuarioses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarioses[i]);
		}
		System.out.println(length + " Usuarios record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.id_usuario.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Cibernauta_registrado by Criteria...");
		basededatos.Cibernauta_registradoCriteria lbasededatosCibernauta_registradoCriteria = new basededatos.Cibernauta_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCibernauta_registradoCriteria.id_usuario.eq();
		lbasededatosCibernauta_registradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cibernauta_registrado[] basededatosCibernauta_registrados = lbasededatosCibernauta_registradoCriteria.listCibernauta_registrado();
		length =basededatosCibernauta_registrados== null ? 0 : Math.min(basededatosCibernauta_registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCibernauta_registrados[i]);
		}
		System.out.println(length + " Cibernauta_registrado record(s) retrieved."); 
		
		System.out.println("Listing Encargado_de_compras by Criteria...");
		basededatos.Encargado_de_comprasCriteria lbasededatosEncargado_de_comprasCriteria = new basededatos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEncargado_de_comprasCriteria.id_usuario.eq();
		lbasededatosEncargado_de_comprasCriteria.setMaxResults(ROW_COUNT);
		basededatos.Encargado_de_compras[] basededatosEncargado_de_comprases = lbasededatosEncargado_de_comprasCriteria.listEncargado_de_compras();
		length =basededatosEncargado_de_comprases== null ? 0 : Math.min(basededatosEncargado_de_comprases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEncargado_de_comprases[i]);
		}
		System.out.println(length + " Encargado_de_compras record(s) retrieved."); 
		
		System.out.println("Listing Empresa_de_transportes by Criteria...");
		basededatos.Empresa_de_transportesCriteria lbasededatosEmpresa_de_transportesCriteria = new basededatos.Empresa_de_transportesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEmpresa_de_transportesCriteria.id_usuario.eq();
		lbasededatosEmpresa_de_transportesCriteria.setMaxResults(ROW_COUNT);
		basededatos.Empresa_de_transportes[] basededatosEmpresa_de_transporteses = lbasededatosEmpresa_de_transportesCriteria.listEmpresa_de_transportes();
		length =basededatosEmpresa_de_transporteses== null ? 0 : Math.min(basededatosEmpresa_de_transporteses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEmpresa_de_transporteses[i]);
		}
		System.out.println(length + " Empresa_de_transportes record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		basededatos.ProductoCriteria lbasededatosProductoCriteria = new basededatos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosProductoCriteria.id_producto.eq();
		lbasededatosProductoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Producto[] basededatosProductos = lbasededatosProductoCriteria.listProducto();
		length =basededatosProductos== null ? 0 : Math.min(basededatosProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Reseña by Criteria...");
		basededatos.ReseñaCriteria lbasededatosReseñaCriteria = new basededatos.ReseñaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosReseñaCriteria.Id_reseña.eq();
		lbasededatosReseñaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Reseña[] basededatosReseñas = lbasededatosReseñaCriteria.listReseña();
		length =basededatosReseñas== null ? 0 : Math.min(basededatosReseñas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosReseñas[i]);
		}
		System.out.println(length + " Reseña record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		basededatos.OfertaCriteria lbasededatosOfertaCriteria = new basededatos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosOfertaCriteria.id_ofertas.eq();
		lbasededatosOfertaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Oferta[] basededatosOfertas = lbasededatosOfertaCriteria.listOferta();
		length =basededatosOfertas== null ? 0 : Math.min(basededatosOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		basededatos.CategoriaCriteria lbasededatosCategoriaCriteria = new basededatos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCategoriaCriteria.id_categorias.eq();
		lbasededatosCategoriaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Categoria[] basededatosCategorias = lbasededatosCategoriaCriteria.listCategoria();
		length =basededatosCategorias== null ? 0 : Math.min(basededatosCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Compra by Criteria...");
		basededatos.CompraCriteria lbasededatosCompraCriteria = new basededatos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCompraCriteria.id_compra.eq();
		lbasededatosCompraCriteria.setMaxResults(ROW_COUNT);
		basededatos.Compra[] basededatosCompras = lbasededatosCompraCriteria.listCompra();
		length =basededatosCompras== null ? 0 : Math.min(basededatosCompras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCompras[i]);
		}
		System.out.println(length + " Compra record(s) retrieved."); 
		
		System.out.println("Listing Compra_pendiente by Criteria...");
		basededatos.Compra_pendienteCriteria lbasededatosCompra_pendienteCriteria = new basededatos.Compra_pendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCompra_pendienteCriteria.id_compra.eq();
		lbasededatosCompra_pendienteCriteria.setMaxResults(ROW_COUNT);
		basededatos.Compra_pendiente[] basededatosCompra_pendientes = lbasededatosCompra_pendienteCriteria.listCompra_pendiente();
		length =basededatosCompra_pendientes== null ? 0 : Math.min(basededatosCompra_pendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCompra_pendientes[i]);
		}
		System.out.println(length + " Compra_pendiente record(s) retrieved."); 
		
		System.out.println("Listing Compra_enviada by Criteria...");
		basededatos.Compra_enviadaCriteria lbasededatosCompra_enviadaCriteria = new basededatos.Compra_enviadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCompra_enviadaCriteria.id_compra.eq();
		lbasededatosCompra_enviadaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Compra_enviada[] basededatosCompra_enviadas = lbasededatosCompra_enviadaCriteria.listCompra_enviada();
		length =basededatosCompra_enviadas== null ? 0 : Math.min(basededatosCompra_enviadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCompra_enviadas[i]);
		}
		System.out.println(length + " Compra_enviada record(s) retrieved."); 
		
		System.out.println("Listing Compra_recibida by Criteria...");
		basededatos.Compra_recibidaCriteria lbasededatosCompra_recibidaCriteria = new basededatos.Compra_recibidaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCompra_recibidaCriteria.id_compra.eq();
		lbasededatosCompra_recibidaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Compra_recibida[] basededatosCompra_recibidas = lbasededatosCompra_recibidaCriteria.listCompra_recibida();
		length =basededatosCompra_recibidas== null ? 0 : Math.min(basededatosCompra_recibidas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCompra_recibidas[i]);
		}
		System.out.println(length + " Compra_recibida record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		basededatos.FotoCriteria lbasededatosFotoCriteria = new basededatos.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosFotoCriteria.id_foto.eq();
		lbasededatosFotoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Foto[] basededatosFotos = lbasededatosFotoCriteria.listFoto();
		length =basededatosFotos== null ? 0 : Math.min(basededatosFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
		System.out.println("Listing Item by Criteria...");
		basededatos.ItemCriteria lbasededatosItemCriteria = new basededatos.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosItemCriteria.id_item.eq();
		lbasededatosItemCriteria.setMaxResults(ROW_COUNT);
		basededatos.Item[] basededatosItems = lbasededatosItemCriteria.listItem();
		length =basededatosItems== null ? 0 : Math.min(basededatosItems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosItems[i]);
		}
		System.out.println(length + " Item record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTFGómezMontalbánData listTFGómezMontalbánData = new ListTFGómezMontalbánData();
			try {
				listTFGómezMontalbánData.listTestData();
				//listTFGómezMontalbánData.listByCriteria();
			}
			finally {
				basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
