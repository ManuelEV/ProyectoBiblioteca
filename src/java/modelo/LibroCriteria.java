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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LibroCriteria extends AbstractORMCriteria {
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
	
	public LibroCriteria(Criteria criteria) {
		super(criteria);
		codigo = new StringExpression("codigo", this);
		nombre = new StringExpression("nombre", this);
		numeroDePaginas = new IntegerExpression("numeroDePaginas", this);
		disponibilidad = new StringExpression("disponibilidad", this);
		fechaDeAdquisicion = new DateExpression("fechaDeAdquisicion", this);
		fechaDeEdicion = new DateExpression("fechaDeEdicion", this);
		edicion = new StringExpression("edicion", this);
		editor = new StringExpression("editor", this);
		vecesSolicitado = new IntegerExpression("vecesSolicitado", this);
		fechaUltimaSolicitud = new DateExpression("fechaUltimaSolicitud", this);
		colorTapa = new StringExpression("colorTapa", this);
		estadoDeterioro = new StringExpression("estadoDeterioro", this);
		idioma = new StringExpression("idioma", this);
		idEstanteId = new StringExpression("idEstante.idEstante", this);
		idEstante = new AssociationExpression("idEstante", this);
		idCategoriaId = new StringExpression("idCategoria.idCategoria", this);
		idCategoria = new AssociationExpression("idCategoria", this);
		solicitudLibro = new CollectionExpression("ORM_SolicitudLibro", this);
		entregaDeLibro = new CollectionExpression("ORM_EntregaDeLibro", this);
		autores = new CollectionExpression("ORM_Autores", this);
	}
	
	public LibroCriteria(PersistentSession session) {
		this(session.createCriteria(Libro.class));
	}
	
	public LibroCriteria() throws PersistentException {
		this(ProyectoprogramacionavanzadaPersistentManager.instance().getSession());
	}
	
	public EstanteCriteria createIdEstanteCriteria() {
		return new EstanteCriteria(createCriteria("idEstante"));
	}
	
	public CategoriaCriteria createIdCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("idCategoria"));
	}
	
	public SolicitudLibroCriteria createSolicitudLibroCriteria() {
		return new SolicitudLibroCriteria(createCriteria("ORM_SolicitudLibro"));
	}
	
	public EntregaDeLibroCriteria createEntregaDeLibroCriteria() {
		return new EntregaDeLibroCriteria(createCriteria("ORM_EntregaDeLibro"));
	}
	
	public AutoresCriteria createAutoresCriteria() {
		return new AutoresCriteria(createCriteria("ORM_Autores"));
	}
	
	public Libro uniqueLibro() {
		return (Libro) super.uniqueResult();
	}
	
	public Libro[] listLibro() {
		java.util.List list = super.list();
		return (Libro[]) list.toArray(new Libro[list.size()]);
	}
}

