/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoprogramacionavanzadaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Biblioteca...");
		modelo.Categoria[] listaCategoria = modelo.CategoriaDAO.listCategoriaByQuery(null, null);
		int length = Math.min(listaCategoria.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(listaCategoria[i].getNombre());
		}
		System.out.println(length + " record(s) retrieved.");
		
//		System.out.println("Listing Libro...");
//		modelo.Libro[] modeloLibros = modelo.LibroDAO.listLibroByQuery(null, null);
//		length = Math.min(modeloLibros.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloLibros[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Cliente...");
//		modelo.Cliente[] modeloClientes = modelo.ClienteDAO.listClienteByQuery(null, null);
//		length = Math.min(modeloClientes.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloClientes[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Estante...");
//		modelo.Estante[] modeloEstantes = modelo.EstanteDAO.listEstanteByQuery(null, null);
//		length = Math.min(modeloEstantes.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloEstantes[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Autor...");
//		modelo.Autor[] modeloAutors = modelo.AutorDAO.listAutorByQuery(null, null);
//		length = Math.min(modeloAutors.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloAutors[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Ciudad...");
//		modelo.Ciudad[] modeloCiudads = modelo.CiudadDAO.listCiudadByQuery(null, null);
//		length = Math.min(modeloCiudads.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloCiudads[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Pais...");
//		modelo.Pais[] modeloPaises = modelo.PaisDAO.listPaisByQuery(null, null);
//		length = Math.min(modeloPaises.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloPaises[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Categoria...");
//		modelo.Categoria[] modeloCategorias = modelo.CategoriaDAO.listCategoriaByQuery(null, null);
//		length = Math.min(modeloCategorias.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloCategorias[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Computador...");
//		modelo.Computador[] modeloComputadors = modelo.ComputadorDAO.listComputadorByQuery(null, null);
//		length = Math.min(modeloComputadors.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloComputadors[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing SolicitudComputador...");
//		modelo.SolicitudComputador[] modeloSolicitudComputadors = modelo.SolicitudComputadorDAO.listSolicitudComputadorByQuery(null, null);
//		length = Math.min(modeloSolicitudComputadors.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloSolicitudComputadors[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing SolicitudLibro...");
//		modelo.SolicitudLibro[] modeloSolicitudLibros = modelo.SolicitudLibroDAO.listSolicitudLibroByQuery(null, null);
//		length = Math.min(modeloSolicitudLibros.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloSolicitudLibros[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing EntregaDeLibro...");
//		modelo.EntregaDeLibro[] modeloEntregaDeLibros = modelo.EntregaDeLibroDAO.listEntregaDeLibroByQuery(null, null);
//		length = Math.min(modeloEntregaDeLibros.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloEntregaDeLibros[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing SalaDeLectura...");
//		modelo.SalaDeLectura[] modeloSalaDeLecturas = modelo.SalaDeLecturaDAO.listSalaDeLecturaByQuery(null, null);
//		length = Math.min(modeloSalaDeLecturas.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloSalaDeLecturas[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Funcionario...");
//		modelo.Funcionario[] modeloFuncionarios = modelo.FuncionarioDAO.listFuncionarioByQuery(null, null);
//		length = Math.min(modeloFuncionarios.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloFuncionarios[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing RegistroSalaLectura...");
//		modelo.RegistroSalaLectura[] modeloRegistroSalaLecturas = modelo.RegistroSalaLecturaDAO.listRegistroSalaLecturaByQuery(null, null);
//		length = Math.min(modeloRegistroSalaLecturas.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloRegistroSalaLecturas[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Autores...");
//		modelo.Autores[] modeloAutoreses = modelo.AutoresDAO.listAutoresByQuery(null, null);
//		length = Math.min(modeloAutoreses.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloAutoreses[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing ClienteDeBiblioteca...");
//		modelo.ClienteDeBiblioteca[] modeloClienteDeBibliotecas = modelo.ClienteDeBibliotecaDAO.listClienteDeBibliotecaByQuery(null, null);
//		length = Math.min(modeloClienteDeBibliotecas.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloClienteDeBibliotecas[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
//		
//		System.out.println("Listing Usuario...");
//		modelo.Usuario[] modeloUsuarios = modelo.UsuarioDAO.listUsuarioByQuery(null, null);
//		length = Math.min(modeloUsuarios.length, ROW_COUNT);
//		for (int i = 0; i < length; i++) {
//			System.out.println(modeloUsuarios[i]);
//		}
//		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Biblioteca by Criteria...");
		modelo.BibliotecaCriteria lmodeloBibliotecaCriteria = new modelo.BibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloBibliotecaCriteria.id.eq();
		lmodeloBibliotecaCriteria.setMaxResults(ROW_COUNT);
		modelo.Biblioteca[] modeloBibliotecas = lmodeloBibliotecaCriteria.listBiblioteca();
		int length =modeloBibliotecas== null ? 0 : Math.min(modeloBibliotecas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloBibliotecas[i]);
		}
		System.out.println(length + " Biblioteca record(s) retrieved."); 
		
		System.out.println("Listing Libro by Criteria...");
		modelo.LibroCriteria lmodeloLibroCriteria = new modelo.LibroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloLibroCriteria.id.eq();
		lmodeloLibroCriteria.setMaxResults(ROW_COUNT);
		modelo.Libro[] modeloLibros = lmodeloLibroCriteria.listLibro();
		length =modeloLibros== null ? 0 : Math.min(modeloLibros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloLibros[i]);
		}
		System.out.println(length + " Libro record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		modelo.ClienteCriteria lmodeloClienteCriteria = new modelo.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloClienteCriteria.id.eq();
		lmodeloClienteCriteria.setMaxResults(ROW_COUNT);
		modelo.Cliente[] modeloClientes = lmodeloClienteCriteria.listCliente();
		length =modeloClientes== null ? 0 : Math.min(modeloClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Estante by Criteria...");
		modelo.EstanteCriteria lmodeloEstanteCriteria = new modelo.EstanteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloEstanteCriteria.id.eq();
		lmodeloEstanteCriteria.setMaxResults(ROW_COUNT);
		modelo.Estante[] modeloEstantes = lmodeloEstanteCriteria.listEstante();
		length =modeloEstantes== null ? 0 : Math.min(modeloEstantes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloEstantes[i]);
		}
		System.out.println(length + " Estante record(s) retrieved."); 
		
		System.out.println("Listing Autor by Criteria...");
		modelo.AutorCriteria lmodeloAutorCriteria = new modelo.AutorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloAutorCriteria.id.eq();
		lmodeloAutorCriteria.setMaxResults(ROW_COUNT);
		modelo.Autor[] modeloAutors = lmodeloAutorCriteria.listAutor();
		length =modeloAutors== null ? 0 : Math.min(modeloAutors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloAutors[i]);
		}
		System.out.println(length + " Autor record(s) retrieved."); 
		
		System.out.println("Listing Ciudad by Criteria...");
		modelo.CiudadCriteria lmodeloCiudadCriteria = new modelo.CiudadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloCiudadCriteria.id.eq();
		lmodeloCiudadCriteria.setMaxResults(ROW_COUNT);
		modelo.Ciudad[] modeloCiudads = lmodeloCiudadCriteria.listCiudad();
		length =modeloCiudads== null ? 0 : Math.min(modeloCiudads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloCiudads[i]);
		}
		System.out.println(length + " Ciudad record(s) retrieved."); 
		
		System.out.println("Listing Pais by Criteria...");
		modelo.PaisCriteria lmodeloPaisCriteria = new modelo.PaisCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloPaisCriteria.id.eq();
		lmodeloPaisCriteria.setMaxResults(ROW_COUNT);
		modelo.Pais[] modeloPaises = lmodeloPaisCriteria.listPais();
		length =modeloPaises== null ? 0 : Math.min(modeloPaises.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloPaises[i]);
		}
		System.out.println(length + " Pais record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		modelo.CategoriaCriteria lmodeloCategoriaCriteria = new modelo.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloCategoriaCriteria.id.eq();
		lmodeloCategoriaCriteria.setMaxResults(ROW_COUNT);
		modelo.Categoria[] modeloCategorias = lmodeloCategoriaCriteria.listCategoria();
		length =modeloCategorias== null ? 0 : Math.min(modeloCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Computador by Criteria...");
		modelo.ComputadorCriteria lmodeloComputadorCriteria = new modelo.ComputadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloComputadorCriteria.id.eq();
		lmodeloComputadorCriteria.setMaxResults(ROW_COUNT);
		modelo.Computador[] modeloComputadors = lmodeloComputadorCriteria.listComputador();
		length =modeloComputadors== null ? 0 : Math.min(modeloComputadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloComputadors[i]);
		}
		System.out.println(length + " Computador record(s) retrieved."); 
		
		System.out.println("Listing SolicitudComputador by Criteria...");
		modelo.SolicitudComputadorCriteria lmodeloSolicitudComputadorCriteria = new modelo.SolicitudComputadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloSolicitudComputadorCriteria.id.eq();
		//modelo.ComputadorCriteria lmodeloSolicitudComputadorCriteria_Computador = lmodeloSolicitudComputadorCriteria.createIdComputadorCriteria();
		//lmodeloSolicitudComputadorCriteria_Computador.id.eq();
		//modelo.ClienteCriteria lmodeloSolicitudComputadorCriteria_Cliente = lmodeloSolicitudComputadorCriteria.createIdClienteCriteria();
		//lmodeloSolicitudComputadorCriteria_Cliente.id.eq();
		lmodeloSolicitudComputadorCriteria.setMaxResults(ROW_COUNT);
		modelo.SolicitudComputador[] modeloSolicitudComputadors = lmodeloSolicitudComputadorCriteria.listSolicitudComputador();
		length =modeloSolicitudComputadors== null ? 0 : Math.min(modeloSolicitudComputadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloSolicitudComputadors[i]);
		}
		System.out.println(length + " SolicitudComputador record(s) retrieved."); 
		
		System.out.println("Listing SolicitudLibro by Criteria...");
		modelo.SolicitudLibroCriteria lmodeloSolicitudLibroCriteria = new modelo.SolicitudLibroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloSolicitudLibroCriteria.id.eq();
		//modelo.LibroCriteria lmodeloSolicitudLibroCriteria_Libro = lmodeloSolicitudLibroCriteria.createCodigoLibroCriteria();
		//lmodeloSolicitudLibroCriteria_Libro.id.eq();
		//modelo.ClienteCriteria lmodeloSolicitudLibroCriteria_Cliente = lmodeloSolicitudLibroCriteria.createIdClienteCriteria();
		//lmodeloSolicitudLibroCriteria_Cliente.id.eq();
		lmodeloSolicitudLibroCriteria.setMaxResults(ROW_COUNT);
		modelo.SolicitudLibro[] modeloSolicitudLibros = lmodeloSolicitudLibroCriteria.listSolicitudLibro();
		length =modeloSolicitudLibros== null ? 0 : Math.min(modeloSolicitudLibros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloSolicitudLibros[i]);
		}
		System.out.println(length + " SolicitudLibro record(s) retrieved."); 
		
		System.out.println("Listing EntregaDeLibro by Criteria...");
		modelo.EntregaDeLibroCriteria lmodeloEntregaDeLibroCriteria = new modelo.EntregaDeLibroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloEntregaDeLibroCriteria.id.eq();
		//modelo.LibroCriteria lmodeloEntregaDeLibroCriteria_Libro = lmodeloEntregaDeLibroCriteria.createLibrocodigoCriteria();
		//lmodeloEntregaDeLibroCriteria_Libro.id.eq();
		//modelo.ClienteCriteria lmodeloEntregaDeLibroCriteria_Cliente = lmodeloEntregaDeLibroCriteria.createIdClienteCriteria();
		//lmodeloEntregaDeLibroCriteria_Cliente.id.eq();
		lmodeloEntregaDeLibroCriteria.setMaxResults(ROW_COUNT);
		modelo.EntregaDeLibro[] modeloEntregaDeLibros = lmodeloEntregaDeLibroCriteria.listEntregaDeLibro();
		length =modeloEntregaDeLibros== null ? 0 : Math.min(modeloEntregaDeLibros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloEntregaDeLibros[i]);
		}
		System.out.println(length + " EntregaDeLibro record(s) retrieved."); 
		
		System.out.println("Listing SalaDeLectura by Criteria...");
		modelo.SalaDeLecturaCriteria lmodeloSalaDeLecturaCriteria = new modelo.SalaDeLecturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloSalaDeLecturaCriteria.id.eq();
		lmodeloSalaDeLecturaCriteria.setMaxResults(ROW_COUNT);
		modelo.SalaDeLectura[] modeloSalaDeLecturas = lmodeloSalaDeLecturaCriteria.listSalaDeLectura();
		length =modeloSalaDeLecturas== null ? 0 : Math.min(modeloSalaDeLecturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloSalaDeLecturas[i]);
		}
		System.out.println(length + " SalaDeLectura record(s) retrieved."); 
		
		System.out.println("Listing Funcionario by Criteria...");
		modelo.FuncionarioCriteria lmodeloFuncionarioCriteria = new modelo.FuncionarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloFuncionarioCriteria.id.eq();
		lmodeloFuncionarioCriteria.setMaxResults(ROW_COUNT);
		modelo.Funcionario[] modeloFuncionarios = lmodeloFuncionarioCriteria.listFuncionario();
		length =modeloFuncionarios== null ? 0 : Math.min(modeloFuncionarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloFuncionarios[i]);
		}
		System.out.println(length + " Funcionario record(s) retrieved."); 
		
		System.out.println("Listing RegistroSalaLectura by Criteria...");
		modelo.RegistroSalaLecturaCriteria lmodeloRegistroSalaLecturaCriteria = new modelo.RegistroSalaLecturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloRegistroSalaLecturaCriteria.id.eq();
		//modelo.SalaDeLecturaCriteria lmodeloRegistroSalaLecturaCriteria_SalaDeLectura = lmodeloRegistroSalaLecturaCriteria.createSalaDeLecturaidSalaCriteria();
		//lmodeloRegistroSalaLecturaCriteria_SalaDeLectura.id.eq();
		//modelo.ClienteCriteria lmodeloRegistroSalaLecturaCriteria_Cliente = lmodeloRegistroSalaLecturaCriteria.createIdClienteCriteria();
		//lmodeloRegistroSalaLecturaCriteria_Cliente.id.eq();
		lmodeloRegistroSalaLecturaCriteria.setMaxResults(ROW_COUNT);
		modelo.RegistroSalaLectura[] modeloRegistroSalaLecturas = lmodeloRegistroSalaLecturaCriteria.listRegistroSalaLectura();
		length =modeloRegistroSalaLecturas== null ? 0 : Math.min(modeloRegistroSalaLecturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloRegistroSalaLecturas[i]);
		}
		System.out.println(length + " RegistroSalaLectura record(s) retrieved."); 
		
		System.out.println("Listing Autores by Criteria...");
		modelo.AutoresCriteria lmodeloAutoresCriteria = new modelo.AutoresCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloAutoresCriteria.id.eq();
		//modelo.AutorCriteria lmodeloAutoresCriteria_Autor = lmodeloAutoresCriteria.createIdAutorCriteria();
		//lmodeloAutoresCriteria_Autor.id.eq();
		//modelo.LibroCriteria lmodeloAutoresCriteria_Libro = lmodeloAutoresCriteria.createIdLibroCriteria();
		//lmodeloAutoresCriteria_Libro.id.eq();
		lmodeloAutoresCriteria.setMaxResults(ROW_COUNT);
		modelo.Autores[] modeloAutoreses = lmodeloAutoresCriteria.listAutores();
		length =modeloAutoreses== null ? 0 : Math.min(modeloAutoreses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloAutoreses[i]);
		}
		System.out.println(length + " Autores record(s) retrieved."); 
		
		System.out.println("Listing ClienteDeBiblioteca by Criteria...");
		modelo.ClienteDeBibliotecaCriteria lmodeloClienteDeBibliotecaCriteria = new modelo.ClienteDeBibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloClienteDeBibliotecaCriteria.id.eq();
		//modelo.BibliotecaCriteria lmodeloClienteDeBibliotecaCriteria_Biblioteca = lmodeloClienteDeBibliotecaCriteria.createBibliotecaidBibliotecaCriteria();
		//lmodeloClienteDeBibliotecaCriteria_Biblioteca.id.eq();
		//modelo.ClienteCriteria lmodeloClienteDeBibliotecaCriteria_Cliente = lmodeloClienteDeBibliotecaCriteria.createClienteCriteria();
		//lmodeloClienteDeBibliotecaCriteria_Cliente.id.eq();
		lmodeloClienteDeBibliotecaCriteria.setMaxResults(ROW_COUNT);
		modelo.ClienteDeBiblioteca[] modeloClienteDeBibliotecas = lmodeloClienteDeBibliotecaCriteria.listClienteDeBiblioteca();
		length =modeloClienteDeBibliotecas== null ? 0 : Math.min(modeloClienteDeBibliotecas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloClienteDeBibliotecas[i]);
		}
		System.out.println(length + " ClienteDeBiblioteca record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		modelo.UsuarioCriteria lmodeloUsuarioCriteria = new modelo.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodeloUsuarioCriteria.id.eq();
		lmodeloUsuarioCriteria.setMaxResults(ROW_COUNT);
		modelo.Usuario[] modeloUsuarios = lmodeloUsuarioCriteria.listUsuario();
		length =modeloUsuarios== null ? 0 : Math.min(modeloUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modeloUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoprogramacionavanzadaData listProyectoprogramacionavanzadaData = new ListProyectoprogramacionavanzadaData();
			try {
				listProyectoprogramacionavanzadaData.listTestData();
				//listProyectoprogramacionavanzadaData.listByCriteria();
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
