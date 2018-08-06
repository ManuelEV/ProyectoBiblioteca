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
		if (getId() != entregadelibro.getId())
			return false;
		if (getLibrocodigo() == null) {
			if (entregadelibro.getLibrocodigo() != null)
				return false;
		}
		else if (!getLibrocodigo().equals(entregadelibro.getLibrocodigo()))
			return false;
		if (getClienteRUN() == null) {
			if (entregadelibro.getClienteRUN() != null)
				return false;
		}
		else if (!getClienteRUN().equals(entregadelibro.getClienteRUN()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getLibrocodigo() != null) {
			hashcode = hashcode + (int) getLibrocodigo().getORMID();
		}
		if (getClienteRUN() != null) {
			hashcode = hashcode + (int) getClienteRUN().getORMID();
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
	
	private int id;
	
	private java.util.Date fechaDeDevolucion;
	
	private int diasDeAtraso;
	
	private modelo.Libro librocodigo;
	
	private int librocodigoId;
	
	private void setLibrocodigoId(int value) {
		this.librocodigoId = value;
	}
	
	public int getLibrocodigoId() {
		return librocodigoId;
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
		return String.valueOf(getId() + " " + ((getLibrocodigo() == null) ? "" : String.valueOf(getLibrocodigo().getORMID())) + " " + ((getClienteRUN() == null) ? "" : String.valueOf(getClienteRUN().getORMID())));
	}
	
}
