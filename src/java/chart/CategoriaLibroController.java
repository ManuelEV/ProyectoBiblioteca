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
import org.orm.PersistentException;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "CategoriaLibroController", urlPatterns = {"/CategoriasLibros"})
public class CategoriaLibroController extends HttpServlet {

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


            ArrayList<LibroChart> lista = new ArrayList<>();
            
            
            
            for (int i = 1; i < 13; i++) {
                modelo.Libro[] librosAux = modelo.LibroDAO.listLibroByQuery("idCategoria='"+i+"'", null);
                modelo.Categoria cat = modelo.CategoriaDAO.getCategoriaByORMID(i);
                
                LibroChart lib = new LibroChart();
                lib.setCantidadCategoria(librosAux.length);
                lib.setNombre(cat.getNombre());
                
                lista.add(lib);
                
            }

            Gson gson = new Gson();
            String jsonString = "";// = gson.toJson(lista, modelo.Pais.class);// = JsonGenerator.PRETTY_PRINTING;

            jsonString = gson.toJson(lista);
            
            System.out.println(jsonString);

            

            response.setContentType("application/json");

            response.getWriter().write(jsonString);

            System.out.println(jsonString);
        } catch (PersistentException ex) {
            Logger.getLogger(CategoriaLibroController.class.getName()).log(Level.SEVERE, null, ex);
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
