package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Fase;
import co.edu.unbosque.progii.fifa.services.FaseService;

@Controller
public class FaseController implements IController<Fase> {

	@Autowired
	private CampeonatoController campeonatoController;

	@Autowired
	private FaseService faseService;
	
	private Fase editarFase;
	
	@PostConstruct
	private void init() {
		
		editarFase = new Fase();
		editarFase.setCampeonato(this.campeonatoController.getCampeonatoActual());
	}

	/*
	 * MÉTODOS DE NEGOCIO
	 * 
	 */
	
	@Override
	public void guardar() {	
		
		this.faseService.guardar(editarFase);
		init();
	}

	@Override
	public void actualizar(Fase fase) {
		
		this.editarFase = fase;
	}

	@Override
	public void eliminar(Fase fase) {
		
		this.faseService.eliminar(fase.getId());
	}

	/*
	 * GETTERS AND SETTERS
	 * 
	 */
	
	public Fase getEditarFase() {
		return editarFase;
	}

	public void setEditarFase(Fase fase) {
		this.editarFase = fase;
	}

	public List<Fase> getFases(){
		
		return this.campeonatoController.getFases();
	}
}
