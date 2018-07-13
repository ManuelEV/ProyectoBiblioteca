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

public class FuncionarioCriteria extends AbstractORMCriteria {
	public final StringExpression RUN;
	public final StringExpression nombre;
	public final StringExpression apellidoMaterno;
	public final StringExpression apellidoPaterno;
	public final StringExpression genero;
	public final DateExpression fechaDeNacimiento;
	public final StringExpression cargo;
	public final DateExpression fechaDeContrato;
	public final DateExpression fechaTerminoContrato;
	public final IntegerExpression numeroCelular;
	public final IntegerExpression numeroTelefono;
	public final StringExpression correoElectronico;
	public final StringExpression idCiudadId;
	public final AssociationExpression idCiudad;
	public final StringExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	
	public FuncionarioCriteria(Criteria criteria) {
		super(criteria);
		RUN = new StringExpression("RUN", this);
		nombre = new StringExpression("nombre", this);
		apellidoMaterno = new StringExpression("apellidoMaterno", this);
		apellidoPaterno = new StringExpression("apellidoPaterno", this);
		genero = new StringExpression("genero", this);
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this);
		cargo = new StringExpression("cargo", this);
		fechaDeContrato = new DateExpression("fechaDeContrato", this);
		fechaTerminoContrato = new DateExpression("fechaTerminoContrato", this);
		numeroCelular = new IntegerExpression("numeroCelular", this);
		numeroTelefono = new IntegerExpression("numeroTelefono", this);
		correoElectronico = new StringExpression("correoElectronico", this);
		idCiudadId = new StringExpression("idCiudad.idCiudad", this);
		idCiudad = new AssociationExpression("idCiudad", this);
		idBibliotecaId = new StringExpression("idBiblioteca.idBiblioteca", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
	}
	
	public FuncionarioCriteria(PersistentSession session) {
		this(session.createCriteria(Funcionario.class));
	}
	
	public FuncionarioCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public CiudadCriteria createIdCiudadCriteria() {
		return new CiudadCriteria(createCriteria("idCiudad"));
	}
	
	public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
	public Funcionario uniqueFuncionario() {
		return (Funcionario) super.uniqueResult();
	}
	
	public Funcionario[] listFuncionario() {
		java.util.List list = super.list();
		return (Funcionario[]) list.toArray(new Funcionario[list.size()]);
	}
}

