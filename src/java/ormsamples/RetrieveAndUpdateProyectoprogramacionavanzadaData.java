/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoprogramacionavanzadaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Biblioteca lmodeloBiblioteca = modelo.BibliotecaDAO.loadBibliotecaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.BibliotecaDAO.save(lmodeloBiblioteca);
			modelo.Libro lmodeloLibro = modelo.LibroDAO.loadLibroByQuery(null, null);
			// Update the properties of the persistent object
			modelo.LibroDAO.save(lmodeloLibro);
			modelo.Cliente lmodeloCliente = modelo.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			modelo.ClienteDAO.save(lmodeloCliente);
			modelo.Estante lmodeloEstante = modelo.EstanteDAO.loadEstanteByQuery(null, null);
			// Update the properties of the persistent object
			modelo.EstanteDAO.save(lmodeloEstante);
			modelo.Autor lmodeloAutor = modelo.AutorDAO.loadAutorByQuery(null, null);
			// Update the properties of the persistent object
			modelo.AutorDAO.save(lmodeloAutor);
			modelo.Ciudad lmodeloCiudad = modelo.CiudadDAO.loadCiudadByQuery(null, null);
			// Update the properties of the persistent object
			modelo.CiudadDAO.save(lmodeloCiudad);
			modelo.Pais lmodeloPais = modelo.PaisDAO.loadPaisByQuery(null, null);
			// Update the properties of the persistent object
			modelo.PaisDAO.save(lmodeloPais);
			modelo.Categoria lmodeloCategoria = modelo.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.CategoriaDAO.save(lmodeloCategoria);
			modelo.Computador lmodeloComputador = modelo.ComputadorDAO.loadComputadorByQuery(null, null);
			// Update the properties of the persistent object
			modelo.ComputadorDAO.save(lmodeloComputador);
			modelo.SolicitudComputador lmodeloSolicitudComputador = modelo.SolicitudComputadorDAO.loadSolicitudComputadorByQuery(null, null);
			// Update the properties of the persistent object
			modelo.SolicitudComputadorDAO.save(lmodeloSolicitudComputador);
			modelo.SolicitudLibro lmodeloSolicitudLibro = modelo.SolicitudLibroDAO.loadSolicitudLibroByQuery(null, null);
			// Update the properties of the persistent object
			modelo.SolicitudLibroDAO.save(lmodeloSolicitudLibro);
			modelo.EntregaDeLibro lmodeloEntregaDeLibro = modelo.EntregaDeLibroDAO.loadEntregaDeLibroByQuery(null, null);
			// Update the properties of the persistent object
			modelo.EntregaDeLibroDAO.save(lmodeloEntregaDeLibro);
			modelo.SalaDeLectura lmodeloSalaDeLectura = modelo.SalaDeLecturaDAO.loadSalaDeLecturaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.SalaDeLecturaDAO.save(lmodeloSalaDeLectura);
			modelo.Funcionario lmodeloFuncionario = modelo.FuncionarioDAO.loadFuncionarioByQuery(null, null);
			// Update the properties of the persistent object
			modelo.FuncionarioDAO.save(lmodeloFuncionario);
			modelo.RegistroSalaLectura lmodeloRegistroSalaLectura = modelo.RegistroSalaLecturaDAO.loadRegistroSalaLecturaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.RegistroSalaLecturaDAO.save(lmodeloRegistroSalaLectura);
			modelo.Autores lmodeloAutores = modelo.AutoresDAO.loadAutoresByQuery(null, null);
			// Update the properties of the persistent object
			modelo.AutoresDAO.save(lmodeloAutores);
			modelo.ClienteDeBiblioteca lmodeloClienteDeBiblioteca = modelo.ClienteDeBibliotecaDAO.loadClienteDeBibliotecaByQuery(null, null);
			// Update the properties of the persistent object
			modelo.ClienteDeBibliotecaDAO.save(lmodeloClienteDeBiblioteca);
			modelo.Usuario lmodeloUsuario = modelo.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			modelo.UsuarioDAO.save(lmodeloUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Biblioteca by BibliotecaCriteria");
		modelo.BibliotecaCriteria lmodeloBibliotecaCriteria = new modelo.BibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloBibliotecaCriteria.id.eq();
		System.out.println(lmodeloBibliotecaCriteria.uniqueBiblioteca());
		
		System.out.println("Retrieving Libro by LibroCriteria");
		modelo.LibroCriteria lmodeloLibroCriteria = new modelo.LibroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloLibroCriteria.id.eq();
		System.out.println(lmodeloLibroCriteria.uniqueLibro());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		modelo.ClienteCriteria lmodeloClienteCriteria = new modelo.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloClienteCriteria.id.eq();
		System.out.println(lmodeloClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Estante by EstanteCriteria");
		modelo.EstanteCriteria lmodeloEstanteCriteria = new modelo.EstanteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloEstanteCriteria.id.eq();
		System.out.println(lmodeloEstanteCriteria.uniqueEstante());
		
		System.out.println("Retrieving Autor by AutorCriteria");
		modelo.AutorCriteria lmodeloAutorCriteria = new modelo.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloAutorCriteria.id.eq();
		System.out.println(lmodeloAutorCriteria.uniqueAutor());
		
		System.out.println("Retrieving Ciudad by CiudadCriteria");
		modelo.CiudadCriteria lmodeloCiudadCriteria = new modelo.CiudadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloCiudadCriteria.id.eq();
		System.out.println(lmodeloCiudadCriteria.uniqueCiudad());
		
		System.out.println("Retrieving Pais by PaisCriteria");
		modelo.PaisCriteria lmodeloPaisCriteria = new modelo.PaisCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloPaisCriteria.id.eq();
		System.out.println(lmodeloPaisCriteria.uniquePais());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		modelo.CategoriaCriteria lmodeloCategoriaCriteria = new modelo.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloCategoriaCriteria.id.eq();
		System.out.println(lmodeloCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Computador by ComputadorCriteria");
		modelo.ComputadorCriteria lmodeloComputadorCriteria = new modelo.ComputadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloComputadorCriteria.id.eq();
		System.out.println(lmodeloComputadorCriteria.uniqueComputador());
		
		System.out.println("Retrieving SolicitudComputador by SolicitudComputadorCriteria");
		modelo.SolicitudComputadorCriteria lmodeloSolicitudComputadorCriteria = new modelo.SolicitudComputadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloSolicitudComputadorCriteria.id.eq();
		//lmodeloSolicitudComputadorCriteria.idComputador.eq();
		//lmodeloSolicitudComputadorCriteria.clienteRUN.eq();
		System.out.println(lmodeloSolicitudComputadorCriteria.uniqueSolicitudComputador());
		
		System.out.println("Retrieving SolicitudLibro by SolicitudLibroCriteria");
		modelo.SolicitudLibroCriteria lmodeloSolicitudLibroCriteria = new modelo.SolicitudLibroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloSolicitudLibroCriteria.id.eq();
		//lmodeloSolicitudLibroCriteria.codigoLibro.eq();
		//lmodeloSolicitudLibroCriteria.clienteRUN.eq();
		System.out.println(lmodeloSolicitudLibroCriteria.uniqueSolicitudLibro());
		
		System.out.println("Retrieving EntregaDeLibro by EntregaDeLibroCriteria");
		modelo.EntregaDeLibroCriteria lmodeloEntregaDeLibroCriteria = new modelo.EntregaDeLibroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloEntregaDeLibroCriteria.id.eq();
		//lmodeloEntregaDeLibroCriteria.librocodigo.eq();
		//lmodeloEntregaDeLibroCriteria.clienteRUN.eq();
		System.out.println(lmodeloEntregaDeLibroCriteria.uniqueEntregaDeLibro());
		
		System.out.println("Retrieving SalaDeLectura by SalaDeLecturaCriteria");
		modelo.SalaDeLecturaCriteria lmodeloSalaDeLecturaCriteria = new modelo.SalaDeLecturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloSalaDeLecturaCriteria.id.eq();
		System.out.println(lmodeloSalaDeLecturaCriteria.uniqueSalaDeLectura());
		
		System.out.println("Retrieving Funcionario by FuncionarioCriteria");
		modelo.FuncionarioCriteria lmodeloFuncionarioCriteria = new modelo.FuncionarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloFuncionarioCriteria.id.eq();
		System.out.println(lmodeloFuncionarioCriteria.uniqueFuncionario());
		
		System.out.println("Retrieving RegistroSalaLectura by RegistroSalaLecturaCriteria");
		modelo.RegistroSalaLecturaCriteria lmodeloRegistroSalaLecturaCriteria = new modelo.RegistroSalaLecturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloRegistroSalaLecturaCriteria.id.eq();
		//lmodeloRegistroSalaLecturaCriteria.salaDeLecturaidSala.eq();
		//lmodeloRegistroSalaLecturaCriteria.clienteRUN.eq();
		System.out.println(lmodeloRegistroSalaLecturaCriteria.uniqueRegistroSalaLectura());
		
		System.out.println("Retrieving Autores by AutoresCriteria");
		modelo.AutoresCriteria lmodeloAutoresCriteria = new modelo.AutoresCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloAutoresCriteria.id.eq();
		//lmodeloAutoresCriteria.autoridAutor.eq();
		//lmodeloAutoresCriteria.librocodigo.eq();
		System.out.println(lmodeloAutoresCriteria.uniqueAutores());
		
		System.out.println("Retrieving ClienteDeBiblioteca by ClienteDeBibliotecaCriteria");
		modelo.ClienteDeBibliotecaCriteria lmodeloClienteDeBibliotecaCriteria = new modelo.ClienteDeBibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloClienteDeBibliotecaCriteria.id.eq();
		//lmodeloClienteDeBibliotecaCriteria.bibliotecaidBiblioteca.eq();
		//lmodeloClienteDeBibliotecaCriteria.clienteRUN.eq();
		System.out.println(lmodeloClienteDeBibliotecaCriteria.uniqueClienteDeBiblioteca());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		modelo.UsuarioCriteria lmodeloUsuarioCriteria = new modelo.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodeloUsuarioCriteria.id.eq();
		System.out.println(lmodeloUsuarioCriteria.uniqueUsuario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoprogramacionavanzadaData retrieveAndUpdateProyectoprogramacionavanzadaData = new RetrieveAndUpdateProyectoprogramacionavanzadaData();
			try {
				retrieveAndUpdateProyectoprogramacionavanzadaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoprogramacionavanzadaData.retrieveByCriteria();
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
