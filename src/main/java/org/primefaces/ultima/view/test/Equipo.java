package org.primefaces.ultima.view.test;

public class Equipo {
		
	private int id;
	private String nombre;
	private String directorTecnico;
	private String fotoEscudo;
	
	public Equipo() {}

	public Equipo(int id, String nombre, String directorTecnico, String fotoEscudo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.directorTecnico = directorTecnico;
		this.fotoEscudo = fotoEscudo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirectorTecnico() {
		return directorTecnico;
	}

	public void setDirectorTecnico(String directorTecnico) {
		this.directorTecnico = directorTecnico;
	}

	public String getFotoEscudo() {
		return fotoEscudo;
	}

	public void setFotoEscudo(String fotoEscudo) {
		this.fotoEscudo = fotoEscudo;
	}
	
	
}
