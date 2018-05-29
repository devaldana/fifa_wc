package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Fase;
import co.edu.unbosque.progii.fifa.persistence.repository.FaseRepository;
import co.edu.unbosque.progii.fifa.services.FaseService;

@Service
@Transactional
public class FaseServiceImpl implements FaseService {

	@Autowired
	private FaseRepository faseRepository;
	
	@Override
	public Fase guardar(final Fase fase) {

		return faseRepository.save(fase);
	}

	@Override
	public Fase buscar(final Long id) {

		return faseRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		faseRepository.delete(id);
	}

	@Override
	public List<Fase> listarTodo() {

		List<Fase> fases = (List<Fase>) faseRepository.findAll();
		
		return fases;
	}
}