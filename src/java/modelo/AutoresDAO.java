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

public class AutoresDAO {
	public static Autores loadAutoresByORMID(int id, modelo.Autor autoridAutor, modelo.Libro librocodigo) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, id, autoridAutor, librocodigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores getAutoresByORMID(int id, modelo.Autor autoridAutor, modelo.Libro librocodigo) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutoresByORMID(session, id, autoridAutor, librocodigo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByORMID(int id, modelo.Autor autoridAutor, modelo.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, id, autoridAutor, librocodigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores getAutoresByORMID(int id, modelo.Autor autoridAutor, modelo.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutoresByORMID(session, id, autoridAutor, librocodigo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByORMID(PersistentSession session, int id, modelo.Autor autoridAutor, modelo.Libro librocodigo) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_AutoridAutor(autoridAutor);
			autores.setORM_Librocodigo(librocodigo);
			
			return (Autores) session.load(modelo.Autores.class, autores);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores getAutoresByORMID(PersistentSession session, int id, modelo.Autor autoridAutor, modelo.Libro librocodigo) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_AutoridAutor(autoridAutor);
			autores.setORM_Librocodigo(librocodigo);
			
			return (Autores) session.get(modelo.Autores.class, autores);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByORMID(PersistentSession session, int id, modelo.Autor autoridAutor, modelo.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_AutoridAutor(autoridAutor);
			autores.setORM_Librocodigo(librocodigo);
			
			return (Autores) session.load(modelo.Autores.class, autores, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores getAutoresByORMID(PersistentSession session, int id, modelo.Autor autoridAutor, modelo.Libro librocodigo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_AutoridAutor(autoridAutor);
			autores.setORM_Librocodigo(librocodigo);
			
			return (Autores) session.get(modelo.Autores.class, autores, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutores(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryAutores(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutores(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryAutores(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores[] listAutoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores[] listAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutores(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autores as Autores");
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
	
	public static List queryAutores(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autores as Autores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autores", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores[] listAutoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutores(session, condition, orderBy);
			return (Autores[]) list.toArray(new Autores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores[] listAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutores(session, condition, orderBy, lockMode);
			return (Autores[]) list.toArray(new Autores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
		else
			return null;
	}
	
	public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy, lockMode);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateAutoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateAutoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autores as Autores");
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
	
	public static java.util.Iterator iterateAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autores as Autores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autores", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores createAutores() {
		return new modelo.Autores();
	}
	
	public static boolean save(modelo.Autores autores) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(autores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.Autores autores) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(autores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Autores autores)throws PersistentException {
		try {
			modelo.Autor autoridAutor = autores.getAutoridAutor();
			if (autores.getAutoridAutor() != null) {
				autores.getAutoridAutor().autores.remove(autores);
			}
			autores.setORM_AutoridAutor(autoridAutor);
			
			modelo.Libro librocodigo = autores.getLibrocodigo();
			if (autores.getLibrocodigo() != null) {
				autores.getLibrocodigo().autores.remove(autores);
			}
			autores.setORM_Librocodigo(librocodigo);
			
			return delete(autores);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.Autores autores, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Autor autoridAutor = autores.getAutoridAutor();
			if (autores.getAutoridAutor() != null) {
				autores.getAutoridAutor().autores.remove(autores);
			}
			autores.setORM_AutoridAutor(autoridAutor);
			
			modelo.Libro librocodigo = autores.getLibrocodigo();
			if (autores.getLibrocodigo() != null) {
				autores.getLibrocodigo().autores.remove(autores);
			}
			autores.setORM_Librocodigo(librocodigo);
			
			try {
				session.delete(autores);
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
	
	public static boolean refresh(modelo.Autores autores) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(autores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.Autores autores) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(autores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autores loadAutoresByCriteria(AutoresCriteria autoresCriteria) {
		Autores[] autoreses = listAutoresByCriteria(autoresCriteria);
		if(autoreses == null || autoreses.length == 0) {
			return null;
		}
		return autoreses[0];
	}
	
	public static Autores[] listAutoresByCriteria(AutoresCriteria autoresCriteria) {
		return autoresCriteria.listAutores();
	}
}
