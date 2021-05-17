package basededatos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Items {
	public BDPrincipal _db_main_items;
	public Item _contiene_item;

//	public void anadir_al_carrito(int aId_item) throws PersistentException {
//		try {
//			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
//			Item item = basededatos.ItemDAO.createItem();
//			
//			item.setCantidad(aId_item);
//			item.setEsta_asociado_a_un_producto(null);
//			item.setEsta_asociado_a_una_compra(null);
//			
//			
//			pt.commit();
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
//		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
//	}

	
//	public void anadir_al_carrito(int aId_item) {
//		throw new UnsupportedOperationException();
//	}
	
	public void anadir_al_carrito(int idProducto) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession().beginTransaction();
			Item item = basededatos.ItemDAO.createItem();
			item.setCantidad(1);
			item.setEsta_asociado_a_un_producto(basededatos.ProductoDAO.getProductoByORMID(idProducto));
			// item.setEsta_asociado_a_una_compra(compra);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

//	public void aumentar_unidad_producto(int aId_item) {
//		throw new UnsupportedOperationException();
//	}
	
	
	
	
	
	
	
	
	
	
//	public void asociar_foto(Producto producto, String link) throws PersistentException {
//		try {
//			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
//					.beginTransaction();
//						
//					Foto foto = basededatos.FotoDAO.createFoto();
//					foto.setLink_foto(link);
//					foto.setEsta_asociada_a_un_producto(basededatos.ProductoDAO.getProductoByORMID(producto.getORMID()));
//					basededatos.FotoDAO.save(foto);		
//			pt.commit();
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
//		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
//	}
// 	
//	public void Alta_producto(String aNombre, String aDescripcion, double aPrecio, String aFoto1, String aFoto2,
//			String aFoto3, String aFoto4, String aFoto5, String categoria) throws PersistentException {
//		try {
//			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
//					.beginTransaction();
//
//			Producto producto = basededatos.ProductoDAO.createProducto();
//			Categoria[] categorias = basededatos.CategoriaDAO.listCategoriaByQuery(null, null);
//
//			for (Categoria cat : categorias) {
//				if (cat.getNombre().equals(categoria)) {
//					producto.setCategoria(cat);
//				}
//			}
//
//			producto.setNombre(aNombre);
//			producto.setDescripción(aDescripcion);
//			producto.setPrecio(aPrecio);
//
//			basededatos.ProductoDAO.save(producto);
//			
//			asociar_foto(producto,aFoto1 );
//			asociar_foto(producto,aFoto2 );
//			asociar_foto(producto,aFoto3 );
//			asociar_foto(producto,aFoto4 );
//			asociar_foto(producto,aFoto5 );
//			
//			pt.commit();
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
//		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
//	}
	
	public void decrementar_unidad_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public Item[] cargar_productos_seleccionados(int aId_usuario) {
		throw new UnsupportedOperationException();
	}
}