package co.edu.unbosque.progii.fifa.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public enum TipoTarjeta  {
	
	ROJA(0, "Roja"),
	AMARILLA(1, "Amarilla");

	private int id;
	private String nombre;
	
	TipoTarjeta(final int id, final String nombre) {
		
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static TipoTarjeta getById(final int id) {
		
		return getValues().filter(p -> p.id == id).findFirst().get();
	}
	
	public static TipoTarjeta getByNombre(final String nombre) {
		
		return getValues().filter(p -> p.nombre.equals(nombre)).findFirst().get();
	}
	
	public static Stream<TipoTarjeta> getValues() {
		
		return Arrays.stream(values());
	}
}