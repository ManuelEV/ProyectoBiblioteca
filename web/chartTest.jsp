<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <!--Load the AJAX API-->
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
       <!-- <script type="text/javascript">

            // Load the Visualization API and the piechart package.
            google.charts.load('current', {'packages': ['corechart']});
            // Set a callback to run when the Google Visualization API is loaded.
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {
                $.ajax({
                    url: "GrafUser",
                    dataType: "json",
                    success: function (jsonData) {
                        var data = new google.visualization.DataTable();
                        // assumes "word" is a string and "count" is a number
                        data.addColumn('string', 'word');
                        data.addColumn('number', 'count');

                        for (var i = 0; i < jsonData.length; i++) {
                            data.addRow([jsonData[i].nombre, jsonData[i].diasDeAtraso]);
                        }

                        var options = {
                            title: 'Usuarios que deben libros',
                            'width': 800,
                            'height': 500,
                            is3D: true
                        };
                        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
                        chart.draw(data, options);
                    }
                });
            }

        </script>-->
    </head>

    <body>
        <!--Div that will hold the pie chart-->
        <div id="chart_div"></div>-->
    </body>
</html>
