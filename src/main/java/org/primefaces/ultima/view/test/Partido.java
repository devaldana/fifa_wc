package org.primefaces.ultima.view.test;

public class Partido {
		
	private int id;
	private String fecha;
	private Equipo equipo1;
	private Equipo equipo2;
	private Estadio estadio;
	private Arbitro arbitro;
	private Fase fase;
	private int jornada;
	
	public Partido() {}

	public Partido(int id, String fecha, Equipo equipo1, Equipo equipo2, Estadio estadio, Arbitro arbitro, Fase fase,
			int jornada) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.estadio = estadio;
		this.arbitro = arbitro;
		this.fase = fase;
		this.jornada = jornada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	
	
}
