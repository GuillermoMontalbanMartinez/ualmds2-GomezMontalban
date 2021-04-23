/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTFGómezMontalbánData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Correo lbasededatosCorreo = basededatos.CorreoDAO.loadCorreoByQuery(null, null);
			// Delete the persistent object
			basededatos.CorreoDAO.delete(lbasededatosCorreo);
			basededatos.Usuarios lbasededatosUsuarios = basededatos.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuariosDAO.delete(lbasededatosUsuarios);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			basededatos.Cibernauta_registrado lbasededatosCibernauta_registrado = basededatos.Cibernauta_registradoDAO.loadCibernauta_registradoByQuery(null, null);
			// Delete the persistent object
			basededatos.Cibernauta_registradoDAO.delete(lbasededatosCibernauta_registrado);
			basededatos.Encargado_de_compras lbasededatosEncargado_de_compras = basededatos.Encargado_de_comprasDAO.loadEncargado_de_comprasByQuery(null, null);
			// Delete the persistent object
			basededatos.Encargado_de_comprasDAO.delete(lbasededatosEncargado_de_compras);
			basededatos.Empresa_de_transportes lbasededatosEmpresa_de_transportes = basededatos.Empresa_de_transportesDAO.loadEmpresa_de_transportesByQuery(null, null);
			// Delete the persistent object
			basededatos.Empresa_de_transportesDAO.delete(lbasededatosEmpresa_de_transportes);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			basededatos.ProductoDAO.delete(lbasededatosProducto);
			basededatos.Reseña lbasededatosReseña = basededatos.ReseñaDAO.loadReseñaByQuery(null, null);
			// Delete the persistent object
			basededatos.ReseñaDAO.delete(lbasededatosReseña);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			basededatos.OfertaDAO.delete(lbasededatosOferta);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			basededatos.CategoriaDAO.delete(lbasededatosCategoria);
			basededatos.Compra lbasededatosCompra = basededatos.CompraDAO.loadCompraByQuery(null, null);
			// Delete the persistent object
			basededatos.CompraDAO.delete(lbasededatosCompra);
			basededatos.Compra_pendiente lbasededatosCompra_pendiente = basededatos.Compra_pendienteDAO.loadCompra_pendienteByQuery(null, null);
			// Delete the persistent object
			basededatos.Compra_pendienteDAO.delete(lbasededatosCompra_pendiente);
			basededatos.Compra_enviada lbasededatosCompra_enviada = basededatos.Compra_enviadaDAO.loadCompra_enviadaByQuery(null, null);
			// Delete the persistent object
			basededatos.Compra_enviadaDAO.delete(lbasededatosCompra_enviada);
			basededatos.Compra_recibida lbasededatosCompra_recibida = basededatos.Compra_recibidaDAO.loadCompra_recibidaByQuery(null, null);
			// Delete the persistent object
			basededatos.Compra_recibidaDAO.delete(lbasededatosCompra_recibida);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			basededatos.FotoDAO.delete(lbasededatosFoto);
			basededatos.Item lbasededatosItem = basededatos.ItemDAO.loadItemByQuery(null, null);
			// Delete the persistent object
			basededatos.ItemDAO.delete(lbasededatosItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTFGómezMontalbánData deleteTFGómezMontalbánData = new DeleteTFGómezMontalbánData();
			try {
				deleteTFGómezMontalbánData.deleteTestData();
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
