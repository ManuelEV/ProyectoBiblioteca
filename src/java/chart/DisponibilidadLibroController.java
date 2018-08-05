/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Libro;
import org.orm.PersistentException;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "DisponibilidadLibroController", urlPatterns = {"/DisponibilidadLibros"})
public class DisponibilidadLibroController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
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
        //processRequest(request, response);
        
        try {

            modelo.Libro[] modeloLibros = modelo.LibroDAO.listLibroByQuery("Disponibilidad='Disponible'", null);
            modelo.Libro[] modeloLibrosNo = modelo.LibroDAO.listLibroByQuery("Disponibilidad='No disponible'", null);

            ArrayList<LibroChart> lista = new ArrayList<>();
            
            LibroChart l1 = new LibroChart();
            l1.setNombre("Disponibles");
            l1.setCantidadDisp(modeloLibros.length);
            LibroChart l2 = new LibroChart();
            l2.setCantidadDisp(modeloLibrosNo.length);
            l2.setNombre("No disponibles");
            
            lista.add(l1);
            lista.add(l2);

            Gson gson = new Gson();
            String jsonString = "";// = gson.toJson(lista, modelo.Pais.class);// = JsonGenerator.PRETTY_PRINTING;

            jsonString = gson.toJson(lista);
            
            System.out.println(jsonString);

            

            response.setContentType("application/json");

            response.getWriter().write(jsonString);

            System.out.println(jsonString);
        } catch (PersistentException ex) {
            Logger.getLogger(DisponibilidadLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
