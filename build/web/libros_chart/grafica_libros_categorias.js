// Load the Visualization API and the piechart package.
google.charts.load('current', {'packages': ['corechart']});
// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
    $.ajax({
        url: "http://localhost:8080/Biblioteca/CategoriasLibros",
        dataType: "json",
        success: function (jsonData) {
            var data = new google.visualization.DataTable();
            // assumes "word" is a string and "count" is a number
            data.addColumn('string', 'word');
            data.addColumn('number', 'Disponibilidad');

            var total = 0;
            for (var i = 0; i < jsonData.length; i++) {
                data.addRow([jsonData[i].nombre, jsonData[i].cantidadCategoria]);
                total+=jsonData[i].cantidadCategoria;
            }

            var options = {
                title: 'Cantidad de libros por categoría, total: '+total,
                'width': 800,
                'height': 500,
                chartArea: {left: "50%"},
                is3D: true
            };

            options.backgroundColor = 'transparent';

            var chart = new google.visualization.PieChart(document.getElementById('lib3_div'));
            chart.draw(data, options);
        }
    });
}