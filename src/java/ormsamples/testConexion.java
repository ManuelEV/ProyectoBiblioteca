/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class testConexion {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			
			modelo.Cliente lmodeloCliente = modelo.ClienteDAO.getClienteByORMID("131679348");
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : clienteDeBiblioteca, registroSalaLectura, entregaDeLibro, solicitudLibro, solicitudComputador, password, idCiudad, correoElectronico, diasDeAtraso, areaDeInteres, estadoDeTrabajo, fechaDeNacimiento, genero, apellidoMaterno, apellidoPaterno, nombre
			
                        System.out.println(lmodeloCliente.getPassword());
                        System.out.println(lmodeloCliente.getCorreoElectronico());
                        
                        
                        modelo.ClienteDAO.save(lmodeloCliente);
                        
                        
                        String query="correoElectronico = 'Diana.Salazar-134958984@bibClient.com'";
                        modelo.Cliente lmodeloClienteQuery = modelo.ClienteDAO.loadClienteByQuery(query, null);
                        System.out.println(lmodeloClienteQuery.getRUN());
                        
                        
                        modelo.ClienteDAO.save(lmodeloClienteQuery);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			testConexion createProyectoprogramacionavanzadaData = new testConexion();
			try {
				createProyectoprogramacionavanzadaData.createTestData();
			}
			finally {
				modelo.ProyectoprogramacionavanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}