/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package modelo;

/**
 *
 * @author Manuel
 */
public class Libro {

    /**
     *
     */
    public Libro() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LIBRO_SOLICITUDLIBRO) {
			return ORM_solicitudLibro;
		}
		else if (key == ORMConstants.KEY_LIBRO_ENTREGADELIBRO) {
			return ORM_entregaDeLibro;
		}
		else if (key == ORMConstants.KEY_LIBRO_AUTORES) {
			return ORM_autores;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LIBRO_IDESTANTE) {
			this.idEstante = (modelo.Estante) owner;
		}
		
		else if (key == ORMConstants.KEY_LIBRO_IDCATEGORIA) {
			this.idCategoria = (modelo.Categoria) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String nombre;
	
	private int numeroDePaginas;
	
	private String disponibilidad;
	
	private java.util.Date fechaDeAdquisicion;
	
	private java.util.Date fechaDeEdicion;
	
	private String edicion;
	
	private String editor;
	
	private int vecesSolicitado;
	
	private java.util.Date fechaUltimaSolicitud;
	
	private String colorTapa;
	
	private String estadoDeterioro;
	
	private String idioma;
	
	private modelo.Estante idEstante;
	
	private modelo.Categoria idCategoria;
	
	private java.util.Set ORM_solicitudLibro = new java.util.HashSet();
	
	private java.util.Set ORM_entregaDeLibro = new java.util.HashSet();
	
	private java.util.Set ORM_autores = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
    /**
     *
     * @return
     */
    public int getId() {
		return id;
	}
	
    /**
     *
     * @return
     */
    public int getORMID() {
		return getId();
	}
	
    /**
     *
     * @param value
     */
    public void setNombre(String value) {
		this.nombre = value;
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
     * @param value
     */
    public void setNumeroDePaginas(int value) {
		this.numeroDePaginas = value;
	}
	
    /**
     *
     * @return
     */
    public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	
    /**
     *
     * @param value
     */
    public void setDisponibilidad(String value) {
		this.disponibilidad = value;
	}
	
    /**
     *
     * @return
     */
    public String getDisponibilidad() {
		return disponibilidad;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaDeAdquisicion(java.util.Date value) {
		this.fechaDeAdquisicion = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeAdquisicion() {
		return fechaDeAdquisicion;
	}
	
    /**
     *
     * @param value
     */
    public void setFechaDeEdicion(java.util.Date value) {
		this.fechaDeEdicion = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaDeEdicion() {
		return fechaDeEdicion;
	}
	
    /**
     *
     * @param value
     */
    public void setEdicion(String value) {
		this.edicion = value;
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
     * @param value
     */
    public void setEditor(String value) {
		this.editor = value;
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
     * @param value
     */
    public void setVecesSolicitado(int value) {
		this.vecesSolicitado = value;
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
     * @param value
     */
    public void setFechaUltimaSolicitud(java.util.Date value) {
		this.fechaUltimaSolicitud = value;
	}
	
    /**
     *
     * @return
     */
    public java.util.Date getFechaUltimaSolicitud() {
		return fechaUltimaSolicitud;
	}
	
    /**
     *
     * @param value
     */
    public void setColorTapa(String value) {
		this.colorTapa = value;
	}
	
    /**
     *
     * @return
     */
    public String getColorTapa() {
		return colorTapa;
	}
	
    /**
     *
     * @param value
     */
    public void setEstadoDeterioro(String value) {
		this.estadoDeterioro = value;
	}
	
    /**
     *
     * @return
     */
    public String getEstadoDeterioro() {
		return estadoDeterioro;
	}
	
    /**
     *
     * @param value
     */
    public void setIdioma(String value) {
		this.idioma = value;
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
     * @param value
     */
    public void setIdEstante(modelo.Estante value) {
		if (idEstante != null) {
			idEstante.libro.remove(this);
		}
		if (value != null) {
			value.libro.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Estante getIdEstante() {
		return idEstante;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdEstante(modelo.Estante value) {
		this.idEstante = value;
	}
	
	private modelo.Estante getORM_IdEstante() {
		return idEstante;
	}
	
    /**
     *
     * @param value
     */
    public void setIdCategoria(modelo.Categoria value) {
		if (idCategoria != null) {
			idCategoria.libro.remove(this);
		}
		if (value != null) {
			value.libro.add(this);
		}
	}
	
    /**
     *
     * @return
     */
    public modelo.Categoria getIdCategoria() {
		return idCategoria;
	}
	
	/**
	 * This method is for internal use only.
     * @param value
	 */
	public void setORM_IdCategoria(modelo.Categoria value) {
		this.idCategoria = value;
	}
	
	private modelo.Categoria getORM_IdCategoria() {
		return idCategoria;
	}
	
	private void setORM_SolicitudLibro(java.util.Set value) {
		this.ORM_solicitudLibro = value;
	}
	
	private java.util.Set getORM_SolicitudLibro() {
		return ORM_solicitudLibro;
	}
	
    /**
     *
     */
    public final modelo.SolicitudLibroSetCollection solicitudLibro = new modelo.SolicitudLibroSetCollection(this, _ormAdapter, ORMConstants.KEY_LIBRO_SOLICITUDLIBRO, ORMConstants.KEY_SOLICITUDLIBRO_CODIGOLIBRO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_EntregaDeLibro(java.util.Set value) {
		this.ORM_entregaDeLibro = value;
	}
	
	private java.util.Set getORM_EntregaDeLibro() {
		return ORM_entregaDeLibro;
	}
	
    /**
     *
     */
    public final modelo.EntregaDeLibroSetCollection entregaDeLibro = new modelo.EntregaDeLibroSetCollection(this, _ormAdapter, ORMConstants.KEY_LIBRO_ENTREGADELIBRO, ORMConstants.KEY_ENTREGADELIBRO_LIBROCODIGO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Autores(java.util.Set value) {
		this.ORM_autores = value;
	}
	
	private java.util.Set getORM_Autores() {
		return ORM_autores;
	}
	
    /**
     *
     */
    public final modelo.AutoresSetCollection autores = new modelo.AutoresSetCollection(this, _ormAdapter, ORMConstants.KEY_LIBRO_AUTORES, ORMConstants.KEY_AUTORES_IDLIBRO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
