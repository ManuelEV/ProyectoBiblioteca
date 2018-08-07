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

import java.io.Serializable;
public class ClienteDeBiblioteca implements Serializable {
	public ClienteDeBiblioteca() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof ClienteDeBiblioteca))
			return false;
		ClienteDeBiblioteca clientedebiblioteca = (ClienteDeBiblioteca)aObj;
		if (getId() != clientedebiblioteca.getId())
			return false;
		if (getBibliotecaidBiblioteca() == null) {
			if (clientedebiblioteca.getBibliotecaidBiblioteca() != null)
				return false;
		}
		else if (!getBibliotecaidBiblioteca().equals(clientedebiblioteca.getBibliotecaidBiblioteca()))
			return false;
		if (getCliente() == null) {
			if (clientedebiblioteca.getCliente() != null)
				return false;
		}
		else if (!getCliente().equals(clientedebiblioteca.getCliente()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		if (getBibliotecaidBiblioteca() != null) {
			hashcode = hashcode + (int) getBibliotecaidBiblioteca().getORMID();
		}
		if (getCliente() != null) {
			hashcode = hashcode + (int) getCliente().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CLIENTEDEBIBLIOTECA_CLIENTE) {
			this.cliente = (modelo.Cliente) owner;
		}
		
		else if (key == ORMConstants.KEY_CLIENTEDEBIBLIOTECA_BIBLIOTECAIDBIBLIOTECA) {
			this.bibliotecaidBiblioteca = (modelo.Biblioteca) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private modelo.Biblioteca bibliotecaidBiblioteca;
	
	private int bibliotecaidBibliotecaId;
	
	private void setBibliotecaidBibliotecaId(int value) {
		this.bibliotecaidBibliotecaId = value;
	}
	
	public int getBibliotecaidBibliotecaId() {
		return bibliotecaidBibliotecaId;
	}
	
	private modelo.Cliente cliente;
	
	private int clienteId;
	
	private void setClienteId(int value) {
		this.clienteId = value;
	}
	
	public int getClienteId() {
		return clienteId;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCliente(modelo.Cliente value) {
		if (cliente != null) {
			cliente.clienteDeBiblioteca.remove(this);
		}
		if (value != null) {
			value.clienteDeBiblioteca.add(this);
		}
	}
	
	public modelo.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(modelo.Cliente value) {
		this.cliente = value;
	}
	
	private modelo.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public void setBibliotecaidBiblioteca(modelo.Biblioteca value) {
		if (bibliotecaidBiblioteca != null) {
			bibliotecaidBiblioteca.clienteDeBiblioteca.remove(this);
		}
		if (value != null) {
			value.clienteDeBiblioteca.add(this);
		}
	}
	
	public modelo.Biblioteca getBibliotecaidBiblioteca() {
		return bibliotecaidBiblioteca;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_BibliotecaidBiblioteca(modelo.Biblioteca value) {
		this.bibliotecaidBiblioteca = value;
	}
	
	private modelo.Biblioteca getORM_BibliotecaidBiblioteca() {
		return bibliotecaidBiblioteca;
	}
	
	public String toString() {
		return String.valueOf(getId() + " " + ((getBibliotecaidBiblioteca() == null) ? "" : String.valueOf(getBibliotecaidBiblioteca().getORMID())) + " " + ((getCliente() == null) ? "" : String.valueOf(getCliente().getORMID())));
	}
	
}
