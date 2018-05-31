package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the sede database table.
 */
@Entity
public class Sede extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String region;
	private double temperatura;

	@OneToMany(mappedBy="sede")
	private List<Estadio> estadios;
	
	@ManyToOne
	@JoinColumn(name="id_campeonato")
	private Campeonato campeonato;
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public List<Estadio> getEstadios() {
		return this.estadios;
	}

	public void setEstadios(List<Estadio> estadios) {
		this.estadios = estadios;
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public Estadio addEstadio(Estadio estadio) {
		getEstadios().add(estadio);
		estadio.setSede(this);

		return estadio;
	}

	public Estadio removeEstadio(Estadio estadio) {
		getEstadios().remove(estadio);
		estadio.setSede(null);

		return estadio;
	}

}