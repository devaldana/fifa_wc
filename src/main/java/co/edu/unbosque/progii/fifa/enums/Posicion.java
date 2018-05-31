package co.edu.unbosque.progii.fifa.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Posicion  {
	
	PORTERO(1, "Portero"),
	DEFENSA(2, "Defensa"),
	CENTROCAMPISTA(3, "Centrocampista"),
	DELANTERO(4, "Delantero");
	
	private int id;
	private String nombre;
	
	Posicion(final int id, final String nombre) {
		
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