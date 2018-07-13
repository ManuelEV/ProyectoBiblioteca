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

public class EntregaDeLibroCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDevolucion;
	public final DateExpression fechaDeDevolucion;
	public final IntegerExpression diasDeAtraso;
	public final StringExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	public final StringExpression librocodigoId;
	public final AssociationExpression librocodigo;
	
	public EntregaDeLibroCriteria(Criteria criteria) {
		super(criteria);
		idDevolucion = new IntegerExpression("idDevolucion", this);
		fechaDeDevolucion = new DateExpression("fechaDeDevolucion", this);
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this);
		clienteRUNId = new StringExpression("ORM_ClienteRUN.RUN", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
		librocodigoId = new StringExpression("ORM_Librocodigo.codigo", this);
		librocodigo = new AssociationExpression("ORM_Librocodigo", this);
	}
	
	public EntregaDeLibroCriteria(PersistentSession session) {
		this(session.createCriteria(EntregaDeLibro.class));
	}
	
	public EntregaDeLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public LibroCriteria createLibrocodigoCriteria() {
		return new LibroCriteria(createCriteria("ORM_Librocodigo"));
	}
	
	public EntregaDeLibro uniqueEntregaDeLibro() {
		return (EntregaDeLibro) super.uniqueResult();
	}
	
	public EntregaDeLibro[] listEntregaDeLibro() {
		java.util.List list = super.list();
		return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
	}
}

