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

			boolean aumentado = false;
			for (Compra c : basededatos.CompraDAO.listCompraByQuery(null, null)) {
				if (c.getTiene_asociado_un_cibernauta_registrado().getORMID() == idUsuario) {
					if (c.getTiene_item().getEsta_asociado_a_un_producto().getORMID() == idProducto) {
						c.getTiene_item().setCantidad(c.getTiene_item().getCantidad() + 1);
						aumentado = true;
					}
				}
//				if (i.getEsta_asociado_a_un_producto().getORMID() == idProducto) {
//					i.setCantidad(i.getCantidad() + 1);
//					aumentado = true;
//				}
			}
			if (!aumentado) {
				Producto producto = basededatos.ProductoDAO.loadProductoByORMID(idProducto);

				Item item = basededatos.ItemDAO.createItem();
				Compra compra = basededatos.CompraDAO.createCompra();

				if (producto.getTiene_item() != null) {
					Producto aux = basededatos.ProductoDAO.createProducto();
					aux.setNombre(producto.getNombre());
					aux.setCategoria(producto.getCategoria());
					aux.setDescripción(producto.getDescripción());
					aux.setPrecio(producto.getPrecio());
					aux.setTiene_una_oferta(producto.getTiene_una_oferta());
					basededatos.ProductoDAO.save(aux);
					for (Foto f : producto.tiene_fotos.toArray()) {

						asociar_foto(aux, f.getLink_foto());

					}

					item.setEsta_asociado_a_un_producto(aux);
					compra.setPrecio_compra(aux.getPrecio());

					item.setCantidad(1);
					basededatos.ItemDAO.save(item);
					Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO
							.getCibernauta_registradoByORMID(idUsuario);

					compra.setTotal_productos(1);
					compra.setTiene_asociado_un_cibernauta_registrado(cb);
					compra.setTiene_item(item);
					basededatos.CompraDAO.save(compra);

				} else {
					item.setEsta_asociado_a_un_producto(producto);
					compra.setPrecio_compra(producto.getPrecio());
					item.setCantidad(1);
					basededatos.ItemDAO.save(item);
					Cibernauta_registrado cb = basededatos.Cibernauta_registradoDAO
							.getCibernauta_registradoByORMID(idUsuario);

					compra.setTotal_productos(1);
					compra.setTiene_asociado_un_cibernauta_registrado(cb);
					compra.setTiene_item(item);
					basededatos.CompraDAO.save(compra);

				}

			}

			
			// item.setEsta_asociado_a_una_compra(compra);
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		t.commit();
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
		if (i.getCantidad() >= 2) {
			i.setCantidad(i.getCantidad() - 1);
			basededatos.ItemDAO.save(i);
			t.commit();

		}
	}

	public void eliminar_producto(int aId_item) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Item> cargar_productos_seleccionados(int aId_usuario) throws PersistentException {
		try {
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
		} catch (Exception e) {
			System.out.println("Yikes");
			return null;
		}
	}

	public void asociar_foto(Producto producto, String link) throws PersistentException {
		try {
			PersistentTransaction pt = basededatos.TFGómezMontalbánPersistentManager.instance().getSession()
					.beginTransaction();

			Foto foto = basededatos.FotoDAO.createFoto();
			foto.setLink_foto(link);
			foto.setEsta_asociada_a_un_producto(basededatos.ProductoDAO.getProductoByORMID(producto.getORMID()));
			basededatos.FotoDAO.save(foto);
			pt.commit();
			try{ Thread.sleep(500); } catch (InterruptedException e ) { System.out.println("Pausa"); }
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
	}
}