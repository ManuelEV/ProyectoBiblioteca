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
	public final IntegerExpression id;
	public final DateExpression fechaDeDevolucion;
	public final IntegerExpression diasDeAtraso;
	public final IntegerExpression librocodigoId;
	public final AssociationExpression librocodigo;
	public final IntegerExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	
	public EntregaDeLibroCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fechaDeDevolucion = new DateExpression("fechaDeDevolucion", this);
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this);
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this);
		librocodigo = new AssociationExpression("ORM_Librocodigo", this);
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
	}
	
	public EntregaDeLibroCriteria(PersistentSession session) {
		this(session.createCriteria(EntregaDeLibro.class));
	}
	
	public EntregaDeLibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public LibroCriteria createLibrocodigoCriteria() {
		return new LibroCriteria(createCriteria("ORM_Librocodigo"));
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public EntregaDeLibro uniqueEntregaDeLibro() {
		return (EntregaDeLibro) super.uniqueResult();
	}
	
	public EntregaDeLibro[] listEntregaDeLibro() {
		java.util.List list = super.list();
		return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
	}
}

