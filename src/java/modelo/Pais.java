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
public class Pais {

    /**
     *
     */
    public Pais() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PAIS_CIUDAD) {
			return ORM_ciudad;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private java.util.Set ORM_ciudad = new java.util.HashSet();
	
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
	
	private void setORM_Ciudad(java.util.Set value) {
		this.ORM_ciudad = value;
	}
	
	private java.util.Set getORM_Ciudad() {
		return ORM_ciudad;
	}
	
    /**
     *
     */
    public final modelo.CiudadSetCollection ciudad = new modelo.CiudadSetCollection(this, _ormAdapter, ORMConstants.KEY_PAIS_CIUDAD, ORMConstants.KEY_CIUDAD_IDPAIS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
