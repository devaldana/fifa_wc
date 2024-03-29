package co.edu.unbosque.progii.fifa.enums;

import java.util.Arrays;
import java.util.stream.Stream;

public enum TipoGol  {
	
	AUTOGOL(1, "Autogol"),
	PENALTI(2, "Penalti"),
	OTRO(3, "Otro");
	
	int id;
	private String nombre;
	
	TipoGol(final int id, final String nombre) {
		
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static TipoGol getById(final int id) {
		
		return getValues().filter(p -> p.id == id).findFirst().get();
	}
	
	public static TipoGol getByNombre(final String nombre) {
		
		return getValues().filter(p -> p.nombre.equals(nombre)).findFirst().get();
	}
	
	public static Stream<TipoGol> getValues() {
		
		return Arrays.stream(values());
	}
}