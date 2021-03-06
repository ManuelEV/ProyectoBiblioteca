/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;

/**
 *
 * @author Manuel
 */
public class LoginController extends HttpServlet {

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
        
        request.setCharacterEncoding("UTF-8");
        
        
        
        
        HttpSession sesion = request.getSession();
        
        if(sesion.getAttribute("usuario")!=null){
            sesion.removeAttribute("usuario");
            sesion.invalidate();
            sesion = request.getSession();
        }
        
        if(sesion.getAttribute("admin")!=null){
            sesion.removeAttribute("admin");
            sesion.invalidate();
            sesion = request.getSession();
        }
        
        String mail = request.getParameter("email");
        String password = request.getParameter("password");
        
        
        String url="";
        
        try {
            //PersistentTransaction t = modelo.ProyectoprogramacionavanzadaPersistentManager.instance().getSession().beginTransaction();
            String query="";
            
            
            query="correo = '"+mail+"'";
            
            modelo.Usuario user = modelo.UsuarioDAO.loadUsuarioByQuery(query, null);
            
            query="Usuarioid = '"+user.getId()+"'";
            
            
            modelo.Cliente cliente = modelo.ClienteDAO.loadClienteByQuery(query, null);
            
            String privilegio = user.getTipoUsuario();
            
            if (cliente!=null && password.equals(user.getContraseña()) && sesion.getAttribute("usuario")==null && privilegio.equals("cliente")) {
                sesion.setAttribute("usuario",cliente);
                //url = "loginExitoso.jsp";
                //dispatcher = request.getRequestDispatcher("principal.html");
                response.sendRedirect("/Biblioteca/principal");
                
            }else if(user!=null && password.equals(user.getContraseña()) && sesion.getAttribute("usuario")==null && privilegio.equals("administrador")){
                sesion.setAttribute("admin",user);
                RequestDispatcher rd = request.getRequestDispatcher("vistas_admin/principal.jsp");
                rd.forward(request, response);
                
            }else{
                //dispatcher = request.getRequestDispatcher("index.html");
                url = "index.html";
                System.out.println("login invalido");
                response.sendRedirect("/Biblioteca/index.html");
                sesion.invalidate();
            }
            
        } catch (PersistentException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //RequestDispatcher rd = request.getRequestDispatcher(url);
        //rd.forward(request, response);
        
        
        
        
        
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
