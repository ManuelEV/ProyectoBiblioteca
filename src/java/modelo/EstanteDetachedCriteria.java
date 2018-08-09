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
public class EstanteDetachedCriteria extends AbstractORMDetachedCriteria {

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
     */
    public EstanteDetachedCriteria() {
		super(modelo.Estante.class, modelo.EstanteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		idCategoriaId = new IntegerExpression("idCategoria.id", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public EstanteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.EstanteCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		idCategoriaId = new IntegerExpression("idCategoria.id", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public BibliotecaDetachedCriteria createIdBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("idBiblioteca"));
	}
	
    /**
     *
     * @return
     */
    public CategoriaDetachedCriteria createIdCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("idCategoria"));
	}
	
    /**
     *
     * @return
     */
    public LibroDetachedCriteria createLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_Libro"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Estante uniqueEstante(PersistentSession session) {
		return (Estante) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Estante[] listEstante(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estante[]) list.toArray(new Estante[list.size()]);
	}
}

