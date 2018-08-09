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

/**
 *
 * @author Manuel
 */
public class RegistroSalaLecturaCriteria extends AbstractORMCriteria {

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
     * @param criteria
     */
    public RegistroSalaLecturaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaRegistro = new DateExpression("fechaRegistro", this);
		tipoRegistro = new StringExpression("tipoRegistro", this);
		horaRegistro = new TimeExpression("horaRegistro", this);
		salaDeLecturaidSalaId = new IntegerExpression("ORM_SalaDeLecturaidSala.id", this);
		salaDeLecturaidSala = new AssociationExpression("ORM_SalaDeLecturaidSala", this);
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this);
		idCliente = new AssociationExpression("ORM_IdCliente", this);
	}
	
    /**
     *
     * @param session
     */
    public RegistroSalaLecturaCriteria(PersistentSession session) {
		this(session.createCriteria(RegistroSalaLectura.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public RegistroSalaLecturaCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public SalaDeLecturaCriteria createSalaDeLecturaidSalaCriteria() {
		return new SalaDeLecturaCriteria(createCriteria("ORM_SalaDeLecturaidSala"));
	}
	
    /**
     *
     * @return
     */
    public ClienteCriteria createIdClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_IdCliente"));
	}
	
    /**
     *
     * @return
     */
    public RegistroSalaLectura uniqueRegistroSalaLectura() {
		return (RegistroSalaLectura) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public RegistroSalaLectura[] listRegistroSalaLectura() {
		java.util.List list = super.list();
		return (RegistroSalaLectura[]) list.toArray(new RegistroSalaLectura[list.size()]);
	}
}

