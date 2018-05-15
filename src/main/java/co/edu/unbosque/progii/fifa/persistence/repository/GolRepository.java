package co.edu.unbosque.progii.fifa.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unbosque.progii.fifa.persistence.domain.Gol;

@Repository
public interface GolRepository extends CrudRepository<Gol, Long> {

}