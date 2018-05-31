package org.primefaces.ultima.view.test;

public class Usuario {
	
	private int id;
	private String nomUsuario;
	private String email;
	private String contrasena;
	
	public Usuario() {}

	public Usuario(int id, String nomUsuario, String email, String contrasena) {
		super();
		this.id = id;
		this.nomUsuario = nomUsuario;
		this.email = email;
		this.contrasena = contrasena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
