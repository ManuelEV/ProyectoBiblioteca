/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

/**
 *
 * @author Manuel
 */
public class ClienteInfo {
    
    private String id, run, nombre, apellidos, genero, fechaNacimiento, areaInteres;
    private int cantidadHombres;
    private int cantidadMujeres;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAreaInteres() {
        return areaInteres;
    }

    public void setAreaInteres(String areaInteres) {
        this.areaInteres = areaInteres;
    }

    public int getCantidadHombres() {
        return cantidadHombres;
    }

    public void setCantidadHombres(int cantidadHombres) {
        this.cantidadHombres = cantidadHombres;
    }

    public int getCantidadMujeres() {
        return cantidadMujeres;
    }

    public void setCantidadMujeres(int cantidadMujeres) {
        this.cantidadMujeres = cantidadMujeres;
    }
    
    
    
}
