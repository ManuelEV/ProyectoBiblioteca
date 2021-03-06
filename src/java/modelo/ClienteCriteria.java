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
public class ClienteCriteria extends AbstractORMCriteria {

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
    public final StringExpression apellidoPaterno;

    /**
     *
     */
    public final StringExpression apellidoMaterno;

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
    public final StringExpression estadoDeTrabajo;

    /**
     *
     */
    public final StringExpression areaDeInteres;

    /**
     *
     */
    public final DateExpression fechaUltimaSolicitud;

    /**
     *
     */
    public final IntegerExpression diasDeAtraso;

    /**
     *
     */
    public final IntegerExpression numeroDeCelular;

    /**
     *
     */
    public final IntegerExpression numeroDeTelefono;

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
    public final IntegerExpression usuarioId;

    /**
     *
     */
    public final AssociationExpression usuario;

    /**
     *
     */
    public final CollectionExpression solicitudComputador;

    /**
     *
     */
    public final CollectionExpression solicitudLibro;

    /**
     *
     */
    public final CollectionExpression entregaDeLibro;

    /**
     *
     */
    public final CollectionExpression registroSalaLectura;

    /**
     *
     */
    public final CollectionExpression clienteDeBiblioteca;
	
    /**
     *
     * @param criteria
     */
    public ClienteCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		RUN = new StringExpression("RUN", this);
		nombre = new StringExpression("nombre", this);
		apellidoPaterno = new StringExpression("apellidoPaterno", this);
		apellidoMaterno = new StringExpression("apellidoMaterno", this);
		genero = new StringExpression("genero", this);
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this);
		estadoDeTrabajo = new StringExpression("estadoDeTrabajo", this);
		areaDeInteres = new StringExpression("areaDeInteres", this);
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this);
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this);
		numeroDeCelular = new IntegerExpression("numeroDeCelular", this);
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this);
		idCiudadId = new IntegerExpression("idCiudad.id", this);
		idCiudad = new AssociationExpression("idCiudad", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this);
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this);
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this);
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this);
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this);
	}
	
    /**
     *
     * @param session
     */
    public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
    /**
     *
     * @throws PersistentException
     */
    public ClienteCriteria() throws PersistentException {
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
    public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
    /**
     *
     * @return
     */
    public SolicitudComputadorCriteria createSolicitudComputadorCriteria() {
		return new SolicitudComputadorCriteria(createCriteria("ORM_SolicitudComputador"));
	}
	
    /**
     *
     * @return
     */
    public SolicitudLibroCriteria createSolicitudLibroCriteria() {
		return new SolicitudLibroCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
    /**
     *
     * @return
     */
    public EntregaDeLibroCriteria createEntregaDeLibroCriteria() {
		return new EntregaDeLibroCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
    /**
     *
     * @return
     */
    public RegistroSalaLecturaCriteria createRegistroSalaLecturaCriteria() {
		return new RegistroSalaLecturaCriteria(createCriteria("ORM_RegistroSalaLectura"));
	}
	
    /**
     *
     * @return
     */
    public ClienteDeBibliotecaCriteria createClienteDeBibliotecaCriteria() {
		return new ClienteDeBibliotecaCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
	}
	
    /**
     *
     * @return
     */
    public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
    /**
     *
     * @return
     */
    public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

