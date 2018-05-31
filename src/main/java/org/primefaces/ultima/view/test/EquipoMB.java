package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EquipoMB {
	
	private String jugador ="DOUGLAS";

	public ArrayList<Equipo> listaDeEquipos() {

		return BaseDatos.getInstance().getListaEquipos();
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}
	
	public void agregarJugador() {
		
		this.jugador += " - Test";
	}

	
	
}
