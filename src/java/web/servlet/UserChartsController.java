/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.stream.JsonGenerator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pais;
import org.orm.PersistentException;

/**
 *
 * @author Manuel
 */
public class UserChartsController extends HttpServlet {

    private static final long serialVersionUID = 1L;

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

        try {
            

            List<modelo.Pais> lista = new ArrayList<>();// = getClientes();

            modelo.Pais c1 = modelo.PaisDAO.loadPaisByORMID("p01");
            modelo.Pais c2 = modelo.PaisDAO.loadPaisByORMID("p02");
            
            modelo.Cliente c3;

            System.out.println(c2.getNombre());

            lista.add(c1);
            lista.add(c2);

            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

            String jsonString="";// = gson.toJson(lista, modelo.Pais.class);// = JsonGenerator.PRETTY_PRINTING;
            
            jsonString += "{";
            
            for (Pais lista1 : lista) {
                jsonString+="{";
                jsonString+="\"pais\": \""+lista1.getNombre()+"\"";
                jsonString+="},";
            }
            
            System.out.println(jsonString);
            
            jsonString+="}";
            
            System.out.println(jsonString);
            
            jsonString = JsonGenerator.PRETTY_PRINTING;
            
            System.out.println(jsonString);
            
            response.setContentType("application/json");

            response.getWriter().write(jsonString);

            System.out.println(jsonString);
        } catch (PersistentException ex) {
            Logger.getLogger(UserChartsController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private List<modelo.Cliente> getClientes() {
        List<modelo.Cliente> lista = new ArrayList<>();

        try {
            modelo.Cliente c1 = modelo.ClienteDAO.getClienteByORMID("131679348");
            //modelo.Cliente c2 = modelo.ClienteDAO.getClienteByORMID("147168913");

            lista.add(c1);
            //lista.add(c2);

        } catch (PersistentException ex) {
            Logger.getLogger(UserChartsController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
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
