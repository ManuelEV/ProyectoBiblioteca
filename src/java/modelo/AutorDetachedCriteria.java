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

public class AutorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idAutor;
	public final StringExpression nombre;
	public final DateExpression fechaDeNacimiento;
	public final StringExpression genero;
	public final StringExpression apellidoPaterno;
	public final StringExpression apellidoMaterno;
	public final CollectionExpression autores;
	
	public AutorDetachedCriteria() {
		super(modelo.Autor.class, modelo.AutorCriteria.class);
		idAutor = new StringExpression("idAutor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public AutorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.AutorCriteria.class);
		idAutor = new StringExpression("idAutor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public AutoresDetachedCriteria createAutoresCriteria() {
		return new AutoresDetachedCriteria(createCriteria("ORM_Autores"));
	}
	
	public Autor uniqueAutor(PersistentSession session) {
		return (Autor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autor[] listAutor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autor[]) list.toArray(new Autor[list.size()]);
	}
}

