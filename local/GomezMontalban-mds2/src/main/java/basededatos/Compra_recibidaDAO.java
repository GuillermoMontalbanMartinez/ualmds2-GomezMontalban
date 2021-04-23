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

public class Compra_recibidaDAO {
	public static Compra_recibida loadCompra_recibidaByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_recibidaByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida getCompra_recibidaByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_recibidaByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_recibidaByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida getCompra_recibidaByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_recibidaByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_recibida) session.load(basededatos.Compra_recibida.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida getCompra_recibidaByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_recibida) session.get(basededatos.Compra_recibida.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_recibida) session.load(basededatos.Compra_recibida.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida getCompra_recibidaByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_recibida) session.get(basededatos.Compra_recibida.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_recibida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_recibida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_recibida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_recibida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida[] listCompra_recibidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_recibidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida[] listCompra_recibidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_recibidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_recibida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_recibida as Compra_recibida");
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
	
	public static List queryCompra_recibida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_recibida as Compra_recibida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_recibida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida[] listCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra_recibida(session, condition, orderBy);
			return (Compra_recibida[]) list.toArray(new Compra_recibida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida[] listCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra_recibida(session, condition, orderBy, lockMode);
			return (Compra_recibida[]) list.toArray(new Compra_recibida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_recibidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_recibidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra_recibida[] compra_recibidas = listCompra_recibidaByQuery(session, condition, orderBy);
		if (compra_recibidas != null && compra_recibidas.length > 0)
			return compra_recibidas[0];
		else
			return null;
	}
	
	public static Compra_recibida loadCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra_recibida[] compra_recibidas = listCompra_recibidaByQuery(session, condition, orderBy, lockMode);
		if (compra_recibidas != null && compra_recibidas.length > 0)
			return compra_recibidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompra_recibidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_recibidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_recibidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_recibidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_recibida as Compra_recibida");
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
	
	public static java.util.Iterator iterateCompra_recibidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_recibida as Compra_recibida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_recibida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida createCompra_recibida() {
		return new basededatos.Compra_recibida();
	}
	
	public static boolean save(basededatos.Compra_recibida compra_recibida) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(compra_recibida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Compra_recibida compra_recibida) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(compra_recibida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_recibida compra_recibida)throws PersistentException {
		try {
			if (compra_recibida.getTiene_item() != null) {
				compra_recibida.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_recibida.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_recibida.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_recibida);
			}
			
			return delete(compra_recibida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_recibida compra_recibida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (compra_recibida.getTiene_item() != null) {
				compra_recibida.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_recibida.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_recibida.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_recibida);
			}
			
			try {
				session.delete(compra_recibida);
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
	
	public static boolean refresh(basededatos.Compra_recibida compra_recibida) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(compra_recibida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Compra_recibida compra_recibida) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(compra_recibida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_recibida loadCompra_recibidaByCriteria(Compra_recibidaCriteria compra_recibidaCriteria) {
		Compra_recibida[] compra_recibidas = listCompra_recibidaByCriteria(compra_recibidaCriteria);
		if(compra_recibidas == null || compra_recibidas.length == 0) {
			return null;
		}
		return compra_recibidas[0];
	}
	
	public static Compra_recibida[] listCompra_recibidaByCriteria(Compra_recibidaCriteria compra_recibidaCriteria) {
		return compra_recibidaCriteria.listCompra_recibida();
	}
}
