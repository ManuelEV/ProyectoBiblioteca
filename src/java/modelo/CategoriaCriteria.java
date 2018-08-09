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
public class CategoriaCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final StringExpression nombre;

    /**
     *
     */
    public final CollectionExpression estante;

    /**
     *
     */
    public final CollectionExpression libro;
	
    /**
     *
     * @param criteria
     */
    public CategoriaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		estante = new CollectionExpression("ORM_Estante", this);
		libro = new CollectionExpression("ORM_Libro", this);
	}
	
    /**
     *
     * @param session
     */
    public CategoriaCriteria(PersistentSession session) {
		this(session.createCriteria(Categoria.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public CategoriaCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public EstanteCriteria createEstanteCriteria() {
		return new EstanteCriteria(createCriteria("ORM_Estante"));
	}
	
    /**
     *
     * @return
     */
    public LibroCriteria createLibroCriteria() {
		return new LibroCriteria(createCriteria("ORM_Libro"));
	}
	
    /**
     *
     * @return
     */
    public Categoria uniqueCategoria() {
		return (Categoria) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Categoria[] listCategoria() {
		java.util.List list = super.list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

