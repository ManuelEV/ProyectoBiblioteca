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
public class EstanteDAO {

    /**
     *
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Estante loadEstanteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByORMID(session, id);
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
    public static Estante getEstanteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEstanteByORMID(session, id);
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
    public static Estante loadEstanteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByORMID(session, id, lockMode);
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
    public static Estante getEstanteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getEstanteByORMID(session, id, lockMode);
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
    public static Estante loadEstanteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estante) session.load(modelo.Estante.class, new Integer(id));
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
    public static Estante getEstanteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estante) session.get(modelo.Estante.class, new Integer(id));
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
    public static Estante loadEstanteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estante) session.load(modelo.Estante.class, new Integer(id), lockMode);
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
    public static Estante getEstanteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estante) session.get(modelo.Estante.class, new Integer(id), lockMode);
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
    public static List queryEstante(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEstante(session, condition, orderBy);
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
    public static List queryEstante(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryEstante(session, condition, orderBy, lockMode);
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
    public static Estante[] listEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEstanteByQuery(session, condition, orderBy);
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
    public static Estante[] listEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listEstanteByQuery(session, condition, orderBy, lockMode);
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
    public static List queryEstante(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Estante as Estante");
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
    public static List queryEstante(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Estante as Estante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estante", lockMode);
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
    public static Estante[] listEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstante(session, condition, orderBy);
			return (Estante[]) list.toArray(new Estante[list.size()]);
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
    public static Estante[] listEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstante(session, condition, orderBy, lockMode);
			return (Estante[]) list.toArray(new Estante[list.size()]);
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
    public static Estante loadEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByQuery(session, condition, orderBy);
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
    public static Estante loadEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadEstanteByQuery(session, condition, orderBy, lockMode);
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
    public static Estante loadEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estante[] estantes = listEstanteByQuery(session, condition, orderBy);
		if (estantes != null && estantes.length > 0)
			return estantes[0];
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
    public static Estante loadEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estante[] estantes = listEstanteByQuery(session, condition, orderBy, lockMode);
		if (estantes != null && estantes.length > 0)
			return estantes[0];
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
    public static java.util.Iterator iterateEstanteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEstanteByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateEstanteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateEstanteByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iterateEstanteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Estante as Estante");
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
    public static java.util.Iterator iterateEstanteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Estante as Estante");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estante", lockMode);
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
    public static Estante createEstante() {
		return new modelo.Estante();
	}
	
    /**
     *
     * @param estante
     * @return
     * @throws PersistentException
     */
    public static boolean save(modelo.Estante estante) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param estante
     * @return
     * @throws PersistentException
     */
    public static boolean delete(modelo.Estante estante) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param estante
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Estante estante)throws PersistentException {
		try {
			if (estante.getIdBiblioteca() != null) {
				estante.getIdBiblioteca().estante.remove(estante);
			}
			
			if (estante.getIdCategoria() != null) {
				estante.getIdCategoria().estante.remove(estante);
			}
			
			modelo.Libro[] lLibros = estante.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdEstante(null);
			}
			return delete(estante);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param estante
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Estante estante, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estante.getIdBiblioteca() != null) {
				estante.getIdBiblioteca().estante.remove(estante);
			}
			
			if (estante.getIdCategoria() != null) {
				estante.getIdCategoria().estante.remove(estante);
			}
			
			modelo.Libro[] lLibros = estante.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdEstante(null);
			}
			try {
				session.delete(estante);
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
     * @param estante
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(modelo.Estante estante) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param estante
     * @return
     * @throws PersistentException
     */
    public static boolean evict(modelo.Estante estante) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(estante);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param estanteCriteria
     * @return
     */
    public static Estante loadEstanteByCriteria(EstanteCriteria estanteCriteria) {
		Estante[] estantes = listEstanteByCriteria(estanteCriteria);
		if(estantes == null || estantes.length == 0) {
			return null;
		}
		return estantes[0];
	}
	
    /**
     *
     * @param estanteCriteria
     * @return
     */
    public static Estante[] listEstanteByCriteria(EstanteCriteria estanteCriteria) {
		return estanteCriteria.listEstante();
	}
}
