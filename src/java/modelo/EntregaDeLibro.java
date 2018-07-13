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
public class EntregaDeLibro implements Serializable {
	public EntregaDeLibro() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof EntregaDeLibro))
			return false;
		EntregaDeLibro entregadelibro = (EntregaDeLibro)aObj;
		if (getIdDevolucion() != entregadelibro.getIdDevolucion())
			return false;
		if (getClienteRUN() == null) {
			if (entregadelibro.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(entregadelibro.getClienteRUN()))
			return false;
		if (getLibrocodigo() == null) {
			if (entregadelibro.getLibrocodigo() != null)
				return false;
		}
		else if (!getLibrocodigo().equals(entregadelibro.getLibrocodigo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getIdDevolucion();
		if (getClienteRUN() != null) {
			hashcode = hashcode + (getClienteRUN().getORMID() == null ? 0 : getClienteRUN().getORMID().hashCode());
		}
		if (getLibrocodigo() != null) {
			hashcode = hashcode + (getLibrocodigo().getORMID() == null ? 0 : getLibrocodigo().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ENTREGADELIBRO_CLIENTERUN) {
			this.clienteRUN = (modelo.Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_ENTREGADELIBRO_LIBROCODIGO) {
			this.librocodigo = (modelo.Libro) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idDevolucion;
	
	private java.util.Date fechaDeDevolucion;
	
	private int diasDeAtraso;
	
	private modelo.Cliente clienteRUN;
	
	private String clienteRUNId;
	
	private void setClienteRUNId(String value) {
		this.clienteRUNId = value;
	}
	
	public String getClienteRUNId() {
		return clienteRUNId;
	}
	
	private modelo.Libro librocodigo;
	
	private String librocodigoId;
	
	private void setLibrocodigoId(String value) {
		this.librocodigoId = value;
	}
	
	public String getLibrocodigoId() {
		return librocodigoId;
	}
	
	public void setIdDevolucion(int value) {
		this.idDevolucion = value;
	}
	
	public int getIdDevolucion() {
		return idDevolucion;
	}
	
	public void setFechaDeDevolucion(java.util.Date value) {
		this.fechaDeDevolucion = value;
	}
	
	public java.util.Date getFechaDeDevolucion() {
		return fechaDeDevolucion;
	}
	
	public void setDiasDeAtraso(int value) {
		this.diasDeAtraso = value;
	}
	
	public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	
	public void setClienteRUN(modelo.Cliente value) {
		if (clienteRUN != null) {
			clienteRUN.entregaDeLibro.remove(this);
		}
		if (value != null) {
			value.entregaDeLibro.add(this);
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
	
	public void setLibrocodigo(modelo.Libro value) {
		if (librocodigo != null) {
			librocodigo.entregaDeLibro.remove(this);
		}
		if (value != null) {
			value.entregaDeLibro.add(this);
		}
	}
	
	public modelo.Libro getLibrocodigo() {
		return librocodigo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Librocodigo(modelo.Libro value) {
		this.librocodigo = value;
	}
	
	private modelo.Libro getORM_Librocodigo() {
		return librocodigo;
	}
	
	public String toString() {
		return String.valueOf(getIdDevolucion() + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())) + " " + ((getLibrocodigo() == null) ? "" : String.valueOf(getLibrocodigo().getORMID())));
	}
	
}
