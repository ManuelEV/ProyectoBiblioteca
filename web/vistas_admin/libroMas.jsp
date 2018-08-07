<%-- 
    Document   : libroMas
    Created on : 07-08-2018, 0:01:19
    Author     : jorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="/Biblioteca/libros_chart/grafica_libros.js"></script>
        <script type="text/javascript" src="/Biblioteca/vistas_admin/estadisticas/grafica_libros_no_populares.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/vistas_admin/principal.jsp">Principal</a></li>
                    <li class="active"><a href="/Biblioteca/vistas_admin/estadisticas.jsp">Estadísticas</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/reservas.jsp">Libros reservados</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/editar.jsp">Editar</a></li>
                    
                </ul>
                <ul class="nav navbar-nav navbar-right">
<!--                    <li ><a href="/Biblioteca/vistas_admin/perfil.jsp"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>-->
                    <li><a href="/Biblioteca/index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>
        <!--SubNav para edicion de libros-->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/vistas_admin/libroMas.jsp">Libro+</a></li>
                    <li ><a href="/Biblioteca/vistas_admin/libroMenos.jsp">Libro-</a></li>
                    
                    
                </ul>
                

            </div>
        </nav>
        
        <form id="formulario" method="post" action="LibroMas">
                            <fieldset>

                                <label>Nombre</label><br><input type="mail" class="form-control" name="nombre" value="" /><br>
                                <label>Numero de paginas</label><br><input type="text" class="form-control" name="numeroDePaginas" value="" /><br>
                                <label>Disponibilidad</label><br><select name="disponibilidad">
                                    <option>Disponible</option>
                                    <option>Reservado</option>
                                    <option>No disponible</option>
                                </select><br>
                                <label class="control-label" for="fechaDeAdquisicion">Fecha de adquisicion</label>
                                <input class="form-control" id="fechaDeAdquisicion" name="fechaDeAdquisicion" placeholder="YYYY/MM/DD" type="date"/><br>
                                <label class="control-label" for="fechaDeEdicion">Fecha de edicion</label>
                                <input class="form-control" id="fechaDeEdicion" name="fechaDeEdicion" placeholder="YYYY/MM/DD" type="date"/><br>
                                <label>Edicion</label><br><input type="text" class="form-control" name="edicion" value="" /><br>
                                <label>Editor</label><br><input type="text" class="form-control" name="editor" value="" /><br>
                                <!--Veces solicitado = 0-->
                                <!--Fecha Ultima solicitud = null-->
                                <label>Color de tapa</label><br><input type="text" class="form-control" name="colorTapa" value="" /><br>
                                <label>Estado de deterioro</label><br><select name="estadoDeterioro">
                                    <option>Nuevo</option>
                                    <option>Usado</option>
                                    <option>Legible deteriorado</option>
                                    <option>Ilegible deteriorado</option>
                                </select><br>
                                <label>Idioma</label><br><input type="text" class="form-control" name="idioma" value="" /><br>
                                <!--Estante-->
                                <label>Categoria</label><br><select name="categoria">
                                    {{categoria}}
                                </select>

                                

                                

                                







                            </fieldset>
                            <br>

                            <input type="button" value="Cancelar" name="enviar" class="btn btn-danger" />
                            <input type="submit" value="Enviar" name="enviar" class="btn btn-primary" />

                            <br>
                            <br><br><br><br><br><br><br><br>

                        </form>
    </body>
</html>
