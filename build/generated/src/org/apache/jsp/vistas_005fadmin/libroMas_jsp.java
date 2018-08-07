package org.apache.jsp.vistas_005fadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class libroMas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Biblioteca</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Recursos/MyFavicon.png\" />\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"/Biblioteca/libros_chart/grafica_libros.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"/Biblioteca/vistas_admin/estadisticas/grafica_libros_no_populares.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Biblioteca</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"/Biblioteca/vistas_admin/principal.jsp\">Principal</a></li>\n");
      out.write("                    <li class=\"active\"><a href=\"/Biblioteca/vistas_admin/estadisticas.jsp\">Estadísticas</a></li>\n");
      out.write("                    <li ><a href=\"/Biblioteca/vistas_admin/reservas.jsp\">Libros reservados</a></li>\n");
      out.write("                    <li ><a href=\"/Biblioteca/vistas_admin/editar.jsp\">Editar</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("<!--                    <li ><a href=\"/Biblioteca/vistas_admin/perfil.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Mi perfil</a></li>-->\n");
      out.write("                    <li><a href=\"/Biblioteca/index.html\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--SubNav para edicion de libros-->\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Biblioteca</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"/Biblioteca/vistas_admin/libroMas.jsp\">Libro+</a></li>\n");
      out.write("                    <li ><a href=\"/Biblioteca/vistas_admin/libroMenos.jsp\">Libro-</a></li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <form id=\"formulario\" method=\"post\" action=\"LibroMas\">\n");
      out.write("                            <fieldset>\n");
      out.write("\n");
      out.write("                                <label>Nombre</label><br><input type=\"mail\" class=\"form-control\" name=\"email\" value=\"\" /><br>\n");
      out.write("                                <label>Numero de paginas</label><br><input type=\"text\" class=\"form-control\" name=\"usuario\" value=\"\" /><br>\n");
      out.write("                                <label>Disponibilidad</label><br><select name=\"genero\">\n");
      out.write("                                    <option>Disponible</option>\n");
      out.write("                                    <option>Reservado</option>\n");
      out.write("                                    <option>No disponible</option>\n");
      out.write("                                </select><br>\n");
      out.write("                                <label class=\"control-label\" for=\"date\">Fecha de adquisicion</label>\n");
      out.write("                                <input class=\"form-control\" id=\"date\" name=\"date\" placeholder=\"YYYY/MM/DD\" type=\"date\"/><br>\n");
      out.write("                                <label class=\"control-label\" for=\"date\">Fecha de edicion</label>\n");
      out.write("                                <input class=\"form-control\" id=\"date\" name=\"date\" placeholder=\"YYYY/MM/DD\" type=\"date\"/><br>\n");
      out.write("                                <label>Edicion</label><br><input type=\"text\" class=\"form-control\" name=\"apellidoPaterno\" value=\"\" /><br>\n");
      out.write("                                <label>Editor</label><br><input type=\"text\" class=\"form-control\" name=\"apellidoMaterno\" value=\"\" /><br>\n");
      out.write("                                <!--Veces solicitado = 0-->\n");
      out.write("                                <!--Fecha Ultima solicitud = null-->\n");
      out.write("                                <label>Color de tapa</label><br><input type=\"text\" class=\"form-control\" name=\"apellidoMaterno\" value=\"\" /><br>\n");
      out.write("                                <label>Estado de deterioro</label><br><select name=\"genero\">\n");
      out.write("                                    <option>Nuevo</option>\n");
      out.write("                                    <option>Usado</option>\n");
      out.write("                                    <option>Legible deteriorado</option>\n");
      out.write("                                    <option>Ilegible deteriorado</option>\n");
      out.write("                                </select><br>\n");
      out.write("                                <label>Idioma</label><br><input type=\"text\" class=\"form-control\" name=\"apellidoMaterno\" value=\"\" /><br>\n");
      out.write("                                <!--Estante-->\n");
      out.write("                                <label>Categoria</label><br><input type=\"text\" class=\"form-control\" name=\"apellidoMaterno\" value=\"\" /><br>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <input type=\"button\" value=\"Cancelar\" name=\"enviar\" class=\"btn btn-danger\" />\n");
      out.write("                            <input type=\"submit\" value=\"Enviar\" name=\"enviar\" class=\"btn btn-primary\" />\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <br><br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
