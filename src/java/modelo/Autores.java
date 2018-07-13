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
public class Autores implements Serializable {
	public Autores() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Autores))
			return false;
		Autores autores = (Autores)aObj;
		if (getId() != autores.getId())
			return false;
		if (getAutoridAutor() == null) {
			if (autores.getAutoridAutor() != null)
				return false;
		}
		else if (!getAutoridAutor().equals(autores.getAutoridAutor()))
			return false;
		if (getLibrocodigo() == null) {
			if (autores.getLibrocodigo() != null)
				return false;
		}
		else if (!getLibrocodigo().equals(autores.getLibrocodigo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getAutoridAutor() != null) {
			hashcode = hashcode + (getAutoridAutor().getORMID() == null ? 0 : getAutoridAutor().getORMID().hashCode());
		}
		if (getLibrocodigo() != null) {
			hashcode = hashcode + (getLibrocodigo().getORMID() == null ? 0 : getLibrocodigo().getORMID().hashCode());
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_AUTORES_AUTORIDAUTOR) {
			this.autoridAutor = (modelo.Autor) owner;
		}
		
		else if (key == ORMConstants.KEY_AUTORES_LIBROCODIGO) {
			this.librocodigo = (modelo.Libro) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private modelo.Autor autoridAutor;
	
	private String autoridAutorId;
	
	private void setAutoridAutorId(String value) {
		this.autoridAutorId = value;
	}
	
	public String getAutoridAutorId() {
		return autoridAutorId;
	}
	
	private modelo.Libro librocodigo;
	
	private String librocodigoId;
	
	private void setLibrocodigoId(String value) {
		this.librocodigoId = value;
	}
	
	public String getLibrocodigoId() {
		return librocodigoId;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAutoridAutor(modelo.Autor value) {
		if (autoridAutor != null) {
			autoridAutor.autores.remove(this);
		}
		if (value != null) {
			value.autores.add(this);
		}
	}
	
	public modelo.Autor getAutoridAutor() {
		return autoridAutor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AutoridAutor(modelo.Autor value) {
		this.autoridAutor = value;
	}
	
	private modelo.Autor getORM_AutoridAutor() {
		return autoridAutor;
	}
	
	public void setLibrocodigo(modelo.Libro value) {
		if (librocodigo != null) {
			librocodigo.autores.remove(this);
		}
		if (value != null) {
			value.autores.add(this);
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
		return String.valueOf(getId() + " " + ((getAutoridAutor() == null) ? "" : String.valueOf(getAutoridAutor().getORMID())) + " " + ((getLibrocodigo() == null) ? "" : String.valueOf(getLibrocodigo().getORMID())));
	}
	
}
