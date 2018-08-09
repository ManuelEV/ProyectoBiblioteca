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

/**
 *
 * @author Manuel
 */
public class RegistroSalaLecturaDetachedCriteria extends AbstractORMDetachedCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final DateExpression fechaRegistro;

    /**
     *
     */
    public final StringExpression tipoRegistro;

    /**
     *
     */
    public final TimeExpression horaRegistro;

    /**
     *
     */
    public final IntegerExpression salaDeLecturaidSalaId;

    /**
     *
     */
    public final AssociationExpression salaDeLecturaidSala;

    /**
     *
     */
    public final IntegerExpression idClienteId;

    /**
     *
     */
    public final AssociationExpression idCliente;
	
    /**
     *
     */
    public RegistroSalaLecturaDetachedCriteria() {
		super(modelo.RegistroSalaLectura.class, modelo.RegistroSalaLecturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		tipoRegistro = new StringExpression("tipoRegistro", this.getDetachedCriteria());
		horaRegistro = new TimeExpression("horaRegistro", this.getDetachedCriteria());
		salaDeLecturaidSalaId = new IntegerExpression("ORM_SalaDeLecturaidSala.id", this.getDetachedCriteria());
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public RegistroSalaLecturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.RegistroSalaLecturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaRegistro = new DateExpression("fechaRegistro", this.getDetachedCriteria());
		tipoRegistro = new StringExpression("tipoRegistro", this.getDetachedCriteria());
		horaRegistro = new TimeExpression("horaRegistro", this.getDetachedCriteria());
		salaDeLecturaidSalaId = new IntegerExpression("ORM_SalaDeLecturaidSala.id", this.getDetachedCriteria());
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public SalaDeLecturaDetachedCriteria createSalaDeLecturaidSalaCriteria() {
		return new SalaDeLecturaDetachedCriteria(createCriteria("ORM_SalaDeLecturaidSala"));
	}
	
    /**
     *
     * @return
     */
    public ClienteDetachedCriteria createIdClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_IdCliente"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public RegistroSalaLectura uniqueRegistroSalaLectura(PersistentSession session) {
		return (RegistroSalaLectura) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public RegistroSalaLectura[] listRegistroSalaLectura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
	}
}

