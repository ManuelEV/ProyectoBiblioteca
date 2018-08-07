<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("index.html");
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

    <body style="background: linear-gradient(-90deg, #00ff99, #00e6e6)">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/principal">Principal</a></li>
                    <li class="active"><a href="/Biblioteca/catalogo">Catálogo</a></li>
                    <li ><a href="/Biblioteca/credencial">Credencial</a></li>
                    <li ><a href="/Biblioteca/Reserva">Libros pedidos</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="/Biblioteca/perfil"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>
                    <li><a href="./index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>

        <form id="formulario" method="post" action="Reserva">
            <div class="container">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Código del libro</th>
                            <th>Usuario solicitante</th>
                            <th>Nombre de libro</th>
                            <th>Número de páginas</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${busqueda}" var="element">    
                            <tr>
                                <td> <input name="idLibro" type="text" value="${element.id}" readonly="readonly"></td>
                                <td> <input name="rut" type="text" value="${sessionScope.usuario.RUN}" readonly="readonly"></td>
                                <td>${element.nombre}</td>
                                <td>${element.numeroDePaginas}</td>
                                <td><input type="submit" value="RESERVAR"></td>
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </form>



    </body>

</html>
