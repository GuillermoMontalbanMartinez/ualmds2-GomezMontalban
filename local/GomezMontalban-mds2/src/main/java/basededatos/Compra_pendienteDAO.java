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

public class Compra_pendienteDAO {
	public static Compra_pendiente loadCompra_pendienteByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_pendienteByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente getCompra_pendienteByORMID(int id_compra) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_pendienteByORMID(session, id_compra);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_pendienteByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente getCompra_pendienteByORMID(int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return getCompra_pendienteByORMID(session, id_compra, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_pendiente) session.load(basededatos.Compra_pendiente.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente getCompra_pendienteByORMID(PersistentSession session, int id_compra) throws PersistentException {
		try {
			return (Compra_pendiente) session.get(basededatos.Compra_pendiente.class, new Integer(id_compra));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_pendiente) session.load(basededatos.Compra_pendiente.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente getCompra_pendienteByORMID(PersistentSession session, int id_compra, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compra_pendiente) session.get(basededatos.Compra_pendiente.class, new Integer(id_compra), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_pendiente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_pendiente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_pendiente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return queryCompra_pendiente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente[] listCompra_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente[] listCompra_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return listCompra_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompra_pendiente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_pendiente as Compra_pendiente");
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
	
	public static List queryCompra_pendiente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_pendiente as Compra_pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_pendiente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente[] listCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompra_pendiente(session, condition, orderBy);
			return (Compra_pendiente[]) list.toArray(new Compra_pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente[] listCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompra_pendiente(session, condition, orderBy, lockMode);
			return (Compra_pendiente[]) list.toArray(new Compra_pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return loadCompra_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compra_pendiente[] compra_pendientes = listCompra_pendienteByQuery(session, condition, orderBy);
		if (compra_pendientes != null && compra_pendientes.length > 0)
			return compra_pendientes[0];
		else
			return null;
	}
	
	public static Compra_pendiente loadCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compra_pendiente[] compra_pendientes = listCompra_pendienteByQuery(session, condition, orderBy, lockMode);
		if (compra_pendientes != null && compra_pendientes.length > 0)
			return compra_pendientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompra_pendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_pendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_pendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TFGómezMontalbánPersistentManager.instance().getSession();
			return iterateCompra_pendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_pendiente as Compra_pendiente");
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
	
	public static java.util.Iterator iterateCompra_pendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compra_pendiente as Compra_pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compra_pendiente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente createCompra_pendiente() {
		return new basededatos.Compra_pendiente();
	}
	
	public static boolean save(basededatos.Compra_pendiente compra_pendiente) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().saveObject(compra_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Compra_pendiente compra_pendiente) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().deleteObject(compra_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_pendiente compra_pendiente)throws PersistentException {
		try {
			if (compra_pendiente.getTiene_item() != null) {
				compra_pendiente.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_pendiente.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_pendiente.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_pendiente);
			}
			
			return delete(compra_pendiente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compra_pendiente compra_pendiente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (compra_pendiente.getTiene_item() != null) {
				compra_pendiente.getTiene_item().setEsta_asociado_a_una_compra(null);
			}
			
			if (compra_pendiente.getTiene_asociado_un_cibernauta_registrado() != null) {
				compra_pendiente.getTiene_asociado_un_cibernauta_registrado().tiene_compra.remove(compra_pendiente);
			}
			
			try {
				session.delete(compra_pendiente);
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
	
	public static boolean refresh(basededatos.Compra_pendiente compra_pendiente) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().refresh(compra_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Compra_pendiente compra_pendiente) throws PersistentException {
		try {
			TFGómezMontalbánPersistentManager.instance().getSession().evict(compra_pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compra_pendiente loadCompra_pendienteByCriteria(Compra_pendienteCriteria compra_pendienteCriteria) {
		Compra_pendiente[] compra_pendientes = listCompra_pendienteByCriteria(compra_pendienteCriteria);
		if(compra_pendientes == null || compra_pendientes.length == 0) {
			return null;
		}
		return compra_pendientes[0];
	}
	
	public static Compra_pendiente[] listCompra_pendienteByCriteria(Compra_pendienteCriteria compra_pendienteCriteria) {
		return compra_pendienteCriteria.listCompra_pendiente();
	}
}
