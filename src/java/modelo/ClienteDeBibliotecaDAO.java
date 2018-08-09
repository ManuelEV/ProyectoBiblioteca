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
public class ClienteDeBibliotecaDAO {

    /**
     *
     * @param id
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByORMID(int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadClienteDeBibliotecaByORMID(session, id, bibliotecaidBiblioteca, cliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca getClienteDeBibliotecaByORMID(int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getClienteDeBibliotecaByORMID(session, id, bibliotecaidBiblioteca, cliente);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByORMID(int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadClienteDeBibliotecaByORMID(session, id, bibliotecaidBiblioteca, cliente, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param id
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca getClienteDeBibliotecaByORMID(int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getClienteDeBibliotecaByORMID(session, id, bibliotecaidBiblioteca, cliente, lockMode);
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
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByORMID(PersistentSession session, int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente) throws PersistentException {
		try {
			ClienteDeBiblioteca clientedebiblioteca = new modelo.ClienteDeBiblioteca();
			clientedebiblioteca.setId(id);
			clientedebiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			clientedebiblioteca.setORM_Cliente(cliente);
			
			return (ClienteDeBiblioteca) session.load(modelo.ClienteDeBiblioteca.class, clientedebiblioteca);
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
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca getClienteDeBibliotecaByORMID(PersistentSession session, int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente) throws PersistentException {
		try {
			ClienteDeBiblioteca clientedebiblioteca = new modelo.ClienteDeBiblioteca();
			clientedebiblioteca.setId(id);
			clientedebiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			clientedebiblioteca.setORM_Cliente(cliente);
			
			return (ClienteDeBiblioteca) session.get(modelo.ClienteDeBiblioteca.class, clientedebiblioteca);
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
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByORMID(PersistentSession session, int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			ClienteDeBiblioteca clientedebiblioteca = new modelo.ClienteDeBiblioteca();
			clientedebiblioteca.setId(id);
			clientedebiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			clientedebiblioteca.setORM_Cliente(cliente);
			
			return (ClienteDeBiblioteca) session.load(modelo.ClienteDeBiblioteca.class, clientedebiblioteca, lockMode);
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
     * @param bibliotecaidBiblioteca
     * @param cliente
     * @param lockMode
     * @return
     * @throws PersistentException
     */
    public static ClienteDeBiblioteca getClienteDeBibliotecaByORMID(PersistentSession session, int id, modelo.Biblioteca bibliotecaidBiblioteca, modelo.Cliente cliente, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			ClienteDeBiblioteca clientedebiblioteca = new modelo.ClienteDeBiblioteca();
			clientedebiblioteca.setId(id);
			clientedebiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			clientedebiblioteca.setORM_Cliente(cliente);
			
			return (ClienteDeBiblioteca) session.get(modelo.ClienteDeBiblioteca.class, clientedebiblioteca, lockMode);
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
    public static List queryClienteDeBiblioteca(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryClienteDeBiblioteca(session, condition, orderBy);
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
    public static List queryClienteDeBiblioteca(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryClienteDeBiblioteca(session, condition, orderBy, lockMode);
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
    public static ClienteDeBiblioteca[] listClienteDeBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listClienteDeBibliotecaByQuery(session, condition, orderBy);
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
    public static ClienteDeBiblioteca[] listClienteDeBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listClienteDeBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static List queryClienteDeBiblioteca(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.ClienteDeBiblioteca as ClienteDeBiblioteca");
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
    public static List queryClienteDeBiblioteca(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.ClienteDeBiblioteca as ClienteDeBiblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ClienteDeBiblioteca", lockMode);
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
    public static ClienteDeBiblioteca[] listClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClienteDeBiblioteca(session, condition, orderBy);
			return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
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
    public static ClienteDeBiblioteca[] listClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClienteDeBiblioteca(session, condition, orderBy, lockMode);
			return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
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
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadClienteDeBibliotecaByQuery(session, condition, orderBy);
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
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadClienteDeBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ClienteDeBiblioteca[] clienteDeBibliotecas = listClienteDeBibliotecaByQuery(session, condition, orderBy);
		if (clienteDeBibliotecas != null && clienteDeBibliotecas.length > 0)
			return clienteDeBibliotecas[0];
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
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ClienteDeBiblioteca[] clienteDeBibliotecas = listClienteDeBibliotecaByQuery(session, condition, orderBy, lockMode);
		if (clienteDeBibliotecas != null && clienteDeBibliotecas.length > 0)
			return clienteDeBibliotecas[0];
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
    public static java.util.Iterator iterateClienteDeBibliotecaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateClienteDeBibliotecaByQuery(session, condition, orderBy);
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
    public static java.util.Iterator iterateClienteDeBibliotecaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateClienteDeBibliotecaByQuery(session, condition, orderBy, lockMode);
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
    public static java.util.Iterator iterateClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.ClienteDeBiblioteca as ClienteDeBiblioteca");
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
    public static java.util.Iterator iterateClienteDeBibliotecaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.ClienteDeBiblioteca as ClienteDeBiblioteca");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ClienteDeBiblioteca", lockMode);
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
    public static ClienteDeBiblioteca createClienteDeBiblioteca() {
		return new modelo.ClienteDeBiblioteca();
	}
	
    /**
     *
     * @param clienteDeBiblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean save(modelo.ClienteDeBiblioteca clienteDeBiblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(clienteDeBiblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param clienteDeBiblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean delete(modelo.ClienteDeBiblioteca clienteDeBiblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(clienteDeBiblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param clienteDeBiblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.ClienteDeBiblioteca clienteDeBiblioteca)throws PersistentException {
		try {
			modelo.Biblioteca bibliotecaidBiblioteca = clienteDeBiblioteca.getBibliotecaidBiblioteca();
			if (clienteDeBiblioteca.getBibliotecaidBiblioteca() != null) {
				clienteDeBiblioteca.getBibliotecaidBiblioteca().clienteDeBiblioteca.remove(clienteDeBiblioteca);
			}
			clienteDeBiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			
			modelo.Cliente cliente = clienteDeBiblioteca.getCliente();
			if (clienteDeBiblioteca.getCliente() != null) {
				clienteDeBiblioteca.getCliente().clienteDeBiblioteca.remove(clienteDeBiblioteca);
			}
			clienteDeBiblioteca.setORM_Cliente(cliente);
			
			return delete(clienteDeBiblioteca);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param clienteDeBiblioteca
     * @param session
     * @return
     * @throws PersistentException
     */
    public static boolean deleteAndDissociate(modelo.ClienteDeBiblioteca clienteDeBiblioteca, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.Biblioteca bibliotecaidBiblioteca = clienteDeBiblioteca.getBibliotecaidBiblioteca();
			if (clienteDeBiblioteca.getBibliotecaidBiblioteca() != null) {
				clienteDeBiblioteca.getBibliotecaidBiblioteca().clienteDeBiblioteca.remove(clienteDeBiblioteca);
			}
			clienteDeBiblioteca.setORM_BibliotecaidBiblioteca(bibliotecaidBiblioteca);
			
			modelo.Cliente cliente = clienteDeBiblioteca.getCliente();
			if (clienteDeBiblioteca.getCliente() != null) {
				clienteDeBiblioteca.getCliente().clienteDeBiblioteca.remove(clienteDeBiblioteca);
			}
			clienteDeBiblioteca.setORM_Cliente(cliente);
			
			try {
				session.delete(clienteDeBiblioteca);
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
     * @param clienteDeBiblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean refresh(modelo.ClienteDeBiblioteca clienteDeBiblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(clienteDeBiblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param clienteDeBiblioteca
     * @return
     * @throws PersistentException
     */
    public static boolean evict(modelo.ClienteDeBiblioteca clienteDeBiblioteca) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(clienteDeBiblioteca);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
    /**
     *
     * @param clienteDeBibliotecaCriteria
     * @return
     */
    public static ClienteDeBiblioteca loadClienteDeBibliotecaByCriteria(ClienteDeBibliotecaCriteria clienteDeBibliotecaCriteria) {
		ClienteDeBiblioteca[] clienteDeBibliotecas = listClienteDeBibliotecaByCriteria(clienteDeBibliotecaCriteria);
		if(clienteDeBibliotecas == null || clienteDeBibliotecas.length == 0) {
			return null;
		}
		return clienteDeBibliotecas[0];
	}
	
    /**
     *
     * @param clienteDeBibliotecaCriteria
     * @return
     */
    public static ClienteDeBiblioteca[] listClienteDeBibliotecaByCriteria(ClienteDeBibliotecaCriteria clienteDeBibliotecaCriteria) {
		return clienteDeBibliotecaCriteria.listClienteDeBiblioteca();
	}
}
