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

public class SolicitudLibroCriteria extends AbstractORMCriteria {
	public final IntegerExpression idSolicitud;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaDeSolicitud;
	public final DateExpression fechaEntregaLimite;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression codigoLibroId;
	public final AssociationExpression codigoLibro;
	
	public SolicitudLibroCriteria(Criteria criteria) {
		super(criteria);
		idSolicitud = new IntegerExpression("idSolicitud", this);
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this);
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this);
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this);
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
		codigoLibroId = new StringExpression("ORM_CodigoLibro.codigo", this);
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this);
	}
	
	public SolicitudLibroCriteria(PersistentSession session) {
		this(session.createCriteria(SolicitudLibro.class));
	}
	
	public SolicitudLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public LibroCriteria createCodigoLibroCriteria() {
		return new LibroCriteria(createCriteria("ORM_CodigoLibro"));
	}
	
	public SolicitudLibro uniqueSolicitudLibro() {
		return (SolicitudLibro) super.uniqueResult();
	}
	
	public SolicitudLibro[] listSolicitudLibro() {
		java.util.List list = super.list();
		return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
	}
}

