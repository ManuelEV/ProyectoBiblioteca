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

public class ClienteDeBibliotecaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression bibliotecaidBibliotecaId;
	public final AssociationExpression bibliotecaidBiblioteca;
	public final IntegerExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	
	public ClienteDeBibliotecaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		bibliotecaidBibliotecaId = new IntegerExpression("ORM_BibliotecaidBiblioteca.id", this);
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this);
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this);
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this);
	}
	
	public ClienteDeBibliotecaCriteria(PersistentSession session) {
		this(session.createCriteria(ClienteDeBiblioteca.class));
	}
	
	public ClienteDeBibliotecaCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createBibliotecaidBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("ORM_BibliotecaidBiblioteca"));
	}
	
	public ClienteCriteria createClienteRUNCriteria() {
		return new ClienteCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public ClienteDeBiblioteca uniqueClienteDeBiblioteca() {
		return (ClienteDeBiblioteca) super.uniqueResult();
	}
	
	public ClienteDeBiblioteca[] listClienteDeBiblioteca() {
		java.util.List list = super.list();
		return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
	}
}

