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

public class PaisDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression idPais;
	public final StringExpression nombre;
	public final CollectionExpression ciudad;
	
	public PaisDetachedCriteria() {
		super(modelo.Pais.class, modelo.PaisCriteria.class);
		idPais = new StringExpression("idPais", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ciudad = new CollectionExpression("ORM_Ciudad", this.getDetachedCriteria());
	}
	
	public PaisDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.PaisCriteria.class);
		idPais = new StringExpression("idPais", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ciudad = new CollectionExpression("ORM_Ciudad", this.getDetachedCriteria());
	}
	
	public CiudadDetachedCriteria createCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("ORM_Ciudad"));
	}
	
	public Pais uniquePais(PersistentSession session) {
		return (Pais) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pais[] listPais(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pais[]) list.toArray(new Pais[list.size()]);
	}
}

