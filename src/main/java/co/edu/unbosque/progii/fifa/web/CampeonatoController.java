package co.edu.unbosque.progii.fifa.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.enums.EstadoCampeonato;
import co.edu.unbosque.progii.fifa.persistence.domain.Arbitro;
import co.edu.unbosque.progii.fifa.persistence.domain.Campeonato;
import co.edu.unbosque.progii.fifa.persistence.domain.Equipo;
import co.edu.unbosque.progii.fifa.persistence.domain.Fase;
import co.edu.unbosque.progii.fifa.persistence.domain.Grupo;
import co.edu.unbosque.progii.fifa.persistence.domain.Partido;
import co.edu.unbosque.progii.fifa.persistence.domain.Sede;
import co.edu.unbosque.progii.fifa.services.ArbitroService;
import co.edu.unbosque.progii.fifa.services.CampeonatoService;
import co.edu.unbosque.progii.fifa.services.EquipoService;
import co.edu.unbosque.progii.fifa.services.FaseService;
import co.edu.unbosque.progii.fifa.services.GrupoService;
import co.edu.unbosque.progii.fifa.services.PartidoService;
import co.edu.unbosque.progii.fifa.services.SedeService;

@Controller
@Scope("request")
public class CampeonatoController {
	
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
	
	@Autowired
	private ArbitroService arbitroService;
	
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
		//cargarInfoCampeonatoActivo();
	}
	
	private void cargarInfoCampeonatoActivo() {
		
		this.campeonatos = campeonatoService.listarTodo();
		
		// Carga el campeonato actual
		this.campeonatoActual = this.campeonatos.stream()
									.filter(campeonato -> campeonato.getEstado() == EstadoCampeonato.ACTIVO)
									.findFirst().get();
				
		this.fases = faseService.listarTodo().stream()
								.filter( fase -> fase.getCampeonato().equals(this.campeonatoActual) )
								.collect(Collectors.toList());
		
		this.partidos = partidoService.listarTodo().stream()
									  .filter(partido -> partido.getEstadio().getSede().getCampeonato().equals(this.campeonatoActual))
									  .collect(Collectors.toList());
		
		this.sedes = sedeService.listarTodo().stream()
								.filter(sede -> sede.getCampeonato().equals(this.campeonatoActual))
								.collect(Collectors.toList());
		
		this.equipos = equipoService.listarTodo().stream()
									.filter(equipo -> equipo.getGrupo().getCampeonato().equals(this.campeonatoActual))
									.collect(Collectors.toList());
		
		this.grupos = grupoService.listarTodo().stream()
								  .filter(grupo -> grupo.getCampeonato().equals(this.campeonatoActual))
								  .collect(Collectors.toList());
		
		this.arbitros = this.partidos.stream()
									 .map( partido -> partido.getArbitro())
									 .collect(Collectors.toList());
	}

	public CampeonatoService getCampeonatoService() {
		return campeonatoService;
	}

	public void setCampeonatoService(CampeonatoService campeonatoService) {
		this.campeonatoService = campeonatoService;
	}

	public FaseService getFaseService() {
		return faseService;
	}

	public void setFaseService(FaseService faseService) {
		this.faseService = faseService;
	}

	public PartidoService getPartidoService() {
		return partidoService;
	}

	public void setPartidoService(PartidoService partidoService) {
		this.partidoService = partidoService;
	}

	public SedeService getSedeService() {
		return sedeService;
	}

	public void setSedeService(SedeService sedeService) {
		this.sedeService = sedeService;
	}

	public EquipoService getEquipoService() {
		return equipoService;
	}

	public void setEquipoService(EquipoService equipoService) {
		this.equipoService = equipoService;
	}

	public GrupoService getGrupoService() {
		return grupoService;
	}

	public void setGrupoService(GrupoService grupoService) {
		this.grupoService = grupoService;
	}

	public ArbitroService getArbitroService() {
		return arbitroService;
	}

	public void setArbitroService(ArbitroService arbitroService) {
		this.arbitroService = arbitroService;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public List<Fase> getFases() {
		return fases;
	}

	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public List<Sede> getSedes() {
		return sedes;
	}

	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public List<Arbitro> getArbitros() {
		return arbitros;
	}

	public void setArbitros(List<Arbitro> arbitros) {
		this.arbitros = arbitros;
	}

	public Campeonato getCampeonatoActual() {
		return campeonatoActual;
	}

	public void setCampeonatoActual(Campeonato campeonatoActual) {
		this.campeonatoActual = campeonatoActual;
	}
	
	public void agregarCampeonato() {
		
		this.campeonatoService.guardar(editarCampeonato);
		this.campeonatos = campeonatoService.listarTodo();
		
		editarCampeonato = new Campeonato();
	}
	
	public void eliminarCampeonato() {
		
		
	}
}