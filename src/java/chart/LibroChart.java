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

    /**
     *
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     *
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     *
     * @return
     */
    public String getCodigoLibro() {
        return codigoLibro;
    }

    /**
     *
     * @param codigoLibro
     */
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    /**
     *
     * @return
     */
    public String getEditor() {
        return editor;
    }

    /**
     *
     * @param editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     *
     * @return
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     *
     * @param edicion
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    /**
     *
     * @return
     */
    public int getCantidadCategoria() {
        return cantidadCategoria;
    }

    /**
     *
     * @param cantidadCategoria
     */
    public void setCantidadCategoria(int cantidadCategoria) {
        this.cantidadCategoria = cantidadCategoria;
    }

    /**
     *
     * @return
     */
    public int getCantidadDisp() {
        return cantidadDisp;
    }

    /**
     *
     * @param cantidadDisp
     */
    public void setCantidadDisp(int cantidadDisp) {
        this.cantidadDisp = cantidadDisp;
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
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    /**
     *
     * @param disponibilidad
     */
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     *
     * @return
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     *
     * @param idioma
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     *
     * @return
     */
    public int getVecesSolicitado() {
        return vecesSolicitado;
    }

    /**
     *
     * @param vecesSolicitado
     */
    public void setVecesSolicitado(int vecesSolicitado) {
        this.vecesSolicitado = vecesSolicitado;
    }
    
    
    
}
