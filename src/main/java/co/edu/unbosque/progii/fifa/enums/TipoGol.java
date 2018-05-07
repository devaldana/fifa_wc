package co.edu.unbosque.progii.fifa.enums;

public enum TipoGol  {
	
	AUTOGOL(0, "Autogol"),
	PENALTI(0, "Penalti"),
	OTRO(1, "Otro");
	
	private int id;
	private String nombre;
	
	private TipoGol(final int id, final String nombre) {
		
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