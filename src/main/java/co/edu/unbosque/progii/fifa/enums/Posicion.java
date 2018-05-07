package co.edu.unbosque.progii.fifa.enums;

public enum Posicion  {
	
	PORTERO(0, "Portero"),
	DEFENSA(1, "Defensa"),
	CENTROCAMPISTA(2, "Centrocampista"),
	DELANTERO(3, "Delantero");
	
	private int id;
	private String nombre;
	
	private Posicion(final int id, final String nombre) {
		
		this.id = id;
		this.nombre = nombre;
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
}