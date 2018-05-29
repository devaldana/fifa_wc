package co.edu.unbosque.progii.fifa.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public enum EstadoCampeonato {

	ACTIVO(0, "Activo"),
	INACTIVO(1, "Inactivo"),
	FINALIZADO(2, "Finalizado");
	
	private int id;
	private String nombre;
	
	EstadoCampeonato(final int id, final String nombre) {
		
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static EstadoCampeonato getById(final int id) {
		
		return getValues().filter(p -> p.id == id).findFirst().get();
	}
	
	public static EstadoCampeonato getByNombre(final String nombre) {
		
		return getValues().filter(p -> p.nombre.equals(nombre)).findFirst().get();
	}
	
	public static Stream<EstadoCampeonato> getValues() {
		
		return Arrays.stream(values());
	}
}
