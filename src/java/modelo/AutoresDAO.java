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
public class AutoresDAO {

    /**
     *
     * @param id
     * @param idAutor
     * @param idLibro
     * @return
     * @throws PersistentException
     */
    public static Autores loadAutoresByORMID(int id, modelo.Autor idAutor, modelo.Libro idLibro) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, id, idAutor, idLibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param idAutor
     * @param idLibro
     * @return
     * @throws PersistentException
     */
    public static Autores getAutoresByORMID(int id, modelo.Autor idAutor, modelo.Libro idLibro) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutoresByORMID(session, id, idAutor, idLibro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param idAutor
     * @param idLibro
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autores loadAutoresByORMID(int id, modelo.Autor idAutor, modelo.Libro idLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadAutoresByORMID(session, id, idAutor, idLibro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param idAutor
     * @param idLibro
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autores getAutoresByORMID(int id, modelo.Autor idAutor, modelo.Libro idLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getAutoresByORMID(session, id, idAutor, idLibro, lockMode);
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
     * @param idAutor
     * @param idLibro
     * @return
     * @throws PersistentException
     */
    public static Autores loadAutoresByORMID(PersistentSession session, int id, modelo.Autor idAutor, modelo.Libro idLibro) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_IdAutor(idAutor);
			autores.setORM_IdLibro(idLibro);
			
			return (Autores) session.load(modelo.Autores.class, autores);
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
     * @param idAutor
     * @param idLibro
     * @return
     * @throws PersistentException
     */
    public static Autores getAutoresByORMID(PersistentSession session, int id, modelo.Autor idAutor, modelo.Libro idLibro) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_IdAutor(idAutor);
			autores.setORM_IdLibro(idLibro);
			
			return (Autores) session.get(modelo.Autores.class, autores);
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
     * @param idAutor
     * @param idLibro
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autores loadAutoresByORMID(PersistentSession session, int id, modelo.Autor idAutor, modelo.Libro idLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_IdAutor(idAutor);
			autores.setORM_IdLibro(idLibro);
			
			return (Autores) session.load(modelo.Autores.class, autores, lockMode);
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
     * @param idAutor
     * @param idLibro
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static Autores getAutoresByORMID(PersistentSession session, int id, modelo.Autor idAutor, modelo.Libro idLibro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			Autores autores = new modelo.Autores();
			autores.setId(id);
			autores.setORM_IdAutor(idAutor);
			autores.setORM_IdLibro(idLibro);
			
			return (Autores) session.get(modelo.Autores.class, autores, lockMode);
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
    public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
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
    public static Autores loadAutoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autores[] autoreses = listAutoresByQuery(session, condition, orderBy, lockMode);
		if (autoreses != null && autoreses.length > 0)
			return autoreses[0];
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
	
    /**
     *
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param session
     * @param condition
     * @param orderBy
     * @param lockMode
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @return
     */
    public static Autores createAutores() {
		return new modelo.Autores();
	}
	
    /**
     *
     * @param autores
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param autores
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param autores
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Autores autores)throws PersistentException {
		try {
			modelo.Autor idAutor = autores.getIdAutor();
			if (autores.getIdAutor() != null) {
				autores.getIdAutor().autores.remove(autores);
			}
			autores.setORM_IdAutor(idAutor);
			
			modelo.Libro idLibro = autores.getIdLibro();
			if (autores.getIdLibro() != null) {
				autores.getIdLibro().autores.remove(autores);
			}
			autores.setORM_IdLibro(idLibro);
			
			return delete(autores);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param autores
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Autores autores, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Autor idAutor = autores.getIdAutor();
			if (autores.getIdAutor() != null) {
				autores.getIdAutor().autores.remove(autores);
			}
			autores.setORM_IdAutor(idAutor);
			
			modelo.Libro idLibro = autores.getIdLibro();
			if (autores.getIdLibro() != null) {
				autores.getIdLibro().autores.remove(autores);
			}
			autores.setORM_IdLibro(idLibro);
			
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
	
    /**
     *
     * @param autores
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param autores
     * @return
     * @throws PersistentException
     */
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
	
    /**
     *
     * @param autoresCriteria
     * @return
     */
    public static Autores loadAutoresByCriteria(AutoresCriteria autoresCriteria) {
		Autores[] autoreses = listAutoresByCriteria(autoresCriteria);
		if(autoreses == null || autoreses.length == 0) {
			return null;
		}
		return autoreses[0];
	}
	
    /**
     *
     * @param autoresCriteria
     * @return
     */
    public static Autores[] listAutoresByCriteria(AutoresCriteria autoresCriteria) {
		return autoresCriteria.listAutores();
	}
}
