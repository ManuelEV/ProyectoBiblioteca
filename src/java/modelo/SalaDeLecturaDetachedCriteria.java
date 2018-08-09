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
public class SalaDeLecturaDetachedCriteria extends AbstractORMDetachedCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final IntegerExpression capacidad;

    /**
     *
     */
    public final StringExpression nombre;

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
    public final CollectionExpression registroSalaLectura;
	
    /**
     *
     */
    public SalaDeLecturaDetachedCriteria() {
		super(modelo.SalaDeLectura.class, modelo.SalaDeLecturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		capacidad = new IntegerExpression("capacidad", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public SalaDeLecturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.SalaDeLecturaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		capacidad = new IntegerExpression("capacidad", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this.getDetachedCriteria());
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
    public RegistroSalaLecturaDetachedCriteria createRegistroSalaLecturaCriteria() {
		return new RegistroSalaLecturaDetachedCriteria(createCriteria("ORM_RegistroSalaLectura"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public SalaDeLectura uniqueSalaDeLectura(PersistentSession session) {
		return (SalaDeLectura) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public SalaDeLectura[] listSalaDeLectura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SalaDeLectura[]) list.toArray(new SalaDeLectura[list.size()]);
	}
}

