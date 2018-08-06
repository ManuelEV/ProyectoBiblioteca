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
public class SolicitudLibro implements Serializable {
	public SolicitudLibro() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof SolicitudLibro))
			return false;
		SolicitudLibro solicitudlibro = (SolicitudLibro)aObj;
		if (getId() != solicitudlibro.getId())
			return false;
		if (getCodigoLibro() == null) {
			if (solicitudlibro.getCodigoLibro() != null)
				return false;
		}
		else if (!getCodigoLibro().equals(solicitudlibro.getCodigoLibro()))
			return false;
		if (getClienteRUN() == null) {
			if (solicitudlibro.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(solicitudlibro.getClienteRUN()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getCodigoLibro() != null) {
			hashcode = hashcode + (int) getCodigoLibro().getORMID();
		}
		if (getClienteRUN() != null) {
			hashcode = hashcode + (int) getClienteRUN().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SOLICITUDLIBRO_CLIENTERUN) {
			this.clienteRUN = (modelo.Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_SOLICITUDLIBRO_CODIGOLIBRO) {
			this.codigoLibro = (modelo.Libro) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private java.util.Date fechaDeSolicitud;
	
	private java.sql.Time horaDeSolicitud;
	
	private java.util.Date fechaEntregaLimite;
	
	private modelo.Libro codigoLibro;
	
	private int codigoLibroId;
	
	private void setCodigoLibroId(int value) {
		this.codigoLibroId = value;
	}
	
	public int getCodigoLibroId() {
		return codigoLibroId;
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
	
	public void setHoraDeSolicitud(java.sql.Time value) {
		this.horaDeSolicitud = value;
	}
	
	public java.sql.Time getHoraDeSolicitud() {
		return horaDeSolicitud;
	}
	
	public void setFechaEntregaLimite(java.util.Date value) {
		this.fechaEntregaLimite = value;
	}
	
	public java.util.Date getFechaEntregaLimite() {
		return fechaEntregaLimite;
	}
	
	public void setClienteRUN(modelo.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.solicitudLibro.remove(this);
		}
		if (value != null) {
			value.solicitudLibro.add(this);
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
	
	public void setCodigoLibro(modelo.Libro value) {
		if (codigoLibro != null) {
			codigoLibro.solicitudLibro.remove(this);
		}
		if (value != null) {
			value.solicitudLibro.add(this);
		}
	}
	
	public modelo.Libro getCodigoLibro() {
		return codigoLibro;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_CodigoLibro(modelo.Libro value) {
		this.codigoLibro = value;
	}
	
	private modelo.Libro getORM_CodigoLibro() {
		return codigoLibro;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getCodigoLibro() == null) ? "" : String.valueOf(getCodigoLibro().getORMID())) + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())));
	}
	
}
