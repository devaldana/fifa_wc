package org.primefaces.ultima.view.test;

public class Jugador {
	
	private int id;
	private String nombre;
	private double estatura;
	private int edad;
	private int numCamiseta;
	private String foto;
	private Equipo elEquipo;
	
	public Jugador() {}



	public Jugador(int id, String nombre, double estatura, int edad, int numCamiseta, String foto, Equipo elEquipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.numCamiseta = numCamiseta;
		this.foto = foto;
		this.elEquipo = elEquipo;
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Equipo getElEquipo() {
		return elEquipo;
	}

	public void setElEquipo(Equipo elEquipo) {
		this.elEquipo = elEquipo;
	}

	public int getNumCamiseta() {
		return numCamiseta;
	}

	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}
	
	

}
