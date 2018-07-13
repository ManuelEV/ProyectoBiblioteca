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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class RegistroSalaLecturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idRegistro;
	public final DateExpression fechaRegistro;
	public final StringExpression tipoRegistro;
	public final TimeExpression horaRegistro;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression salaDeLecturaidSalaId;
	public final AssociationExpression salaDeLecturaidSala;
	
	public RegistroSalaLecturaDetachedCriteria() {
		super(modelo.RegistroSalaLectura.class, modelo.RegistroSalaLecturaCriteria.class);
		idRegistro = new IntegerExpression("idRegistro", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		tipoRegistro = new StringExpression("tipoRegistro", this.getDetachedCriteria());
		horaRegistro = new TimeExpression("horaRegistro", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		salaDeLecturaidSalaId = new StringExpression("ORM_SalaDeLecturaidSala.idSala", this.getDetachedCriteria());
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this.getDetachedCriteria());
	}
	
	public RegistroSalaLecturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.RegistroSalaLecturaCriteria.class);
		idRegistro = new IntegerExpression("idRegistro", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		tipoRegistro = new StringExpression("tipoRegistro", this.getDetachedCriteria());
		horaRegistro = new TimeExpression("horaRegistro", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		salaDeLecturaidSalaId = new StringExpression("ORM_SalaDeLecturaidSala.idSala", this.getDetachedCriteria());
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public SalaDeLecturaDetachedCriteria createSalaDeLecturaidSalaCriteria() {
		return new SalaDeLecturaDetachedCriteria(createCriteria("ORM_SalaDeLecturaidSala"));
	}
	
	public RegistroSalaLectura uniqueRegistroSalaLectura(PersistentSession session) {
		return (RegistroSalaLectura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public RegistroSalaLectura[] listRegistroSalaLectura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
	}
}

