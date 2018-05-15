package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Grupo;
import co.edu.unbosque.progii.fifa.persistence.repository.GrupoRepository;
import co.edu.unbosque.progii.fifa.services.GrupoService;

@Service
@Transactional
public class GrupoServiceImpl implements GrupoService {

	@Autowired
	private GrupoRepository grupoRepository;
	
	@Override
	public Grupo guardar(final Grupo grupo) {

		return grupoRepository.save(grupo);
	}

	@Override
	public Grupo buscar(final Long id) {

		return grupoRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		grupoRepository.delete(id);
	}

	@Override
	public List<Grupo> listarTodo() {

		final List<Grupo> grupos = (List<Grupo>) grupoRepository.findAll();
		
		return grupos;
	}
}