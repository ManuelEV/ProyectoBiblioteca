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
public class CategoriaDAO {

    /**
     *
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Categoria loadCategoriaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCategoriaByORMID(session, id);
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
    public static Categoria getCategoriaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getCategoriaByORMID(session, id);
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
    public static Categoria loadCategoriaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCategoriaByORMID(session, id, lockMode);
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
    public static Categoria getCategoriaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getCategoriaByORMID(session, id, lockMode);
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
    public static Categoria loadCategoriaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Categoria) session.load(modelo.Categoria.class, new Integer(id));
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
    public static Categoria getCategoriaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Categoria) session.get(modelo.Categoria.class, new Integer(id));
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
    public static Categoria loadCategoriaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categoria) session.load(modelo.Categoria.class, new Integer(id), lockMode);
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
    public static Categoria getCategoriaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categoria) session.get(modelo.Categoria.class, new Integer(id), lockMode);
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
    public static List queryCategoria(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryCategoria(session, condition, orderBy);
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
    public static List queryCategoria(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryCategoria(session, condition, orderBy, lockMode);
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
    public static Categoria[] listCategoriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listCategoriaByQuery(session, condition, orderBy);
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
    public static Categoria[] listCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listCategoriaByQuery(session, condition, orderBy, lockMode);
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
    public static List queryCategoria(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Categoria as Categoria");
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
    public static List queryCategoria(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Categoria as Categoria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categoria", lockMode);
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
    public static Categoria[] listCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCategoria(session, condition, orderBy);
			return (Categoria[]) list.toArray(new Categoria[list.size()]);
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
    public static Categoria[] listCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCategoria(session, condition, orderBy, lockMode);
			return (Categoria[]) list.toArray(new Categoria[list.size()]);
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
    public static Categoria loadCategoriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCategoriaByQuery(session, condition, orderBy);
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
    public static Categoria loadCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadCategoriaByQuery(session, condition, orderBy, lockMode);
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
    public static Categoria loadCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Categoria[] categorias = listCategoriaByQuery(session, condition, orderBy);
		if (categorias != null && categorias.length > 0)
			return categorias[0];
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
    public static Categoria loadCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Categoria[] categorias = listCategoriaByQuery(session, condition, orderBy, lockMode);
		if (categorias != null && categorias.length > 0)
			return categorias[0];
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
    public static java.util.Iterator iterateCategoriaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateCategoriaByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateCategoriaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateCategoriaByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iterateCategoriaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Categoria as Categoria");
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
    public static java.util.Iterator iterateCategoriaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Categoria as Categoria");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categoria", lockMode);
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
    public static Categoria createCategoria() {
		return new modelo.Categoria();
	}
	
    /**
     *
     * @param categoria
     * @return
     * @throws PersistentException
     */
    public static boolean save(modelo.Categoria categoria) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(categoria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param categoria
     * @return
     * @throws PersistentException
     */
    public static boolean delete(modelo.Categoria categoria) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(categoria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param categoria
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Categoria categoria)throws PersistentException {
		try {
			modelo.Estante[] lEstantes = categoria.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdCategoria(null);
			}
			modelo.Libro[] lLibros = categoria.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdCategoria(null);
			}
			return delete(categoria);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param categoria
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Categoria categoria, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Estante[] lEstantes = categoria.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdCategoria(null);
			}
			modelo.Libro[] lLibros = categoria.libro.toArray();
			for(int i = 0; i < lLibros.length; i++) {
				lLibros[i].setIdCategoria(null);
			}
			try {
				session.delete(categoria);
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
     * @param categoria
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(modelo.Categoria categoria) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(categoria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param categoria
     * @return
     * @throws PersistentException
     */
    public static boolean evict(modelo.Categoria categoria) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(categoria);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param categoriaCriteria
     * @return
     */
    public static Categoria loadCategoriaByCriteria(CategoriaCriteria categoriaCriteria) {
		Categoria[] categorias = listCategoriaByCriteria(categoriaCriteria);
		if(categorias == null || categorias.length == 0) {
			return null;
		}
		return categorias[0];
	}
	
    /**
     *
     * @param categoriaCriteria
     * @return
     */
    public static Categoria[] listCategoriaByCriteria(CategoriaCriteria categoriaCriteria) {
		return categoriaCriteria.listCategoria();
	}
}
