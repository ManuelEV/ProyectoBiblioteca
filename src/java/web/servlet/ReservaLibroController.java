/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.SolicitudLibro;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "ReservaLibroController", urlPatterns = {"/Reserva"})
public class ReservaLibroController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws org.orm.PersistentException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, PersistentException {
        response.setContentType("text/html;charset=UTF-8");

        String idLibro = request.getParameter("idLibro");
        String rut = request.getParameter("rut");

        PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();

        System.out.println(idLibro);
        System.out.println("asdrut");
        System.out.println(rut);
        System.out.println("asdrut2");
        
        ArrayList<modelo.SolicitudLibro> lista = new ArrayList<>();

        modelo.SolicitudLibro[] sValidacion = modelo.SolicitudLibroDAO.listSolicitudLibroByQuery(null, null);
        
        boolean solicitudValida=true;
        
        for (SolicitudLibro sv : sValidacion) {
            if(sv.getIdCliente().getRUN().equals(rut) && (sv.getCodigoLibro().getId()+"").equals(idLibro)){
                solicitudValida=false;
            }
        }

        if (idLibro != null && rut != null && solicitudValida) {

            try {

                String query = "";

                query = "RUN= '" + rut + "'";

                modelo.SolicitudLibro[] s = modelo.SolicitudLibroDAO.listSolicitudLibroByQuery(null, null);

                int indice = s.length;

                modelo.Cliente cliente = modelo.ClienteDAO.loadClienteByQuery(query, null);

                System.out.println("********************PROBANDO**********************");
                System.out.println(cliente.getNombre());

                query = "id= '" + idLibro + "'";

                modelo.Libro libro = modelo.LibroDAO.loadLibroByQuery(query, null);

                modelo.SolicitudLibro solicitud = new modelo.SolicitudLibro();

                solicitud.setCodigoLibro(libro);

                System.out.println("Solicitud codigolibro: " + solicitud.getCodigoLibro());

                Date fechaSolicitud = new Date();

                solicitud.setFechaDeSolicitud(fechaSolicitud);

                System.out.println("Solicitud fechaSol: " + solicitud.getFechaDeSolicitud());

                Time hora = new Time(fechaSolicitud.getTime());

                solicitud.setHoraDeSolicitud(hora);

                System.out.println("Solicitud horaSol: " + solicitud.getHoraDeSolicitud());

                solicitud.setIdCliente(cliente);

                System.out.println("Solicitud cliente: " + solicitud.getIdCliente());

                LocalDate ld = LocalDate.now().plusDays(7);

                Date fechaLimite = java.sql.Date.valueOf(ld);

                solicitud.setFechaEntregaLimite(fechaLimite);

                solicitud.setId(indice + 1);

                System.out.println("Solicitud fechaLimite: " + solicitud.getFechaEntregaLimite());

                System.out.println("*****************SOLICITUD TOSTRING******************");

                System.out.println(solicitud.getCodigoLibro());
                //System.out.println(solicitud.getCodigoLibroId());
                System.out.println(solicitud.getFechaDeSolicitud());
                System.out.println(solicitud.getFechaEntregaLimite());
                System.out.println(solicitud.getHoraDeSolicitud());

                modelo.SolicitudLibroDAO.save(solicitud);
                
                libro.setDisponibilidad("No disponible");

                modelo.LibroDAO.save(libro);
                
                lista.add(solicitud);

                request.setAttribute("solicitudes", lista);

                RequestDispatcher rd = request.getRequestDispatcher("reservaLibros.jsp");
                rd.forward(request, response);
                t.commit();

            } catch (PersistentException ex) {
                Logger.getLogger(ReservaLibroController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            HttpSession sesion = request.getSession();

            Object c = sesion.getAttribute("usuario");

            String id = c.toString();

            String query = "idCliente='" + id + "'";

            System.out.println("Query: " + query);

            modelo.SolicitudLibro[] sol = modelo.SolicitudLibroDAO.listSolicitudLibroByQuery(query, null);

            System.out.println(sol.length);

            for (SolicitudLibro sol1 : sol) {
                lista.add(sol1);

            }

            request.setAttribute("solicitudes", lista);

            RequestDispatcher rd = request.getRequestDispatcher("reservaLibros.jsp");
            rd.forward(request, response);

        }

    }

    /**
     *
     * @param cadena
     * @return
     */
    public boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
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
            Logger.getLogger(ReservaLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ReservaLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
