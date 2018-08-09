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

import java.io.Serializable;

/**
 *
 * @author Manuel
 */
public class RegistroSalaLectura implements Serializable {

    /**
     *
     */
    public RegistroSalaLectura() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof RegistroSalaLectura))
			return false;
		RegistroSalaLectura registrosalalectura = (RegistroSalaLectura)aObj;
		if (getId() != registrosalalectura.getId())
			return false;
		if (getSalaDeLecturaidSala() == null) {
			if (registrosalalectura.getSalaDeLecturaidSala() != null)
				return false;
		}
		else if (!getSalaDeLecturaidSala().equals(registrosalalectura.getSalaDeLecturaidSala()))
			return false;
		if (getIdCliente() == null) {
			if (registrosalalectura.getIdCliente() != null)
				return false;
		}
		else if (!getIdCliente().equals(registrosalalectura.getIdCliente()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getSalaDeLecturaidSala() != null) {
			hashcode = hashcode + (int) getSalaDeLecturaidSala().getORMID();
		}
		if (getIdCliente() != null) {
			hashcode = hashcode + (int) getIdCliente().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REGISTROSALALECTURA_IDCLIENTE) {
			this.idCliente = (modelo.Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_REGISTROSALALECTURA_SALADELECTURAIDSALA) {
			this.salaDeLecturaidSala = (modelo.SalaDeLectura) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private java.util.Date fechaRegistro;
	
	private String tipoRegistro;
	
	private java.sql.Time horaRegistro;
	
	private modelo.SalaDeLectura salaDeLecturaidSala;
	
	private int salaDeLecturaidSalaId;
	
	private void setSalaDeLecturaidSalaId(int value) {
		this.salaDeLecturaidSalaId = value;
	}
	
    /**
     *
     * @return
     */
    public int getSalaDeLecturaidSalaId() {
		return salaDeLecturaidSalaId;
	}
	
	private modelo.Cliente idCliente;
	
	private int idClienteId;
	
	private void setIdClienteId(int value) {
		this.idClienteId = value;
	}
	
    /**
     *
     * @return
     */
    public int getIdClienteId() {
		return idClienteId;
	}
	
    /**
     *
     * @param value
     */
    public void setId(int value) {
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
     * @param value
     */
    public void setFechaRegistro(java.util.Date value) {
		this.fechaRegistro = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaRegistro() {
		return fechaRegistro;
	}
	
    /**
     *
     * @param value
     */
    public void setTipoRegistro(String value) {
		this.tipoRegistro = value;
	}
	
    /**
     *
     * @return
     */
    public String getTipoRegistro() {
		return tipoRegistro;
	}
	
    /**
     *
     * @param value
     */
    public void setHoraRegistro(java.sql.Time value) {
		this.horaRegistro = value;
	}
	
    /**
     *
     * @return
     */
    public java.sql.Time getHoraRegistro() {
		return horaRegistro;
	}
	
    /**
     *
     * @param value
     */
    public void setIdCliente(modelo.Cliente value) {
		if (idCliente != null) {
			idCliente.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Cliente getIdCliente() {
		return idCliente;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdCliente(modelo.Cliente value) {
		this.idCliente = value;
	}
	
	private modelo.Cliente getORM_IdCliente() {
		return idCliente;
	}
	
    /**
     *
     * @param value
     */
    public void setSalaDeLecturaidSala(modelo.SalaDeLectura value) {
		if (salaDeLecturaidSala != null) {
			salaDeLecturaidSala.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.SalaDeLectura getSalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_SalaDeLecturaidSala(modelo.SalaDeLectura value) {
		this.salaDeLecturaidSala = value;
	}
	
	private modelo.SalaDeLectura getORM_SalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getSalaDeLecturaidSala() == null) ? "" : String.valueOf(getSalaDeLecturaidSala().getORMID())) + " " + ((getIdCliente() == null) ? "" : String.valueOf(getIdCliente().getORMID())));
	}
	
}
