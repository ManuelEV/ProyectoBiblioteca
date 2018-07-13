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

public class CiudadCriteria extends AbstractORMCriteria {
	public final StringExpression idCiudad;
	public final StringExpression nombre;
	public final StringExpression idPaisId;
	public final AssociationExpression idPais;
	public final CollectionExpression cliente;
	public final CollectionExpression biblioteca;
	public final CollectionExpression funcionario;
	
	public CiudadCriteria(Criteria criteria) {
		super(criteria);
		idCiudad = new StringExpression("idCiudad", this);
		nombre = new StringExpression("nombre", this);
		idPaisId = new StringExpression("idPais.idPais", this);
		idPais = new AssociationExpression("idPais", this);
		cliente = new CollectionExpression("ORM_Cliente", this);
		biblioteca = new CollectionExpression("ORM_Biblioteca", this);
		funcionario = new CollectionExpression("ORM_Funcionario", this);
	}
	
	public CiudadCriteria(PersistentSession session) {
		this(session.createCriteria(Ciudad.class));
	}
	
	public CiudadCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public PaisCriteria createIdPaisCriteria() {
		return new PaisCriteria(createCriteria("idPais"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public BibliotecaCriteria createBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("ORM_Biblioteca"));
	}
	
	public FuncionarioCriteria createFuncionarioCriteria() {
		return new FuncionarioCriteria(createCriteria("ORM_Funcionario"));
	}
	
	public Ciudad uniqueCiudad() {
		return (Ciudad) super.uniqueResult();
	}
	
	public Ciudad[] listCiudad() {
		java.util.List list = super.list();
		return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
	}
}

