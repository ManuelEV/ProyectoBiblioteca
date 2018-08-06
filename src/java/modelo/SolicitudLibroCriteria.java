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
	public final IntegerExpression id;
	public final DateExpression fechaDeSolicitud;
	public final TimeExpression horaDeSolicitud;
	public final DateExpression fechaEntregaLimite;
	public final IntegerExpression codigoLibroId;
	public final AssociationExpression codigoLibro;
	public final IntegerExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	
	public SolicitudLibroCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this);
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this);
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this);
		codigoLibroId = new IntegerExpression("ORM_CodigoLibro.id", this);
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this);
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
	}
	
	public SolicitudLibroCriteria(PersistentSession session) {
		this(session.createCriteria(SolicitudLibro.class));
	}
	
	public SolicitudLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public LibroCriteria createCodigoLibroCriteria() {
		return new LibroCriteria(createCriteria("ORM_CodigoLibro"));
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public SolicitudLibro uniqueSolicitudLibro() {
		return (SolicitudLibro) super.uniqueResult();
	}
	
	public SolicitudLibro[] listSolicitudLibro() {
		java.util.List list = super.list();
		return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
	}
}

