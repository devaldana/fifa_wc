package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Arbitro;
import co.edu.unbosque.progii.fifa.persistence.repository.ArbitroRepository;
import co.edu.unbosque.progii.fifa.services.ArbitroService;

@Service
@Transactional
public class ArbitroServiceImpl implements ArbitroService {

	@Autowired
	private ArbitroRepository arbitroRepository;
	
	@Override
	public Arbitro guardar(final Arbitro arbitro) {
		
		return arbitroRepository.save(arbitro);
	}

	@Override
	public Arbitro buscar(final Long id) {
		
		return arbitroRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		arbitroRepository.delete(id);
	}

	@Override
	public List<Arbitro> listarTodo() {
		
		final List<Arbitro> arbitros = (List<Arbitro>) arbitroRepository.findAll();
		
		return arbitros;
	}
}