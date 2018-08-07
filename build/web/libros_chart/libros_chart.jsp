<%-- 
    Document   : libros_chart
    Created on : 01-08-2018, 21:20:28
    Author     : Manuel
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

        <script type="text/javascript" src="grafica_libros.js"></script>
        <script type="text/javascript" src="grafica_libros_disponibilidad.js"></script>
        <script type="text/javascript" src="grafica_libros_categorias.js"></script>
        <script type="text/javascript" src="grafica_libros_lista.js"></script>
    </head>

    <body style="background: linear-gradient(-90deg, #ffb366, #d9ff66)">

        <br><br><br><br><br>

        <div style="border: 3px solid #404040; background-color: #ffeb99">
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

        <!--        <div id="lib_div"></div>
        
                <div id="lib2_div"></div>
        
                <div id="lib3_div"></div>-->


                <div id="lib4_div"></div>



        <br/>


    </body>

</html>
