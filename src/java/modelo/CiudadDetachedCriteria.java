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
public class CiudadDetachedCriteria extends AbstractORMDetachedCriteria {

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
     */
    public CiudadDetachedCriteria() {
		super(modelo.Ciudad.class, modelo.CiudadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idPaisId = new IntegerExpression("idPais.id", this.getDetachedCriteria());
		idPais = new AssociationExpression("idPais", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_Cliente", this.getDetachedCriteria());
		biblioteca = new CollectionExpression("ORM_Biblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public CiudadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.CiudadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		idPaisId = new IntegerExpression("idPais.id", this.getDetachedCriteria());
		idPais = new AssociationExpression("idPais", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_Cliente", this.getDetachedCriteria());
		biblioteca = new CollectionExpression("ORM_Biblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public PaisDetachedCriteria createIdPaisCriteria() {
		return new PaisDetachedCriteria(createCriteria("idPais"));
	}
	
    /**
     *
     * @return
     */
    public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_Cliente"));
	}
	
    /**
     *
     * @return
     */
    public BibliotecaDetachedCriteria createBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("ORM_Biblioteca"));
	}
	
    /**
     *
     * @return
     */
    public FuncionarioDetachedCriteria createFuncionarioCriteria() {
		return new FuncionarioDetachedCriteria(createCriteria("ORM_Funcionario"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Ciudad uniqueCiudad(PersistentSession session) {
		return (Ciudad) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Ciudad[] listCiudad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
	}
}

