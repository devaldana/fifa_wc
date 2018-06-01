package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Estadio;
import co.edu.unbosque.progii.fifa.persistence.domain.Sede;
import co.edu.unbosque.progii.fifa.services.EstadioService;

@Controller
public class EstadioController implements IController<Estadio>{
	
	@Autowired
	private CampeonatoController campeonatoController;
	
	@Autowired
	private EstadioService estadioService;
	
	private Estadio editarEstadio;
	
	public EstadioController() {
	 	
	}
	
	@PostConstruct
	private void init() {
		
		editarEstadio = new Estadio();
	}

	/*
	 * MÉTODOS DE NEGOCIO
	 * 
	 */
	
	@Override
	public void guardar() {
		
		estadioService.guardar(editarEstadio);
		editarEstadio =  new Estadio();
	}

	@Override
	public void actualizar(Estadio estadio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Estadio estadio) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public Estadio getEditarEstadio() {
		return editarEstadio;
	}

	public void setEditarEstadio(Estadio editarEstadio) {
		this.editarEstadio = editarEstadio;
	}
	
	public List<Estadio> getEstadios(){
		
		return this.campeonatoController.getEstadios();
	}
	
	public List<Sede> getSedes(){
		
		return this.campeonatoController.getSedes();
	}
}
