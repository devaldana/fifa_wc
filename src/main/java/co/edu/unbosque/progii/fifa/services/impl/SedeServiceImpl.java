package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Sede;
import co.edu.unbosque.progii.fifa.persistence.repository.SedeRepository;
import co.edu.unbosque.progii.fifa.services.SedeService;

@Service
@Transactional
public class SedeServiceImpl implements SedeService {

	@Autowired
	private SedeRepository sedeRepository;
	
	@Override
	public Sede guardar(final Sede sede) {

		return sedeRepository.save(sede);
	}

	@Override
	public Sede buscar(final Long id) {

		return sedeRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		sedeRepository.delete(id);
	}

	@Override
	public List<Sede> listarTodo() {

		final List<Sede> sedes = (List<Sede>) sedeRepository.findAll();
				
		return sedes;
	}
}