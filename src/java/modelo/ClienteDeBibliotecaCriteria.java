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
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	
	public ClienteDeBibliotecaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		bibliotecaidBibliotecaId = new IntegerExpression("ORM_BibliotecaidBiblioteca.id", this);
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this);
		clienteId = new IntegerExpression("ORM_Cliente.id", this);
		cliente = new AssociationExpression("ORM_Cliente", this);
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
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public ClienteDeBiblioteca uniqueClienteDeBiblioteca() {
		return (ClienteDeBiblioteca) super.uniqueResult();
	}
	
	public ClienteDeBiblioteca[] listClienteDeBiblioteca() {
		java.util.List list = super.list();
		return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
	}
}

