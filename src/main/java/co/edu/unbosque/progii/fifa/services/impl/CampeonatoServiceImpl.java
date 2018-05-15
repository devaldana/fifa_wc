package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Campeonato;
import co.edu.unbosque.progii.fifa.persistence.repository.CampeonatoRepository;
import co.edu.unbosque.progii.fifa.services.CampeonatoService;

@Service
@Transactional
public class CampeonatoServiceImpl implements CampeonatoService {

	@Autowired
	private CampeonatoRepository campeonatoRepository; 
	
	@Override
	public Campeonato guardar(final Campeonato campeonato) {

		return campeonatoRepository.save(campeonato);
	}

	@Override
	public Campeonato buscar(final Long id) {

		return campeonatoRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		campeonatoRepository.delete(id);
	}

	@Override
	public List<Campeonato> listarTodo() {

		final List<Campeonato> campeonatos = (List<Campeonato>) campeonatoRepository.findAll();
		
		return campeonatos;
	}

}
