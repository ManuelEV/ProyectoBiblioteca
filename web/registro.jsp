<%-- 
    Document   : registro
    Created on : 28-07-2018, 12:08:00
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


        <link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />

        <!-- Bootstrap Date-Picker Plugin -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>




        <title>Registrarse</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Biblioteca</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="./index.html">Home</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="./index.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
            </div>
        </nav>
        
        

        <div class="bootstrap-iso" style="background: linear-gradient(-90deg, #ffcc00, #ff6600);">
            <br><br><br><br>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4">

                        <form id="formulario" method="post" action="Registro">
                            <fieldset>

                                <label>Rut</label><br><input type="text" class="form-control" name="rut" value="" /><br>
                                <label>Correo electrónico</label><br><input type="text" class="form-control" name="correo" value="" /><br>
                                <label>Password</label><br><input type="password" class="form-control" name="password" value="" /><br>
                                <label>Primer nombre</label><br><input type="text" class="form-control" name="nombre" value="" /><br>
                                <label>Primer Apellido</label><br><input type="text" class="form-control" name="primerApellido" value="" /><br>
                                <label>Segundo Apellido</label><br><input type="text" class="form-control" name="segundoApellido" value="" /><br>
                                <label>Estado de trabajo</label><br><input type="text" class="form-control" name="estadoTrabajo" value="" /><br>
                                <label>Área de interés</label><br><input type="text" class="form-control" name="areaInteres" value="" /><br>
                                
                                <label>Teléfono</label><br><input type="text" class="form-control" name="telefono" value="" /><br>
                                <label>Celular</label><br><input type="text" class="form-control" name="celular" value="" /><br>
                                
                                <!-- ESTO PODRIAMOS DEJARLO COMO 0 POR DEFECTO DIRECTAMENTE EN EL CONTROLADOR(SERVLET)-->
                                <label>Días de atraso</label><br><input type="text" class="form-control" name="diasAtraso" value="" /><br>
                                

                                <label class="control-label" for="date">Fecha de nacimiento</label>
                                <input class="form-control" id="date" name="date" placeholder="YYY/MM/DD" type="text"/><br>

                                <label>Género</label><br><select name="genero">
                                    <option>Masculino</option>
                                    <option>Femenino</option>
                                </select><br>
                                
                                <label>Ciudad</label><br><select name="ciudad">
                                    <option>Temuco</option>
                                    <option>Santiago</option>
                                    <option>Buenos Aires</option>
                                    <option>Bariloche</option>
                                    <option>New York</option>
                                </select><br>

                            </fieldset>
                            <br>

                            <input type="button" value="Cancelar" name="enviar" class="btn btn-danger" />
                            <input type="submit" value="Enviar" name="enviar" class="btn btn-primary" />
                            
                            <br>
                            <br><br><br><br><br><br><br><br>

                        </form> 
                    </div>
                </div>
            </div>
        </div> 
    </body>

    <script>
        $(document).ready(function () {
            var date_input = $('input[name="date"]'); //our date input has the name "date"
            var container = $('.bootstrap-iso form').length > 0 ? $('.bootstrap-iso form').parent() : "body";
            var options = {
                format: 'yyyy/mm/dd',
                container: container,
                todayHighlight: true,
                autoclose: true,
            };
            date_input.datepicker(options);
        })
    </script>

</html>
