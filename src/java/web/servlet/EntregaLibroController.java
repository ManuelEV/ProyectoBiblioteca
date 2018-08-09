/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.EntregaDeLibro;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Manuel
 */
public class EntregaLibroController extends HttpServlet {

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

        ArrayList<modelo.EntregaDeLibro> lista = new ArrayList<>();

        String idSolicitud = request.getParameter("idSolicitud");
        String codLibro = request.getParameter("codLibro");

        modelo.Libro libro = modelo.LibroDAO.loadLibroByQuery("id='" + codLibro + "'", null);
        
        boolean libNoDisponible = false;
        
        if(libro != null){
            if(libro.getDisponibilidad().equals("No disponible")){
                libNoDisponible = true;
            }
        }
        
        String query = "id='" + idSolicitud + "'";
        modelo.SolicitudLibro solicitud = modelo.SolicitudLibroDAO.loadSolicitudLibroByQuery(query, null);
        
        System.out.println(solicitud==null);
        //System.out.println("idsol: "+solicitud.getId());
        

        PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();

        if (libNoDisponible && solicitud!=null) {

            try {
                //modelo.SolicitudLibro solicitud = modelo.SolicitudLibroDAO.loadSolicitudLibroByQuery(query, null);

                int idLibro = solicitud.getCodigoLibroId();
                int idCliente = solicitud.getIdCliente().getId();
                
                System.out.println("idlibro: "+idLibro +" idcliente: "+idCliente);

                modelo.Cliente cliente = modelo.ClienteDAO.getClienteByORMID(idCliente);
                //modelo.Libro libro = modelo.LibroDAO.getLibroByORMID(idLibro);

                //Date fechaSolicitud = solicitud.getFechaDeSolicitud();
                Date fechaEntrega = new Date();

                Date fechaLimite = solicitud.getFechaEntregaLimite();

                int diasAtraso = 0;

                int entrega = numeroDiasEntreDosFechas(fechaLimite, fechaEntrega);

                if (entrega > 0) {
                    diasAtraso = entrega;
                }

                modelo.EntregaDeLibro[] cantEntregas = modelo.EntregaDeLibroDAO.listEntregaDeLibroByQuery(null, null);
                
                for (EntregaDeLibro cantEntrega : cantEntregas) {
                    lista.add(cantEntrega);
                }

                int indice = cantEntregas.length;

                modelo.EntregaDeLibro entregaLibro = new modelo.EntregaDeLibro();

                entregaLibro.setId(indice + 1);

                entregaLibro.setDiasDeAtraso(diasAtraso);

                entregaLibro.setFechaDeDevolucion(fechaEntrega);

                entregaLibro.setIdCliente(cliente);

                entregaLibro.setLibrocodigo(libro);

                modelo.EntregaDeLibroDAO.save(entregaLibro);

                libro.setDisponibilidad("Disponible");

                modelo.LibroDAO.save(libro);

                request.setAttribute("entregas", lista);
                RequestDispatcher rd = request.getRequestDispatcher("vistas_admin/entregaLibro.jsp");
                rd.forward(request, response);

                t.commit();

            } catch (PersistentException ex) {
                Logger.getLogger(EntregaLibroController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            modelo.EntregaDeLibro[] entregas = modelo.EntregaDeLibroDAO.listEntregaDeLibroByQuery(null, null);

            for (EntregaDeLibro entrega : entregas) {
                lista.add(entrega);
            }

            request.setAttribute("entregas", lista);
            RequestDispatcher rd = request.getRequestDispatcher("vistas_admin/entregaLibro.jsp");
            rd.forward(request, response);

        }

    }

    /**
     *
     * @param fecha1
     * @param fecha2
     * @return
     */
    public static int numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {
        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return (int) diffDays;
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
            Logger.getLogger(EntregaLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EntregaLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
