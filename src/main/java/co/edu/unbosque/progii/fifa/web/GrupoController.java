package co.edu.unbosque.progii.fifa.web;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.edu.unbosque.progii.fifa.persistence.domain.Grupo;
import co.edu.unbosque.progii.fifa.services.GrupoService;


@Controller
public class GrupoController implements IController<Grupo> {

	@Autowired
	private CampeonatoController campeonatoController;
	
	@Autowired
	private GrupoService grupoService;
	
	private Grupo editarGrupo;
	
	@PostConstruct
	private void init() {
		
		editarGrupo = new Grupo();
		editarGrupo.setCampeonato(campeonatoController.getCampeonatoActual());
	}
	
	@Override
	public void guardar() {
		
		this.grupoService.guardar(editarGrupo);
		init();		
	}

	@Override
	public void actualizar(Grupo grupo) {
		
		this.editarGrupo = grupo;
	}

	@Override
	public void eliminar(Grupo grupo) {
		
		this.grupoService.eliminar(grupo.getId());
	}
	
	
	public List<Grupo> getGrupos(){
		
		return this.campeonatoController.getGrupos();
	}

	public Grupo getEditarGrupo() {
		return editarGrupo;
	}

	public void setEditarGrupo(Grupo editarGrupo) {
		this.editarGrupo = editarGrupo;
	}
	
}
