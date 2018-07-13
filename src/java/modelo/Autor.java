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

public class Autor {
	public Autor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_AUTOR_AUTORES) {
			return ORM_autores;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String idAutor;
	
	private String nombre;
	
	private java.util.Date fechaDeNacimiento;
	
	private String genero;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private java.util.Set ORM_autores = new java.util.HashSet();
	
	public void setIdAutor(String value) {
		this.idAutor = value;
	}
	
	public String getIdAutor() {
		return idAutor;
	}
	
	public String getORMID() {
		return getIdAutor();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFechaDeNacimiento(java.util.Date value) {
		this.fechaDeNacimiento = value;
	}
	
	public java.util.Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setGenero(String value) {
		this.genero = value;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setApellidoPaterno(String value) {
		this.apellidoPaterno = value;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public void setApellidoMaterno(String value) {
		this.apellidoMaterno = value;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
	private void setORM_Autores(java.util.Set value) {
		this.ORM_autores = value;
	}
	
	private java.util.Set getORM_Autores() {
		return ORM_autores;
	}
	
	public final modelo.AutoresSetCollection autores = new modelo.AutoresSetCollection(this, _ormAdapter, ORMConstants.KEY_AUTOR_AUTORES, ORMConstants.KEY_AUTORES_AUTORIDAUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAutor());
	}
	
}
