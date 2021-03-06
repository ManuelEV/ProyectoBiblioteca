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
public class ComputadorCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final StringExpression marca;

    /**
     *
     */
    public final DateExpression fechaDeAdquisicion;

    /**
     *
     */
    public final DateExpression fechaUltimaSolicitud;

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
    public final CollectionExpression solicitudComputador;
	
    /**
     *
     * @param criteria
     */
    public ComputadorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		marca = new StringExpression("marca", this);
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this);
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this);
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this);
	}
	
    /**
     *
     * @param session
     */
    public ComputadorCriteria(PersistentSession session) {
		this(session.createCriteria(Computador.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public ComputadorCriteria() throws PersistentException {
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
    public SolicitudComputadorCriteria createSolicitudComputadorCriteria() {
		return new SolicitudComputadorCriteria(createCriteria("ORM_SolicitudComputador"));
	}
	
    /**
     *
     * @return
     */
    public Computador uniqueComputador() {
		return (Computador) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Computador[] listComputador() {
		java.util.List list = super.list();
		return (Computador[]) list.toArray(new Computador[list.size()]);
	}
}

