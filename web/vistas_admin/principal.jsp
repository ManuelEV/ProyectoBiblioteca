<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession sesion = request.getSession();

    if (sesion.getAttribute("usuario") == null || !sesion.getAttribute("tipoUsuario").equals("administrador")) {
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

    <body style="background: linear-gradient(-90deg, #ffb366, #d9ff66)">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Principal</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/estadisticas">Estadísticas</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/registros">Registros</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="/Biblioteca/vistas_admin/"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>
                    <li><a href="/Biblioteca/index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>


        <div class="container">
            <div class="jumbotron">
                <h1>Bienvenid@ ${sessionScope.usuario.nombre}</h1>  
                <p>${sessionScope.usuario.correoElectronico}</p> 
                <p>Administrador</p>
            </div>
        </div>


    </body>

</html>