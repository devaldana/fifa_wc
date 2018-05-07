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

	//bi-directional many-to-one association to Partido
	@OneToMany(mappedBy="fase")
	private List<Partido> partidos;

	public Fase() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
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