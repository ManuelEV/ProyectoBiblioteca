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
import utility.Utility;

/**
 *
 * @author jorge
 */
public class LibroMasController extends HttpServlet {

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
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            
            String nombre = request.getParameter("nombre");
            int numeroDePaginas = Integer.parseInt(request.getParameter("numeroDePaginas"));
            String disponibilidad = request.getParameter("disponibilidad");
            String fDA=request.getParameter("fechaDeAdquisicion");
            Utility use = new Utility();
            Date fechaDeAdquisicion = use.retrieveDate(fDA);
            String fDE=request.getParameter("fechaDeEdicion");
            Date fechaDeEdicion = use.retrieveDate(fDE);
            String edicion=request.getParameter("edicion");
            String editor = request.getParameter("editor");
            int vecesSolicitado = 0;
            //fechaUltimaSolicitud = null;
            String colorTapa= request.getParameter("colorTapa");
            String estadoDeterioro= request.getParameter("estadoDeterioro");
            String idioma=request.getParameter("idioma");
            //idEstante=null
            String idCategoria = request.getParameter("categoria");
            
            /*----------------------*/
            
            PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                
                modelo.Libro libro=modelo.LibroDAO.createLibro();
                libro.setNombre(nombre);
                libro.setNumeroDePaginas(numeroDePaginas);
                libro.setDisponibilidad(disponibilidad);
                libro.setFechaDeAdquisicion(fechaDeAdquisicion);
                libro.setFechaDeEdicion(fechaDeEdicion);
                libro.setEdicion(edicion);
                libro.setEditor(editor);
                libro.setVecesSolicitado(vecesSolicitado);
                //libro.setFechaUltimaSolicitud=null;
                libro.setColorTapa(colorTapa);
                libro.setEstadoDeterioro(estadoDeterioro);
                libro.setIdioma(idioma);
                
                libro.setIdCategoria(modelo.CategoriaDAO.loadCategoriaByQuery("nombre ='"+idCategoria+"'", null));
                modelo.LibroDAO.save(libro);
                
                t.commit();
                
                //-unir usuario-cliente
                RequestDispatcher rd = request.getRequestDispatcher("/libroMas");
                rd.forward(request, response);
            } catch (Exception e) {
                t.rollback();
            }
            
        } catch (PersistentException ex) {
            Logger.getLogger(LibroMasController.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
