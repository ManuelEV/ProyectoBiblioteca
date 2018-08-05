/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Load the Visualization API and the piechart package.
google.charts.load('current', {'packages': ['corechart']});
// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
    $.ajax({
        url: "http://localhost:8080/Biblioteca/LibroData",
        dataType: "json",
        success: function (jsonData) {
            var data = new google.visualization.DataTable();
            // assumes "word" is a string and "count" is a number
            data.addColumn('string', 'Nombre');
            data.addColumn('number', 'Veces pedido');

            for (var i = 0; i < jsonData.length; i++) {
                if (jsonData[i].vecesSolicitado > 82)
                    data.addRow([jsonData[i].nombre, jsonData[i].vecesSolicitado]);
            }

            var options = {
                title: 'Libros más populares',
                'width': 1000,
                'height': 500,
                chartArea: {left: "60%"},
                //pieHole: 0.4,
                is3D: true
            };

            options.backgroundColor = 'transparent';

            var chart = new google.visualization.BarChart(document.getElementById('lib_div'));
            chart.draw(data, options);
        }
    });
}