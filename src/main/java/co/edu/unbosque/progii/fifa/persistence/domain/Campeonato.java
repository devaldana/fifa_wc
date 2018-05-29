package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.unbosque.progii.fifa.enums.EstadoCampeonato;


/**
 * The persistent class for the campeonato database table.
 */
@Entity
public class Campeonato extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int anio;
	private String nombre;
	private EstadoCampeonato estado;

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoCampeonato getEstado() {
		return estado;
	}

	public void setEstado(EstadoCampeonato estado) {
		this.estado = estado;
	}
	
	@Override
	public boolean equals(Object otroCampeotano) {
		
		return this.getId() == ((Campeonato) otroCampeotano).getId();
	}
}