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

public class ClienteCriteria extends AbstractORMCriteria {
	public final StringExpression RUN;
	public final StringExpression nombre;
	public final StringExpression apellidoPaterno;
	public final StringExpression apellidoMaterno;
	public final StringExpression genero;
	public final DateExpression fechaDeNacimiento;
	public final StringExpression estadoDeTrabajo;
	public final StringExpression areaDeInteres;
	public final DateExpression fechaUltimaSolicitud;
	public final IntegerExpression diasDeAtraso;
	public final IntegerExpression numeroDeCelular;
	public final IntegerExpression numeroDeTelefono;
	public final StringExpression correoElectronico;
	public final StringExpression idCiudadId;
	public final AssociationExpression idCiudad;
	public final StringExpression password;
	public final StringExpression privilegio;
	public final CollectionExpression solicitudComputador;
	public final CollectionExpression solicitudLibro;
	public final CollectionExpression entregaDeLibro;
	public final CollectionExpression registroSalaLectura;
	public final CollectionExpression clienteDeBiblioteca;
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
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
		correoElectronico = new StringExpression("correoElectronico", this);
		idCiudadId = new StringExpression("idCiudad.idCiudad", this);
		idCiudad = new AssociationExpression("idCiudad", this);
		password = new StringExpression("password", this);
		privilegio = new StringExpression("privilegio", this);
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this);
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this);
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this);
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this);
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public CiudadCriteria createIdCiudadCriteria() {
		return new CiudadCriteria(createCriteria("idCiudad"));
	}
	
	public SolicitudComputadorCriteria createSolicitudComputadorCriteria() {
		return new SolicitudComputadorCriteria(createCriteria("ORM_SolicitudComputador"));
	}
	
	public SolicitudLibroCriteria createSolicitudLibroCriteria() {
		return new SolicitudLibroCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public EntregaDeLibroCriteria createEntregaDeLibroCriteria() {
		return new EntregaDeLibroCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public RegistroSalaLecturaCriteria createRegistroSalaLecturaCriteria() {
		return new RegistroSalaLecturaCriteria(createCriteria("ORM_RegistroSalaLectura"));
	}
	
	public ClienteDeBibliotecaCriteria createClienteDeBibliotecaCriteria() {
		return new ClienteDeBibliotecaCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

