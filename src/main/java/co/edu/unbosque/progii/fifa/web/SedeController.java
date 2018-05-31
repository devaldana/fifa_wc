package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Sede;
import co.edu.unbosque.progii.fifa.services.SedeService;

@Controller
public class SedeController implements IController<Sede>{

	@Autowired
	private CampeonatoController campeonatoController;
	
	@Autowired
	private SedeService sedeService;
	
	private Sede editarSede;
	
	public SedeController() {
		
		editarSede = new Sede();
	}
	
	/*
	 * MÉTODOS DE NEGOCIO
	 * 
	 * */
	
	@Override
	public void guardar() {
		
		this.sedeService.guardar(editarSede);
		this.editarSede = new Sede();
	}
	
	@Override
	public void actualizar(Sede sede) {
		
		this.editarSede = sede;
	}

	@Override
	public void eliminar(Sede sede) {
		
		this.sedeService.eliminar(sede.getId());
	}

	/* 
	 * GETTERS AND SETTERS
	 * 
	 * */
	
	public Sede getEditarSede() {
		return editarSede;
	}

	public void setEditarSede(Sede editarSede) {
		this.editarSede = editarSede;
	}
	
	public List<Sede> getSedes(){
		
		return this.campeonatoController.getSedes();
	}
}
