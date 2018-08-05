// Load the Visualization API and the piechart package.
google.charts.load('current', {'packages': ['table']});
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
            data.addColumn('string', 'Autor');
            data.addColumn('string', 'Idioma');
            data.addColumn('string', 'Edición');
            data.addColumn('string', 'Editor');
            data.addColumn('boolean', 'Disponibilidad');

            var total = 0;
            for (var i = 0; i < jsonData.length; i++) {
                data.addRow([jsonData[i].nombre,jsonData[i].autor, jsonData[i].idioma,jsonData[i].edicion,jsonData[i].editor, jsonData[i].disponibilidad]);
                total+=jsonData[i].cantidadCategoria;
            }

            var options = {
                title: 'Cantidad de libros por categoría, total: '+total,
                'width': 1200,
                'height': 500,
                chartArea: {left: "50%"},
                is3D: true
            };

            options.backgroundColor = 'transparent';

            var chart = new google.visualization.Table(document.getElementById('lib4_div'));
            chart.draw(data, options);
        }
    });
}