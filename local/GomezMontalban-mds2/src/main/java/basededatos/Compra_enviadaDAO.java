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

public class Compra_enviadaDAO {
	public static Compra_enviada loadCompra_enviadaByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_enviadaByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada getCompra_enviadaByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_enviadaByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_enviadaByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada getCompra_enviadaByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_enviadaByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_enviada) session.load(basededatos.Compra_enviada.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada getCompra_enviadaByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_enviada) session.get(basededatos.Compra_enviada.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_enviada) session.load(basededatos.Compra_enviada.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada getCompra_enviadaByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_enviada) session.get(basededatos.Compra_enviada.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_enviada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_enviada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_enviada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_enviada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada[] listCompra_enviadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_enviadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada[] listCompra_enviadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_enviadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_enviada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_enviada as Compra_enviada");
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
	
	public static List queryCompra_enviada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_enviada as Compra_enviada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_enviada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada[] listCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra_enviada(session, condition, orderBy);
			return (Compra_enviada[]) list.toArray(new Compra_enviada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada[] listCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra_enviada(session, condition, orderBy, lockMode);
			return (Compra_enviada[]) list.toArray(new Compra_enviada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_enviadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_enviadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra_enviada[] compra_enviadas = listCompra_enviadaByQuery(session, condition, orderBy);
		if (compra_enviadas != null && compra_enviadas.length > 0)
			return compra_enviadas[0];
		else
			return null;
	}
	
	public static Compra_enviada loadCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra_enviada[] compra_enviadas = listCompra_enviadaByQuery(session, condition, orderBy, lockMode);
		if (compra_enviadas != null && compra_enviadas.length > 0)
			return compra_enviadas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompra_enviadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_enviadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_enviadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_enviadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_enviada as Compra_enviada");
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
	
	public static java.util.Iterator iterateCompra_enviadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_enviada as Compra_enviada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_enviada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada createCompra_enviada() {
		return new basededatos.Compra_enviada();
	}
	
	public static boolean save(basededatos.Compra_enviada compra_enviada) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(compra_enviada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Compra_enviada compra_enviada) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(compra_enviada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_enviada compra_enviada)throws PersistentException {
		try {
			if (compra_enviada.getEmpresa_de_transportes() != null) {
				compra_enviada.getEmpresa_de_transportes().compra_enviada.remove(compra_enviada);
			}
			
			if (compra_enviada.getTiene_item() != null) {
				compra_enviada.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_enviada.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_enviada.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_enviada);
			}
			
			return delete(compra_enviada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_enviada compra_enviada, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (compra_enviada.getEmpresa_de_transportes() != null) {
				compra_enviada.getEmpresa_de_transportes().compra_enviada.remove(compra_enviada);
			}
			
			if (compra_enviada.getTiene_item() != null) {
				compra_enviada.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_enviada.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_enviada.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_enviada);
			}
			
			try {
				session.delete(compra_enviada);
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
	
	public static boolean refresh(basededatos.Compra_enviada compra_enviada) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(compra_enviada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Compra_enviada compra_enviada) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(compra_enviada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_enviada loadCompra_enviadaByCriteria(Compra_enviadaCriteria compra_enviadaCriteria) {
		Compra_enviada[] compra_enviadas = listCompra_enviadaByCriteria(compra_enviadaCriteria);
		if(compra_enviadas == null || compra_enviadas.length == 0) {
			return null;
		}
		return compra_enviadas[0];
	}
	
	public static Compra_enviada[] listCompra_enviadaByCriteria(Compra_enviadaCriteria compra_enviadaCriteria) {
		return compra_enviadaCriteria.listCompra_enviada();
	}
}
