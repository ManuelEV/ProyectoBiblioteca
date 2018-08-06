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

public class EntregaDeLibroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final DateExpression fechaDeDevolucion;
	public final IntegerExpression diasDeAtraso;
	public final IntegerExpression librocodigoId;
	public final AssociationExpression librocodigo;
	public final IntegerExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	
	public EntregaDeLibroDetachedCriteria() {
		super(modelo.EntregaDeLibro.class, modelo.EntregaDeLibroCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeDevolucion = new DateExpression("fechaDeDevolucion", this.getDetachedCriteria());
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this.getDetachedCriteria());
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this.getDetachedCriteria());
		librocodigo = new AssociationExpression("ORM_Librocodigo", this.getDetachedCriteria());
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
	}
	
	public EntregaDeLibroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.EntregaDeLibroCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fechaDeDevolucion = new DateExpression("fechaDeDevolucion", this.getDetachedCriteria());
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this.getDetachedCriteria());
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this.getDetachedCriteria());
		librocodigo = new AssociationExpression("ORM_Librocodigo", this.getDetachedCriteria());
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
	}
	
	public LibroDetachedCriteria createLibrocodigoCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_Librocodigo"));
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public EntregaDeLibro uniqueEntregaDeLibro(PersistentSession session) {
		return (EntregaDeLibro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EntregaDeLibro[] listEntregaDeLibro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EntregaDeLibro[]) list.toArray(new EntregaDeLibro[list.size()]);
	}
}

