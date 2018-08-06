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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PaisCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression ciudad;
	
	public PaisCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		ciudad = new CollectionExpression("ORM_Ciudad", this);
	}
	
	public PaisCriteria(PersistentSession session) {
		this(session.createCriteria(Pais.class));
	}
	
	public PaisCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public CiudadCriteria createCiudadCriteria() {
		return new CiudadCriteria(createCriteria("ORM_Ciudad"));
	}
	
	public Pais uniquePais() {
		return (Pais) super.uniqueResult();
	}
	
	public Pais[] listPais() {
		java.util.List list = super.list();
		return (Pais[]) list.toArray(new Pais[list.size()]);
	}
}

