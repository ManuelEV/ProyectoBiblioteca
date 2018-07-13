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

public class SolicitudComputadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSolicitud;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaSolicitud;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression idComputadorId;
	public final AssociationExpression idComputador;
	
	public SolicitudComputadorCriteria(Criteria criteria) {
		super(criteria);
		idSolicitud = new IntegerExpression("idSolicitud", this);
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this);
		horaSolicitud = new TimeExpression("horaSolicitud", this);
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
		idComputadorId = new StringExpression("ORM_IdComputador.idComputador", this);
		idComputador = new AssociationExpression("ORM_IdComputador", this);
	}
	
	public SolicitudComputadorCriteria(PersistentSession session) {
		this(session.createCriteria(SolicitudComputador.class));
	}
	
	public SolicitudComputadorCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public ComputadorCriteria createIdComputadorCriteria() {
		return new ComputadorCriteria(createCriteria("ORM_IdComputador"));
	}
	
	public SolicitudComputador uniqueSolicitudComputador() {
		return (SolicitudComputador) super.uniqueResult();
	}
	
	public SolicitudComputador[] listSolicitudComputador() {
		java.util.List list = super.list();
		return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
	}
}

