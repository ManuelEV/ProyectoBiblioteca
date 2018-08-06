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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression correo;
	public final StringExpression usuario;
	public final StringExpression tipoUsuario;
	public final StringExpression contraseña;
	public final IntegerExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final CollectionExpression cliente1;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		correo = new StringExpression("correo", this);
		usuario = new StringExpression("usuario", this);
		tipoUsuario = new StringExpression("tipoUsuario", this);
		contraseña = new StringExpression("contraseña", this);
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
		cliente1 = new CollectionExpression("ORM_Cliente1", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
	public ClienteCriteria createCliente1Criteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente1"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

