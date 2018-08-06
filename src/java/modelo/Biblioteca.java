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

public class Biblioteca {
	public Biblioteca() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BIBLIOTECA_ESTANTE) {
			return ORM_estante;
		}
		else if (key == ORMConstants.KEY_BIBLIOTECA_COMPUTADOR) {
			return ORM_computador;
		}
		else if (key == ORMConstants.KEY_BIBLIOTECA_SALADELECTURA) {
			return ORM_salaDeLectura;
		}
		else if (key == ORMConstants.KEY_BIBLIOTECA_CLIENTEDEBIBLIOTECA) {
			return ORM_clienteDeBiblioteca;
		}
		else if (key == ORMConstants.KEY_BIBLIOTECA_FUNCIONARIO) {
			return ORM_funcionario;
		}
		else if (key == ORMConstants.KEY_BIBLIOTECA_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BIBLIOTECA_IDCIUDAD) {
			this.idCiudad = (modelo.Ciudad) owner;
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
	
	private String direccion;
	
	private String propietario;
	
	private Integer numeroDeTelefono;
	
	private String correoElectronico;
	
	private modelo.Ciudad idCiudad;
	
	private java.util.Set ORM_estante = new java.util.HashSet();
	
	private java.util.Set ORM_computador = new java.util.HashSet();
	
	private java.util.Set ORM_salaDeLectura = new java.util.HashSet();
	
	private java.util.Set ORM_clienteDeBiblioteca = new java.util.HashSet();
	
	private java.util.Set ORM_funcionario = new java.util.HashSet();
	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setPropietario(String value) {
		this.propietario = value;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setNumeroDeTelefono(int value) {
		setNumeroDeTelefono(new Integer(value));
	}
	
	public void setNumeroDeTelefono(Integer value) {
		this.numeroDeTelefono = value;
	}
	
	public Integer getNumeroDeTelefono() {
		return numeroDeTelefono;
	}
	
	public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setIdCiudad(modelo.Ciudad value) {
		if (idCiudad != null) {
			idCiudad.biblioteca.remove(this);
		}
		if (value != null) {
			value.biblioteca.add(this);
		}
	}
	
	public modelo.Ciudad getIdCiudad() {
		return idCiudad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdCiudad(modelo.Ciudad value) {
		this.idCiudad = value;
	}
	
	private modelo.Ciudad getORM_IdCiudad() {
		return idCiudad;
	}
	
	private void setORM_Estante(java.util.Set value) {
		this.ORM_estante = value;
	}
	
	private java.util.Set getORM_Estante() {
		return ORM_estante;
	}
	
	public final modelo.EstanteSetCollection estante = new modelo.EstanteSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_ESTANTE, ORMConstants.KEY_ESTANTE_IDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Computador(java.util.Set value) {
		this.ORM_computador = value;
	}
	
	private java.util.Set getORM_Computador() {
		return ORM_computador;
	}
	
	public final modelo.ComputadorSetCollection computador = new modelo.ComputadorSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_COMPUTADOR, ORMConstants.KEY_COMPUTADOR_IDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_SalaDeLectura(java.util.Set value) {
		this.ORM_salaDeLectura = value;
	}
	
	private java.util.Set getORM_SalaDeLectura() {
		return ORM_salaDeLectura;
	}
	
	public final modelo.SalaDeLecturaSetCollection salaDeLectura = new modelo.SalaDeLecturaSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_SALADELECTURA, ORMConstants.KEY_SALADELECTURA_IDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ClienteDeBiblioteca(java.util.Set value) {
		this.ORM_clienteDeBiblioteca = value;
	}
	
	private java.util.Set getORM_ClienteDeBiblioteca() {
		return ORM_clienteDeBiblioteca;
	}
	
	public final modelo.ClienteDeBibliotecaSetCollection clienteDeBiblioteca = new modelo.ClienteDeBibliotecaSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_CLIENTEDEBIBLIOTECA, ORMConstants.KEY_CLIENTEDEBIBLIOTECA_BIBLIOTECAIDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Funcionario(java.util.Set value) {
		this.ORM_funcionario = value;
	}
	
	private java.util.Set getORM_Funcionario() {
		return ORM_funcionario;
	}
	
	public final modelo.FuncionarioSetCollection funcionario = new modelo.FuncionarioSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_FUNCIONARIO, ORMConstants.KEY_FUNCIONARIO_IDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	public final modelo.UsuarioSetCollection usuario = new modelo.UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_BIBLIOTECA_USUARIO, ORMConstants.KEY_USUARIO_IDBIBLIOTECA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
