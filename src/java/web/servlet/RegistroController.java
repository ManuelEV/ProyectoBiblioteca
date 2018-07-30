/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellidoMaterno = request.getParameter("primerApellido");
        String apellidoPaterno = request.getParameter("segundoApellido");
        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        String estadoTrabajo = request.getParameter("estadoTrabajo");
        String areaInteres = request.getParameter("areaInteres");
        String genero = request.getParameter("genero");
        String ciudad = request.getParameter("ciudad");
        String fechaNacimiento = request.getParameter("date");
        System.out.println(rut);
        System.out.println(nombre);
        System.out.println(apellidoMaterno);
        System.out.println(apellidoPaterno);
        System.out.println(correo);
        System.out.println(password);
        System.out.println(estadoTrabajo);
        System.out.println(areaInteres);
        System.out.println(genero);
        System.out.println(ciudad);
        System.out.println(fechaNacimiento);
        //String telefono = request.getParameter("telefono");
        //String celular = request.getParameter("celular");

        PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
        try {

            if (modelo.ClienteDAO.getClienteByORMID(rut) == null) {

                modelo.Cliente nuevoCliente = modelo.ClienteDAO.createCliente();
                
                nuevoCliente.setPrivilegio("general");

                nuevoCliente.setRUN(rut);
                nuevoCliente.setNombre(nombre);
                nuevoCliente.setApellidoMaterno(apellidoMaterno);
                nuevoCliente.setApellidoPaterno(apellidoPaterno);
                nuevoCliente.setCorreoElectronico(correo);
                nuevoCliente.setPassword(password);
                nuevoCliente.setEstadoDeTrabajo(estadoTrabajo);
                nuevoCliente.setAreaDeInteres(areaInteres);
                nuevoCliente.setGenero(genero);

                String query = "nombre = '" + ciudad + "'";
                modelo.Ciudad objCiudad = modelo.CiudadDAO.loadCiudadByQuery(query, null);

                nuevoCliente.setIdCiudad(objCiudad);

                Date objFecha = new Date(fechaNacimiento);
                nuevoCliente.setFechaDeNacimiento(objFecha);

                nuevoCliente.setDiasDeAtraso(0);

                modelo.ClienteDAO.save(nuevoCliente);

                t.commit();

                RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                rd.forward(request, response);

            }
        } catch (Exception e) {
            t.rollback();
        }

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
