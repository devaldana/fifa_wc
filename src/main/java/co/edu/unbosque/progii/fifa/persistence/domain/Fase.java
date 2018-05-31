package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fase database table.
 */
@Entity
public class Fase extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;

	@OneToMany(mappedBy="fase", fetch=FetchType.LAZY)
	private List<Partido> partidos;
	
	@ManyToOne
	@JoinColumn(name="id_campeonato")
	private Campeonato campeonato;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public Partido addPartido(Partido partido) {
		getPartidos().add(partido);
		partido.setFase(this);

		return partido;
	}

	public Partido removePartido(Partido partido) {
		getPartidos().remove(partido);
		partido.setFase(null);

		return partido;
	}

}