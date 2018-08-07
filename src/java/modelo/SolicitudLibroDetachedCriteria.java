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

public class SolicitudLibroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaDeSolicitud;
	public final DateExpression fechaEntregaLimite;
	public final IntegerExpression codigoLibroId;
	public final AssociationExpression codigoLibro;
	public final IntegerExpression idClienteId;
	public final AssociationExpression idCliente;
	
	public SolicitudLibroDetachedCriteria() {
		super(modelo.SolicitudLibro.class, modelo.SolicitudLibroCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this.getDetachedCriteria());
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this.getDetachedCriteria());
		codigoLibroId = new IntegerExpression("ORM_CodigoLibro.id", this.getDetachedCriteria());
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
	public SolicitudLibroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.SolicitudLibroCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this.getDetachedCriteria());
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this.getDetachedCriteria());
		codigoLibroId = new IntegerExpression("ORM_CodigoLibro.id", this.getDetachedCriteria());
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this.getDetachedCriteria());
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this.getDetachedCriteria());
		idCliente = new AssociationExpression("ORM_IdCliente", this.getDetachedCriteria());
	}
	
	public LibroDetachedCriteria createCodigoLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_CodigoLibro"));
	}
	
	public ClienteDetachedCriteria createIdClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_IdCliente"));
	}
	
	public SolicitudLibro uniqueSolicitudLibro(PersistentSession session) {
		return (SolicitudLibro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SolicitudLibro[] listSolicitudLibro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
	}
}

