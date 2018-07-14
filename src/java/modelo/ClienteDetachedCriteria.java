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

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ClienteDetachedCriteria() {
		super(modelo.Cliente.class, modelo.ClienteCriteria.class);
		RUN = new StringExpression("RUN", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		estadoDeTrabajo = new StringExpression("estadoDeTrabajo", this.getDetachedCriteria());
		areaDeInteres = new StringExpression("areaDeInteres", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this.getDetachedCriteria());
		numeroDeCelular = new IntegerExpression("numeroDeCelular", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new StringExpression("idCiudad.idCiudad", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		privilegio = new StringExpression("privilegio", this.getDetachedCriteria());
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.ClienteCriteria.class);
		RUN = new StringExpression("RUN", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidoPaterno = new StringExpression("apellidoPaterno", this.getDetachedCriteria());
		apellidoMaterno = new StringExpression("apellidoMaterno", this.getDetachedCriteria());
		genero = new StringExpression("genero", this.getDetachedCriteria());
		fechaDeNacimiento = new DateExpression("fechaDeNacimiento", this.getDetachedCriteria());
		estadoDeTrabajo = new StringExpression("estadoDeTrabajo", this.getDetachedCriteria());
		areaDeInteres = new StringExpression("areaDeInteres", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		diasDeAtraso = new IntegerExpression("diasDeAtraso", this.getDetachedCriteria());
		numeroDeCelular = new IntegerExpression("numeroDeCelular", this.getDetachedCriteria());
		numeroDeTelefono = new IntegerExpression("numeroDeTelefono", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		idCiudadId = new StringExpression("idCiudad.idCiudad", this.getDetachedCriteria());
		idCiudad = new AssociationExpression("idCiudad", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		privilegio = new StringExpression("privilegio", this.getDetachedCriteria());
		solicitudComputador = new CollectionExpression("ORM_SolicitudComputador", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		registroSalaLectura = new CollectionExpression("ORM_RegistroSalaLectura", this.getDetachedCriteria());
		clienteDeBiblioteca = new CollectionExpression("ORM_ClienteDeBiblioteca", this.getDetachedCriteria());
	}
	
	public CiudadDetachedCriteria createIdCiudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("idCiudad"));
	}
	
	public SolicitudComputadorDetachedCriteria createSolicitudComputadorCriteria() {
		return new SolicitudComputadorDetachedCriteria(createCriteria("ORM_SolicitudComputador"));
	}
	
	public SolicitudLibroDetachedCriteria createSolicitudLibroCriteria() {
		return new SolicitudLibroDetachedCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public EntregaDeLibroDetachedCriteria createEntregaDeLibroCriteria() {
		return new EntregaDeLibroDetachedCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public RegistroSalaLecturaDetachedCriteria createRegistroSalaLecturaCriteria() {
		return new RegistroSalaLecturaDetachedCriteria(createCriteria("ORM_RegistroSalaLectura"));
	}
	
	public ClienteDeBibliotecaDetachedCriteria createClienteDeBibliotecaCriteria() {
		return new ClienteDeBibliotecaDetachedCriteria(createCriteria("ORM_ClienteDeBiblioteca"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

