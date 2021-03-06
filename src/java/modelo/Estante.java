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
public class Estante {

    /**
     *
     */
    public Estante() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTANTE_LIBRO) {
			return ORM_libro;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ESTANTE_IDBIBLIOTECA) {
			this.idBiblioteca = (modelo.Biblioteca) owner;
		}
		
		else if (key == ORMConstants.KEY_ESTANTE_IDCATEGORIA) {
			this.idCategoria = (modelo.Categoria) owner;
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
	
	private int capacidadAproximada;
	
	private modelo.Biblioteca idBiblioteca;
	
	private modelo.Categoria idCategoria;
	
	private java.util.Set ORM_libro = new java.util.HashSet();
	
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
    public void setCapacidadAproximada(int value) {
		this.capacidadAproximada = value;
	}
	
    /**
     *
     * @return
     */
    public int getCapacidadAproximada() {
		return capacidadAproximada;
	}
	
    /**
     *
     * @param value
     */
    public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.estante.remove(this);
		}
		if (value != null) {
			value.estante.add(this);
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
	
    /**
     *
     * @param value
     */
    public void setIdCategoria(modelo.Categoria value) {
		if (idCategoria != null) {
			idCategoria.estante.remove(this);
		}
		if (value != null) {
			value.estante.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Categoria getIdCategoria() {
		return idCategoria;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdCategoria(modelo.Categoria value) {
		this.idCategoria = value;
	}
	
	private modelo.Categoria getORM_IdCategoria() {
		return idCategoria;
	}
	
	private void setORM_Libro(java.util.Set value) {
		this.ORM_libro = value;
	}
	
	private java.util.Set getORM_Libro() {
		return ORM_libro;
	}
	
    /**
     *
     */
    public final modelo.LibroSetCollection libro = new modelo.LibroSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTANTE_LIBRO, ORMConstants.KEY_LIBRO_IDESTANTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
