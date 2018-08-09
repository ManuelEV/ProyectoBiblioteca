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

/**
 *
 * @author Manuel
 */
public class Cliente {

    /**
     *
     */
    public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLIENTE_SOLICITUDCOMPUTADOR) {
			return ORM_solicitudComputador;
		}
		else if (key == ORMConstants.KEY_CLIENTE_SOLICITUDLIBRO) {
			return ORM_solicitudLibro;
		}
		else if (key == ORMConstants.KEY_CLIENTE_ENTREGADELIBRO) {
			return ORM_entregaDeLibro;
		}
		else if (key == ORMConstants.KEY_CLIENTE_REGISTROSALALECTURA) {
			return ORM_registroSalaLectura;
		}
		else if (key == ORMConstants.KEY_CLIENTE_CLIENTEDEBIBLIOTECA) {
			return ORM_clienteDeBiblioteca;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CLIENTE_IDCIUDAD) {
			this.idCiudad = (modelo.Ciudad) owner;
		}
		
		else if (key == ORMConstants.KEY_CLIENTE_USUARIO) {
			this.usuario = (modelo.Usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String RUN;
	
	private String nombre;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private String genero;
	
	private java.util.Date fechaDeNacimiento;
	
	private String estadoDeTrabajo;
	
	private String areaDeInteres;
	
	private java.util.Date fechaUltimaSolicitud;
	
	private int diasDeAtraso = 0;
	
	private Integer numeroDeCelular;
	
	private Integer numeroDeTelefono;
	
	private modelo.Ciudad idCiudad;
	
	private modelo.Usuario usuario;
	
	private java.util.Set ORM_solicitudComputador = new java.util.HashSet();
	
	private java.util.Set ORM_solicitudLibro = new java.util.HashSet();
	
	private java.util.Set ORM_entregaDeLibro = new java.util.HashSet();
	
	private java.util.Set ORM_registroSalaLectura = new java.util.HashSet();
	
	private java.util.Set ORM_clienteDeBiblioteca = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
    /**
     *
     * @return
     */
    public int getId() {
		return id;
	}
	
    /**
     *
     * @return
     */
    public int getORMID() {
		return getId();
	}
	
    /**
     *
     * @param value
     */
    public void setRUN(String value) {
		this.RUN = value;
	}
	
    /**
     *
     * @return
     */
    public String getRUN() {
		return RUN;
	}
	
    /**
     *
     * @param value
     */
    public void setNombre(String value) {
		this.nombre = value;
	}
	
    /**
     *
     * @return
     */
    public String getNombre() {
		return nombre;
	}
	
    /**
     *
     * @param value
     */
    public void setApellidoPaterno(String value) {
		this.apellidoPaterno = value;
	}
	
    /**
     *
     * @return
     */
    public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
    /**
     *
     * @param value
     */
    public void setApellidoMaterno(String value) {
		this.apellidoMaterno = value;
	}
	
    /**
     *
     * @return
     */
    public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
    /**
     *
     * @param value
     */
    public void setGenero(String value) {
		this.genero = value;
	}
	
    /**
     *
     * @return
     */
    public String getGenero() {
		return genero;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaDeNacimiento(java.util.Date value) {
		this.fechaDeNacimiento = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
    /**
     *
     * @param value
     */
    public void setEstadoDeTrabajo(String value) {
		this.estadoDeTrabajo = value;
	}
	
    /**
     *
     * @return
     */
    public String getEstadoDeTrabajo() {
		return estadoDeTrabajo;
	}
	
    /**
     *
     * @param value
     */
    public void setAreaDeInteres(String value) {
		this.areaDeInteres = value;
	}
	
    /**
     *
     * @return
     */
    public String getAreaDeInteres() {
		return areaDeInteres;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaUltimaSolicitud(java.util.Date value) {
		this.fechaUltimaSolicitud = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaUltimaSolicitud() {
		return fechaUltimaSolicitud;
	}
	
    /**
     *
     * @param value
     */
    public void setDiasDeAtraso(int value) {
		this.diasDeAtraso = value;
	}
	
    /**
     *
     * @return
     */
    public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroDeCelular(int value) {
		setNumeroDeCelular(new Integer(value));
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroDeCelular(Integer value) {
		this.numeroDeCelular = value;
	}
	
    /**
     *
     * @return
     */
    public Integer getNumeroDeCelular() {
		return numeroDeCelular;
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroDeTelefono(int value) {
		setNumeroDeTelefono(new Integer(value));
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroDeTelefono(Integer value) {
		this.numeroDeTelefono = value;
	}
	
    /**
     *
     * @return
     */
    public Integer getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	
    /**
     *
     * @param value
     */
    public void setIdCiudad(modelo.Ciudad value) {
		if (idCiudad != null) {
			idCiudad.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Ciudad getIdCiudad() {
		return idCiudad;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdCiudad(modelo.Ciudad value) {
		this.idCiudad = value;
	}
	
	private modelo.Ciudad getORM_IdCiudad() {
		return idCiudad;
	}
	
    /**
     *
     * @param value
     */
    public void setUsuario(modelo.Usuario value) {
		if (usuario != null) {
			usuario.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_Usuario(modelo.Usuario value) {
		this.usuario = value;
	}
	
	private modelo.Usuario getORM_Usuario() {
		return usuario;
	}
	
	private void setORM_SolicitudComputador(java.util.Set value) {
		this.ORM_solicitudComputador = value;
	}
	
	private java.util.Set getORM_SolicitudComputador() {
		return ORM_solicitudComputador;
	}
	
    /**
     *
     */
    public final modelo.SolicitudComputadorSetCollection solicitudComputador = new modelo.SolicitudComputadorSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_SOLICITUDCOMPUTADOR, ORMConstants.KEY_SOLICITUDCOMPUTADOR_IDCLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_SolicitudLibro(java.util.Set value) {
		this.ORM_solicitudLibro = value;
	}
	
	private java.util.Set getORM_SolicitudLibro() {
		return ORM_solicitudLibro;
	}
	
    /**
     *
     */
    public final modelo.SolicitudLibroSetCollection solicitudLibro = new modelo.SolicitudLibroSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_SOLICITUDLIBRO, ORMConstants.KEY_SOLICITUDLIBRO_IDCLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_EntregaDeLibro(java.util.Set value) {
		this.ORM_entregaDeLibro = value;
	}
	
	private java.util.Set getORM_EntregaDeLibro() {
		return ORM_entregaDeLibro;
	}
	
    /**
     *
     */
    public final modelo.EntregaDeLibroSetCollection entregaDeLibro = new modelo.EntregaDeLibroSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_ENTREGADELIBRO, ORMConstants.KEY_ENTREGADELIBRO_IDCLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_RegistroSalaLectura(java.util.Set value) {
		this.ORM_registroSalaLectura = value;
	}
	
	private java.util.Set getORM_RegistroSalaLectura() {
		return ORM_registroSalaLectura;
	}
	
    /**
     *
     */
    public final modelo.RegistroSalaLecturaSetCollection registroSalaLectura = new modelo.RegistroSalaLecturaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_REGISTROSALALECTURA, ORMConstants.KEY_REGISTROSALALECTURA_IDCLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ClienteDeBiblioteca(java.util.Set value) {
		this.ORM_clienteDeBiblioteca = value;
	}
	
	private java.util.Set getORM_ClienteDeBiblioteca() {
		return ORM_clienteDeBiblioteca;
	}
	
    /**
     *
     */
    public final modelo.ClienteDeBibliotecaSetCollection clienteDeBiblioteca = new modelo.ClienteDeBibliotecaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_CLIENTEDEBIBLIOTECA, ORMConstants.KEY_CLIENTEDEBIBLIOTECA_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
