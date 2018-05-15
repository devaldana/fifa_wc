package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Estadio;
import co.edu.unbosque.progii.fifa.persistence.repository.EstadioRepository;
import co.edu.unbosque.progii.fifa.services.EstadioService;

@Service
@Transactional
public class EstadioServiceImpl implements EstadioService {

	@Autowired
	private EstadioRepository estadioRepository;
	
	@Override
	public Estadio guardar(final Estadio estadio) {

		return estadioRepository.save(estadio);
	}

	@Override
	public Estadio buscar(final Long id) {

		return estadioRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		estadioRepository.delete(id);
	}

	@Override
	public List<Estadio> listarTodo() {

		final List<Estadio> estadios = (List<Estadio>) estadioRepository.findAll();
		
		return estadios;
	}
}