package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Equipo;
import co.edu.unbosque.progii.fifa.persistence.repository.EquipoRepository;
import co.edu.unbosque.progii.fifa.services.EquipoService;

@Service
@Transactional
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoRepository equipoRepository;
	
	@Override
	public Equipo guardar(final Equipo equipo) {

		return equipoRepository.save(equipo);
	}

	@Override
	public Equipo buscar(final Long id) {

		return equipoRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		equipoRepository.delete(id);
	}

	@Override
	public List<Equipo> listarTodo() {

		final List<Equipo> equipos = (List<Equipo>) equipoRepository.findAll();
		
		return equipos;
	}

}
