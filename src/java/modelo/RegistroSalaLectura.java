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
public class RegistroSalaLectura implements Serializable {
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
		if (getClienteRUN() == null) {
			if (registrosalalectura.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(registrosalalectura.getClienteRUN()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getSalaDeLecturaidSala() != null) {
			hashcode = hashcode + (int) getSalaDeLecturaidSala().getORMID();
		}
		if (getClienteRUN() != null) {
			hashcode = hashcode + (int) getClienteRUN().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REGISTROSALALECTURA_CLIENTERUN) {
			this.clienteRUN = (modelo.Cliente) owner;
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
	
	public int getSalaDeLecturaidSalaId() {
		return salaDeLecturaidSalaId;
	}
	
	private modelo.Cliente clienteRUN;
	
	private int clienteRUNId;
	
	private void setClienteRUNId(int value) {
		this.clienteRUNId = value;
	}
	
	public int getClienteRUNId() {
		return clienteRUNId;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFechaRegistro(java.util.Date value) {
		this.fechaRegistro = value;
	}
	
	public java.util.Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setTipoRegistro(String value) {
		this.tipoRegistro = value;
	}
	
	public String getTipoRegistro() {
		return tipoRegistro;
	}
	
	public void setHoraRegistro(java.sql.Time value) {
		this.horaRegistro = value;
	}
	
	public java.sql.Time getHoraRegistro() {
		return horaRegistro;
	}
	
	public void setClienteRUN(modelo.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
		}
	}
	
	public modelo.Cliente getClienteRUN() {
		return clienteRUN;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ClienteRUN(modelo.Cliente value) {
		this.clienteRUN = value;
	}
	
	private modelo.Cliente getORM_ClienteRUN() {
		return clienteRUN;
	}
	
	public void setSalaDeLecturaidSala(modelo.SalaDeLectura value) {
		if (salaDeLecturaidSala != null) {
			salaDeLecturaidSala.registroSalaLectura.remove(this);
		}
		if (value != null) {
			value.registroSalaLectura.add(this);
		}
	}
	
	public modelo.SalaDeLectura getSalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SalaDeLecturaidSala(modelo.SalaDeLectura value) {
		this.salaDeLecturaidSala = value;
	}
	
	private modelo.SalaDeLectura getORM_SalaDeLecturaidSala() {
		return salaDeLecturaidSala;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getSalaDeLecturaidSala() == null) ? "" : String.valueOf(getSalaDeLecturaidSala().getORMID())) + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())));
	}
	
}
