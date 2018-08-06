/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoprogramacionavanzadaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Biblioteca lmodeloBiblioteca = modelo.BibliotecaDAO.loadBibliotecaByQuery(null, null);
			// Delete the persistent object
			modelo.BibliotecaDAO.delete(lmodeloBiblioteca);
			modelo.Libro lmodeloLibro = modelo.LibroDAO.loadLibroByQuery(null, null);
			// Delete the persistent object
			modelo.LibroDAO.delete(lmodeloLibro);
			modelo.Cliente lmodeloCliente = modelo.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			modelo.ClienteDAO.delete(lmodeloCliente);
			modelo.Estante lmodeloEstante = modelo.EstanteDAO.loadEstanteByQuery(null, null);
			// Delete the persistent object
			modelo.EstanteDAO.delete(lmodeloEstante);
			modelo.Autor lmodeloAutor = modelo.AutorDAO.loadAutorByQuery(null, null);
			// Delete the persistent object
			modelo.AutorDAO.delete(lmodeloAutor);
			modelo.Ciudad lmodeloCiudad = modelo.CiudadDAO.loadCiudadByQuery(null, null);
			// Delete the persistent object
			modelo.CiudadDAO.delete(lmodeloCiudad);
			modelo.Pais lmodeloPais = modelo.PaisDAO.loadPaisByQuery(null, null);
			// Delete the persistent object
			modelo.PaisDAO.delete(lmodeloPais);
			modelo.Categoria lmodeloCategoria = modelo.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			modelo.CategoriaDAO.delete(lmodeloCategoria);
			modelo.Computador lmodeloComputador = modelo.ComputadorDAO.loadComputadorByQuery(null, null);
			// Delete the persistent object
			modelo.ComputadorDAO.delete(lmodeloComputador);
			modelo.SolicitudComputador lmodeloSolicitudComputador = modelo.SolicitudComputadorDAO.loadSolicitudComputadorByQuery(null, null);
			// Delete the persistent object
			modelo.SolicitudComputadorDAO.delete(lmodeloSolicitudComputador);
			modelo.SolicitudLibro lmodeloSolicitudLibro = modelo.SolicitudLibroDAO.loadSolicitudLibroByQuery(null, null);
			// Delete the persistent object
			modelo.SolicitudLibroDAO.delete(lmodeloSolicitudLibro);
			modelo.EntregaDeLibro lmodeloEntregaDeLibro = modelo.EntregaDeLibroDAO.loadEntregaDeLibroByQuery(null, null);
			// Delete the persistent object
			modelo.EntregaDeLibroDAO.delete(lmodeloEntregaDeLibro);
			modelo.SalaDeLectura lmodeloSalaDeLectura = modelo.SalaDeLecturaDAO.loadSalaDeLecturaByQuery(null, null);
			// Delete the persistent object
			modelo.SalaDeLecturaDAO.delete(lmodeloSalaDeLectura);
			modelo.Funcionario lmodeloFuncionario = modelo.FuncionarioDAO.loadFuncionarioByQuery(null, null);
			// Delete the persistent object
			modelo.FuncionarioDAO.delete(lmodeloFuncionario);
			modelo.RegistroSalaLectura lmodeloRegistroSalaLectura = modelo.RegistroSalaLecturaDAO.loadRegistroSalaLecturaByQuery(null, null);
			// Delete the persistent object
			modelo.RegistroSalaLecturaDAO.delete(lmodeloRegistroSalaLectura);
			modelo.Autores lmodeloAutores = modelo.AutoresDAO.loadAutoresByQuery(null, null);
			// Delete the persistent object
			modelo.AutoresDAO.delete(lmodeloAutores);
			modelo.ClienteDeBiblioteca lmodeloClienteDeBiblioteca = modelo.ClienteDeBibliotecaDAO.loadClienteDeBibliotecaByQuery(null, null);
			// Delete the persistent object
			modelo.ClienteDeBibliotecaDAO.delete(lmodeloClienteDeBiblioteca);
			modelo.Usuario lmodeloUsuario = modelo.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			modelo.UsuarioDAO.delete(lmodeloUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoprogramacionavanzadaData deleteProyectoprogramacionavanzadaData = new DeleteProyectoprogramacionavanzadaData();
			try {
				deleteProyectoprogramacionavanzadaData.deleteTestData();
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
