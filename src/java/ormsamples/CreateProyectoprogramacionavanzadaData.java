/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoprogramacionavanzadaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			modelo.Biblioteca lmodeloBiblioteca = modelo.BibliotecaDAO.createBiblioteca();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, funcionario, clienteDeBiblioteca, salaDeLectura, computador, estante, idCiudad, correoElectronico, propietario, direccion, nombre
			modelo.BibliotecaDAO.save(lmodeloBiblioteca);
			modelo.Libro lmodeloLibro = modelo.LibroDAO.createLibro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autores, entregaDeLibro, solicitudLibro, idCategoria, idioma, estadoDeterioro, colorTapa, vecesSolicitado, editor, fechaDeEdicion, fechaDeAdquisicion, disponibilidad, numeroDePaginas, nombre
			modelo.LibroDAO.save(lmodeloLibro);
			modelo.Cliente lmodeloCliente = modelo.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : clienteDeBiblioteca, registroSalaLectura, entregaDeLibro, solicitudLibro, solicitudComputador, idCiudad, diasDeAtraso, areaDeInteres, estadoDeTrabajo, fechaDeNacimiento, genero, apellidoMaterno, apellidoPaterno, nombre, RUN
			modelo.ClienteDAO.save(lmodeloCliente);
			modelo.Estante lmodeloEstante = modelo.EstanteDAO.createEstante();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idCategoria, idBiblioteca, capacidadAproximada
			modelo.EstanteDAO.save(lmodeloEstante);
			modelo.Autor lmodeloAutor = modelo.AutorDAO.createAutor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autores, apellidoMaterno, apellidoPaterno, genero, nombre
			modelo.AutorDAO.save(lmodeloAutor);
			modelo.Ciudad lmodeloCiudad = modelo.CiudadDAO.createCiudad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : funcionario, biblioteca, cliente, idPais, nombre
			modelo.CiudadDAO.save(lmodeloCiudad);
			modelo.Pais lmodeloPais = modelo.PaisDAO.createPais();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ciudad, nombre
			modelo.PaisDAO.save(lmodeloPais);
			modelo.Categoria lmodeloCategoria = modelo.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : libro, estante, nombre
			modelo.CategoriaDAO.save(lmodeloCategoria);
			modelo.Computador lmodeloComputador = modelo.ComputadorDAO.createComputador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : solicitudComputador, idBiblioteca, fechaDeAdquisicion, marca
			modelo.ComputadorDAO.save(lmodeloComputador);
			modelo.SolicitudComputador lmodeloSolicitudComputador = modelo.SolicitudComputadorDAO.createSolicitudComputador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horaSolicitud, fechaDeSolicitud
			modelo.SolicitudComputadorDAO.save(lmodeloSolicitudComputador);
			modelo.SolicitudLibro lmodeloSolicitudLibro = modelo.SolicitudLibroDAO.createSolicitudLibro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fechaEntregaLimite, horaDeSolicitud, fechaDeSolicitud
			modelo.SolicitudLibroDAO.save(lmodeloSolicitudLibro);
			modelo.EntregaDeLibro lmodeloEntregaDeLibro = modelo.EntregaDeLibroDAO.createEntregaDeLibro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : diasDeAtraso, fechaDeDevolucion
			modelo.EntregaDeLibroDAO.save(lmodeloEntregaDeLibro);
			modelo.SalaDeLectura lmodeloSalaDeLectura = modelo.SalaDeLecturaDAO.createSalaDeLectura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : registroSalaLectura, idBiblioteca, nombre, capacidad
			modelo.SalaDeLecturaDAO.save(lmodeloSalaDeLectura);
			modelo.Funcionario lmodeloFuncionario = modelo.FuncionarioDAO.createFuncionario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idBiblioteca, idCiudad, correoElectronico, fechaDeNacimiento, genero, apellidoPaterno, apellidoMaterno, nombre, RUN
			modelo.FuncionarioDAO.save(lmodeloFuncionario);
			modelo.RegistroSalaLectura lmodeloRegistroSalaLectura = modelo.RegistroSalaLecturaDAO.createRegistroSalaLectura();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horaRegistro, tipoRegistro, fechaRegistro
			modelo.RegistroSalaLecturaDAO.save(lmodeloRegistroSalaLectura);
			modelo.Autores lmodeloAutores = modelo.AutoresDAO.createAutores();
			// Initialize the properties of the persistent object here
			modelo.AutoresDAO.save(lmodeloAutores);
			modelo.ClienteDeBiblioteca lmodeloClienteDeBiblioteca = modelo.ClienteDeBibliotecaDAO.createClienteDeBiblioteca();
			// Initialize the properties of the persistent object here
			modelo.ClienteDeBibliotecaDAO.save(lmodeloClienteDeBiblioteca);
			modelo.Usuario lmodeloUsuario = modelo.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idBiblioteca, contraseña, tipoUsuario, usuario, correo
			modelo.UsuarioDAO.save(lmodeloUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoprogramacionavanzadaData createProyectoprogramacionavanzadaData = new CreateProyectoprogramacionavanzadaData();
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
