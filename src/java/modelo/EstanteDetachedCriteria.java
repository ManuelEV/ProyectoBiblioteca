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

public class EstanteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idEstante;
	public final IntegerExpression capacidadAproximada;
	public final StringExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final StringExpression idCategoriaId;
	public final AssociationExpression idCategoria;
	public final CollectionExpression libro;
	
	public EstanteDetachedCriteria() {
		super(modelo.Estante.class, modelo.EstanteCriteria.class);
		idEstante = new StringExpression("idEstante", this.getDetachedCriteria());
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this.getDetachedCriteria());
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public EstanteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.EstanteCriteria.class);
		idEstante = new StringExpression("idEstante", this.getDetachedCriteria());
		capacidadAproximada = new IntegerExpression("capacidadAproximada", this.getDetachedCriteria());
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		libro = new CollectionExpression("ORM_Libro", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createIdBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("idBiblioteca"));
	}
	
	public CategoriaDetachedCriteria createIdCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("idCategoria"));
	}
	
	public LibroDetachedCriteria createLibroCriteria() {
		return new LibroDetachedCriteria(createCriteria("ORM_Libro"));
	}
	
	public Estante uniqueEstante(PersistentSession session) {
		return (Estante) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estante[] listEstante(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estante[]) list.toArray(new Estante[list.size()]);
	}
}

