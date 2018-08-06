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

public class Funcionario {
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
	
	public void setRUN(String value) {
		this.RUN = value;
	}
	
	public String getRUN() {
		return RUN;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidoMaterno(String value) {
		this.apellidoMaterno = value;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
	public void setApellidoPaterno(String value) {
		this.apellidoPaterno = value;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setFechaDeNacimiento(java.util.Date value) {
		this.fechaDeNacimiento = value;
	}
	
	public java.util.Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setCargo(String value) {
		this.cargo = value;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setFechaDeContrato(java.util.Date value) {
		this.fechaDeContrato = value;
	}
	
	public java.util.Date getFechaDeContrato() {
		return fechaDeContrato;
	}
	
	public void setFechaTerminoContrato(java.util.Date value) {
		this.fechaTerminoContrato = value;
	}
	
	public java.util.Date getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	
	public void setNumeroCelular(int value) {
		setNumeroCelular(new Integer(value));
	}
	
	public void setNumeroCelular(Integer value) {
		this.numeroCelular = value;
	}
	
	public Integer getNumeroCelular() {
		return numeroCelular;
	}
	
	public void setNumeroTelefono(int value) {
		setNumeroTelefono(new Integer(value));
	}
	
	public void setNumeroTelefono(Integer value) {
		this.numeroTelefono = value;
	}
	
	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setIdCiudad(modelo.Ciudad value) {
		if (idCiudad != null) {
			idCiudad.funcionario.remove(this);
		}
		if (value != null) {
			value.funcionario.add(this);
		}
	}
	
	public modelo.Ciudad getIdCiudad() {
		return idCiudad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdCiudad(modelo.Ciudad value) {
		this.idCiudad = value;
	}
	
	private modelo.Ciudad getORM_IdCiudad() {
		return idCiudad;
	}
	
	public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.funcionario.remove(this);
		}
		if (value != null) {
			value.funcionario.add(this);
		}
	}
	
	public modelo.Biblioteca getIdBiblioteca() {
		return idBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
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
