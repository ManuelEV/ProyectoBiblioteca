/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package modelo;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SolicitudComputadorDAO {
	public static SolicitudComputador loadSolicitudComputadorByORMID(int id, modelo.Computador idComputador, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByORMID(session, id, idComputador, clienteRUN);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(int id, modelo.Computador idComputador, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudComputadorByORMID(session, id, idComputador, clienteRUN);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(int id, modelo.Computador idComputador, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByORMID(session, id, idComputador, clienteRUN, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(int id, modelo.Computador idComputador, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudComputadorByORMID(session, id, idComputador, clienteRUN, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(PersistentSession session, int id, modelo.Computador idComputador, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new modelo.SolicitudComputador();
			solicitudcomputador.setId(id);
			solicitudcomputador.setORM_IdComputador(idComputador);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			
			return (SolicitudComputador) session.load(modelo.SolicitudComputador.class, solicitudcomputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(PersistentSession session, int id, modelo.Computador idComputador, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new modelo.SolicitudComputador();
			solicitudcomputador.setId(id);
			solicitudcomputador.setORM_IdComputador(idComputador);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			
			return (SolicitudComputador) session.get(modelo.SolicitudComputador.class, solicitudcomputador);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByORMID(PersistentSession session, int id, modelo.Computador idComputador, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new modelo.SolicitudComputador();
			solicitudcomputador.setId(id);
			solicitudcomputador.setORM_IdComputador(idComputador);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			
			return (SolicitudComputador) session.load(modelo.SolicitudComputador.class, solicitudcomputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador getSolicitudComputadorByORMID(PersistentSession session, int id, modelo.Computador idComputador, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudComputador solicitudcomputador = new modelo.SolicitudComputador();
			solicitudcomputador.setId(id);
			solicitudcomputador.setORM_IdComputador(idComputador);
			solicitudcomputador.setORM_ClienteRUN(clienteRUN);
			
			return (SolicitudComputador) session.get(modelo.SolicitudComputador.class, solicitudcomputador, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudComputador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudComputador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudComputador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudComputador as SolicitudComputador");
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
	
	public static List querySolicitudComputador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudComputador as SolicitudComputador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudComputador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySolicitudComputador(session, condition, orderBy);
			return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySolicitudComputador(session, condition, orderBy, lockMode);
			return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByQuery(session, condition, orderBy);
		if (solicitudComputadors != null && solicitudComputadors.length > 0)
			return solicitudComputadors[0];
		else
			return null;
	}
	
	public static SolicitudComputador loadSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		if (solicitudComputadors != null && solicitudComputadors.length > 0)
			return solicitudComputadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudComputadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudComputadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudComputador as SolicitudComputador");
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
	
	public static java.util.Iterator iterateSolicitudComputadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudComputador as SolicitudComputador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudComputador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador createSolicitudComputador() {
		return new modelo.SolicitudComputador();
	}
	
	public static boolean save(modelo.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.SolicitudComputador solicitudComputador)throws PersistentException {
		try {
			modelo.Computador idComputador = solicitudComputador.getIdComputador();
			if (solicitudComputador.getIdComputador() != null) {
				solicitudComputador.getIdComputador().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_IdComputador(idComputador);
			
			modelo.Cliente clienteRUN = solicitudComputador.getClienteRUN();
			if (solicitudComputador.getClienteRUN() != null) {
				solicitudComputador.getClienteRUN().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_ClienteRUN(clienteRUN);
			
			return delete(solicitudComputador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.SolicitudComputador solicitudComputador, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Computador idComputador = solicitudComputador.getIdComputador();
			if (solicitudComputador.getIdComputador() != null) {
				solicitudComputador.getIdComputador().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_IdComputador(idComputador);
			
			modelo.Cliente clienteRUN = solicitudComputador.getClienteRUN();
			if (solicitudComputador.getClienteRUN() != null) {
				solicitudComputador.getClienteRUN().solicitudComputador.remove(solicitudComputador);
			}
			solicitudComputador.setORM_ClienteRUN(clienteRUN);
			
			try {
				session.delete(solicitudComputador);
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
	
	public static boolean refresh(modelo.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.SolicitudComputador solicitudComputador) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(solicitudComputador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudComputador loadSolicitudComputadorByCriteria(SolicitudComputadorCriteria solicitudComputadorCriteria) {
		SolicitudComputador[] solicitudComputadors = listSolicitudComputadorByCriteria(solicitudComputadorCriteria);
		if(solicitudComputadors == null || solicitudComputadors.length == 0) {
			return null;
		}
		return solicitudComputadors[0];
	}
	
	public static SolicitudComputador[] listSolicitudComputadorByCriteria(SolicitudComputadorCriteria solicitudComputadorCriteria) {
		return solicitudComputadorCriteria.listSolicitudComputador();
	}
}
