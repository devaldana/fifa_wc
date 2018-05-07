package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.unbosque.progii.fifa.enums.TipoTarjeta;


/**
 * The persistent class for the partidos_tarjetas database table.
 * 
 */
@Entity
@Table(name="partidos_tarjetas")
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t")
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(insertable=false, updatable=false)
	private Long id;

	//uni-directional many-to-one association to Jugador
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_jugador")
	private Jugador jugador;

	//bi-directional many-to-one association to Partido
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_partido")
	private Partido partido;
	
	private TipoTarjeta tipoTarjeta;

	public Tarjeta() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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