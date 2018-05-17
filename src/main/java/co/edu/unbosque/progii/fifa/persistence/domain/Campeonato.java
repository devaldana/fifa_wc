package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the campeonato database table.
 */
@Entity
public class Campeonato extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int anio;
	private String nombre;

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
}