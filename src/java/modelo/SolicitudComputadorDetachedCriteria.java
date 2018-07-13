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

public class SolicitudComputadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idSolicitud;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaSolicitud;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression idComputadorId;
	public final AssociationExpression idComputador;
	
	public SolicitudComputadorDetachedCriteria() {
		super(modelo.SolicitudComputador.class, modelo.SolicitudComputadorCriteria.class);
		idSolicitud = new IntegerExpression("idSolicitud", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaSolicitud = new TimeExpression("horaSolicitud", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		idComputadorId = new StringExpression("ORM_IdComputador.idComputador", this.getDetachedCriteria());
		idComputador = new AssociationExpression("ORM_IdComputador", this.getDetachedCriteria());
	}
	
	public SolicitudComputadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.SolicitudComputadorCriteria.class);
		idSolicitud = new IntegerExpression("idSolicitud", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaSolicitud = new TimeExpression("horaSolicitud", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		idComputadorId = new StringExpression("ORM_IdComputador.idComputador", this.getDetachedCriteria());
		idComputador = new AssociationExpression("ORM_IdComputador", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public ComputadorDetachedCriteria createIdComputadorCriteria() {
		return new ComputadorDetachedCriteria(createCriteria("ORM_IdComputador"));
	}
	
	public SolicitudComputador uniqueSolicitudComputador(PersistentSession session) {
		return (SolicitudComputador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SolicitudComputador[] listSolicitudComputador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
	}
}

