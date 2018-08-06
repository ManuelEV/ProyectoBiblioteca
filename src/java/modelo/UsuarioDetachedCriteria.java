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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression correo;
	public final StringExpression usuario;
	public final StringExpression tipoUsuario;
	public final StringExpression contraseña;
	public final IntegerExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	public final CollectionExpression cliente1;
	
	public UsuarioDetachedCriteria() {
		super(modelo.Usuario.class, modelo.UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		cliente1 = new CollectionExpression("ORM_Cliente1", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
		cliente1 = new CollectionExpression("ORM_Cliente1", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createIdBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("idBiblioteca"));
	}
	
	public ClienteDetachedCriteria createCliente1Criteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_Cliente1"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

