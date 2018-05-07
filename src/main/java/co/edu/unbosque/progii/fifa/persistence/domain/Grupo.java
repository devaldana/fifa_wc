package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupo database table.
 */
@Entity
public class Grupo extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;

	public Grupo() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}