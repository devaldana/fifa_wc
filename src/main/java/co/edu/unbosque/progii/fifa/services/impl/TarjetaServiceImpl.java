package co.edu.unbosque.progii.fifa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unbosque.progii.fifa.persistence.domain.Tarjeta;
import co.edu.unbosque.progii.fifa.persistence.repository.TarjetaRepository;
import co.edu.unbosque.progii.fifa.services.TarjetaService;

@Service
@Transactional
public class TarjetaServiceImpl implements TarjetaService {

	@Autowired
	private TarjetaRepository tarjetaRepository;
	
	@Override
	public Tarjeta guardar(final Tarjeta tarjeta) {

		return tarjetaRepository.save(tarjeta);
	}

	@Override
	public Tarjeta buscar(final Long id) {

		return tarjetaRepository.findOne(id);
	}

	@Override
	public void eliminar(final Long id) {

		tarjetaRepository.delete(id);
	}

	@Override
	public List<Tarjeta> listarTodo() {

		final List<Tarjeta> tarjetas =  (List<Tarjeta>) tarjetaRepository.findAll();
		
		return tarjetas;
	}
}