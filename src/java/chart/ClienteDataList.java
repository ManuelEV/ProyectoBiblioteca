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
import modelo.Cliente;
import modelo.Libro;
import org.orm.PersistentException;

/**
 *
 * @author Manuel
 */
@WebServlet(name = "ClienteDataList", urlPatterns = {"/ClientesDataList"})
public class ClienteDataList extends HttpServlet {

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

        ArrayList<ClienteInfo> lista = new ArrayList<>();

        try {
            modelo.Cliente[] clientes = modelo.ClienteDAO.listClienteByQuery(null, null);

            for (Cliente clienteModel : clientes) {
                ClienteInfo cliente = new ClienteInfo();
                
                cliente.setApellidos(clienteModel.getApellidoPaterno()+" "+clienteModel.getApellidoMaterno());
                cliente.setAreaInteres(clienteModel.getAreaDeInteres());
                cliente.setFechaNacimiento(clienteModel.getFechaDeNacimiento()+"");
                cliente.setGenero(clienteModel.getGenero());
                cliente.setId(clienteModel.getId()+"");
                cliente.setRun(clienteModel.getRUN());
                cliente.setNombre(clienteModel.getNombre());
                
                lista.add(cliente);
            }

        } catch (PersistentException ex) {
            Logger.getLogger(ClienteDataList.class.getName()).log(Level.SEVERE, null, ex);
        }

        Gson gson = new Gson();
        String jsonString = "";// = gson.toJson(lista, modelo.Pais.class);// = JsonGenerator.PRETTY_PRINTING;

        jsonString = gson.toJson(lista);

        //System.out.println(jsonString);
        response.setContentType("application/json");

        response.getWriter().write(jsonString);
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
