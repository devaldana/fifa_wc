package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.unbosque.progii.fifa.enums.Posicion;
import co.edu.unbosque.progii.fifa.persistence.converters.PosicionConverter;


/**
 * The persistent class for the jugador database table.
 */
@Entity
public class Jugador extends Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_posicion")
	@Convert(converter=PosicionConverter.class)
	private Posicion posicion;
	
	private String camisa;

	@ManyToOne
	@JoinColumn(name="id_equipo")
	private Equipo equipo;

	public String getCamisa() {
		return this.camisa;
	}

	public void setCamisa(String camisa) {
		this.camisa = camisa;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}