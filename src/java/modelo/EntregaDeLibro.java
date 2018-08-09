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
public class EntregaDeLibro implements Serializable {

    /**
     *
     */
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
		if (getIdCliente() == null) {
			if (entregadelibro.getIdCliente() != null)
				return false;
		}
		else if (!getIdCliente().equals(entregadelibro.getIdCliente()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getLibrocodigo() != null) {
			hashcode = hashcode + (int) getLibrocodigo().getORMID();
		}
		if (getIdCliente() != null) {
			hashcode = hashcode + (int) getIdCliente().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ENTREGADELIBRO_IDCLIENTE) {
			this.idCliente = (modelo.Cliente) owner;
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
	
    /**
     *
     * @return
     */
    public int getLibrocodigoId() {
		return librocodigoId;
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
    public void setFechaDeDevolucion(java.util.Date value) {
		this.fechaDeDevolucion = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeDevolucion() {
		return fechaDeDevolucion;
	}
	
    /**
     *
     * @param value
     */
    public void setDiasDeAtraso(int value) {
		this.diasDeAtraso = value;
	}
	
    /**
     *
     * @return
     */
    public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	
    /**
     *
     * @param value
     */
    public void setIdCliente(modelo.Cliente value) {
		if (idCliente != null) {
			idCliente.entregaDeLibro.remove(this);
		}
		if (value != null) {
			value.entregaDeLibro.add(this);
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
    public void setLibrocodigo(modelo.Libro value) {
		if (librocodigo != null) {
			librocodigo.entregaDeLibro.remove(this);
		}
		if (value != null) {
			value.entregaDeLibro.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Libro getLibrocodigo() {
		return librocodigo;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_Librocodigo(modelo.Libro value) {
		this.librocodigo = value;
	}
	
	private modelo.Libro getORM_Librocodigo() {
		return librocodigo;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getLibrocodigo() == null) ? "" : String.valueOf(getLibrocodigo().getORMID())) + " " + ((getIdCliente() == null) ? "" : String.valueOf(getIdCliente().getORMID())));
	}
	
}
