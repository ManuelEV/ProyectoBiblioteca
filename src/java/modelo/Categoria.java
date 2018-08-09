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
public class Categoria {

    /**
     *
     */
    public Categoria() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CATEGORIA_ESTANTE) {
			return ORM_estante;
		}
		else if (key == ORMConstants.KEY_CATEGORIA_LIBRO) {
			return ORM_libro;
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
	
	private java.util.Set ORM_estante = new java.util.HashSet();
	
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
	
	private void setORM_Estante(java.util.Set value) {
		this.ORM_estante = value;
	}
	
	private java.util.Set getORM_Estante() {
		return ORM_estante;
	}
	
    /**
     *
     */
    public final modelo.EstanteSetCollection estante = new modelo.EstanteSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIA_ESTANTE, ORMConstants.KEY_ESTANTE_IDCATEGORIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Libro(java.util.Set value) {
		this.ORM_libro = value;
	}
	
	private java.util.Set getORM_Libro() {
		return ORM_libro;
	}
	
    /**
     *
     */
    public final modelo.LibroSetCollection libro = new modelo.LibroSetCollection(this, _ormAdapter, ORMConstants.KEY_CATEGORIA_LIBRO, ORMConstants.KEY_LIBRO_IDCATEGORIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
