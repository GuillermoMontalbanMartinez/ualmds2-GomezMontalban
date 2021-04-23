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

public class Cibernauta_registradoDAO {
	public static Cibernauta_registrado loadCibernauta_registradoByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCibernauta_registradoByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado getCibernauta_registradoByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCibernauta_registradoByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCibernauta_registradoByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado getCibernauta_registradoByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCibernauta_registradoByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Cibernauta_registrado) session.load(basededatos.Cibernauta_registrado.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado getCibernauta_registradoByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Cibernauta_registrado) session.get(basededatos.Cibernauta_registrado.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta_registrado) session.load(basededatos.Cibernauta_registrado.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado getCibernauta_registradoByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta_registrado) session.get(basededatos.Cibernauta_registrado.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta_registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCibernauta_registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta_registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCibernauta_registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado[] listCibernauta_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCibernauta_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado[] listCibernauta_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCibernauta_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta_registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cibernauta_registrado as Cibernauta_registrado");
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
	
	public static List queryCibernauta_registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cibernauta_registrado as Cibernauta_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cibernauta_registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado[] listCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCibernauta_registrado(session, condition, orderBy);
			return (Cibernauta_registrado[]) list.toArray(new Cibernauta_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado[] listCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCibernauta_registrado(session, condition, orderBy, lockMode);
			return (Cibernauta_registrado[]) list.toArray(new Cibernauta_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCibernauta_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCibernauta_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cibernauta_registrado[] cibernauta_registrados = listCibernauta_registradoByQuery(session, condition, orderBy);
		if (cibernauta_registrados != null && cibernauta_registrados.length > 0)
			return cibernauta_registrados[0];
		else
			return null;
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cibernauta_registrado[] cibernauta_registrados = listCibernauta_registradoByQuery(session, condition, orderBy, lockMode);
		if (cibernauta_registrados != null && cibernauta_registrados.length > 0)
			return cibernauta_registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCibernauta_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCibernauta_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernauta_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCibernauta_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cibernauta_registrado as Cibernauta_registrado");
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
	
	public static java.util.Iterator iterateCibernauta_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cibernauta_registrado as Cibernauta_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cibernauta_registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado createCibernauta_registrado() {
		return new basededatos.Cibernauta_registrado();
	}
	
	public static boolean save(basededatos.Cibernauta_registrado cibernauta_registrado) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(cibernauta_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cibernauta_registrado cibernauta_registrado) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(cibernauta_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cibernauta_registrado cibernauta_registrado)throws PersistentException {
		try {
			basededatos.Resena[] lRealiza_reseñas = cibernauta_registrado.realiza_reseña.toArray();
			for(int i = 0; i < lRealiza_reseñas.length; i++) {
				lRealiza_reseñas[i].setEsta_asociada_a_un_cibernauta_registrado(null);
			}
			basededatos.Compra[] lTiene_compras = cibernauta_registrado.tiene_compra.toArray();
			for(int i = 0; i < lTiene_compras.length; i++) {
				lTiene_compras[i].setTiene_asociado_un_cibernauta_registrado(null);
			}
			basededatos.Correo[] lTiene_correoss = cibernauta_registrado.tiene_correos.toArray();
			for(int i = 0; i < lTiene_correoss.length; i++) {
				lTiene_correoss[i].setPertenece_a_un_cibernauta_registrado(null);
			}
			return delete(cibernauta_registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cibernauta_registrado cibernauta_registrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Resena[] lRealiza_reseñas = cibernauta_registrado.realiza_reseña.toArray();
			for(int i = 0; i < lRealiza_reseñas.length; i++) {
				lRealiza_reseñas[i].setEsta_asociada_a_un_cibernauta_registrado(null);
			}
			basededatos.Compra[] lTiene_compras = cibernauta_registrado.tiene_compra.toArray();
			for(int i = 0; i < lTiene_compras.length; i++) {
				lTiene_compras[i].setTiene_asociado_un_cibernauta_registrado(null);
			}
			basededatos.Correo[] lTiene_correoss = cibernauta_registrado.tiene_correos.toArray();
			for(int i = 0; i < lTiene_correoss.length; i++) {
				lTiene_correoss[i].setPertenece_a_un_cibernauta_registrado(null);
			}
			try {
				session.delete(cibernauta_registrado);
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
	
	public static boolean refresh(basededatos.Cibernauta_registrado cibernauta_registrado) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(cibernauta_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cibernauta_registrado cibernauta_registrado) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(cibernauta_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta_registrado loadCibernauta_registradoByCriteria(Cibernauta_registradoCriteria cibernauta_registradoCriteria) {
		Cibernauta_registrado[] cibernauta_registrados = listCibernauta_registradoByCriteria(cibernauta_registradoCriteria);
		if(cibernauta_registrados == null || cibernauta_registrados.length == 0) {
			return null;
		}
		return cibernauta_registrados[0];
	}
	
	public static Cibernauta_registrado[] listCibernauta_registradoByCriteria(Cibernauta_registradoCriteria cibernauta_registradoCriteria) {
		return cibernauta_registradoCriteria.listCibernauta_registrado();
	}
}
