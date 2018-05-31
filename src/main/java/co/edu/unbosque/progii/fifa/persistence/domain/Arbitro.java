package co.edu.unbosque.progii.fifa.persistence.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the arbitro database table.
 */
@Entity
public class Arbitro extends Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="partidos_arbitrados")
	private int partidosArbitrados;
	
	@Column(name="tarjetas_amarillas")
	private int tarjetasAmarillas;
	
	@Column(name="tarjetas_rojas")
	private int tarjetasRojas;

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