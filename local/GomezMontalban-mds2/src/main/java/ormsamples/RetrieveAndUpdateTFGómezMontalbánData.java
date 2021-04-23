/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTFGómezMontalbánData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Correo lbasededatosCorreo = basededatos.CorreoDAO.loadCorreoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CorreoDAO.save(lbasededatosCorreo);
			basededatos.Usuarios lbasededatosUsuarios = basededatos.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuariosDAO.save(lbasededatosUsuarios);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Cibernauta_registrado lbasededatosCibernauta_registrado = basededatos.Cibernauta_registradoDAO.loadCibernauta_registradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Cibernauta_registradoDAO.save(lbasededatosCibernauta_registrado);
			basededatos.Encargado_de_compras lbasededatosEncargado_de_compras = basededatos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Encargado_de_comprasDAO.save(lbasededatosEncargado_de_compras);
			basededatos.Empresa_de_transportes lbasededatosEmpresa_de_transportes = basededatos.Empresa_de_transportesDAO.loadEmpresa_de_transportesByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Empresa_de_transportesDAO.save(lbasededatosEmpresa_de_transportes);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ProductoDAO.save(lbasededatosProducto);
			basededatos.Resena lbasededatosResena = basededatos.ResenaDAO.loadResenaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ResenaDAO.save(lbasededatosResena);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.OfertaDAO.save(lbasededatosOferta);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CategoriaDAO.save(lbasededatosCategoria);
			basededatos.Compra lbasededatosCompra = basededatos.CompraDAO.loadCompraByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CompraDAO.save(lbasededatosCompra);
			basededatos.Compra_pendiente lbasededatosCompra_pendiente = basededatos.Compra_pendienteDAO.loadCompra_pendienteByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Compra_pendienteDAO.save(lbasededatosCompra_pendiente);
			basededatos.Compra_enviada lbasededatosCompra_enviada = basededatos.Compra_enviadaDAO.loadCompra_enviadaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Compra_enviadaDAO.save(lbasededatosCompra_enviada);
			basededatos.Compra_recibida lbasededatosCompra_recibida = basededatos.Compra_recibidaDAO.loadCompra_recibidaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Compra_recibidaDAO.save(lbasededatosCompra_recibida);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.FotoDAO.save(lbasededatosFoto);
			basededatos.Item lbasededatosItem = basededatos.ItemDAO.loadItemByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ItemDAO.save(lbasededatosItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Correo by CorreoCriteria");
		basededatos.CorreoCriteria lbasededatosCorreoCriteria = new basededatos.CorreoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCorreoCriteria.id_correo.eq();
		System.out.println(lbasededatosCorreoCriteria.uniqueCorreo());
		
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		basededatos.UsuariosCriteria lbasededatosUsuariosCriteria = new basededatos.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuariosCriteria.id_usuario.eq();
		System.out.println(lbasededatosUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.id_usuario.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Cibernauta_registrado by Cibernauta_registradoCriteria");
		basededatos.Cibernauta_registradoCriteria lbasededatosCibernauta_registradoCriteria = new basededatos.Cibernauta_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCibernauta_registradoCriteria.id_usuario.eq();
		System.out.println(lbasededatosCibernauta_registradoCriteria.uniqueCibernauta_registrado());
		
		System.out.println("Retrieving Encargado_de_compras by Encargado_de_comprasCriteria");
		basededatos.Encargado_de_comprasCriteria lbasededatosEncargado_de_comprasCriteria = new basededatos.Encargado_de_comprasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEncargado_de_comprasCriteria.id_usuario.eq();
		System.out.println(lbasededatosEncargado_de_comprasCriteria.uniqueEncargado_de_compras());
		
		System.out.println("Retrieving Empresa_de_transportes by Empresa_de_transportesCriteria");
		basededatos.Empresa_de_transportesCriteria lbasededatosEmpresa_de_transportesCriteria = new basededatos.Empresa_de_transportesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEmpresa_de_transportesCriteria.id_usuario.eq();
		System.out.println(lbasededatosEmpresa_de_transportesCriteria.uniqueEmpresa_de_transportes());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		basededatos.ProductoCriteria lbasededatosProductoCriteria = new basededatos.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosProductoCriteria.id_producto.eq();
		System.out.println(lbasededatosProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Resena by ResenaCriteria");
		basededatos.ResenaCriteria lbasededatosResenaCriteria = new basededatos.ResenaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosResenaCriteria.Id_resena.eq();
		System.out.println(lbasededatosResenaCriteria.uniqueResena());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		basededatos.OfertaCriteria lbasededatosOfertaCriteria = new basededatos.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosOfertaCriteria.id_ofertas.eq();
		System.out.println(lbasededatosOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		basededatos.CategoriaCriteria lbasededatosCategoriaCriteria = new basededatos.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCategoriaCriteria.id_categorias.eq();
		System.out.println(lbasededatosCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Compra by CompraCriteria");
		basededatos.CompraCriteria lbasededatosCompraCriteria = new basededatos.CompraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCompraCriteria.id_compra.eq();
		System.out.println(lbasededatosCompraCriteria.uniqueCompra());
		
		System.out.println("Retrieving Compra_pendiente by Compra_pendienteCriteria");
		basededatos.Compra_pendienteCriteria lbasededatosCompra_pendienteCriteria = new basededatos.Compra_pendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCompra_pendienteCriteria.id_compra.eq();
		System.out.println(lbasededatosCompra_pendienteCriteria.uniqueCompra_pendiente());
		
		System.out.println("Retrieving Compra_enviada by Compra_enviadaCriteria");
		basededatos.Compra_enviadaCriteria lbasededatosCompra_enviadaCriteria = new basededatos.Compra_enviadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCompra_enviadaCriteria.id_compra.eq();
		System.out.println(lbasededatosCompra_enviadaCriteria.uniqueCompra_enviada());
		
		System.out.println("Retrieving Compra_recibida by Compra_recibidaCriteria");
		basededatos.Compra_recibidaCriteria lbasededatosCompra_recibidaCriteria = new basededatos.Compra_recibidaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCompra_recibidaCriteria.id_compra.eq();
		System.out.println(lbasededatosCompra_recibidaCriteria.uniqueCompra_recibida());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		basededatos.FotoCriteria lbasededatosFotoCriteria = new basededatos.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosFotoCriteria.id_foto.eq();
		System.out.println(lbasededatosFotoCriteria.uniqueFoto());
		
		System.out.println("Retrieving Item by ItemCriteria");
		basededatos.ItemCriteria lbasededatosItemCriteria = new basededatos.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosItemCriteria.id_item.eq();
		System.out.println(lbasededatosItemCriteria.uniqueItem());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTFGómezMontalbánData retrieveAndUpdateTFGómezMontalbánData = new RetrieveAndUpdateTFGómezMontalbánData();
			try {
				retrieveAndUpdateTFGómezMontalbánData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTFGómezMontalbánData.retrieveByCriteria();
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
