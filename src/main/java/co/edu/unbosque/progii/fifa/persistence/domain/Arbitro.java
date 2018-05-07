package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the arbitro database table.
 */
@Entity
public class Arbitro extends Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int partidosArbitrados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;

	public Arbitro() {
	}

	public int getPartidosArbitrados() {
		return this.partidosArbitrados;
	}

	public void setPartidosArbitrados(int partidosArbitrados) {
		this.partidosArbitrados = partidosArbitrados;
	}

	public int getTarjetasAmarillas() {
		return this.tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return this.tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
}