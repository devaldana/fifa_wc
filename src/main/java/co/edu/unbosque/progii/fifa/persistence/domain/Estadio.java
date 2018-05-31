package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estadio database table.
 */
@Entity
public class Estadio extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="fecha_inauguracion")
	private Date fechaInauguracion;
	
	private String nombre;
	private int capacidad;
	
	@ManyToOne
	@JoinColumn(name="id_sede")
	private Sede sede;

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Date getFechaInauguracion() {
		return this.fechaInauguracion;
	}

	public void setFechaInauguracion(Date fechaInauguracion) {
		this.fechaInauguracion = fechaInauguracion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
}