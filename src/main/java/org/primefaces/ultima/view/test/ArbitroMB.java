package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ArbitroMB {

	private ArrayList<String> listaNacionalidad = new ArrayList<String>();
	private ArrayList<Integer> listaNumPPitados = new ArrayList<Integer>();
	private ArrayList<Integer> listaTAmarillas = new ArrayList<Integer>();
	private ArrayList<Integer> listaTRojas = new ArrayList<Integer>();

	public ArrayList<Arbitro> listadoArbitros() {

		return BaseDatos.getInstance().getListaArbitros();
	}

	public ArrayList<String> listaDeNacionalidades() {

		ArrayList<Arbitro> lista = BaseDatos.getInstance().getListaArbitros();

		for (int i = 0; i < lista.size(); i++) {

			Arbitro actual = lista.get(i);

			listaNacionalidad.add(actual.getNombre());
		}

		return listaNacionalidad;
	}
	

	public ArrayList<Integer> losPartidos() {
		for (int i = 0; i <= 10; i++) {

			listaNumPPitados.add(i);
		}
		return listaNumPPitados;
	}

	public ArrayList<Integer> listaTamarillas() {

		for (int i = 0; i <= 20; i++) {

			listaTAmarillas.add(i);
		}
		return listaTAmarillas;
	}
	
	public ArrayList<Integer> listaTrojas() {

		for (int i = 0; i <= 20; i++) {

			listaTRojas.add(i);
		}
		return listaTRojas;
	}

	public ArrayList<String> getListaNacionalidad() {
		return listaNacionalidad;
	}

	public ArrayList<Integer> getListaNumPPitados() {
		return listaNumPPitados;
	}

	public ArrayList<Integer> getListaTAmarillas() {
		return listaTAmarillas;
	}

	public ArrayList<Integer> getListaTRojas() {
		return listaTRojas;
	}

}
