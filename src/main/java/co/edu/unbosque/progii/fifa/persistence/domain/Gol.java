package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.unbosque.progii.fifa.enums.TipoGol;
import co.edu.unbosque.progii.fifa.persistence.converters.TipoGolConverter;


/**
 * The persistent class for the partidos_goles database table.
 */
@Entity
@Table(name="partidos_goles")
public class Gol extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="id_jugador")
	private Jugador jugador;

	@ManyToOne
	@JoinColumn(name="id_partido")
	private Partido partido;
	
	@Column(name="id_tipo_gol")
	@Convert(converter=TipoGolConverter.class)
	private TipoGol tipoGol;

	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Partido getPartido() {
		return this.partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public TipoGol getTipoGol() {
		return this.tipoGol;
	}

	public void setTipoGol(TipoGol tipoGol) {
		this.tipoGol = tipoGol;
	}

}