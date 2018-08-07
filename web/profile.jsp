<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession sesion = request.getSession();
        
        if(sesion.getAttribute("usuario")==null){
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
                    <li ><a href="/Biblioteca/catalogo">Catálogo</a></li>
                    <li ><a href="/Biblioteca/credencial">Credencial</a></li>
                    <li ><a href="/Biblioteca/Reserva">Libros pedidos</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="active"><a href="#"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>
                    <li><a href="./index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>


        <div class="container">
            <div class="jumbotron">
                <h1>Tu información: ${sessionScope.usuario.nombre}</h1> 
                <p>Apellidos: ${sessionScope.usuario.apellidoPaterno} ${sessionScope.usuario.apellidoMaterno}</p> 
                <p>Ocupación: ${sessionScope.usuario.estadoDeTrabajo}</p> 
                <p>Área de interés: ${sessionScope.usuario.areaDeInteres}</p> 
                <p>Fecha de nacimiento: ${sessionScope.usuario.fechaDeNacimiento}</p> 
                <p>Género: ${sessionScope.usuario.genero}</p> 
                <p>Días de atraso: ${sessionScope.usuario.diasDeAtraso}</p> 
            </div>
        </div>


    </body>



</html>
