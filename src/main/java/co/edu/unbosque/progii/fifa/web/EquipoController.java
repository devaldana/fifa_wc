package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Equipo;
import co.edu.unbosque.progii.fifa.persistence.domain.Grupo;
import co.edu.unbosque.progii.fifa.services.EquipoService;

@Controller
public class EquipoController implements IController<Equipo>{
	
	@Autowired
	private CampeonatoController campeonatoController;
	
	@Autowired
	private EquipoService equipoService;
	
	private Equipo editarEquipo;
	
	public EquipoController() {

		editarEquipo = new Equipo();
	}
	
	/*
	 * MÉTODOS DE NEGOCIO
	 * 
	 * */
	
	@Override
	public void guardar() {
		
		this.equipoService.guardar(editarEquipo);
		editarEquipo = new Equipo();
	}

	@Override
	public void actualizar(Equipo equipo) {
		
		this.editarEquipo = equipo;
	}

	@Override
	public void eliminar(Equipo equipo) {
		
		this.equipoService.eliminar(equipo.getId());
	}
	
	/* 
	 * GETTERS AND SETTERS
	 * 
	 * */
	

	public Equipo getEditarEquipo() {
		return editarEquipo;
	}


	public void setEditarEquipo(Equipo editarEquipo) {
		this.editarEquipo = editarEquipo;
	}
	
	public List<Equipo> getEquipos(){
		
		return this.campeonatoController.getEquipos();
	}
	
	public List<Grupo> getGrupos(){
		
		return this.campeonatoController.getGrupos();
	}
}