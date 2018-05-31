package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.unbosque.progii.fifa.enums.TipoTarjeta;
import co.edu.unbosque.progii.fifa.persistence.converters.TipoTarjetaConverter;


/**
 * The persistent class for the partidos_tarjetas database table.
 * 
 */
@Entity
@Table(name="partidos_tarjetas")
public class Tarjeta extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_tipo_tarjeta")
	@Convert(converter=TipoTarjetaConverter.class)
	private TipoTarjeta tipoTarjeta;

	@ManyToOne
	@JoinColumn(name="id_jugador")
	private Jugador jugador;

	@ManyToOne
	@JoinColumn(name="id_partido")
	private Partido partido;

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

	public TipoTarjeta getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
}