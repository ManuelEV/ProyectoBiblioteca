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
                    url: "http://localhost:8080/Biblioteca/DisponibilidadLibros",
                    dataType: "json",
                    success: function (jsonData) {
                        var data = new google.visualization.DataTable();
                        // assumes "word" is a string and "count" is a number
                        data.addColumn('string', 'word');
                        data.addColumn('number', 'Disponibilidad');

                        for (var i = 0; i < jsonData.length; i++) {
                            data.addRow([jsonData[i].nombre, jsonData[i].cantidadDisp]);
                        }

                        var options = {
                            title: 'Disponibilidad de libros',
                            'width': 800,
                            'height': 500,
                            chartArea : { left: "50%" },
                            //colors: ['#66ffcc', '#66ffcc'],
                            is3D: true
                        };
                        
                        options.backgroundColor = 'transparent';
                        
                        var chart = new google.visualization.PieChart(document.getElementById('lib2_div'));
                        chart.draw(data, options);
                    }
                });
            }