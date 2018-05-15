package co.edu.unbosque.progii.fifa.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.progii.fifa.persistence.domain.Arbitro;

@Repository
public interface ArbitroRepository extends CrudRepository<Arbitro, Long>{

}
