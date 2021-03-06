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
public class PaisDetachedCriteria extends AbstractORMDetachedCriteria {

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
    public final CollectionExpression ciudad;
	
    /**
     *
     */
    public PaisDetachedCriteria() {
		super(modelo.Pais.class, modelo.PaisCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ciudad = new CollectionExpression("ORM_Ciudad", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public PaisDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.PaisCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		ciudad = new CollectionExpression("ORM_Ciudad", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public CiudadDetachedCriteria createCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("ORM_Ciudad"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Pais uniquePais(PersistentSession session) {
		return (Pais) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Pais[] listPais(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pais[]) list.toArray(new Pais[list.size()]);
	}
}

