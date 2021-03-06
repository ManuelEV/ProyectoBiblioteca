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
public class SalaDeLectura {

    /**
     *
     */
    public SalaDeLectura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SALADELECTURA_REGISTROSALALECTURA) {
			return ORM_registroSalaLectura;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SALADELECTURA_IDBIBLIOTECA) {
			this.idBiblioteca = (modelo.Biblioteca) owner;
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
	
	private int capacidad;
	
	private String nombre;
	
	private modelo.Biblioteca idBiblioteca;
	
	private java.util.Set ORM_registroSalaLectura = new java.util.HashSet();
	
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
    public void setCapacidad(int value) {
		this.capacidad = value;
	}
	
    /**
     *
     * @return
     */
    public int getCapacidad() {
		return capacidad;
	}
	
    /**
     *
     * @param value
     */
    public void setNombre(String value) {
		this.nombre = value;
	}
	
    /**
     *
     * @return
     */
    public String getNombre() {
		return nombre;
	}
	
    /**
     *
     * @param value
     */
    public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.salaDeLectura.remove(this);
		}
		if (value != null) {
			value.salaDeLectura.add(this);
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
	
	private void setORM_RegistroSalaLectura(java.util.Set value) {
		this.ORM_registroSalaLectura = value;
	}
	
	private java.util.Set getORM_RegistroSalaLectura() {
		return ORM_registroSalaLectura;
	}
	
    /**
     *
     */
    public final modelo.RegistroSalaLecturaSetCollection registroSalaLectura = new modelo.RegistroSalaLecturaSetCollection(this, _ormAdapter, ORMConstants.KEY_SALADELECTURA_REGISTROSALALECTURA, ORMConstants.KEY_REGISTROSALALECTURA_SALADELECTURAIDSALA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
