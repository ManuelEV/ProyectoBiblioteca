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

public class RegistroSalaLecturaDAO {
	public static RegistroSalaLectura loadRegistroSalaLecturaByORMID(int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadRegistroSalaLecturaByORMID(session, id, salaDeLecturaidSala, clienteRUN);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura getRegistroSalaLecturaByORMID(int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getRegistroSalaLecturaByORMID(session, id, salaDeLecturaidSala, clienteRUN);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByORMID(int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadRegistroSalaLecturaByORMID(session, id, salaDeLecturaidSala, clienteRUN, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura getRegistroSalaLecturaByORMID(int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return getRegistroSalaLecturaByORMID(session, id, salaDeLecturaidSala, clienteRUN, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByORMID(PersistentSession session, int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			RegistroSalaLectura registrosalalectura = new modelo.RegistroSalaLectura();
			registrosalalectura.setId(id);
			registrosalalectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			registrosalalectura.setORM_ClienteRUN(clienteRUN);
			
			return (RegistroSalaLectura) session.load(modelo.RegistroSalaLectura.class, registrosalalectura);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura getRegistroSalaLecturaByORMID(PersistentSession session, int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN) throws PersistentException {
		try {
			RegistroSalaLectura registrosalalectura = new modelo.RegistroSalaLectura();
			registrosalalectura.setId(id);
			registrosalalectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			registrosalalectura.setORM_ClienteRUN(clienteRUN);
			
			return (RegistroSalaLectura) session.get(modelo.RegistroSalaLectura.class, registrosalalectura);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByORMID(PersistentSession session, int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			RegistroSalaLectura registrosalalectura = new modelo.RegistroSalaLectura();
			registrosalalectura.setId(id);
			registrosalalectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			registrosalalectura.setORM_ClienteRUN(clienteRUN);
			
			return (RegistroSalaLectura) session.load(modelo.RegistroSalaLectura.class, registrosalalectura, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura getRegistroSalaLecturaByORMID(PersistentSession session, int id, modelo.SalaDeLectura salaDeLecturaidSala, modelo.Cliente clienteRUN, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			RegistroSalaLectura registrosalalectura = new modelo.RegistroSalaLectura();
			registrosalalectura.setId(id);
			registrosalalectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			registrosalalectura.setORM_ClienteRUN(clienteRUN);
			
			return (RegistroSalaLectura) session.get(modelo.RegistroSalaLectura.class, registrosalalectura, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistroSalaLectura(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryRegistroSalaLectura(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistroSalaLectura(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return queryRegistroSalaLectura(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura[] listRegistroSalaLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listRegistroSalaLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura[] listRegistroSalaLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return listRegistroSalaLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRegistroSalaLectura(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.RegistroSalaLectura as RegistroSalaLectura");
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
	
	public static List queryRegistroSalaLectura(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.RegistroSalaLectura as RegistroSalaLectura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RegistroSalaLectura", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura[] listRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRegistroSalaLectura(session, condition, orderBy);
			return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura[] listRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRegistroSalaLectura(session, condition, orderBy, lockMode);
			return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadRegistroSalaLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return loadRegistroSalaLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		RegistroSalaLectura[] registroSalaLecturas = listRegistroSalaLecturaByQuery(session, condition, orderBy);
		if (registroSalaLecturas != null && registroSalaLecturas.length > 0)
			return registroSalaLecturas[0];
		else
			return null;
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		RegistroSalaLectura[] registroSalaLecturas = listRegistroSalaLecturaByQuery(session, condition, orderBy, lockMode);
		if (registroSalaLecturas != null && registroSalaLecturas.length > 0)
			return registroSalaLecturas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRegistroSalaLecturaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateRegistroSalaLecturaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistroSalaLecturaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoprogramacionavanzadaPersistentManager.instance().getSession();
			return iterateRegistroSalaLecturaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.RegistroSalaLectura as RegistroSalaLectura");
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
	
	public static java.util.Iterator iterateRegistroSalaLecturaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.RegistroSalaLectura as RegistroSalaLectura");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RegistroSalaLectura", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura createRegistroSalaLectura() {
		return new modelo.RegistroSalaLectura();
	}
	
	public static boolean save(modelo.RegistroSalaLectura registroSalaLectura) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().saveObject(registroSalaLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(modelo.RegistroSalaLectura registroSalaLectura) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().deleteObject(registroSalaLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.RegistroSalaLectura registroSalaLectura)throws PersistentException {
		try {
			modelo.SalaDeLectura salaDeLecturaidSala = registroSalaLectura.getSalaDeLecturaidSala();
			if (registroSalaLectura.getSalaDeLecturaidSala() != null) {
				registroSalaLectura.getSalaDeLecturaidSala().registroSalaLectura.remove(registroSalaLectura);
			}
			registroSalaLectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			
			modelo.Cliente clienteRUN = registroSalaLectura.getClienteRUN();
			if (registroSalaLectura.getClienteRUN() != null) {
				registroSalaLectura.getClienteRUN().registroSalaLectura.remove(registroSalaLectura);
			}
			registroSalaLectura.setORM_ClienteRUN(clienteRUN);
			
			return delete(registroSalaLectura);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(modelo.RegistroSalaLectura registroSalaLectura, org.orm.PersistentSession session)throws PersistentException {
		try {
			modelo.SalaDeLectura salaDeLecturaidSala = registroSalaLectura.getSalaDeLecturaidSala();
			if (registroSalaLectura.getSalaDeLecturaidSala() != null) {
				registroSalaLectura.getSalaDeLecturaidSala().registroSalaLectura.remove(registroSalaLectura);
			}
			registroSalaLectura.setORM_SalaDeLecturaidSala(salaDeLecturaidSala);
			
			modelo.Cliente clienteRUN = registroSalaLectura.getClienteRUN();
			if (registroSalaLectura.getClienteRUN() != null) {
				registroSalaLectura.getClienteRUN().registroSalaLectura.remove(registroSalaLectura);
			}
			registroSalaLectura.setORM_ClienteRUN(clienteRUN);
			
			try {
				session.delete(registroSalaLectura);
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
	
	public static boolean refresh(modelo.RegistroSalaLectura registroSalaLectura) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().refresh(registroSalaLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(modelo.RegistroSalaLectura registroSalaLectura) throws PersistentException {
		try {
			ProyectoprogramacionavanzadaPersistentManager.instance().getSession().evict(registroSalaLectura);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RegistroSalaLectura loadRegistroSalaLecturaByCriteria(RegistroSalaLecturaCriteria registroSalaLecturaCriteria) {
		RegistroSalaLectura[] registroSalaLecturas = listRegistroSalaLecturaByCriteria(registroSalaLecturaCriteria);
		if(registroSalaLecturas == null || registroSalaLecturas.length == 0) {
			return null;
		}
		return registroSalaLecturas[0];
	}
	
	public static RegistroSalaLectura[] listRegistroSalaLecturaByCriteria(RegistroSalaLecturaCriteria registroSalaLecturaCriteria) {
		return registroSalaLecturaCriteria.listRegistroSalaLectura();
	}
}
