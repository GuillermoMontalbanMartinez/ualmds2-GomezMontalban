/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ProductoDAO {
	public static Producto loadProductoByORMID(int id_producto) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id_producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id_producto) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getProductoByORMID(session, id_producto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(int id_producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id_producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id_producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getProductoByORMID(session, id_producto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id_producto) throws PersistentException {
		try {
			return (Producto) session.load(basededatos.Producto.class, new Integer(id_producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id_producto) throws PersistentException {
		try {
			return (Producto) session.get(basededatos.Producto.class, new Integer(id_producto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id_producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.load(basededatos.Producto.class, new Integer(id_producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id_producto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.get(basededatos.Producto.class, new Integer(id_producto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy, lockMode);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy, lockMode);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto createProducto() {
		return new basededatos.Producto();
	}
	
	public static boolean save(basededatos.Producto producto) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Producto producto) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Producto producto)throws PersistentException {
		try {
			if (producto.getTiene_item() != null) {
				producto.getTiene_item().setEsta_asociado_a_un_producto(null);
			}
			
			if (producto.getCategoria() != null) {
				producto.getCategoria().productos.remove(producto);
			}
			
			if (producto.getTiene_una_oferta() != null) {
				producto.getTiene_una_oferta().setEsta_asociada_a_un_producto(null);
			}
			
			basededatos.Foto[] lTiene_fotoss = producto.tiene_fotos.toArray();
			for(int i = 0; i < lTiene_fotoss.length; i++) {
				lTiene_fotoss[i].setEsta_asociada_a_un_producto(null);
			}
			basededatos.Reseña[] lTiene_reseñass = producto.tiene_reseñas.toArray();
			for(int i = 0; i < lTiene_reseñass.length; i++) {
				lTiene_reseñass[i].setEsta_asociados_a_un_producto(null);
			}
			return delete(producto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Producto producto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (producto.getTiene_item() != null) {
				producto.getTiene_item().setEsta_asociado_a_un_producto(null);
			}
			
			if (producto.getCategoria() != null) {
				producto.getCategoria().productos.remove(producto);
			}
			
			if (producto.getTiene_una_oferta() != null) {
				producto.getTiene_una_oferta().setEsta_asociada_a_un_producto(null);
			}
			
			basededatos.Foto[] lTiene_fotoss = producto.tiene_fotos.toArray();
			for(int i = 0; i < lTiene_fotoss.length; i++) {
				lTiene_fotoss[i].setEsta_asociada_a_un_producto(null);
			}
			basededatos.Reseña[] lTiene_reseñass = producto.tiene_reseñas.toArray();
			for(int i = 0; i < lTiene_reseñass.length; i++) {
				lTiene_reseñass[i].setEsta_asociados_a_un_producto(null);
			}
			try {
				session.delete(producto);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Producto producto) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Producto producto) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(producto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByCriteria(ProductoCriteria productoCriteria) {
		Producto[] productos = listProductoByCriteria(productoCriteria);
		if(productos == null || productos.length == 0) {
			return null;
		}
		return productos[0];
	}
	
	public static Producto[] listProductoByCriteria(ProductoCriteria productoCriteria) {
		return productoCriteria.listProducto();
	}
}
