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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LibroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression codigo;
	public final StringExpression nombre;
	public final IntegerExpression numeroDePaginas;
	public final StringExpression disponibilidad;
	public final DateExpression fechaDeAdquisicion;
	public final DateExpression fechaDeEdicion;
	public final StringExpression edicion;
	public final StringExpression editor;
	public final IntegerExpression vecesSolicitado;
	public final DateExpression fechaUltimaSolicitud;
	public final StringExpression colorTapa;
	public final StringExpression estadoDeterioro;
	public final StringExpression idioma;
	public final StringExpression idEstanteId;
	public final AssociationExpression idEstante;
	public final StringExpression idCategoriaId;
	public final AssociationExpression idCategoria;
	public final CollectionExpression solicitudLibro;
	public final CollectionExpression entregaDeLibro;
	public final CollectionExpression autores;
	
	public LibroDetachedCriteria() {
		super(modelo.Libro.class, modelo.LibroCriteria.class);
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this.getDetachedCriteria());
		disponibilidad = new StringExpression("disponibilidad", this.getDetachedCriteria());
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaDeEdicion = new DateExpression("fechaDeEdicion", this.getDetachedCriteria());
		edicion = new StringExpression("edicion", this.getDetachedCriteria());
		editor = new StringExpression("editor", this.getDetachedCriteria());
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		colorTapa = new StringExpression("colorTapa", this.getDetachedCriteria());
		estadoDeterioro = new StringExpression("estadoDeterioro", this.getDetachedCriteria());
		idioma = new StringExpression("idioma", this.getDetachedCriteria());
		idEstanteId = new StringExpression("idEstante.idEstante", this.getDetachedCriteria());
		idEstante = new AssociationExpression("idEstante", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public LibroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, modelo.LibroCriteria.class);
		codigo = new StringExpression("codigo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this.getDetachedCriteria());
		disponibilidad = new StringExpression("disponibilidad", this.getDetachedCriteria());
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this.getDetachedCriteria());
		fechaDeEdicion = new DateExpression("fechaDeEdicion", this.getDetachedCriteria());
		edicion = new StringExpression("edicion", this.getDetachedCriteria());
		editor = new StringExpression("editor", this.getDetachedCriteria());
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this.getDetachedCriteria());
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this.getDetachedCriteria());
		colorTapa = new StringExpression("colorTapa", this.getDetachedCriteria());
		estadoDeterioro = new StringExpression("estadoDeterioro", this.getDetachedCriteria());
		idioma = new StringExpression("idioma", this.getDetachedCriteria());
		idEstanteId = new StringExpression("idEstante.idEstante", this.getDetachedCriteria());
		idEstante = new AssociationExpression("idEstante", this.getDetachedCriteria());
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this.getDetachedCriteria());
		idCategoria = new AssociationExpression("idCategoria", this.getDetachedCriteria());
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this.getDetachedCriteria());
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this.getDetachedCriteria());
		autores = new CollectionExpression("ORM_Autores", this.getDetachedCriteria());
	}
	
	public EstanteDetachedCriteria createIdEstanteCriteria() {
		return new EstanteDetachedCriteria(createCriteria("idEstante"));
	}
	
	public CategoriaDetachedCriteria createIdCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("idCategoria"));
	}
	
	public SolicitudLibroDetachedCriteria createSolicitudLibroCriteria() {
		return new SolicitudLibroDetachedCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public EntregaDeLibroDetachedCriteria createEntregaDeLibroCriteria() {
		return new EntregaDeLibroDetachedCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public AutoresDetachedCriteria createAutoresCriteria() {
		return new AutoresDetachedCriteria(createCriteria("ORM_Autores"));
	}
	
	public Libro uniqueLibro(PersistentSession session) {
		return (Libro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Libro[] listLibro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Libro[]) list.toArray(new Libro[list.size()]);
	}
}

