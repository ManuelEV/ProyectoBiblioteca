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
public class BibliotecaDAO {

    /**
     *
     * @param id
     * @return
     * @throws PersistentException
     */
    public static Biblioteca loadBibliotecaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByORMID(session, id);
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
    public static Biblioteca getBibliotecaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getBibliotecaByORMID(session, id);
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
    public static Biblioteca loadBibliotecaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByORMID(session, id, lockMode);
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
    public static Biblioteca getBibliotecaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getBibliotecaByORMID(session, id, lockMode);
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
    public static Biblioteca loadBibliotecaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Biblioteca) session.load(modelo.Biblioteca.class, new Integer(id));
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
    public static Biblioteca getBibliotecaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Biblioteca) session.get(modelo.Biblioteca.class, new Integer(id));
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
    public static Biblioteca loadBibliotecaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Biblioteca) session.load(modelo.Biblioteca.class, new Integer(id), lockMode);
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
    public static Biblioteca getBibliotecaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Biblioteca) session.get(modelo.Biblioteca.class, new Integer(id), lockMode);
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
    public static List queryBiblioteca(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryBiblioteca(session, condition, orderBy);
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
    public static List queryBiblioteca(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryBiblioteca(session, condition, orderBy, lockMode);
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
    public static Biblioteca[] listBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listBibliotecaByQuery(session, condition, orderBy);
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
    public static Biblioteca[] listBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static List queryBiblioteca(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Biblioteca as Biblioteca");
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
    public static List queryBiblioteca(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Biblioteca as Biblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Biblioteca", lockMode);
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
    public static Biblioteca[] listBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBiblioteca(session, condition, orderBy);
			return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
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
    public static Biblioteca[] listBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBiblioteca(session, condition, orderBy, lockMode);
			return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
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
    public static Biblioteca loadBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByQuery(session, condition, orderBy);
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
    public static Biblioteca loadBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static Biblioteca loadBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Biblioteca[] bibliotecas = listBibliotecaByQuery(session, condition, orderBy);
		if (bibliotecas != null && bibliotecas.length > 0)
			return bibliotecas[0];
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
    public static Biblioteca loadBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Biblioteca[] bibliotecas = listBibliotecaByQuery(session, condition, orderBy, lockMode);
		if (bibliotecas != null && bibliotecas.length > 0)
			return bibliotecas[0];
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
    public static java.util.Iterator iterateBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateBibliotecaByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iterateBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Biblioteca as Biblioteca");
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
    public static java.util.Iterator iterateBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.Biblioteca as Biblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Biblioteca", lockMode);
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
    public static Biblioteca createBiblioteca() {
		return new modelo.Biblioteca();
	}
	
    /**
     *
     * @param biblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean save(modelo.Biblioteca biblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param biblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean delete(modelo.Biblioteca biblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param biblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Biblioteca biblioteca)throws PersistentException {
		try {
			if (biblioteca.getIdCiudad() != null) {
				biblioteca.getIdCiudad().biblioteca.remove(biblioteca);
			}
			
			modelo.Estante[] lEstantes = biblioteca.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdBiblioteca(null);
			}
			modelo.Computador[] lComputadors = biblioteca.computador.toArray();
			for(int i = 0; i < lComputadors.length; i++) {
				lComputadors[i].setIdBiblioteca(null);
			}
			modelo.SalaDeLectura[] lSalaDeLecturas = biblioteca.salaDeLectura.toArray();
			for(int i = 0; i < lSalaDeLecturas.length; i++) {
				lSalaDeLecturas[i].setIdBiblioteca(null);
			}
			modelo.ClienteDeBiblioteca[] lClienteDeBibliotecas = biblioteca.clienteDeBiblioteca.toArray();
			for(int i = 0; i < lClienteDeBibliotecas.length; i++) {
				lClienteDeBibliotecas[i].setBibliotecaidBiblioteca(null);
			}
			modelo.Funcionario[] lFuncionarios = biblioteca.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdBiblioteca(null);
			}
			modelo.Usuario[] lUsuarios = biblioteca.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].setIdBiblioteca(null);
			}
			return delete(biblioteca);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param biblioteca
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.Biblioteca biblioteca, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (biblioteca.getIdCiudad() != null) {
				biblioteca.getIdCiudad().biblioteca.remove(biblioteca);
			}
			
			modelo.Estante[] lEstantes = biblioteca.estante.toArray();
			for(int i = 0; i < lEstantes.length; i++) {
				lEstantes[i].setIdBiblioteca(null);
			}
			modelo.Computador[] lComputadors = biblioteca.computador.toArray();
			for(int i = 0; i < lComputadors.length; i++) {
				lComputadors[i].setIdBiblioteca(null);
			}
			modelo.SalaDeLectura[] lSalaDeLecturas = biblioteca.salaDeLectura.toArray();
			for(int i = 0; i < lSalaDeLecturas.length; i++) {
				lSalaDeLecturas[i].setIdBiblioteca(null);
			}
			modelo.ClienteDeBiblioteca[] lClienteDeBibliotecas = biblioteca.clienteDeBiblioteca.toArray();
			for(int i = 0; i < lClienteDeBibliotecas.length; i++) {
				lClienteDeBibliotecas[i].setBibliotecaidBiblioteca(null);
			}
			modelo.Funcionario[] lFuncionarios = biblioteca.funcionario.toArray();
			for(int i = 0; i < lFuncionarios.length; i++) {
				lFuncionarios[i].setIdBiblioteca(null);
			}
			modelo.Usuario[] lUsuarios = biblioteca.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].setIdBiblioteca(null);
			}
			try {
				session.delete(biblioteca);
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
     * @param biblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(modelo.Biblioteca biblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param biblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean evict(modelo.Biblioteca biblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(biblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param bibliotecaCriteria
     * @return
     */
    public static Biblioteca loadBibliotecaByCriteria(BibliotecaCriteria bibliotecaCriteria) {
		Biblioteca[] bibliotecas = listBibliotecaByCriteria(bibliotecaCriteria);
		if(bibliotecas == null || bibliotecas.length == 0) {
			return null;
		}
		return bibliotecas[0];
	}
	
    /**
     *
     * @param bibliotecaCriteria
     * @return
     */
    public static Biblioteca[] listBibliotecaByCriteria(BibliotecaCriteria bibliotecaCriteria) {
		return bibliotecaCriteria.listBiblioteca();
	}
}
