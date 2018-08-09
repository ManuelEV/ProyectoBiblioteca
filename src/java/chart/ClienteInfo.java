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

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getRun() {
        return run;
    }

    /**
     *
     * @param run
     */
    public void setRun(String run) {
        this.run = run;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     *
     * @return
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     *
     * @return
     */
    public String getAreaInteres() {
        return areaInteres;
    }

    /**
     *
     * @param areaInteres
     */
    public void setAreaInteres(String areaInteres) {
        this.areaInteres = areaInteres;
    }

    /**
     *
     * @return
     */
    public int getCantidadHombres() {
        return cantidadHombres;
    }

    /**
     *
     * @param cantidadHombres
     */
    public void setCantidadHombres(int cantidadHombres) {
        this.cantidadHombres = cantidadHombres;
    }

    /**
     *
     * @return
     */
    public int getCantidadMujeres() {
        return cantidadMujeres;
    }

    /**
     *
     * @param cantidadMujeres
     */
    public void setCantidadMujeres(int cantidadMujeres) {
        this.cantidadMujeres = cantidadMujeres;
    }
    
    
    
}
