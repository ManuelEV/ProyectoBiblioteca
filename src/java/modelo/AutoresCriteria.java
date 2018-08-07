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
	public final IntegerExpression idAutorId;
	public final AssociationExpression idAutor;
	public final IntegerExpression idLibroId;
	public final AssociationExpression idLibro;
	
	public AutoresCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		idAutorId = new IntegerExpression("ORM_IdAutor.id", this);
		idAutor = new AssociationExpression("ORM_IdAutor", this);
		idLibroId = new IntegerExpression("ORM_IdLibro.id", this);
		idLibro = new AssociationExpression("ORM_IdLibro", this);
	}
	
	public AutoresCriteria(PersistentSession session) {
		this(session.createCriteria(Autores.class));
	}
	
	public AutoresCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public AutorCriteria createIdAutorCriteria() {
		return new AutorCriteria(createCriteria("ORM_IdAutor"));
	}
	
	public LibroCriteria createIdLibroCriteria() {
		return new LibroCriteria(createCriteria("ORM_IdLibro"));
	}
	
	public Autores uniqueAutores() {
		return (Autores) super.uniqueResult();
	}
	
	public Autores[] listAutores() {
		java.util.List list = super.list();
		return (Autores[]) list.toArray(new Autores[list.size()]);
	}
}

