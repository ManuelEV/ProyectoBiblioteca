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
public class LibroChart {
    private String nombre;
    private Boolean disponibilidad;
    private String idioma;
    private String editor;
    private String edicion;
    private String autor;
    private String codigoLibro;
    
    private int vecesSolicitado;
    private int cantidadCategoria;
    
    private int cantidadDisp;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    
    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    
    

    public int getCantidadCategoria() {
        return cantidadCategoria;
    }

    public void setCantidadCategoria(int cantidadCategoria) {
        this.cantidadCategoria = cantidadCategoria;
    }

    
    
    
    public int getCantidadDisp() {
        return cantidadDisp;
    }

    public void setCantidadDisp(int cantidadDisp) {
        this.cantidadDisp = cantidadDisp;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVecesSolicitado() {
        return vecesSolicitado;
    }

    public void setVecesSolicitado(int vecesSolicitado) {
        this.vecesSolicitado = vecesSolicitado;
    }
    
    
    
}
