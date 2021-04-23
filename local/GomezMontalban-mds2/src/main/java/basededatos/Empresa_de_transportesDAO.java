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

public class Empresa_de_transportesDAO {
	public static Empresa_de_transportes loadEmpresa_de_transportesByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadEmpresa_de_transportesByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes getEmpresa_de_transportesByORMID(int id_usuario) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getEmpresa_de_transportesByORMID(session, id_usuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadEmpresa_de_transportesByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes getEmpresa_de_transportesByORMID(int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getEmpresa_de_transportesByORMID(session, id_usuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Empresa_de_transportes) session.load(basededatos.Empresa_de_transportes.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes getEmpresa_de_transportesByORMID(PersistentSession session, int id_usuario) throws PersistentException {
		try {
			return (Empresa_de_transportes) session.get(basededatos.Empresa_de_transportes.class, new Integer(id_usuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empresa_de_transportes) session.load(basededatos.Empresa_de_transportes.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes getEmpresa_de_transportesByORMID(PersistentSession session, int id_usuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empresa_de_transportes) session.get(basededatos.Empresa_de_transportes.class, new Integer(id_usuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa_de_transportes(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryEmpresa_de_transportes(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa_de_transportes(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryEmpresa_de_transportes(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes[] listEmpresa_de_transportesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listEmpresa_de_transportesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes[] listEmpresa_de_transportesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listEmpresa_de_transportesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa_de_transportes(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Empresa_de_transportes as Empresa_de_transportes");
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
	
	public static List queryEmpresa_de_transportes(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Empresa_de_transportes as Empresa_de_transportes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empresa_de_transportes", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes[] listEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpresa_de_transportes(session, condition, orderBy);
			return (Empresa_de_transportes[]) list.toArray(new Empresa_de_transportes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes[] listEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpresa_de_transportes(session, condition, orderBy, lockMode);
			return (Empresa_de_transportes[]) list.toArray(new Empresa_de_transportes[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadEmpresa_de_transportesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadEmpresa_de_transportesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Empresa_de_transportes[] empresa_de_transporteses = listEmpresa_de_transportesByQuery(session, condition, orderBy);
		if (empresa_de_transporteses != null && empresa_de_transporteses.length > 0)
			return empresa_de_transporteses[0];
		else
			return null;
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Empresa_de_transportes[] empresa_de_transporteses = listEmpresa_de_transportesByQuery(session, condition, orderBy, lockMode);
		if (empresa_de_transporteses != null && empresa_de_transporteses.length > 0)
			return empresa_de_transporteses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpresa_de_transportesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateEmpresa_de_transportesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpresa_de_transportesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateEmpresa_de_transportesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Empresa_de_transportes as Empresa_de_transportes");
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
	
	public static java.util.Iterator iterateEmpresa_de_transportesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Empresa_de_transportes as Empresa_de_transportes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empresa_de_transportes", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes createEmpresa_de_transportes() {
		return new basededatos.Empresa_de_transportes();
	}
	
	public static boolean save(basededatos.Empresa_de_transportes empresa_de_transportes) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(empresa_de_transportes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Empresa_de_transportes empresa_de_transportes) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(empresa_de_transportes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Empresa_de_transportes empresa_de_transportes)throws PersistentException {
		try {
			basededatos.Compra_enviada[] lCompra_enviadas = empresa_de_transportes.compra_enviada.toArray();
			for(int i = 0; i < lCompra_enviadas.length; i++) {
				lCompra_enviadas[i].setEmpresa_de_transportes(null);
			}
			return delete(empresa_de_transportes);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Empresa_de_transportes empresa_de_transportes, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Compra_enviada[] lCompra_enviadas = empresa_de_transportes.compra_enviada.toArray();
			for(int i = 0; i < lCompra_enviadas.length; i++) {
				lCompra_enviadas[i].setEmpresa_de_transportes(null);
			}
			try {
				session.delete(empresa_de_transportes);
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
	
	public static boolean refresh(basededatos.Empresa_de_transportes empresa_de_transportes) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(empresa_de_transportes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Empresa_de_transportes empresa_de_transportes) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(empresa_de_transportes);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa_de_transportes loadEmpresa_de_transportesByCriteria(Empresa_de_transportesCriteria empresa_de_transportesCriteria) {
		Empresa_de_transportes[] empresa_de_transporteses = listEmpresa_de_transportesByCriteria(empresa_de_transportesCriteria);
		if(empresa_de_transporteses == null || empresa_de_transporteses.length == 0) {
			return null;
		}
		return empresa_de_transporteses[0];
	}
	
	public static Empresa_de_transportes[] listEmpresa_de_transportesByCriteria(Empresa_de_transportesCriteria empresa_de_transportesCriteria) {
		return empresa_de_transportesCriteria.listEmpresa_de_transportes();
	}
}
