// Load the Visualization API and the piechart package.
google.charts.load('current', {'packages': ['table']});
// Set a callback to run when the Google Visualization API is loaded.
google.charts.setOnLoadCallback(drawChart);
function drawChart() {
    $.ajax({
        url: "http://localhost:8080/Biblioteca/ClientesDataList",
        dataType: "json",
        success: function (jsonData) {
            var data = new google.visualization.DataTable();
            // assumes "word" is a string and "count" is a number
            data.addColumn('string', 'ID');
            data.addColumn('string', 'Rut');
            data.addColumn('string', 'Nombre');
            data.addColumn('string', 'Apellidos');
            data.addColumn('string', 'Género');
            data.addColumn('string', 'Fecha Nacimiento');
            data.addColumn('string', 'Área de Interés');
            
            
            

            var total = 0;
            for (var i = 0; i < jsonData.length; i++) {
                data.addRow([jsonData[i].id,jsonData[i].run,jsonData[i].nombre, jsonData[i].apellidos,jsonData[i].genero,jsonData[i].fechaNacimiento, 
                    jsonData[i].areaInteres]);
                
            }

            var options = {
                title: 'Cantidad de libros por categoría, total: ',
                'width': 1300,
                'height': 500,
                chartArea: {left: "50%"},
                is3D: true
            };

            options.backgroundColor = 'transparent';

            var chart = new google.visualization.Table(document.getElementById('lista_clientes'));
            chart.draw(data, options);
        }
    });
}
