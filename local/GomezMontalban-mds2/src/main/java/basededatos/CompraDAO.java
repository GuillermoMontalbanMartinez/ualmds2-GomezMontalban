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

public class CompraDAO {
	public static Compra loadCompraByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompraByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompraByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompraByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompraByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra) session.load(basededatos.Compra.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra) session.get(basededatos.Compra.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.load(basededatos.Compra.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra getCompraByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra) session.get(basededatos.Compra.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra as Compra");
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
	
	public static List queryCompra(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra[] listCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra(session, condition, orderBy, lockMode);
			return (Compra[]) list.toArray(new Compra[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static Compra loadCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra[] compras = listCompraByQuery(session, condition, orderBy, lockMode);
		if (compras != null && compras.length > 0)
			return compras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra as Compra");
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
	
	public static java.util.Iterator iterateCompraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra as Compra");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra createCompra() {
		return new basededatos.Compra();
	}
	
	public static boolean save(basededatos.Compra compra) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Compra compra) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra compra)throws PersistentException {
		if (compra instanceof basededatos.Compra_pendiente) {
			return basededatos.Compra_pendienteDAO.deleteAndDissociate((basededatos.Compra_pendiente) compra);
		}
		
		if (compra instanceof basededatos.Compra_enviada) {
			return basededatos.Compra_enviadaDAO.deleteAndDissociate((basededatos.Compra_enviada) compra);
		}
		
		if (compra instanceof basededatos.Compra_recibida) {
			return basededatos.Compra_recibidaDAO.deleteAndDissociate((basededatos.Compra_recibida) compra);
		}
		
		try {
			if (compra.getTiene_item() != null) {
				compra.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra);
			}
			
			return delete(compra);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra compra, org.orm.PersistentSession session)throws PersistentException {
		if (compra instanceof basededatos.Compra_pendiente) {
			return basededatos.Compra_pendienteDAO.deleteAndDissociate((basededatos.Compra_pendiente) compra, session);
		}
		
		if (compra instanceof basededatos.Compra_enviada) {
			return basededatos.Compra_enviadaDAO.deleteAndDissociate((basededatos.Compra_enviada) compra, session);
		}
		
		if (compra instanceof basededatos.Compra_recibida) {
			return basededatos.Compra_recibidaDAO.deleteAndDissociate((basededatos.Compra_recibida) compra, session);
		}
		
		try {
			if (compra.getTiene_item() != null) {
				compra.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra);
			}
			
			try {
				session.delete(compra);
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
	
	public static boolean refresh(basededatos.Compra compra) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Compra compra) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(compra);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra loadCompraByCriteria(CompraCriteria compraCriteria) {
		Compra[] compras = listCompraByCriteria(compraCriteria);
		if(compras == null || compras.length == 0) {
			return null;
		}
		return compras[0];
	}
	
	public static Compra[] listCompraByCriteria(CompraCriteria compraCriteria) {
		return compraCriteria.listCompra();
	}
}
