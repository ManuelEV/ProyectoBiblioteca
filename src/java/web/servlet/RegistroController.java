/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Manuel
 */
public class RegistroController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {

        HttpSession sesion = request.getSession();

        if (sesion.getAttribute("usuario") != null) {
            sesion.removeAttribute("usuario");
            sesion.invalidate();
            sesion = request.getSession();
        }

        String usuario = request.getParameter("usuario");
        String correo = request.getParameter("email");

        String contraseña = request.getParameter("password");

        System.out.println(correo);

        String run = request.getParameter("run");
        String nombre = request.getParameter("nombre");
        String apellidoPaterno = request.getParameter("apellidoPaterno");
        String apellidoMaterno = request.getParameter("apellidoMaterno");
        String genero = request.getParameter("genero");
        String fechaDeNacimiento = request.getParameter("date");
        String estadoDeTrabajo = request.getParameter("estadoDeTrabajo");
        String areaDeInteres = request.getParameter("areaDeInteres");
        String numeroDeCelular = request.getParameter("numeroDeCelular");
        String numeroDeTelefono = request.getParameter("numeroDeTelefono");
        String ciudad = request.getParameter("ciudad");

        PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
        try {

            modelo.Usuario user = modelo.UsuarioDAO.createUsuario();

            user.setCorreo(correo);
            user.setContraseña(contraseña);
            user.setTipoUsuario("cliente");
            user.setUsuario(usuario);

            modelo.Biblioteca bib = modelo.BibliotecaDAO.loadBibliotecaByQuery("id =" + 1, null);

            user.setIdBiblioteca(bib);

            modelo.UsuarioDAO.save(user);
//            System.out.println("----------------------------");
//            System.out.println("run: "+ run);
//            System.out.println("nombre: "+ nombre);
//            System.out.println("apellidoMaterno: "+ apellidoMaterno);
//            System.out.println("apellidoPaterno: "+ apellidoPaterno);
//            System.out.println("genero: "+ genero);
//            System.out.println("estadoDeTrabajo: "+ estadoDeTrabajo);
//            System.out.println("areaDeInteres: "+ areaDeInteres);
//            
            modelo.Cliente lmodeloCliente = modelo.ClienteDAO.createCliente();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : clienteDeBiblioteca, registroSalaLectura, entregaDeLibro, solicitudLibro, solicitudComputador, idCiudad, correoElectronico, diasDeAtraso, areaDeInteres, estadoDeTrabajo, fechaDeNacimiento, genero, apellidoMaterno, apellidoPaterno, nombre

            System.out.println("-------------------------");

            System.out.println(run);
            System.out.println(nombre);
            System.out.println(apellidoPaterno);
            System.out.println(apellidoMaterno);
            System.out.println(genero);
            System.out.println(fechaDeNacimiento);
            System.out.println(estadoDeTrabajo);
            System.out.println(areaDeInteres);
            System.out.println(user.getId());

            lmodeloCliente.setRUN(run);
            lmodeloCliente.setNombre(nombre);
            lmodeloCliente.setApellidoPaterno(apellidoPaterno);
            lmodeloCliente.setApellidoMaterno(apellidoMaterno);
            lmodeloCliente.setGenero(genero);

            Date fechaDeNacimientoDATE = this.retrieveDate(fechaDeNacimiento);
            lmodeloCliente.setFechaDeNacimiento(fechaDeNacimientoDATE);
            lmodeloCliente.setEstadoDeTrabajo(estadoDeTrabajo);
            lmodeloCliente.setAreaDeInteres(areaDeInteres);
            lmodeloCliente.setDiasDeAtraso(0);
            lmodeloCliente.setIdCiudad(modelo.CiudadDAO.loadCiudadByQuery("nombre ='" + ciudad + "'", null));
            lmodeloCliente.setORM_Usuario(modelo.UsuarioDAO.loadUsuarioByORMID(user.getId()));
            modelo.ClienteDAO.save(lmodeloCliente);

            t.commit();

            //-unir usuario-cliente
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.forward(request, response);
        } catch (Exception e) {
            t.rollback();
        }

    }

    private Date retrieveDate(String fechaDeNacimiento) {
        String[] fecha = fechaDeNacimiento.split("/");
        int year = Integer.parseInt(fecha[0]);
        int month = Integer.parseInt(fecha[1]);
        int day = Integer.parseInt(fecha[2]);

        Date fechaDate = new Date(this.dateToMilis(year, month, day));
        return fechaDate;
    }

    public long dateToMilis(int year, int month, int date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, date);
        return gc.getTimeInMillis();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(RegistroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
