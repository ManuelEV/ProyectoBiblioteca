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
public class SolicitudLibroCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final DateExpression fechaDeSolicitud;

    /**
     *
     */
    public final TimeExpression horaDeSolicitud;

    /**
     *
     */
    public final DateExpression fechaEntregaLimite;

    /**
     *
     */
    public final IntegerExpression codigoLibroId;

    /**
     *
     */
    public final AssociationExpression codigoLibro;

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
    public SolicitudLibroCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaDeSolicitud = new DateExpression("fechaDeSolicitud", this);
		horaDeSolicitud = new TimeExpression("horaDeSolicitud", this);
		fechaEntregaLimite = new DateExpression("fechaEntregaLimite", this);
		codigoLibroId = new IntegerExpression("ORM_CodigoLibro.id", this);
		codigoLibro = new AssociationExpression("ORM_CodigoLibro", this);
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this);
		idCliente = new AssociationExpression("ORM_IdCliente", this);
	}
	
    /**
     *
     * @param session
     */
    public SolicitudLibroCriteria(PersistentSession session) {
		this(session.createCriteria(SolicitudLibro.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public SolicitudLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public LibroCriteria createCodigoLibroCriteria() {
		return new LibroCriteria(createCriteria("ORM_CodigoLibro"));
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
    public SolicitudLibro uniqueSolicitudLibro() {
		return (SolicitudLibro) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public SolicitudLibro[] listSolicitudLibro() {
		java.util.List list = super.list();
		return (SolicitudLibro[]) list.toArray(new SolicitudLibro[list.size()]);
	}
}

