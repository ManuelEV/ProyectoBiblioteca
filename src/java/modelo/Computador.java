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
public class Computador {

    /**
     *
     */
    public Computador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMPUTADOR_SOLICITUDCOMPUTADOR) {
			return ORM_solicitudComputador;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMPUTADOR_IDBIBLIOTECA) {
			this.idBiblioteca = (modelo.Biblioteca) owner;
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
	
	private String marca;
	
	private java.util.Date fechaDeAdquisicion;
	
	private java.util.Date fechaUltimaSolicitud;
	
	private modelo.Biblioteca idBiblioteca;
	
	private java.util.Set ORM_solicitudComputador = new java.util.HashSet();
	
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
    public void setMarca(String value) {
		this.marca = value;
	}
	
    /**
     *
     * @return
     */
    public String getMarca() {
		return marca;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaDeAdquisicion(java.util.Date value) {
		this.fechaDeAdquisicion = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeAdquisicion() {
		return fechaDeAdquisicion;
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
    public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.computador.remove(this);
		}
		if (value != null) {
			value.computador.add(this);
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
	
	private void setORM_SolicitudComputador(java.util.Set value) {
		this.ORM_solicitudComputador = value;
	}
	
	private java.util.Set getORM_SolicitudComputador() {
		return ORM_solicitudComputador;
	}
	
    /**
     *
     */
    public final modelo.SolicitudComputadorSetCollection solicitudComputador = new modelo.SolicitudComputadorSetCollection(this, _ormAdapter, ORMConstants.KEY_COMPUTADOR_SOLICITUDCOMPUTADOR, ORMConstants.KEY_SOLICITUDCOMPUTADOR_IDCOMPUTADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
