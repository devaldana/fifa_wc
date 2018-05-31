package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PartidoMB {

	private ArrayList<Integer> listaJornada = new ArrayList<Integer>();
	private ArrayList<String> listaFase = new ArrayList<String>();
	private ArrayList<String> listaEquipos = new ArrayList<String>();
	private ArrayList<String> listaArbitros = new ArrayList<String>();
	private ArrayList<String> listaEstadios = new ArrayList<String>();
	private ArrayList<String> listaPartidos = new ArrayList<String>();

	public ArrayList<Partido> listaDePartidos() {

		return BaseDatos.getInstance().getListaPartidos();
	}

	public ArrayList<String> listadoFases() {

		ArrayList<Fase> lista = BaseDatos.getInstance().getListaFases();

		for (int i = 0; i < lista.size(); i++) {

			Fase actual = lista.get(i);

			listaFase.add(actual.getNombre());
		}
		return listaFase;
	}

	public ArrayList<String> listadoEquipos() {

		ArrayList<Equipo> lista = BaseDatos.getInstance().getListaEquipos();

		for (int i = 0; i < lista.size(); i++) {

			Equipo actual = lista.get(i);

			listaEquipos.add(actual.getNombre());
		}
		return listaEquipos;
	}

	
	public ArrayList<String> listadoArbitros() {

		ArrayList<Arbitro> lista = BaseDatos.getInstance().getListaArbitros();

		for (int i = 0; i < lista.size(); i++) {

			Arbitro actual = lista.get(i);

			listaArbitros.add(actual.getNombre());
		}
		return listaArbitros;
	}

	
	public ArrayList<String> listadoEstadios() {

		ArrayList<Estadio> lista = BaseDatos.getInstance().getListaEstadios();

		for (int i = 0; i < lista.size(); i++) {

			Estadio actual = lista.get(i);

			listaEstadios.add(actual.getNombre());
		}
		return listaEstadios;
	}
	
	public ArrayList<String> listadoPartidos() {

		ArrayList<Partido> lista = BaseDatos.getInstance().getListaPartidos();

		for (int i = 0; i < lista.size(); i++) {

			Partido actual = lista.get(i);

			listaPartidos.add(actual.getFecha());
		}
		return listaPartidos;
	}

	
	public ArrayList<Integer> listadoJornada() {

		for (int i = 0; i < 5; i++) {

			listaJornada.add(i);
		}
		return listaJornada;
	}

	public ArrayList<Integer> getListaJornada() {
		return listaJornada;
	}

	public ArrayList<String> getListaFase() {
		return listaFase;
	}

	public ArrayList<String> getListaEquipos() {
		return listaEquipos;
	}

	public ArrayList<String> getListaArbitros() {
		return listaArbitros;
	}

	public ArrayList<String> getListaEstadios() {
		return listaEstadios;
	}

	public ArrayList<String> getListaPartidos() {
		return listaPartidos;
	}

	
}
