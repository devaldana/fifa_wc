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
	
	@Column(name="fueras_lugar_equipo_local")
	private int fuerasLugarEquipoLocal;
	
	@Column(name="fueras_lugar_equipo_visitante")
	private int fuerasLugarEquipoVisitante;
	
	@Column(name="cantidad_asistentes")
	private int cantidadAsistentes;
	
	private Integer jornada;
	private boolean jugado;
	
	@Column(name="tiros_esquina_equipo_local")
	private int tirosEsquinaEquipoLocal;
	
	@Column(name="tiros_esquina_equipo_visitante")
	private int tirosEsquinaEquipoVisitante;
	
	//uni-directional many-to-one association to Arbitro
	@ManyToOne
	@JoinColumn(name="id_arbitro")
	private Arbitro arbitro;

	//uni-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="id_equipo_local")
	private Equipo equipoLocal;

	//uni-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="id_equipo_visitante")
	private Equipo equipoVisitante;

	//uni-directional many-to-one association to Estadio
	@ManyToOne
	@JoinColumn(name="id_estadio")
	private Estadio estadio;

	//bi-directional many-to-one association to Fase
	@ManyToOne
	@JoinColumn(name="id_fase")
	private Fase fase;

	//bi-directional many-to-one association to Gol
	@OneToMany(mappedBy="partido", fetch=FetchType.LAZY)
	private List<Gol> goles;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="partido", fetch=FetchType.LAZY)
	private List<Tarjeta> tarjetas;

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

	public Integer getJornada() {
		return this.jornada;
	}

	public void setJornada(Integer jornada) {
		this.jornada = jornada;
	}

	public boolean isJugado() {
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

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
}