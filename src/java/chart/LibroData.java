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
@WebServlet(name = "LibroData", urlPatterns = {"/LibroData"})
public class LibroData extends HttpServlet {

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

            modelo.Libro[] modeloLibros = modelo.LibroDAO.listLibroByQuery(null,null);//"vecesSolicitado>85", null);
            
            modelo.Autor[] autores = modelo.AutorDAO.listAutorByQuery(null,null);

            ArrayList<LibroChart> lista = new ArrayList<>();

            for (Libro modeloLibro : modeloLibros) {
                
                LibroChart l = new LibroChart();
                
                boolean disponible;
                
                disponible = modeloLibro.getDisponibilidad().equals("Disponible");
                
                
                l.setDisponibilidad(disponible);
                l.setIdioma(modeloLibro.getIdioma());
                l.setNombre(modeloLibro.getNombre());
                l.setVecesSolicitado(modeloLibro.getVecesSolicitado());
                l.setEdicion(modeloLibro.getEdicion());
                l.setEditor(modeloLibro.getEditor());
                l.setCodigoLibro(modeloLibro.getId()+"");
                
                int indiceAutor = (int)(Math.random()*150);
                
                l.setAutor(autores[indiceAutor].getNombre()+" "+autores[indiceAutor].getApellidoPaterno());
                
                lista.add(l);
                
            }
            
            

            Gson gson = new Gson();
            String jsonString = "";// = gson.toJson(lista, modelo.Pais.class);// = JsonGenerator.PRETTY_PRINTING;

            jsonString = gson.toJson(lista);
            
            //System.out.println(jsonString);

            

            response.setContentType("application/json");

            response.getWriter().write(jsonString);

            //System.out.println(jsonString);
        } catch (PersistentException ex) {
            Logger.getLogger(LibroData.class.getName()).log(Level.SEVERE, null, ex);
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
