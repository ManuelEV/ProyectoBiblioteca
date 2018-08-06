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

public class Ciudad {
	public Ciudad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CIUDAD_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == ORMConstants.KEY_CIUDAD_BIBLIOTECA) {
			return ORM_biblioteca;
		}
		else if (key == ORMConstants.KEY_CIUDAD_FUNCIONARIO) {
			return ORM_funcionario;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CIUDAD_IDPAIS) {
			this.idPais = (modelo.Pais) owner;
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
	
	private modelo.Pais idPais;
	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	private java.util.Set ORM_biblioteca = new java.util.HashSet();
	
	private java.util.Set ORM_funcionario = new java.util.HashSet();
	
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
	
	public void setIdPais(modelo.Pais value) {
		if (idPais != null) {
			idPais.ciudad.remove(this);
		}
		if (value != null) {
			value.ciudad.add(this);
		}
	}
	
	public modelo.Pais getIdPais() {
		return idPais;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdPais(modelo.Pais value) {
		this.idPais = value;
	}
	
	private modelo.Pais getORM_IdPais() {
		return idPais;
	}
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	public final modelo.ClienteSetCollection cliente = new modelo.ClienteSetCollection(this, _ormAdapter, ORMConstants.KEY_CIUDAD_CLIENTE, ORMConstants.KEY_CLIENTE_IDCIUDAD, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Biblioteca(java.util.Set value) {
		this.ORM_biblioteca = value;
	}
	
	private java.util.Set getORM_Biblioteca() {
		return ORM_biblioteca;
	}
	
	public final modelo.BibliotecaSetCollection biblioteca = new modelo.BibliotecaSetCollection(this, _ormAdapter, ORMConstants.KEY_CIUDAD_BIBLIOTECA, ORMConstants.KEY_BIBLIOTECA_IDCIUDAD, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Funcionario(java.util.Set value) {
		this.ORM_funcionario = value;
	}
	
	private java.util.Set getORM_Funcionario() {
		return ORM_funcionario;
	}
	
	public final modelo.FuncionarioSetCollection funcionario = new modelo.FuncionarioSetCollection(this, _ormAdapter, ORMConstants.KEY_CIUDAD_FUNCIONARIO, ORMConstants.KEY_FUNCIONARIO_IDCIUDAD, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
