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
public class FuncionarioCriteria extends AbstractORMCriteria {

    /**
     *
     */
    public final IntegerExpression id;

    /**
     *
     */
    public final StringExpression RUN;

    /**
     *
     */
    public final StringExpression nombre;

    /**
     *
     */
    public final StringExpression apellidoMaterno;

    /**
     *
     */
    public final StringExpression apellidoPaterno;

    /**
     *
     */
    public final StringExpression genero;

    /**
     *
     */
    public final DateExpression fechaDeNacimiento;

    /**
     *
     */
    public final StringExpression cargo;

    /**
     *
     */
    public final DateExpression fechaDeContrato;

    /**
     *
     */
    public final DateExpression fechaTerminoContrato;

    /**
     *
     */
    public final IntegerExpression numeroCelular;

    /**
     *
     */
    public final IntegerExpression numeroTelefono;

    /**
     *
     */
    public final StringExpression correoElectronico;

    /**
     *
     */
    public final IntegerExpression idCiudadId;

    /**
     *
     */
    public final AssociationExpression idCiudad;

    /**
     *
     */
    public final IntegerExpression idBibliotecaId;

    /**
     *
     */
    public final AssociationExpression idBiblioteca;
	
    /**
     *
     * @param criteria
     */
    public FuncionarioCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
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
		idCiudadId = new IntegerExpression("idCiudad.id", this);
		idCiudad = new AssociationExpression("idCiudad", this);
		idBibliotecaId = new IntegerExpression("idBiblioteca.id", this);
		idBiblioteca = new AssociationExpression("idBiblioteca", this);
	}
	
    /**
     *
     * @param session
     */
    public FuncionarioCriteria(PersistentSession session) {
		this(session.createCriteria(Funcionario.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public FuncionarioCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
    /**
     *
     * @return
     */
    public CiudadCriteria createIdCiudadCriteria() {
		return new CiudadCriteria(createCriteria("idCiudad"));
	}
	
    /**
     *
     * @return
     */
    public BibliotecaCriteria createIdBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("idBiblioteca"));
	}
	
    /**
     *
     * @return
     */
    public Funcionario uniqueFuncionario() {
		return (Funcionario) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Funcionario[] listFuncionario() {
		java.util.List list = super.list();
		return (Funcionario[]) list.toArray(new Funcionario[list.size()]);
	}
}

