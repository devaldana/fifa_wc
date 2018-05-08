package co.edu.unbosque.progii.fifa.enums;

import java.util.Arrays;
import java.util.stream.Stream;

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

	public String getNombre() {
		return nombre;
	}
	
	public static Posicion getById(final int id) {
		
		return getValues().filter(p -> p.id == id).findFirst().get();
	}
	
	public static Posicion getByNombre(final String nombre) {
		
		return getValues().filter(p -> p.nombre.equals(nombre)).findFirst().get();
	}
	
	public static Stream<Posicion> getValues() {
		
		return Arrays.stream(values());
	}
}