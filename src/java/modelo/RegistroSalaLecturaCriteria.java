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

public class RegistroSalaLecturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idRegistro;
	public final DateExpression fechaRegistro;
	public final StringExpression tipoRegistro;
	public final TimeExpression horaRegistro;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression salaDeLecturaidSalaId;
	public final AssociationExpression salaDeLecturaidSala;
	
	public RegistroSalaLecturaCriteria(Criteria criteria) {
		super(criteria);
		idRegistro = new IntegerExpression("idRegistro", this);
		fechaRegistro = new DateExpression("fechaRegistro", this);
		tipoRegistro = new StringExpression("tipoRegistro", this);
		horaRegistro = new TimeExpression("horaRegistro", this);
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
		salaDeLecturaidSalaId = new StringExpression("ORM_SalaDeLecturaidSala.idSala", this);
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this);
	}
	
	public RegistroSalaLecturaCriteria(PersistentSession session) {
		this(session.createCriteria(RegistroSalaLectura.class));
	}
	
	public RegistroSalaLecturaCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public SalaDeLecturaCriteria createSalaDeLecturaidSalaCriteria() {
		return new SalaDeLecturaCriteria(createCriteria("ORM_SalaDeLecturaidSala"));
	}
	
	public RegistroSalaLectura uniqueRegistroSalaLectura() {
		return (RegistroSalaLectura) super.uniqueResult();
	}
	
	public RegistroSalaLectura[] listRegistroSalaLectura() {
		java.util.List list = super.list();
		return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
	}
}

