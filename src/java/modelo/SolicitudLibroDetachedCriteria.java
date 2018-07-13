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
	public final IntegerExpression idSolicitud;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaDeSolicitud;
	public final DateExpression fechaEntregaLimite;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression codigoLibroId;
	public final AssociationExpression codigoLibro;
	
	public SolicitudLibroDetachedCriteria() {
		super(modelo.SolicitudLibro.class, modelo.SolicitudLibroCriteria.class);
		idSolicitud = new IntegerExpression("idSolicitud", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this.getDetachedCriteria());
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		codigoLibroId = new StringExpression("ORM_CodigoLibro.codigo", this.getDetachedCriteria());
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this.getDetachedCriteria());
	}
	
	public SolicitudLibroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.SolicitudLibroCriteria.class);
		idSolicitud = new IntegerExpression("idSolicitud", this.getDetachedCriteria());
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this.getDetachedCriteria());
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this.getDetachedCriteria());
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this.getDetachedCriteria());
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
		codigoLibroId = new StringExpression("ORM_CodigoLibro.codigo", this.getDetachedCriteria());
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public LibroDetachedCriteria createCodigoLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_CodigoLibro"));
	}
	
	public SolicitudLibro uniqueSolicitudLibro(PersistentSession session) {
		return (SolicitudLibro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SolicitudLibro[] listSolicitudLibro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
	}
}

