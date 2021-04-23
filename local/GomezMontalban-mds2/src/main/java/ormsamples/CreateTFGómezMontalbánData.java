/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTFGómezMontalbánData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Correo lbasededatosCorreo = basededatos.CorreoDAO.createCorreo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : remitente, pertenece_a_un_cibernauta_registrado, leido, receptor
			basededatos.CorreoDAO.save(lbasededatosCorreo);
			basededatos.Usuarios lbasededatosUsuarios = basededatos.UsuariosDAO.createUsuarios();
			// Initialize the properties of the persistent object here
			basededatos.UsuariosDAO.save(lbasededatosUsuarios);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Cibernauta_registrado lbasededatosCibernauta_registrado = basededatos.Cibernauta_registradoDAO.createCibernauta_registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_correos, tiene_compra, realiza_reseña, cvv, cp
			basededatos.Cibernauta_registradoDAO.save(lbasededatosCibernauta_registrado);
			basededatos.Encargado_de_compras lbasededatosEncargado_de_compras = basededatos.Encargado_de_comprasDAO.createEncargado_de_compras();
			// Initialize the properties of the persistent object here
			basededatos.Encargado_de_comprasDAO.save(lbasededatosEncargado_de_compras);
			basededatos.Empresa_de_transportes lbasededatosEmpresa_de_transportes = basededatos.Empresa_de_transportesDAO.createEmpresa_de_transportes();
			// Initialize the properties of the persistent object here
			basededatos.Empresa_de_transportesDAO.save(lbasededatosEmpresa_de_transportes);
			basededatos.Producto lbasededatosProducto = basededatos.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_reseñas, tiene_fotos, precio, categoria, tiene_item
			basededatos.ProductoDAO.save(lbasededatosProducto);
			basededatos.Resena lbasededatosResena = basededatos.ResenaDAO.createResena();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esta_asociada_a_un_cibernauta_registrado, valoracion, esta_asociados_a_un_producto
			basededatos.ResenaDAO.save(lbasededatosResena);
			basededatos.Oferta lbasededatosOferta = basededatos.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio_oferta
			basededatos.OfertaDAO.save(lbasededatosOferta);
			basededatos.Categoria lbasededatosCategoria = basededatos.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productos
			basededatos.CategoriaDAO.save(lbasededatosCategoria);
			basededatos.Compra lbasededatosCompra = basededatos.CompraDAO.createCompra();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_asociado_un_cibernauta_registrado, precio_compra, total_productos, tiene_item
			basededatos.CompraDAO.save(lbasededatosCompra);
			basededatos.Compra_pendiente lbasededatosCompra_pendiente = basededatos.Compra_pendienteDAO.createCompra_pendiente();
			// Initialize the properties of the persistent object here
			basededatos.Compra_pendienteDAO.save(lbasededatosCompra_pendiente);
			basededatos.Compra_enviada lbasededatosCompra_enviada = basededatos.Compra_enviadaDAO.createCompra_enviada();
			// Initialize the properties of the persistent object here
			basededatos.Compra_enviadaDAO.save(lbasededatosCompra_enviada);
			basededatos.Compra_recibida lbasededatosCompra_recibida = basededatos.Compra_recibidaDAO.createCompra_recibida();
			// Initialize the properties of the persistent object here
			basededatos.Compra_recibidaDAO.save(lbasededatosCompra_recibida);
			basededatos.Foto lbasededatosFoto = basededatos.FotoDAO.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esta_asociada_a_un_producto, id_foto
			basededatos.FotoDAO.save(lbasededatosFoto);
			basededatos.Item lbasededatosItem = basededatos.ItemDAO.createItem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : esta_asociado_a_un_producto, esta_asociado_a_una_compra, cantidad
			basededatos.ItemDAO.save(lbasededatosItem);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTFGómezMontalbánData createTFGómezMontalbánData = new CreateTFGómezMontalbánData();
			try {
				createTFGómezMontalbánData.createTestData();
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
