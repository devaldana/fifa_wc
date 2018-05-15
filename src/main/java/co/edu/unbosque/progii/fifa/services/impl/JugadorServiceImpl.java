package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Jugador;
import co.edu.unbosque.progii.fifa.persistence.repository.JugadorRepository;
import co.edu.unbosque.progii.fifa.services.JugadorService;

@Service
@Transactional
public class JugadorServiceImpl implements JugadorService {

	@Autowired
	private JugadorRepository jugadorRepository;
	
	@Override
	public Jugador guardar(final Jugador jugador) {

		return jugadorRepository.save(jugador);
	}

	@Override
	public Jugador buscar(final Long id) {

		return jugadorRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		jugadorRepository.delete(id);
	}

	@Override
	public List<Jugador> listarTodo() {
		
		final List<Jugador> jugadores = (List<Jugador>) jugadorRepository.findAll();
		
		return jugadores;
	}
}