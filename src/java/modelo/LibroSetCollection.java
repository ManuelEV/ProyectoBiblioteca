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

import org.orm.*;

/**
 *
 * @author Manuel
 */
public class LibroSetCollection extends org.orm.util.ORMSet {

    /**
     *
     * @param owner
     * @param adapter
     * @param ownerKey
     * @param targetKey
     * @param collType
     */
    public LibroSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
    /**
     *
     * @param owner
     * @param adapter
     * @param ownerKey
     * @param collType
     */
    public LibroSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Libro value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Libro value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Libro value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Libro[] toArray() {
		return (Libro[]) super.toArray(new Libro[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>nombre</li>
	 * <li>numeroDePaginas</li>
	 * <li>disponibilidad</li>
	 * <li>fechaDeAdquisicion</li>
	 * <li>fechaDeEdicion</li>
	 * <li>edicion</li>
	 * <li>editor</li>
	 * <li>vecesSolicitado</li>
	 * <li>fechaUltimaSolicitud</li>
	 * <li>colorTapa</li>
	 * <li>estadoDeterioro</li>
	 * <li>idioma</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Libro[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>nombre</li>
	 * <li>numeroDePaginas</li>
	 * <li>disponibilidad</li>
	 * <li>fechaDeAdquisicion</li>
	 * <li>fechaDeEdicion</li>
	 * <li>edicion</li>
	 * <li>editor</li>
	 * <li>vecesSolicitado</li>
	 * <li>fechaUltimaSolicitud</li>
	 * <li>colorTapa</li>
	 * <li>estadoDeterioro</li>
	 * <li>idioma</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Libro[] toArray(String propertyName, boolean ascending) {
		return (Libro[]) super.toArray(new Libro[size()], propertyName, ascending);
	}
	
    /**
     *
     * @return
     * @throws PersistentException
     */
    protected PersistentManager getPersistentManager() throws PersistentException {
		return ProyectoprogramacionavanzadaPersistentManager.instance();
	}
	
}

