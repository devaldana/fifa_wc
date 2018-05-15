package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Gol;
import co.edu.unbosque.progii.fifa.persistence.repository.GolRepository;
import co.edu.unbosque.progii.fifa.services.GolService;

@Service
@Transactional
public class GolServiceImpl implements GolService {

	@Autowired
	private GolRepository golRepository;
	
	@Override
	public Gol guardar(final Gol gol) {

		return golRepository.save(gol);
	}

	@Override
	public Gol buscar(final Long id) {

		return golRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		golRepository.delete(id);
	}

	@Override
	public List<Gol> listarTodo() {
		
		final List<Gol> goles = (List<Gol>) golRepository.findAll();
		
		return goles;
	}

}
