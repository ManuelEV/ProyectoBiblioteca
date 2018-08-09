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
public class CiudadCriteria extends AbstractORMCriteria {

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
    public final IntegerExpression idPaisId;

    /**
     *
     */
    public final AssociationExpression idPais;

    /**
     *
     */
    public final CollectionExpression cliente;

    /**
     *
     */
    public final CollectionExpression biblioteca;

    /**
     *
     */
    public final CollectionExpression funcionario;
	
    /**
     *
     * @param criteria
     */
    public CiudadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		idPaisId = new IntegerExpression("idPais.id", this);
		idPais = new AssociationExpression("idPais", this);
		cliente = new CollectionExpression("ORM_Cliente", this);
		biblioteca = new CollectionExpression("ORM_Biblioteca", this);
		funcionario = new CollectionExpression("ORM_Funcionario", this);
	}
	
    /**
     *
     * @param session
     */
    public CiudadCriteria(PersistentSession session) {
		this(session.createCriteria(Ciudad.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public CiudadCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public PaisCriteria createIdPaisCriteria() {
		return new PaisCriteria(createCriteria("idPais"));
	}
	
    /**
     *
     * @return
     */
    public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
    /**
     *
     * @return
     */
    public BibliotecaCriteria createBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("ORM_Biblioteca"));
	}
	
    /**
     *
     * @return
     */
    public FuncionarioCriteria createFuncionarioCriteria() {
		return new FuncionarioCriteria(createCriteria("ORM_Funcionario"));
	}
	
    /**
     *
     * @return
     */
    public Ciudad uniqueCiudad() {
		return (Ciudad) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Ciudad[] listCiudad() {
		java.util.List list = super.list();
		return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
	}
}

