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

public class SalaDeLecturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression capacidad;
	public final StringExpression nombre;
	public final IntegerExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final CollectionExpression registroSalaLectura;
	
	public SalaDeLecturaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		capacidad = new IntegerExpression("capacidad", this);
		nombre = new StringExpression("nombre", this);
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this);
	}
	
	public SalaDeLecturaCriteria(PersistentSession session) {
		this(session.createCriteria(SalaDeLectura.class));
	}
	
	public SalaDeLecturaCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
	public RegistroSalaLecturaCriteria createRegistroSalaLecturaCriteria() {
		return new RegistroSalaLecturaCriteria(createCriteria("ORM_RegistroSalaLectura"));
	}
	
	public SalaDeLectura uniqueSalaDeLectura() {
		return (SalaDeLectura) super.uniqueResult();
	}
	
	public SalaDeLectura[] listSalaDeLectura() {
		java.util.List list = super.list();
		return (SalaDeLectura[]) list.toArray(new SalaDeLectura[list.size()]);
	}
}

