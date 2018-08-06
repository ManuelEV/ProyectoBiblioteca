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
public class SolicitudComputador implements Serializable {
	public SolicitudComputador() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof SolicitudComputador))
			return false;
		SolicitudComputador solicitudcomputador = (SolicitudComputador)aObj;
		if (getId() != solicitudcomputador.getId())
			return false;
		if (getIdComputador() == null) {
			if (solicitudcomputador.getIdComputador() != null)
				return false;
		}
		else if (!getIdComputador().equals(solicitudcomputador.getIdComputador()))
			return false;
		if (getClienteRUN() == null) {
			if (solicitudcomputador.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(solicitudcomputador.getClienteRUN()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getIdComputador() != null) {
			hashcode = hashcode + (int) getIdComputador().getORMID();
		}
		if (getClienteRUN() != null) {
			hashcode = hashcode + (int) getClienteRUN().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SOLICITUDCOMPUTADOR_CLIENTERUN) {
			this.clienteRUN = (modelo.Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_SOLICITUDCOMPUTADOR_IDCOMPUTADOR) {
			this.idComputador = (modelo.Computador) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private java.util.Date fechaDeSolicitud;
	
	private java.sql.Time horaSolicitud;
	
	private modelo.Computador idComputador;
	
	private int idComputadorId;
	
	private void setIdComputadorId(int value) {
		this.idComputadorId = value;
	}
	
	public int getIdComputadorId() {
		return idComputadorId;
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
	
	public void setFechaDeSolicitud(java.util.Date value) {
		this.fechaDeSolicitud = value;
	}
	
	public java.util.Date getFechaDeSolicitud() {
		return fechaDeSolicitud;
	}
	
	public void setHoraSolicitud(java.sql.Time value) {
		this.horaSolicitud = value;
	}
	
	public java.sql.Time getHoraSolicitud() {
		return horaSolicitud;
	}
	
	public void setClienteRUN(modelo.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.solicitudComputador.remove(this);
		}
		if (value != null) {
			value.solicitudComputador.add(this);
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
	
	public void setIdComputador(modelo.Computador value) {
		if (idComputador != null) {
			idComputador.solicitudComputador.remove(this);
		}
		if (value != null) {
			value.solicitudComputador.add(this);
		}
	}
	
	public modelo.Computador getIdComputador() {
		return idComputador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdComputador(modelo.Computador value) {
		this.idComputador = value;
	}
	
	private modelo.Computador getORM_IdComputador() {
		return idComputador;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getIdComputador() == null) ? "" : String.valueOf(getIdComputador().getORMID())) + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())));
	}
	
}
