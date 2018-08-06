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

public class FuncionarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
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
	public final IntegerExpression idCiudadId;
	public final AssociationExpression idCiudad;
	public final IntegerExpression idBibliotecaId;
	public final AssociationExpression idBiblioteca;
	
	public FuncionarioDetachedCriteria() {
		super(modelo.Funcionario.class, modelo.FuncionarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		RUN = new StringExpression("RUN", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		cargo = new StringExpression("cargo", this.getDetachedCriteria());
		fechaDeContrato = new DateExpression("fechaDeContrato", this.getDetachedCriteria());
		fechaTerminoContrato = new DateExpression("fechaTerminoContrato", this.getDetachedCriteria());
		numeroCelular = new IntegerExpression("numeroCelular", this.getDetachedCriteria());
		numeroTelefono = new IntegerExpression("numeroTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new IntegerExpression("idCiudad.id", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
	}
	
	public FuncionarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.FuncionarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		RUN = new StringExpression("RUN", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		cargo = new StringExpression("cargo", this.getDetachedCriteria());
		fechaDeContrato = new DateExpression("fechaDeContrato", this.getDetachedCriteria());
		fechaTerminoContrato = new DateExpression("fechaTerminoContrato", this.getDetachedCriteria());
		numeroCelular = new IntegerExpression("numeroCelular", this.getDetachedCriteria());
		numeroTelefono = new IntegerExpression("numeroTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new IntegerExpression("idCiudad.id", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this.getDetachedCriteria());
		idBiblioteca = new AssociationExpression("idBiblioteca", this.getDetachedCriteria());
	}
	
	public CiudadDetachedCriteria createIdCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("idCiudad"));
	}
	
	public BibliotecaDetachedCriteria createIdBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("idBiblioteca"));
	}
	
	public Funcionario uniqueFuncionario(PersistentSession session) {
		return (Funcionario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Funcionario[] listFuncionario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Funcionario[]) list.toArray(new Funcionario[list.size()]);
	}
}

