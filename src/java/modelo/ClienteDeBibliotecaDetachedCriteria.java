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

public class ClienteDeBibliotecaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression bibliotecaidBibliotecaId;
	public final AssociationExpression bibliotecaidBiblioteca;
	public final IntegerExpression clienteRUNId;
	public final AssociationExpression clienteRUN;
	
	public ClienteDeBibliotecaDetachedCriteria() {
		super(modelo.ClienteDeBiblioteca.class, modelo.ClienteDeBibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		bibliotecaidBibliotecaId = new IntegerExpression("ORM_BibliotecaidBiblioteca.id", this.getDetachedCriteria());
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this.getDetachedCriteria());
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
	}
	
	public ClienteDeBibliotecaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.ClienteDeBibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		bibliotecaidBibliotecaId = new IntegerExpression("ORM_BibliotecaidBiblioteca.id", this.getDetachedCriteria());
		bibliotecaidBiblioteca = new AssociationExpression("ORM_BibliotecaidBiblioteca", this.getDetachedCriteria());
		clienteRUNId = new IntegerExpression("ORM_ClienteRUN.id", this.getDetachedCriteria());
		clienteRUN = new AssociationExpression("ORM_ClienteRUN", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createBibliotecaidBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("ORM_BibliotecaidBiblioteca"));
	}
	
	public ClienteDetachedCriteria createClienteRUNCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_ClienteRUN"));
	}
	
	public ClienteDeBiblioteca uniqueClienteDeBiblioteca(PersistentSession session) {
		return (ClienteDeBiblioteca) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ClienteDeBiblioteca[] listClienteDeBiblioteca(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ClienteDeBiblioteca[]) list.toArray(new ClienteDeBiblioteca[list.size()]);
	}
}

