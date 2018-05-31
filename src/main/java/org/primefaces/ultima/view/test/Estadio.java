package org.primefaces.ultima.view.test;

public class Estadio {
	
	private int id;
	private String nombre;
	private Sede laSede;
	private int capacidad;
	private String apertura;
	private Fase fase;
	private String partido;
	
	public Estadio() {}
	
	

	public Estadio(int id, String nombre, Sede laSede, int capacidad, String apertura, Fase fase,String partido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.laSede = laSede;
		this.capacidad = capacidad;
		this.apertura = apertura;
		this.fase = fase;
		this.partido = partido;
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

	public Sede getLaSede() {
		return laSede;
	}

	public void setLaSede(Sede laSede) {
		this.laSede = laSede;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getApertura() {
		return apertura;
	}

	public void setApertura(String apertura) {
		this.apertura = apertura;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	


}
