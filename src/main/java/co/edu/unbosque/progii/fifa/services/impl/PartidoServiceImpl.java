package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Partido;
import co.edu.unbosque.progii.fifa.persistence.repository.PartidoRepository;
import co.edu.unbosque.progii.fifa.services.PartidoService;

@Service
@Transactional
public class PartidoServiceImpl implements PartidoService {

	@Autowired
	private PartidoRepository partidoRepository;
	
	@Override
	public Partido guardar(final Partido partido) {

		return partidoRepository.save(partido);
	}

	@Override
	public Partido buscar(final Long id) {

		return partidoRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		partidoRepository.delete(id);
	}

	@Override
	public List<Partido> listarTodo() {

		final List<Partido> partidos = (List<Partido>) partidoRepository.findAll();
		
		return partidos;
	}
}