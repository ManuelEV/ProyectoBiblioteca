/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;

/**
 *
 * @author Manuel
 */
public class CreateProyectoprogramacionavanzadaDatabaseSchema {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(modelo.ProyectoprogramacionavanzadaPersistentManager.instance());
			modelo.ProyectoprogramacionavanzadaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
