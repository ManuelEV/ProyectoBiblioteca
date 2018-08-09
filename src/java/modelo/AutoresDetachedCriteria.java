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

/**
 *
 * @author Manuel
 */
public class AutoresDetachedCriteria extends AbstractORMDetachedCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final IntegerExpression idAutorId;

    /**
     *
     */
    public final AssociationExpression idAutor;

    /**
     *
     */
    public final IntegerExpression idLibroId;

    /**
     *
     */
    public final AssociationExpression idLibro;
	
    /**
     *
     */
    public AutoresDetachedCriteria() {
		super(modelo.Autores.class, modelo.AutoresCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idAutorId = new IntegerExpression("ORM_IdAutor.id", this.getDetachedCriteria());
		idAutor = new AssociationExpression("ORM_IdAutor", this.getDetachedCriteria());
		idLibroId = new IntegerExpression("ORM_IdLibro.id", this.getDetachedCriteria());
		idLibro = new AssociationExpression("ORM_IdLibro", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public AutoresDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.AutoresCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		idAutorId = new IntegerExpression("ORM_IdAutor.id", this.getDetachedCriteria());
		idAutor = new AssociationExpression("ORM_IdAutor", this.getDetachedCriteria());
		idLibroId = new IntegerExpression("ORM_IdLibro.id", this.getDetachedCriteria());
		idLibro = new AssociationExpression("ORM_IdLibro", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public AutorDetachedCriteria createIdAutorCriteria() {
		return new AutorDetachedCriteria(createCriteria("ORM_IdAutor"));
	}
	
    /**
     *
     * @return
     */
    public LibroDetachedCriteria createIdLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_IdLibro"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Autores uniqueAutores(PersistentSession session) {
		return (Autores) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Autores[] listAutores(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autores[]) list.toArray(new Autores[list.size()]);
	}
}

