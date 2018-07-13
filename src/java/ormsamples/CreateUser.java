/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import java.util.Date;
import org.orm.*;
public class CreateUser {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
                Date fechaNacimiento=new Date(100);
		try {
                        modelo.Pais lmodeloPais = modelo.PaisDAO.createPais();
                        lmodeloPais.setIdPais("1");
                        lmodeloPais.setNombre("pais");
                        
                        modelo.PaisDAO.save(lmodeloPais);
                        
			modelo.Ciudad lmodeloCiudad = modelo.CiudadDAO.createCiudad();
                        lmodeloCiudad.setIdCiudad("1");
                        lmodeloCiudad.setNombre("ciudad");
                        lmodeloCiudad.setIdPais(lmodeloPais);
                        
                        modelo.CiudadDAO.save(lmodeloCiudad);
                        
			modelo.Cliente lmodeloCliente = modelo.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : clienteDeBiblioteca, registroSalaLectura, entregaDeLibro, solicitudLibro, solicitudComputador, idCiudad, correoElectronico, diasDeAtraso, areaDeInteres, estadoDeTrabajo, fechaDeNacimiento, genero, apellidoMaterno, apellidoPaterno, nombre
                        lmodeloCliente.setRUN("19123123-4");
                        lmodeloCliente.setNombre("El_Cliente");
                        lmodeloCliente.setApellidoPaterno("C");
                        lmodeloCliente.setApellidoMaterno("C");
                        lmodeloCliente.setGenero("indefinido");
                        lmodeloCliente.setFechaDeNacimiento(fechaNacimiento);
                        lmodeloCliente.setEstadoDeTrabajo("bien");
                        lmodeloCliente.setAreaDeInteres("IT");
                        lmodeloCliente.setDiasDeAtraso(0);
                        lmodeloCliente.setIdCiudad(lmodeloCiudad);
                        lmodeloCliente.setCorreoElectronico("e.client@ufro.cl");
			modelo.ClienteDAO.save(lmodeloCliente);
                        
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateUser createProyectoprogramacionavanzadaData = new CreateUser();
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
