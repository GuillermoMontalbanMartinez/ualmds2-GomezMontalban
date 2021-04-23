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

public class ReseñaDAO {
	public static Reseña loadReseñaByORMID(int Id_reseña) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadReseñaByORMID(session, Id_reseña);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña getReseñaByORMID(int Id_reseña) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getReseñaByORMID(session, Id_reseña);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByORMID(int Id_reseña, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadReseñaByORMID(session, Id_reseña, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña getReseñaByORMID(int Id_reseña, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getReseñaByORMID(session, Id_reseña, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByORMID(PersistentSession session, int Id_reseña) throws PersistentException {
		try {
			return (Reseña) session.load(basededatos.Reseña.class, new Integer(Id_reseña));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña getReseñaByORMID(PersistentSession session, int Id_reseña) throws PersistentException {
		try {
			return (Reseña) session.get(basededatos.Reseña.class, new Integer(Id_reseña));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByORMID(PersistentSession session, int Id_reseña, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reseña) session.load(basededatos.Reseña.class, new Integer(Id_reseña), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña getReseñaByORMID(PersistentSession session, int Id_reseña, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reseña) session.get(basededatos.Reseña.class, new Integer(Id_reseña), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReseña(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryReseña(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReseña(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryReseña(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña[] listReseñaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listReseñaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña[] listReseñaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listReseñaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReseña(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Reseña as Reseña");
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
	
	public static List queryReseña(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Reseña as Reseña");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reseña", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña[] listReseñaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReseña(session, condition, orderBy);
			return (Reseña[]) list.toArray(new Reseña[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña[] listReseñaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReseña(session, condition, orderBy, lockMode);
			return (Reseña[]) list.toArray(new Reseña[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadReseñaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadReseñaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reseña[] reseñas = listReseñaByQuery(session, condition, orderBy);
		if (reseñas != null && reseñas.length > 0)
			return reseñas[0];
		else
			return null;
	}
	
	public static Reseña loadReseñaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reseña[] reseñas = listReseñaByQuery(session, condition, orderBy, lockMode);
		if (reseñas != null && reseñas.length > 0)
			return reseñas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReseñaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateReseñaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReseñaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateReseñaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReseñaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Reseña as Reseña");
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
	
	public static java.util.Iterator iterateReseñaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Reseña as Reseña");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reseña", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña createReseña() {
		return new basededatos.Reseña();
	}
	
	public static boolean save(basededatos.Reseña reseña) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(reseña);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Reseña reseña) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(reseña);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Reseña reseña)throws PersistentException {
		try {
			if (reseña.getEsta_asociados_a_un_producto() != null) {
				reseña.getEsta_asociados_a_un_producto().tiene_reseñas.remove(reseña);
			}
			
			if (reseña.getEsta_asociada_a_un_cibernauta_registrado() != null) {
				reseña.getEsta_asociada_a_un_cibernauta_registrado().realiza_reseña.remove(reseña);
			}
			
			return delete(reseña);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Reseña reseña, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (reseña.getEsta_asociados_a_un_producto() != null) {
				reseña.getEsta_asociados_a_un_producto().tiene_reseñas.remove(reseña);
			}
			
			if (reseña.getEsta_asociada_a_un_cibernauta_registrado() != null) {
				reseña.getEsta_asociada_a_un_cibernauta_registrado().realiza_reseña.remove(reseña);
			}
			
			try {
				session.delete(reseña);
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
	
	public static boolean refresh(basededatos.Reseña reseña) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(reseña);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Reseña reseña) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(reseña);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reseña loadReseñaByCriteria(ReseñaCriteria reseñaCriteria) {
		Reseña[] reseñas = listReseñaByCriteria(reseñaCriteria);
		if(reseñas == null || reseñas.length == 0) {
			return null;
		}
		return reseñas[0];
	}
	
	public static Reseña[] listReseñaByCriteria(ReseñaCriteria reseñaCriteria) {
		return reseñaCriteria.listReseña();
	}
}
