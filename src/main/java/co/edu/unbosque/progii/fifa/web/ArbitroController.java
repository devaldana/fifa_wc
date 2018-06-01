package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Arbitro;
import co.edu.unbosque.progii.fifa.services.ArbitroService;

@Controller
public class ArbitroController implements IController<Arbitro> {

	
	@Autowired
	private CampeonatoController campeonatoController;
	
	@Autowired
	private ArbitroService arbitroService;
	
	private Arbitro editarArbitro;
	
	public ArbitroController() {

		editarArbitro = new Arbitro();
	}

	@Override
	public void guardar() {
		
		this.arbitroService.guardar(editarArbitro);
		editarArbitro = new Arbitro();
	}

	@Override
	public void actualizar(Arbitro arbitro) {
		
		this.editarArbitro = arbitro;
	}

	@Override
	public void eliminar(Arbitro arbitro) {
		
		this.arbitroService.eliminar(arbitro.getId());
	}
	
	public List<Arbitro> getArbitros(){
		
		return this.campeonatoController.getArbitros();
	}

	public Arbitro getEditarArbitro() {
		return editarArbitro;
	}

	public void setEditarArbitro(Arbitro editarArbitro) {
		this.editarArbitro = editarArbitro;
	}
}
