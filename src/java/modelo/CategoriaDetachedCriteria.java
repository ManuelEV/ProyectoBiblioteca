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

public class CategoriaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression estante;
	public final CollectionExpression libro;
	
	public CategoriaDetachedCriteria() {
		super(modelo.Categoria.class, modelo.CategoriaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.CategoriaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public EstanteDetachedCriteria createEstanteCriteria() {
		return new EstanteDetachedCriteria(createCriteria("ORM_Estante"));
	}
	
	public LibroDetachedCriteria createLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_Libro"));
	}
	
	public Categoria uniqueCategoria(PersistentSession session) {
		return (Categoria) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categoria[] listCategoria(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categoria[]) list.toArray(new Categoria[list.size()]);
	}
}

