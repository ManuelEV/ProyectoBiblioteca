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
	public final IntegerExpression id;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaSolicitud;
	public final IntegerExpression idComputadorId;
	public final AssociationExpression idComputador;
	public final IntegerExpression idClienteId;
	public final AssociationExpression idCliente;
	
	public SolicitudComputadorDetachedCriteria() {
		super(modelo.SolicitudComputador.class, modelo.SolicitudComputadorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaSolicitud = new TimeExpression("horaSolicitud", this.getDetachedCriteria());
		idComputadorId = new IntegerExpression("ORM_IdComputador.id", this.getDetachedCriteria());
		idComputador = new AssociationExpression("ORM_IdComputador", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
	public SolicitudComputadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.SolicitudComputadorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaSolicitud = new TimeExpression("horaSolicitud", this.getDetachedCriteria());
		idComputadorId = new IntegerExpression("ORM_IdComputador.id", this.getDetachedCriteria());
		idComputador = new AssociationExpression("ORM_IdComputador", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
	public ComputadorDetachedCriteria createIdComputadorCriteria() {
		return new ComputadorDetachedCriteria(createCriteria("ORM_IdComputador"));
	}
	
	public ClienteDetachedCriteria createIdClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_IdCliente"));
	}
	
	public SolicitudComputador uniqueSolicitudComputador(PersistentSession session) {
		return (SolicitudComputador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SolicitudComputador[] listSolicitudComputador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SolicitudComputador[]) list.toArray(new SolicitudComputador[list.size()]);
	}
}

