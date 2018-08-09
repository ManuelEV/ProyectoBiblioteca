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
public class EstanteCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final IntegerExpression capacidadAproximada;

    /**
     *
     */
    public final IntegerExpression idBibliotecaId;

    /**
     *
     */
    public final AssociationExpression idBiblioteca;

    /**
     *
     */
    public final IntegerExpression idCategoriaId;

    /**
     *
     */
    public final AssociationExpression idCategoria;

    /**
     *
     */
    public final CollectionExpression libro;
	
    /**
     *
     * @param criteria
     */
    public EstanteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this);
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
		idCategoriaId = new IntegerExpression("idCategoria.id", this);
		idCategoria = new AssociationExpression("idCategoria", this);
		libro = new CollectionExpression("ORM_Libro", this);
	}
	
    /**
     *
     * @param session
     */
    public EstanteCriteria(PersistentSession session) {
		this(session.createCriteria(Estante.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public EstanteCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
    /**
     *
     * @return
     */
    public CategoriaCriteria createIdCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("idCategoria"));
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
    public Estante uniqueEstante() {
		return (Estante) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Estante[] listEstante() {
		java.util.List list = super.list();
		return (Estante[]) list.toArray(new Estante[list.size()]);
	}
}

