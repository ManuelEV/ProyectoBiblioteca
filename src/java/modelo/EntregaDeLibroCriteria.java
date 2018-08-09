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
public class EntregaDeLibroCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final DateExpression fechaDeDevolucion;

    /**
     *
     */
    public final IntegerExpression diasDeAtraso;

    /**
     *
     */
    public final IntegerExpression librocodigoId;

    /**
     *
     */
    public final AssociationExpression librocodigo;

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
    public EntregaDeLibroCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaDeDevolucion = new DateExpression("fechaDeDevolucion", this);
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this);
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this);
		librocodigo = new AssociationExpression("ORM_Librocodigo", this);
		idClienteId = new IntegerExpression("ORM_IdCliente.id", this);
		idCliente = new AssociationExpression("ORM_IdCliente", this);
	}
	
    /**
     *
     * @param session
     */
    public EntregaDeLibroCriteria(PersistentSession session) {
		this(session.createCriteria(EntregaDeLibro.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public EntregaDeLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public LibroCriteria createLibrocodigoCriteria() {
		return new LibroCriteria(createCriteria("ORM_Librocodigo"));
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
    public EntregaDeLibro uniqueEntregaDeLibro() {
		return (EntregaDeLibro) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public EntregaDeLibro[] listEntregaDeLibro() {
		java.util.List list = super.list();
		return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
	}
}

