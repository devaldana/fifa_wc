package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the partido database table.
 */
@Entity
public class Partido extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Date fecha;
	private int fuerasLugarEquipoLocal;
	private int fuerasLugarEquipoVisitante;
	private int jornada;
	private boolean jugado;
	private int tirosEsquinaEquipoLocal;
	private int tirosEsquinaEquipoVisitante;

	//uni-directional many-to-one association to Arbitro
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_arbitro")
	private Arbitro arbitro;

	//uni-directional many-to-one association to Equipo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_local")
	private Equipo equipoLocal;

	//uni-directional many-to-one association to Equipo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_visitante")
	private Equipo equipoVisitante;

	//uni-directional many-to-one association to Estadio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_estadio")
	private Estadio estadio;

	//bi-directional many-to-one association to Fase
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_fase")
	private Fase fase;

	//bi-directional many-to-one association to Gol
	@OneToMany(mappedBy="partido")
	private List<Gol> goles;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="partido")
	private List<Tarjeta> tarjetas;

	public Partido() {
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getFuerasLugarEquipoLocal() {
		return this.fuerasLugarEquipoLocal;
	}

	public void setFuerasLugarEquipoLocal(int fuerasLugarEquipoLocal) {
		this.fuerasLugarEquipoLocal = fuerasLugarEquipoLocal;
	}

	public int getFuerasLugarEquipoVisitante() {
		return this.fuerasLugarEquipoVisitante;
	}

	public void setFuerasLugarEquipoVisitante(int fuerasLugarEquipoVisitante) {
		this.fuerasLugarEquipoVisitante = fuerasLugarEquipoVisitante;
	}

	public int getJornada() {
		return this.jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public boolean getJugado() {
		return this.jugado;
	}

	public void setJugado(boolean jugado) {
		this.jugado = jugado;
	}

	public int getTirosEsquinaEquipoLocal() {
		return this.tirosEsquinaEquipoLocal;
	}

	public void setTirosEsquinaEquipoLocal(int tirosEsquinaEquipoLocal) {
		this.tirosEsquinaEquipoLocal = tirosEsquinaEquipoLocal;
	}

	public int getTirosEsquinaEquipoVisitante() {
		return this.tirosEsquinaEquipoVisitante;
	}

	public void setTirosEsquinaEquipoVisitante(int tirosEsquinaEquipoVisitante) {
		this.tirosEsquinaEquipoVisitante = tirosEsquinaEquipoVisitante;
	}

	public Arbitro getArbitro() {
		return this.arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	public Equipo getEquipoLocal() {
		return this.equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return this.equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Estadio getEstadio() {
		return this.estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Fase getFase() {
		return this.fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public List<Gol> getGoles() {
		return this.goles;
	}

	public void setGoles(List<Gol> partidosGoles) {
		this.goles = partidosGoles;
	}

	public Gol addGol(Gol gol) {
		
		getGoles().add(gol);
		gol.setPartido(this);

		return gol;
	}

	public Gol removeGol(Gol gol) {
		
		getGoles().remove(gol);
		gol.setPartido(null);

		return gol;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addPartidosTarjeta(Tarjeta tarjeta) {
		
		getTarjetas().add(tarjeta);
		tarjeta.setPartido(this);

		return tarjeta;
	}

	public Tarjeta removePartidosTarjeta(Tarjeta tarjeta) {
		
		getTarjetas().remove(tarjeta);
		tarjeta.setPartido(null);

		return tarjeta;
	}

}