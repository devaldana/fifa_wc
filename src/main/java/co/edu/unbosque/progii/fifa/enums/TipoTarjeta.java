package co.edu.unbosque.progii.fifa.enums;

public enum TipoTarjeta  {
	
	ROJA(0, "Roja"),
	AMARILLA(1, "Amarilla");
	
	private int id;
	private String nombre;
	
	private TipoTarjeta(final int id, final String nombre) {
		
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