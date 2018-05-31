package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class JugadorMB {

	private ArrayList<String> listaNombreEquipo = new ArrayList<String>();
	private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
	private ArrayList<String> listaDeLosJugadores = new ArrayList<String>();
	private Jugador jugadorCreado;

	public JugadorMB() {
		jugadorCreado = new Jugador();
		listaJugadores.add(jugadorCreado);
	}

	public ArrayList<Jugador> listaDeJugadores() {

		return BaseDatos.getInstance().getListaJugadores();
	}

	public void agregarJugador() {
		for (int i = 0; i < listaDeJugadores().size(); i++) {

			Jugador actual = listaDeJugadores().get(i);

			if (actual.getId() > 0 && actual != null) {

				BaseDatos.getInstance().agregandolo(jugadorCreado);

				System.out.println(BaseDatos.getInstance().getListaJugadores());
			}
		}

	}

	public ArrayList<String> listaEquipos() {

		ArrayList<Equipo> lista = BaseDatos.getInstance().getListaEquipos();

		for (int i = 0; i < lista.size(); i++) {

			Equipo actual = lista.get(i);

			listaNombreEquipo.add(actual.getNombre());
		}

		return listaNombreEquipo;
	}

	public ArrayList<String> listadoDeLosJugadores() {

		ArrayList<Jugador> lista = BaseDatos.getInstance().getListaJugadores();

		for (int i = 0; i < lista.size(); i++) {

			Jugador actual = lista.get(i);

			listaDeLosJugadores.add(actual.getNombre());
		}

		return listaDeLosJugadores;
	}

	public ArrayList<String> getListaNombreEquipo() {
		return listaNombreEquipo;
	}

	public Jugador getJugadorCreado() {
		return jugadorCreado;
	}

	public void setJugadorCreado(Jugador jugadorCreado) {
		this.jugadorCreado = jugadorCreado;
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public ArrayList<String> getListaDeLosJugadores() {
		return listaDeLosJugadores;
	}
	
}
