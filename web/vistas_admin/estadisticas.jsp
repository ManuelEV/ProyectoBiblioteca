<%-- 
    Document   : estadisticas
    Created on : 06-08-2018, 21:42:43
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("admin") == null){
        response.sendRedirect("/Biblioteca/index.html");
    }
    if (sesion.getAttribute("usuario") != null){
        response.sendRedirect("/Biblioteca/index.html");
    }

%>

<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Biblioteca</title>
        
        <link rel="icon" type="image/png" href="/Biblioteca/Recursos/MyFavicon.png" />
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="/Biblioteca/libros_chart/grafica_libros.js"></script>
        <script type="text/javascript" src="/Biblioteca/vistas_admin/estadisticas/grafica_libros_no_populares.js"></script>
        <script type="text/javascript" src="/Biblioteca/vistas_admin/estadisticas/grafica_clientes_lista.js"></script>
    </head>

    <body style="background: linear-gradient(-90deg, #ffb366, #d9ff66)">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/vistas_admin/principal.jsp">Principal</a></li>
                    <li class="active"><a href="/Biblioteca/vistas_admin/estadisticas.jsp">Estadísticas</a></li>
                    <li ><a href="/Biblioteca/SolicitudesLibros">Libros reservados</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/editar.jsp">Editar</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
<!--                    <li ><a href="/Biblioteca/vistas_admin/perfil.jsp"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>-->
                    <li><a href="/Biblioteca/index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>


        <div id="lib_div"></div>
        <div id="libmenos_div"></div>
        
        <br/><br/><br/>
        <div class="jumbotron">
            <h1>Lista completa de Clientes</h1> 
            <p>Reporte de todos los clientes de la Biblioteca</p> 
        </div>
        <br/><br/><br/>

        <div class="container">
            <div class="center">
                <div id="lista_clientes"></div>
            </div>
        </div>


        <br/><br/><br/>

    </body>

</html>