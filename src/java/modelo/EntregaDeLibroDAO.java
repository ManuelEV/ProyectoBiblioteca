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

public class EntregaDeLibroDAO {
	public static EntregaDeLibro loadEntregaDeLibroByORMID(int id, modelo.Libro librocodigo, modelo.Cliente idCliente) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByORMID(session, id, librocodigo, idCliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(int id, modelo.Libro librocodigo, modelo.Cliente idCliente) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEntregaDeLibroByORMID(session, id, librocodigo, idCliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(int id, modelo.Libro librocodigo, modelo.Cliente idCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByORMID(session, id, librocodigo, idCliente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(int id, modelo.Libro librocodigo, modelo.Cliente idCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEntregaDeLibroByORMID(session, id, librocodigo, idCliente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(PersistentSession session, int id, modelo.Libro librocodigo, modelo.Cliente idCliente) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new modelo.EntregaDeLibro();
			entregadelibro.setId(id);
			entregadelibro.setORM_Librocodigo(librocodigo);
			entregadelibro.setORM_IdCliente(idCliente);
			
			return (EntregaDeLibro) session.load(modelo.EntregaDeLibro.class, entregadelibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(PersistentSession session, int id, modelo.Libro librocodigo, modelo.Cliente idCliente) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new modelo.EntregaDeLibro();
			entregadelibro.setId(id);
			entregadelibro.setORM_Librocodigo(librocodigo);
			entregadelibro.setORM_IdCliente(idCliente);
			
			return (EntregaDeLibro) session.get(modelo.EntregaDeLibro.class, entregadelibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByORMID(PersistentSession session, int id, modelo.Libro librocodigo, modelo.Cliente idCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new modelo.EntregaDeLibro();
			entregadelibro.setId(id);
			entregadelibro.setORM_Librocodigo(librocodigo);
			entregadelibro.setORM_IdCliente(idCliente);
			
			return (EntregaDeLibro) session.load(modelo.EntregaDeLibro.class, entregadelibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro getEntregaDeLibroByORMID(PersistentSession session, int id, modelo.Libro librocodigo, modelo.Cliente idCliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			EntregaDeLibro entregadelibro = new modelo.EntregaDeLibro();
			entregadelibro.setId(id);
			entregadelibro.setORM_Librocodigo(librocodigo);
			entregadelibro.setORM_IdCliente(idCliente);
			
			return (EntregaDeLibro) session.get(modelo.EntregaDeLibro.class, entregadelibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEntregaDeLibro(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEntregaDeLibro(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntregaDeLibro(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.EntregaDeLibro as EntregaDeLibro");
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
	
	public static List queryEntregaDeLibro(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.EntregaDeLibro as EntregaDeLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntregaDeLibro", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntregaDeLibro(session, condition, orderBy);
			return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntregaDeLibro(session, condition, orderBy, lockMode);
			return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByQuery(session, condition, orderBy);
		if (entregaDeLibros != null && entregaDeLibros.length > 0)
			return entregaDeLibros[0];
		else
			return null;
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		if (entregaDeLibros != null && entregaDeLibros.length > 0)
			return entregaDeLibros[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEntregaDeLibroByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEntregaDeLibroByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.EntregaDeLibro as EntregaDeLibro");
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
	
	public static java.util.Iterator iterateEntregaDeLibroByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.EntregaDeLibro as EntregaDeLibro");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EntregaDeLibro", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro createEntregaDeLibro() {
		return new modelo.EntregaDeLibro();
	}
	
	public static boolean save(modelo.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.EntregaDeLibro entregaDeLibro)throws PersistentException {
		try {
			modelo.Libro librocodigo = entregaDeLibro.getLibrocodigo();
			if (entregaDeLibro.getLibrocodigo() != null) {
				entregaDeLibro.getLibrocodigo().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_Librocodigo(librocodigo);
			
			modelo.Cliente idCliente = entregaDeLibro.getIdCliente();
			if (entregaDeLibro.getIdCliente() != null) {
				entregaDeLibro.getIdCliente().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_IdCliente(idCliente);
			
			return delete(entregaDeLibro);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.EntregaDeLibro entregaDeLibro, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Libro librocodigo = entregaDeLibro.getLibrocodigo();
			if (entregaDeLibro.getLibrocodigo() != null) {
				entregaDeLibro.getLibrocodigo().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_Librocodigo(librocodigo);
			
			modelo.Cliente idCliente = entregaDeLibro.getIdCliente();
			if (entregaDeLibro.getIdCliente() != null) {
				entregaDeLibro.getIdCliente().entregaDeLibro.remove(entregaDeLibro);
			}
			entregaDeLibro.setORM_IdCliente(idCliente);
			
			try {
				session.delete(entregaDeLibro);
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
	
	public static boolean refresh(modelo.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.EntregaDeLibro entregaDeLibro) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(entregaDeLibro);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EntregaDeLibro loadEntregaDeLibroByCriteria(EntregaDeLibroCriteria entregaDeLibroCriteria) {
		EntregaDeLibro[] entregaDeLibros = listEntregaDeLibroByCriteria(entregaDeLibroCriteria);
		if(entregaDeLibros == null || entregaDeLibros.length == 0) {
			return null;
		}
		return entregaDeLibros[0];
	}
	
	public static EntregaDeLibro[] listEntregaDeLibroByCriteria(EntregaDeLibroCriteria entregaDeLibroCriteria) {
		return entregaDeLibroCriteria.listEntregaDeLibro();
	}
}
