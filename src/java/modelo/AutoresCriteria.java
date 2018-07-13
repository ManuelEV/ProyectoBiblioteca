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

public class AutoresCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression autoridAutorId;
	public final AssociationExpression autoridAutor;
	public final StringExpression librocodigoId;
	public final AssociationExpression librocodigo;
	
	public AutoresCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		autoridAutorId = new StringExpression("ORM_AutoridAutor.idAutor", this);
		autoridAutor = new AssociationExpression("ORM_AutoridAutor", this);
		librocodigoId = new StringExpression("ORM_Librocodigo.codigo", this);
		librocodigo = new AssociationExpression("ORM_Librocodigo", this);
	}
	
	public AutoresCriteria(PersistentSession session) {
		this(session.createCriteria(Autores.class));
	}
	
	public AutoresCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public AutorCriteria createAutoridAutorCriteria() {
		return new AutorCriteria(createCriteria("ORM_AutoridAutor"));
	}
	
	public LibroCriteria createLibrocodigoCriteria() {
		return new LibroCriteria(createCriteria("ORM_Librocodigo"));
	}
	
	public Autores uniqueAutores() {
		return (Autores) super.uniqueResult();
	}
	
	public Autores[] listAutores() {
		java.util.List list = super.list();
		return (Autores[]) list.toArray(new Autores[list.size()]);
	}
}

