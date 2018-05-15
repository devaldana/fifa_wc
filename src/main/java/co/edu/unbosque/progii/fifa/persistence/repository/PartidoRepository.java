package co.edu.unbosque.progii.fifa.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.progii.fifa.persistence.domain.Partido;

@Repository
public interface PartidoRepository extends CrudRepository<Partido, Long> {

}
