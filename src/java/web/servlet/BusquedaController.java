/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "BusquedaController", urlPatterns = {"/Busqueda"})
public class BusquedaController extends HttpServlet {

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

        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        String idioma = request.getParameter("idioma");

        String query = "";

        try {

            query = "nombre = '" + nombre + "'";

            modelo.Libro[] librosPorNombre = modelo.LibroDAO.listLibroByQuery(query, null);

            query = "nombre = '" + categoria + "'";

            modelo.Categoria categ = modelo.CategoriaDAO.loadCategoriaByQuery(query, null);

            query = "idCategoria = '" + categ.getIdCategoria() + "'";

            modelo.Libro[] librosPorCategoria = modelo.LibroDAO.listLibroByQuery(query, null);

            query = "idioma = '" + idioma + "'";

            modelo.Libro[] librosPorIdioma = modelo.LibroDAO.listLibroByQuery(query, null);

            System.out.println("MOSTRANDO LIBROS");
            //System.out.println(librosPorNombre[0].getNombre());

            System.out.println(librosPorIdioma == null);

            ArrayList<modelo.Libro> lista = new ArrayList<>();

            if (librosPorNombre != null || librosPorCategoria != null || librosPorIdioma != null) {
                if (librosPorNombre != null) {

                    for (Libro librosPorNombre1 : librosPorNombre) {
                        boolean disponible = librosPorNombre1.getDisponibilidad().equals("Disponible");
                        if (disponible) {
                            lista.add(librosPorNombre1);
                        }
                    }

                }
                if (librosPorCategoria != null) {

                    for (Libro librosPorCategoria1 : librosPorCategoria) {
                        boolean disponible = librosPorCategoria1.getDisponibilidad().equals("Disponible");
                        if (disponible) {
                            lista.add(librosPorCategoria1);
                        }
                    }
                }
                if (librosPorIdioma != null) {

                    for (Libro librosPorIdioma1 : librosPorIdioma) {
                        boolean disponible = librosPorIdioma1.getDisponibilidad().equals("Disponible");
                        if (disponible) {
                            lista.add(librosPorIdioma1);
                        }
                    }
                }

                request.setAttribute("busqueda", lista);

                RequestDispatcher rd = request.getRequestDispatcher("busqueda.jsp");
                rd.forward(request, response);

            } else {

                String notFound = "La búsqueda no ha arrojado resultados";

                request.setAttribute("busquedaNotFound", notFound);

                RequestDispatcher rd = request.getRequestDispatcher("/Biblioteca/catalogo.jsp");
                rd.forward(request, response);
            }

        } catch (PersistentException ex) {
            Logger.getLogger(BusquedaController.class.getName()).log(Level.SEVERE, null, ex);
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
