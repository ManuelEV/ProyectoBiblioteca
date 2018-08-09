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

/**
 *
 * @author Manuel
 */
public class AutorDAO {

    /**
     *
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Autor getAutorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor getAutorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Autor) session.load(modelo.Autor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Autor getAutorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Autor) session.get(modelo.Autor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param id
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autor) session.load(modelo.Autor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param id
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor getAutorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autor) session.get(modelo.Autor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static List queryAutor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryAutor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static List queryAutor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryAutor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Autor[] listAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor[] listAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static List queryAutor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autor as Autor");
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static List queryAutor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autor as Autor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Autor[] listAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutor(session, condition, orderBy);
			return (Autor[]) list.toArray(new Autor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor[] listAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutor(session, condition, orderBy, lockMode);
			return (Autor[]) list.toArray(new Autor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autor[] autors = listAutorByQuery(session, condition, orderBy);
		if (autors != null && autors.length > 0)
			return autors[0];
		else
			return null;
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autor loadAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autor[] autors = listAutorByQuery(session, condition, orderBy, lockMode);
		if (autors != null && autors.length > 0)
			return autors[0];
		else
			return null;
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateAutorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateAutorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateAutorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateAutorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateAutorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autor as Autor");
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static java.util.Iterator iterateAutorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Autor as Autor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Autor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @return
     */
    public static Autor createAutor() {
		return new modelo.Autor();
	}
	
    /**
     *
     * @param autor
     * @return
     * @throws PersistentException
     */
    public static boolean save(modelo.Autor autor) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autor
     * @return
     * @throws PersistentException
     */
    public static boolean delete(modelo.Autor autor) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autor
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Autor autor)throws PersistentException {
		try {
			modelo.Autores[] lAutoress = autor.autores.toArray();
			for(int i = 0; i < lAutoress.length; i++) {
				lAutoress[i].setIdAutor(null);
			}
			return delete(autor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autor
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Autor autor, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Autores[] lAutoress = autor.autores.toArray();
			for(int i = 0; i < lAutoress.length; i++) {
				lAutoress[i].setIdAutor(null);
			}
			try {
				session.delete(autor);
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
	
    /**
     *
     * @param autor
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(modelo.Autor autor) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autor
     * @return
     * @throws PersistentException
     */
    public static boolean evict(modelo.Autor autor) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(autor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autorCriteria
     * @return
     */
    public static Autor loadAutorByCriteria(AutorCriteria autorCriteria) {
		Autor[] autors = listAutorByCriteria(autorCriteria);
		if(autors == null || autors.length == 0) {
			return null;
		}
		return autors[0];
	}
	
    /**
     *
     * @param autorCriteria
     * @return
     */
    public static Autor[] listAutorByCriteria(AutorCriteria autorCriteria) {
		return autorCriteria.listAutor();
	}
}
