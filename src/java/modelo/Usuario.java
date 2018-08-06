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

public class Usuario {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_CLIENTE1) {
			return ORM_cliente1;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_IDBIBLIOTECA) {
			this.idBiblioteca = (modelo.Biblioteca) owner;
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
	
	private String correo;
	
	private String usuario;
	
	private String tipoUsuario;
	
	private String contraseña;
	
	private modelo.Biblioteca idBiblioteca;
	
	private java.util.Set ORM_cliente1 = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setTipoUsuario(String value) {
		this.tipoUsuario = value;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setIdBiblioteca(modelo.Biblioteca value) {
		if (idBiblioteca != null) {
			idBiblioteca.usuario.remove(this);
		}
		if (value != null) {
			value.usuario.add(this);
		}
	}
	
	public modelo.Biblioteca getIdBiblioteca() {
		return idBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_IdBiblioteca(modelo.Biblioteca value) {
		this.idBiblioteca = value;
	}
	
	private modelo.Biblioteca getORM_IdBiblioteca() {
		return idBiblioteca;
	}
	
	private void setORM_Cliente1(java.util.Set value) {
		this.ORM_cliente1 = value;
	}
	
	private java.util.Set getORM_Cliente1() {
		return ORM_cliente1;
	}
	
	public final modelo.ClienteSetCollection cliente1 = new modelo.ClienteSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_CLIENTE1, ORMConstants.KEY_CLIENTE_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
