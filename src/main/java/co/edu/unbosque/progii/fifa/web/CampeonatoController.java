package co.edu.unbosque.progii.fifa.web;

import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.edu.unbosque.progii.fifa.enums.EstadoCampeonato;
import co.edu.unbosque.progii.fifa.persistence.domain.Arbitro;
import co.edu.unbosque.progii.fifa.persistence.domain.Campeonato;
import co.edu.unbosque.progii.fifa.persistence.domain.Equipo;
import co.edu.unbosque.progii.fifa.persistence.domain.Fase;
import co.edu.unbosque.progii.fifa.persistence.domain.Grupo;
import co.edu.unbosque.progii.fifa.persistence.domain.Partido;
import co.edu.unbosque.progii.fifa.persistence.domain.Sede;
import co.edu.unbosque.progii.fifa.services.CampeonatoService;
import co.edu.unbosque.progii.fifa.services.EquipoService;
import co.edu.unbosque.progii.fifa.services.FaseService;
import co.edu.unbosque.progii.fifa.services.GrupoService;
import co.edu.unbosque.progii.fifa.services.PartidoService;
import co.edu.unbosque.progii.fifa.services.SedeService;

@SuppressWarnings("unused")
@Component
public class CampeonatoController implements IController<Campeonato>{
	
	@Autowired
	private CampeonatoService campeonatoService;

	@Autowired
	private FaseService faseService;
	
	@Autowired
	private PartidoService partidoService;
	
	@Autowired
	private SedeService sedeService;
	
	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	private GrupoService grupoService;
	
	private List<Campeonato> campeonatos;
	private List<Fase> fases;
	private List<Partido> partidos;
	private List<Sede> sedes;
	private List<Equipo> equipos;
	private List<Grupo> grupos;
	private List<Arbitro> arbitros;
	
	private Campeonato campeonatoActual;
	private Campeonato editarCampeonato;
	
	public CampeonatoController() {
		
		editarCampeonato = new Campeonato();
	}
	
	@PostConstruct
	private void init() {
				
		this.campeonatos = campeonatoService.listarTodo();
		
		// Carga el campeonato actual
		this.campeonatoActual = this.campeonatos.stream()
									.filter(campeonato -> campeonato.getEstado() == EstadoCampeonato.ACTIVO)
									.findFirst().get();
	}

	/*
	 * MÉTODOS DE NEGOCIO
	 * 
	 * */
	
	@Override
	public void guardar() {
		
		this.campeonatoService.guardar(editarCampeonato);
		editarCampeonato = new Campeonato();		
	}

	@Override
	public void actualizar(Campeonato campeonato) {
		
		this.editarCampeonato = campeonato;
	}

	@Override
	public void eliminar(Campeonato campeonato) {
		
		this.campeonatoService.eliminar(campeonato.getId());	
	}

	public EstadoCampeonato[] getEstadosCampeonato() {
		
		return EstadoCampeonato.values();
	}
	
	/* 
	 * GETTERS AND SETTERS
	 * 
	 * */
	
	public List<Campeonato> getCampeonatos() {
		
		return this.campeonatos = campeonatoService.listarTodo();
	}

	public List<Fase> getFases() {
		
		return 	this.fases = faseService.listarTodo().stream()
				.filter( fase -> fase.getCampeonato().equals(this.campeonatoActual) )
				.collect(Collectors.toList());
	}

	public List<Partido> getPartidos() {
		
		return 	this.partidos = partidoService.listarTodo().stream()
				  .filter(partido -> partido.getEstadio().getSede().getCampeonato().equals(this.campeonatoActual))
				  .collect(Collectors.toList());
	}

	public List<Sede> getSedes() {
		
		return 	this.sedes = sedeService.listarTodo().stream()
				.filter(sede -> sede.getCampeonato().equals(this.campeonatoActual))
				.collect(Collectors.toList());
	}

	public List<Equipo> getEquipos() {
		
		return this.equipos = equipoService.listarTodo().stream()
				.filter(equipo -> equipo.getGrupo().getCampeonato().equals(this.campeonatoActual))
				.collect(Collectors.toList());
	}

	public List<Grupo> getGrupos() {
		
		return 	this.grupos = grupoService.listarTodo().stream()
				  .filter(grupo -> grupo.getCampeonato().equals(this.campeonatoActual))
				  .collect(Collectors.toList());
	}

	public List<Arbitro> getArbitros() {
		return 	this.arbitros = this.partidos.stream()
				 .map( partido -> partido.getArbitro())
				 .collect(Collectors.toList());
	}

	public Campeonato getCampeonatoActual() {
		return campeonatoActual;
	}

	public void setCampeonatoActual(Campeonato campeonatoActual) {
		this.campeonatoActual = campeonatoActual;
	}
	
	public Campeonato getEditarCampeonato() {
		return editarCampeonato;
	}

	public void setEditarCampeonato(Campeonato editarCampeonato) {
		this.editarCampeonato = editarCampeonato;
	}	
}