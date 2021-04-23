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

public class ResenaDAO {
	public static Resena loadResenaByORMID(int Id_resena) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadResenaByORMID(session, Id_resena);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena getResenaByORMID(int Id_resena) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getResenaByORMID(session, Id_resena);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByORMID(int Id_resena, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadResenaByORMID(session, Id_resena, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena getResenaByORMID(int Id_resena, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getResenaByORMID(session, Id_resena, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByORMID(PersistentSession session, int Id_resena) throws PersistentException {
		try {
			return (Resena) session.load(basededatos.Resena.class, new Integer(Id_resena));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena getResenaByORMID(PersistentSession session, int Id_resena) throws PersistentException {
		try {
			return (Resena) session.get(basededatos.Resena.class, new Integer(Id_resena));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByORMID(PersistentSession session, int Id_resena, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Resena) session.load(basededatos.Resena.class, new Integer(Id_resena), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena getResenaByORMID(PersistentSession session, int Id_resena, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Resena) session.get(basededatos.Resena.class, new Integer(Id_resena), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResena(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryResena(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResena(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryResena(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena[] listResenaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listResenaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena[] listResenaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listResenaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryResena(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Resena as Resena");
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
	
	public static List queryResena(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Resena as Resena");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Resena", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena[] listResenaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryResena(session, condition, orderBy);
			return (Resena[]) list.toArray(new Resena[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena[] listResenaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryResena(session, condition, orderBy, lockMode);
			return (Resena[]) list.toArray(new Resena[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadResenaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadResenaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Resena[] resenas = listResenaByQuery(session, condition, orderBy);
		if (resenas != null && resenas.length > 0)
			return resenas[0];
		else
			return null;
	}
	
	public static Resena loadResenaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Resena[] resenas = listResenaByQuery(session, condition, orderBy, lockMode);
		if (resenas != null && resenas.length > 0)
			return resenas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateResenaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateResenaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResenaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateResenaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateResenaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Resena as Resena");
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
	
	public static java.util.Iterator iterateResenaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Resena as Resena");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Resena", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena createResena() {
		return new basededatos.Resena();
	}
	
	public static boolean save(basededatos.Resena resena) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(resena);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Resena resena) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(resena);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Resena resena)throws PersistentException {
		try {
			if (resena.getEsta_asociados_a_un_producto() != null) {
				resena.getEsta_asociados_a_un_producto().tiene_reseñas.remove(resena);
			}
			
			if (resena.getEsta_asociada_a_un_cibernauta_registrado() != null) {
				resena.getEsta_asociada_a_un_cibernauta_registrado().realiza_reseña.remove(resena);
			}
			
			return delete(resena);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Resena resena, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (resena.getEsta_asociados_a_un_producto() != null) {
				resena.getEsta_asociados_a_un_producto().tiene_reseñas.remove(resena);
			}
			
			if (resena.getEsta_asociada_a_un_cibernauta_registrado() != null) {
				resena.getEsta_asociada_a_un_cibernauta_registrado().realiza_reseña.remove(resena);
			}
			
			try {
				session.delete(resena);
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
	
	public static boolean refresh(basededatos.Resena resena) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(resena);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Resena resena) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(resena);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Resena loadResenaByCriteria(ResenaCriteria resenaCriteria) {
		Resena[] resenas = listResenaByCriteria(resenaCriteria);
		if(resenas == null || resenas.length == 0) {
			return null;
		}
		return resenas[0];
	}
	
	public static Resena[] listResenaByCriteria(ResenaCriteria resenaCriteria) {
		return resenaCriteria.listResena();
	}
}
