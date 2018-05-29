package co.edu.unbosque.progii.fifa.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public CampeonatoController() {
		
		cargarInfoCampeonatoActivo();
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
}