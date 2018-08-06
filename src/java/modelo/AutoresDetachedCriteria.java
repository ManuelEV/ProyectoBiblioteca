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

public class AutoresDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression autoridAutorId;
	public final AssociationExpression autoridAutor;
	public final IntegerExpression librocodigoId;
	public final AssociationExpression librocodigo;
	
	public AutoresDetachedCriteria() {
		super(modelo.Autores.class, modelo.AutoresCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		autoridAutorId = new IntegerExpression("ORM_AutoridAutor.id", this.getDetachedCriteria());
		autoridAutor = new AssociationExpression("ORM_AutoridAutor", this.getDetachedCriteria());
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this.getDetachedCriteria());
		librocodigo = new AssociationExpression("ORM_Librocodigo", this.getDetachedCriteria());
	}
	
	public AutoresDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.AutoresCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		autoridAutorId = new IntegerExpression("ORM_AutoridAutor.id", this.getDetachedCriteria());
		autoridAutor = new AssociationExpression("ORM_AutoridAutor", this.getDetachedCriteria());
		librocodigoId = new IntegerExpression("ORM_Librocodigo.id", this.getDetachedCriteria());
		librocodigo = new AssociationExpression("ORM_Librocodigo", this.getDetachedCriteria());
	}
	
	public AutorDetachedCriteria createAutoridAutorCriteria() {
		return new AutorDetachedCriteria(createCriteria("ORM_AutoridAutor"));
	}
	
	public LibroDetachedCriteria createLibrocodigoCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_Librocodigo"));
	}
	
	public Autores uniqueAutores(PersistentSession session) {
		return (Autores) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autores[] listAutores(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autores[]) list.toArray(new Autores[list.size()]);
	}
}

