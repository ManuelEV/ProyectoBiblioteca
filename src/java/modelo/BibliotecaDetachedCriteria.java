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
public class BibliotecaDetachedCriteria extends AbstractORMDetachedCriteria {

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
    public final StringExpression direccion;

    /**
     *
     */
    public final StringExpression propietario;

    /**
     *
     */
    public final IntegerExpression numeroDeTelefono;

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
    public final CollectionExpression estante;

    /**
     *
     */
    public final CollectionExpression computador;

    /**
     *
     */
    public final CollectionExpression salaDeLectura;

    /**
     *
     */
    public final CollectionExpression clienteDeBiblioteca;

    /**
     *
     */
    public final CollectionExpression funcionario;

    /**
     *
     */
    public final CollectionExpression usuario;
	
    /**
     *
     */
    public BibliotecaDetachedCriteria() {
		super(modelo.Biblioteca.class, modelo.BibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new IntegerExpression("idCiudad.id", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		computador = new CollectionExpression("ORM_Computador", this.getDetachedCriteria());
		salaDeLectura = new CollectionExpression("ORM_SalaDeLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_Usuario", this.getDetachedCriteria());
	}
	
    /**
     *
     * @param aDetachedCriteria
     */
    public BibliotecaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.BibliotecaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		propietario = new StringExpression("propietario", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new IntegerExpression("idCiudad.id", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		estante = new CollectionExpression("ORM_Estante", this.getDetachedCriteria());
		computador = new CollectionExpression("ORM_Computador", this.getDetachedCriteria());
		salaDeLectura = new CollectionExpression("ORM_SalaDeLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
		funcionario = new CollectionExpression("ORM_Funcionario", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_Usuario", this.getDetachedCriteria());
	}
	
    /**
     *
     * @return
     */
    public CiudadDetachedCriteria createIdCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("idCiudad"));
	}
	
    /**
     *
     * @return
     */
    public EstanteDetachedCriteria createEstanteCriteria() {
		return new EstanteDetachedCriteria(createCriteria("ORM_Estante"));
	}
	
    /**
     *
     * @return
     */
    public ComputadorDetachedCriteria createComputadorCriteria() {
		return new ComputadorDetachedCriteria(createCriteria("ORM_Computador"));
	}
	
    /**
     *
     * @return
     */
    public SalaDeLecturaDetachedCriteria createSalaDeLecturaCriteria() {
		return new SalaDeLecturaDetachedCriteria(createCriteria("ORM_SalaDeLectura"));
	}
	
    /**
     *
     * @return
     */
    public ClienteDeBibliotecaDetachedCriteria createClienteDeBibliotecaCriteria() {
		return new ClienteDeBibliotecaDetachedCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
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
     * @return
     */
    public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_Usuario"));
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Biblioteca uniqueBiblioteca(PersistentSession session) {
		return (Biblioteca) super.createExecutableCriteria(session).uniqueResult();
	}
	
    /**
     *
     * @param session
     * @return
     */
    public Biblioteca[] listBiblioteca(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
	}
}

