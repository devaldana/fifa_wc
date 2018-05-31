package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadioMB {

	ArrayList<String> listaDeSedes = new ArrayList<String>();
	ArrayList<String> listaDeFases = new ArrayList<String>();
	ArrayList<String> listaDePartidos = new ArrayList<String>();

	public ArrayList<Estadio> listadoEstadios() {

		return BaseDatos.getInstance().getListaEstadios();
	}

	public ArrayList<String> listaSedes() {

		ArrayList<Sede> sedes = BaseDatos.getInstance().getListaSedes();

		for (int i = 0; i < sedes.size(); i++) {

			Sede actual = sedes.get(i);

			listaDeFases.add(actual.getNombre());
		}
		return listaDeSedes;
	}

	public ArrayList<String> listaFases() {

		ArrayList<Fase> lista= BaseDatos.getInstance().getListaFases();

		for (int i = 0; i < lista.size(); i++) {

			Fase actual = lista.get(i);

			listaDeSedes.add(actual.getNombre());
		}
		return listaDeSedes;
	}
	
	public ArrayList<String> listadoPartidos()
	{
		String[] encuentros = {"Colombia vs Egipto","Francia vs Alemania", "Inglaterra vs Brasil", "Peru vs Croacia","Portugal vs Colombia","Brasil vs Argentina"};
		
		for (int i = 0; i < encuentros.length; i++) {
			
			listaDePartidos.add(encuentros[i]);
		}
		
		return listaDePartidos;
	}

	public ArrayList<String> getListaDeSedes() {
		return listaDeSedes;
	}

	public ArrayList<String> getListaDeFases() {
		return listaDeFases;
	}

	public ArrayList<String> getListaDePartidos() {
		return listaDePartidos;
	}
	
	

}
