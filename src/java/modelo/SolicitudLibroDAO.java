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

public class SolicitudLibroDAO {
	public static SolicitudLibro loadSolicitudLibroByORMID(int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudLibroByORMID(session, idSolicitud, clienteRUN, codigoLibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro getSolicitudLibroByORMID(int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudLibroByORMID(session, idSolicitud, clienteRUN, codigoLibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByORMID(int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudLibroByORMID(session, idSolicitud, clienteRUN, codigoLibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro getSolicitudLibroByORMID(int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getSolicitudLibroByORMID(session, idSolicitud, clienteRUN, codigoLibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByORMID(PersistentSession session, int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro) throws PersistentException {
		try {
			SolicitudLibro solicitudlibro = new modelo.SolicitudLibro();
			solicitudlibro.setIdSolicitud(idSolicitud);
			solicitudlibro.setORM_ClienteRUN(clienteRUN);
			solicitudlibro.setORM_CodigoLibro(codigoLibro);
			
			return (SolicitudLibro) session.load(modelo.SolicitudLibro.class, solicitudlibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro getSolicitudLibroByORMID(PersistentSession session, int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro) throws PersistentException {
		try {
			SolicitudLibro solicitudlibro = new modelo.SolicitudLibro();
			solicitudlibro.setIdSolicitud(idSolicitud);
			solicitudlibro.setORM_ClienteRUN(clienteRUN);
			solicitudlibro.setORM_CodigoLibro(codigoLibro);
			
			return (SolicitudLibro) session.get(modelo.SolicitudLibro.class, solicitudlibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByORMID(PersistentSession session, int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudLibro solicitudlibro = new modelo.SolicitudLibro();
			solicitudlibro.setIdSolicitud(idSolicitud);
			solicitudlibro.setORM_ClienteRUN(clienteRUN);
			solicitudlibro.setORM_CodigoLibro(codigoLibro);
			
			return (SolicitudLibro) session.load(modelo.SolicitudLibro.class, solicitudlibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro getSolicitudLibroByORMID(PersistentSession session, int idSolicitud, modelo.Cliente clienteRUN, modelo.Libro codigoLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			SolicitudLibro solicitudlibro = new modelo.SolicitudLibro();
			solicitudlibro.setIdSolicitud(idSolicitud);
			solicitudlibro.setORM_ClienteRUN(clienteRUN);
			solicitudlibro.setORM_CodigoLibro(codigoLibro);
			
			return (SolicitudLibro) session.get(modelo.SolicitudLibro.class, solicitudlibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudLibro(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudLibro(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudLibro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return querySolicitudLibro(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro[] listSolicitudLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro[] listSolicitudLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listSolicitudLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySolicitudLibro(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudLibro as SolicitudLibro");
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
	
	public static List querySolicitudLibro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudLibro as SolicitudLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudLibro", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro[] listSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySolicitudLibro(session, condition, orderBy);
			return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro[] listSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySolicitudLibro(session, condition, orderBy, lockMode);
			return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadSolicitudLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SolicitudLibro[] solicitudLibros = listSolicitudLibroByQuery(session, condition, orderBy);
		if (solicitudLibros != null && solicitudLibros.length > 0)
			return solicitudLibros[0];
		else
			return null;
	}
	
	public static SolicitudLibro loadSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SolicitudLibro[] solicitudLibros = listSolicitudLibroByQuery(session, condition, orderBy, lockMode);
		if (solicitudLibros != null && solicitudLibros.length > 0)
			return solicitudLibros[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSolicitudLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateSolicitudLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudLibro as SolicitudLibro");
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
	
	public static java.util.Iterator iterateSolicitudLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.SolicitudLibro as SolicitudLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SolicitudLibro", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro createSolicitudLibro() {
		return new modelo.SolicitudLibro();
	}
	
	public static boolean save(modelo.SolicitudLibro solicitudLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(solicitudLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.SolicitudLibro solicitudLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(solicitudLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.SolicitudLibro solicitudLibro)throws PersistentException {
		try {
			modelo.Cliente clienteRUN = solicitudLibro.getClienteRUN();
			if (solicitudLibro.getClienteRUN() != null) {
				solicitudLibro.getClienteRUN().solicitudLibro.remove(solicitudLibro);
			}
			solicitudLibro.setORM_ClienteRUN(clienteRUN);
			
			modelo.Libro codigoLibro = solicitudLibro.getCodigoLibro();
			if (solicitudLibro.getCodigoLibro() != null) {
				solicitudLibro.getCodigoLibro().solicitudLibro.remove(solicitudLibro);
			}
			solicitudLibro.setORM_CodigoLibro(codigoLibro);
			
			return delete(solicitudLibro);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.SolicitudLibro solicitudLibro, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Cliente clienteRUN = solicitudLibro.getClienteRUN();
			if (solicitudLibro.getClienteRUN() != null) {
				solicitudLibro.getClienteRUN().solicitudLibro.remove(solicitudLibro);
			}
			solicitudLibro.setORM_ClienteRUN(clienteRUN);
			
			modelo.Libro codigoLibro = solicitudLibro.getCodigoLibro();
			if (solicitudLibro.getCodigoLibro() != null) {
				solicitudLibro.getCodigoLibro().solicitudLibro.remove(solicitudLibro);
			}
			solicitudLibro.setORM_CodigoLibro(codigoLibro);
			
			try {
				session.delete(solicitudLibro);
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
	
	public static boolean refresh(modelo.SolicitudLibro solicitudLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(solicitudLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.SolicitudLibro solicitudLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(solicitudLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SolicitudLibro loadSolicitudLibroByCriteria(SolicitudLibroCriteria solicitudLibroCriteria) {
		SolicitudLibro[] solicitudLibros = listSolicitudLibroByCriteria(solicitudLibroCriteria);
		if(solicitudLibros == null || solicitudLibros.length == 0) {
			return null;
		}
		return solicitudLibros[0];
	}
	
	public static SolicitudLibro[] listSolicitudLibroByCriteria(SolicitudLibroCriteria solicitudLibroCriteria) {
		return solicitudLibroCriteria.listSolicitudLibro();
	}
}
