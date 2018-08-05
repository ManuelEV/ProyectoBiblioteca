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



        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<!--        <script type="text/javascript" src="js/grafica_usuarios.js"></script>-->


        <script type="text/javascript" src="libros_chart/grafica_libros.js"></script>
        <script type="text/javascript" src="libros_chart/grafica_libros_disponibilidad.js"></script>
        <script type="text/javascript" src="libros_chart/grafica_libros_categorias.js"></script>
        <script type="text/javascript" src="libros_chart/grafica_libros_lista.js"></script>

    </head>

    <body style="background: linear-gradient(-90deg, #00ff99, #00e6e6)">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li ><a href="/Biblioteca/principal">Principal</a></li>
                    <li class="active"><a href="#">Catálogo</a></li>
                    <li ><a href="/Biblioteca/credencial">Credencial</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li ><a href="/Biblioteca/perfil"><span class="glyphicon glyphicon-user"></span> Mi perfil</a></li>
                    <li><a href="./index.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>

            </div>
        </nav>


        <br/>

        <div class="jumbotron">
            <h1>Estadísticas</h1> 
        </div>

        <div style="border: 2px solid #404040; background-color: #fff">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner">
                    <div class="item active">
                        <div id="lib_div"></div>
                    </div>

                    <div class="item">
                        <div id="lib2_div"></div>
                    </div>

                    <div class="item">
                        <div id="lib3_div"></div>
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>

        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>


        <div class="jumbotron">
            <h1>Búsqueda de libros</h1> 
            <p>Haz tu reserva aquí</p> 
        </div>


        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">

                    <form id="formulario" method="post" action="Busqueda">
                        <fieldset>

                            <label>Nombre</label><br><input type="text" class="form-control" name="nombre" value="" /><br>
                            <label>Categoría</label><br><select name="categoria">
                                <option>Accion</option>
                                <option>Romance</option>
                                <option>Historia</option>
                                <option>Leyenda</option>
                                <option>Fisica</option>
                                <option>Quimica</option>
                                <option>Biologia</option>
                                <option>Programacion</option>
                                <option>Seguridad Informatica</option>
                                <option>Sistemas operativos</option>
                                <option>Novela policiaca</option>
                                <option>Filosofia</option>
                            </select><br>
                            

                            <label>Idioma</label><br><select name="idioma">
                                <option>Español</option>
                                <option>Ingles</option>
                                <option>Frances</option>
                            </select><br>

                            

                        </fieldset>
                        <br>

                        <!-- <input type="button" value="Cancelar" name="enviar" class="btn btn-danger" /> -->
                        <input type="submit" value="Buscar" name="buscar" class="btn btn-primary" />

                        <br>
                        

                    </form> 
                </div>
            </div>
        </div>


        <br/><br/><br/><br/>

        <div class="jumbotron">
            <h1>Lista completa de libros</h1> 
            <p>Reporte de todos los libros que se pueden encontrar en esta biblioteca</p> 
        </div>

        <br/><br/><br/>


        <div id="lib4_div"></div>


        <!--        <form action="UserCharts" target="_black">
                    <input type="submit" value="Ver grafico" style="font-family: Arial; background: aqua; font-size: 20pt"/>
                </form>-->

        <!--        <div id="chart_div"></div>-->


        <br/>


    </body>

</html>