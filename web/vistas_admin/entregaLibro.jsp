
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("admin") == null) {// || !sesion.getAttribute("tipoUsuario").equals("administrador")) {
        response.sendRedirect("/Biblioteca/index.html");
    }
    if (sesion.getAttribute("usuario") != null) {// || !sesion.getAttribute("tipoUsuario").equals("administrador")) {
        response.sendRedirect("/Biblioteca/index.html");
    }

%>

<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Biblioteca</title>

        <link rel="icon" type="image/png" href="Recursos/MyFavicon.png" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <body style="background: linear-gradient(-90deg, #ffb366, #d9ff66)">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/vistas_admin/principal.jsp">Principal</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/estadisticas.jsp">Estadísticas</a></li>
                    <li ><a href="/Biblioteca/SolicitudesLibros">Libros reservados</a></li>
                    <li class="active"><a href="/Biblioteca/EntregaLibro">Entrega Libros</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <!--                    <li ><a href="/Biblioteca/vistas_admin/perfil.jsp"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>-->
                    <li><a href="/Biblioteca/index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>

<!--        <form id="formulario" method="post" action="EntregaLibros">-->
            <div class="container">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID entrega</th>
                            <th>Código libro</th>
                            <th>ID cliente</th>
                            <th>Fecha Devolución</th>
                            <th>Días de atraso</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${entregas}" var="element">
                            <tr>
                                <td>${element.id} </td>
                                <td>${element.librocodigo}</td>
                                <td>${element.idCliente}</td>
                                <td>${element.fechaDeDevolucion}</td>
                                <td>${element.diasDeAtraso}</td> 
<!--                               <td><input type="submit" value="Entrega"></td>-->
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </div>
<!--        </form>-->

    </body>

</html>
