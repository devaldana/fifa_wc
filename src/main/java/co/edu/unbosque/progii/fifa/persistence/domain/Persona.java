package co.edu.unbosque.progii.fifa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona extends BaseEntity {
	
	@Column(name="url_foto")
	private String urlFoto;
	
	private int edad;
	private double estatura;
	private String nacionalidad;
	private String nombre;
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public String getUrlFoto() {
		return urlFoto;
	}
	
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}