package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the equipo database table.
 */
@Entity
public class Equipo extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String codigoPais;
	private String directorTecnico;
	private Date fechaFundacion;
	private String federacion;
	private String nombre;

	@OneToMany(mappedBy="equipo", fetch=FetchType.LAZY)
	private List<Jugador> jugadores;

	public Equipo() {
	}

	public String getCodigoPais() {
		return this.codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getDirectorTecnico() {
		return this.directorTecnico;
	}

	public void setDirectorTecnico(String directorTecnico) {
		this.directorTecnico = directorTecnico;
	}

	public Date getFechaFundacion() {
		return this.fechaFundacion;
	}

	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getFederacion() {
		return this.federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Jugador addJugadore(Jugador jugadore) {
		getJugadores().add(jugadore);
		jugadore.setEquipo(this);

		return jugadore;
	}

	public Jugador removeJugadore(Jugador jugadore) {
		getJugadores().remove(jugadore);
		jugadore.setEquipo(null);

		return jugadore;
	}

}