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
public class Funcionario {

    /**
     *
     */
    public Funcionario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FUNCIONARIO_IDCIUDAD) {
			this.idCiudad = (modelo.Ciudad) owner;
		}
		
		else if (key == ORMConstants.KEY_FUNCIONARIO_IDBIBLIOTECA) {
			this.idBiblioteca = (modelo.Biblioteca) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String RUN;
	
	private String nombre;
	
	private String apellidoMaterno;
	
	private String apellidoPaterno;
	
	private String genero;
	
	private java.util.Date fechaDeNacimiento;
	
	private String cargo;
	
	private java.util.Date fechaDeContrato;
	
	private java.util.Date fechaTerminoContrato;
	
	private Integer numeroCelular;
	
	private Integer numeroTelefono;
	
	private String correoElectronico;
	
	private modelo.Ciudad idCiudad;
	
	private modelo.Biblioteca idBiblioteca;
	
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
    public void setCargo(String value) {
		this.cargo = value;
	}
	
    /**
     *
     * @return
     */
    public String getCargo() {
		return cargo;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaDeContrato(java.util.Date value) {
		this.fechaDeContrato = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeContrato() {
		return fechaDeContrato;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaTerminoContrato(java.util.Date value) {
		this.fechaTerminoContrato = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroCelular(int value) {
		setNumeroCelular(new Integer(value));
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroCelular(Integer value) {
		this.numeroCelular = value;
	}
	
    /**
     *
     * @return
     */
    public Integer getNumeroCelular() {
		return numeroCelular;
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroTelefono(int value) {
		setNumeroTelefono(new Integer(value));
	}
	
    /**
     *
     * @param value
     */
    public void setNumeroTelefono(Integer value) {
		this.numeroTelefono = value;
	}
	
    /**
     *
     * @return
     */
    public Integer getNumeroTelefono() {
		return numeroTelefono;
	}
	
    /**
     *
     * @param value
     */
    public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
    /**
     *
     * @return
     */
    public String getCorreoElectronico() {
		return correoElectronico;
	}
	
    /**
     *
     * @param value
     */
    public void setIdCiudad(modelo.Ciudad value) {
		if (idCiudad != null) {
			idCiudad.funcionario.remove(this);
		}
		if (value != null) {
			value.funcionario.add(this);
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
    public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.funcionario.remove(this);
		}
		if (value != null) {
			value.funcionario.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Biblioteca getIdBiblioteca() {
		return idBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdBiblioteca(modelo.Biblioteca value) {
		this.idBiblioteca = value;
	}
	
	private modelo.Biblioteca getORM_IdBiblioteca() {
		return idBiblioteca;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
