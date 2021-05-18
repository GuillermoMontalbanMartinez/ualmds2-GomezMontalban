package basededatos;

import java.util.ArrayList;

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

	public void anadir_al_carrito(int idProducto, int idUsuario) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();

		try {

			Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO.getCibernauta_registradoByORMID(idUsuario);
			boolean aumentado = false;
			for (Item i : basededatos.ItemDAO.listItemByQuery(null, null)) {
				if (i.getEsta_asociado_a_un_producto().getORMID() == idProducto) {
					i.setCantidad(i.getCantidad() + 1);
					aumentado = true;
				}
			}
			if (!aumentado) {
				Producto producto = basededatos.ProductoDAO.loadProductoByORMID(idProducto);
				Item item = basededatos.ItemDAO.createItem();
				item.setCantidad(1);
				item.setEsta_asociado_a_un_producto(producto);
				basededatos.ItemDAO.save(item);

				Compra compra = basededatos.CompraDAO.createCompra();
				compra.setTotal_productos(1);
				compra.setTiene_asociado_un_cibernauta_registrado(cb);
				compra.setTiene_item(item);
				compra.setPrecio_compra(producto.getPrecio());
				basededatos.CompraDAO.save(compra);
			}

			t.commit();
			// item.setEsta_asociado_a_una_compra(compra);
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}

	public void aumentar_unidad_producto(int aId_item) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		
		Item i = basededatos.ItemDAO.getItemByORMID(aId_item);
		i.setCantidad(i.getCantidad() + 1);
		basededatos.ItemDAO.save(i);
		t.commit();


	}

	public void decrementar_unidad_producto(int aId_item) throws PersistentException {
		PersistentTransaction t = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
				.beginTransaction();
		
		Item i = basededatos.ItemDAO.getItemByORMID(aId_item);
		if(i.getCantidad()>=2) {
			i.setCantidad(i.getCantidad() - 1);
			basededatos.ItemDAO.save(i);
			t.commit();


		}
	}

	public void eliminar_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Item> cargar_productos_seleccionados(int aId_usuario) throws PersistentException {
		ArrayList<Item> items = new ArrayList<Item>();
		basededatos.Compra compras[] = basededatos.CompraDAO.listCompraByQuery(null, null);
		basededatos.Producto pro[] = basededatos.ProductoDAO.listProductoByQuery(null, null);
		for (basededatos.Compra c : compras) {
			for (basededatos.Producto p : pro) {
				if (p.getTiene_item().getORMID() == c.getTiene_item().getORMID()) {
					if (aId_usuario == c.getTiene_asociado_un_cibernauta_registrado().getORMID()) {
						items.add(c.getTiene_item());
					}
				}
			}

		}
		return items;
	}
}