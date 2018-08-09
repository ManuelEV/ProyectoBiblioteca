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
public class Autores implements Serializable {

    /**
     *
     */
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
		if (getIdAutor() == null) {
			if (autores.getIdAutor() != null)
				return false;
		}
		else if (!getIdAutor().equals(autores.getIdAutor()))
			return false;
		if (getIdLibro() == null) {
			if (autores.getIdLibro() != null)
				return false;
		}
		else if (!getIdLibro().equals(autores.getIdLibro()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getIdAutor() != null) {
			hashcode = hashcode + (int) getIdAutor().getORMID();
		}
		if (getIdLibro() != null) {
			hashcode = hashcode + (int) getIdLibro().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_AUTORES_IDAUTOR) {
			this.idAutor = (modelo.Autor) owner;
		}
		
		else if (key == ORMConstants.KEY_AUTORES_IDLIBRO) {
			this.idLibro = (modelo.Libro) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private modelo.Autor idAutor;
	
	private int idAutorId;
	
	private void setIdAutorId(int value) {
		this.idAutorId = value;
	}
	
    /**
     *
     * @return
     */
    public int getIdAutorId() {
		return idAutorId;
	}
	
	private modelo.Libro idLibro;
	
	private int idLibroId;
	
	private void setIdLibroId(int value) {
		this.idLibroId = value;
	}
	
    /**
     *
     * @return
     */
    public int getIdLibroId() {
		return idLibroId;
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
    public void setIdAutor(modelo.Autor value) {
		if (idAutor != null) {
			idAutor.autores.remove(this);
		}
		if (value != null) {
			value.autores.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Autor getIdAutor() {
		return idAutor;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdAutor(modelo.Autor value) {
		this.idAutor = value;
	}
	
	private modelo.Autor getORM_IdAutor() {
		return idAutor;
	}
	
    /**
     *
     * @param value
     */
    public void setIdLibro(modelo.Libro value) {
		if (idLibro != null) {
			idLibro.autores.remove(this);
		}
		if (value != null) {
			value.autores.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Libro getIdLibro() {
		return idLibro;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdLibro(modelo.Libro value) {
		this.idLibro = value;
	}
	
	private modelo.Libro getORM_IdLibro() {
		return idLibro;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getIdAutor() == null) ? "" : String.valueOf(getIdAutor().getORMID())) + " " + ((getIdLibro() == null) ? "" : String.valueOf(getIdLibro().getORMID())));
	}
	
}
