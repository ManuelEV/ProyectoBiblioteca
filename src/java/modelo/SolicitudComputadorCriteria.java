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
	public final IntegerExpression id;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaSolicitud;
	public final IntegerExpression idComputadorId;
	public final AssociationExpression idComputador;
	public final IntegerExpression idClienteId;
	public final AssociationExpression idCliente;
	
	public SolicitudComputadorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this);
		horaSolicitud = new TimeExpression("horaSolicitud", this);
		idComputadorId = new IntegerExpression("ORM_IdComputador.id", this);
		idComputador = new AssociationExpression("ORM_IdComputador", this);
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this);
		idCliente = new AssociationExpression("ORM_IdCliente", this);
	}
	
	public SolicitudComputadorCriteria(PersistentSession session) {
		this(session.createCriteria(SolicitudComputador.class));
	}
	
	public SolicitudComputadorCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public ComputadorCriteria createIdComputadorCriteria() {
		return new ComputadorCriteria(createCriteria("ORM_IdComputador"));
	}
	
	public ClienteCriteria createIdClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_IdCliente"));
	}
	
	public SolicitudComputador uniqueSolicitudComputador() {
		return (SolicitudComputador) super.uniqueResult();
	}
	
	public SolicitudComputador[] listSolicitudComputador() {
		java.util.List list = super.list();
		return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
	}
}

