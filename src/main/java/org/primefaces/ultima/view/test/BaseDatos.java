package org.primefaces.ultima.view.test;

import java.util.ArrayList;

public class BaseDatos {

	
	private static BaseDatos bdLocal;
	private ArrayList<Campeonato> listaCameonatos = new ArrayList<Campeonato>();
	private ArrayList<Sede> listaSedes = new ArrayList<Sede>();
	private ArrayList<Estadio> listaEstadios = new ArrayList<Estadio>();
	private ArrayList<Fase> listaFases = new ArrayList<Fase>();
	private ArrayList<Grupo> listaGrupos = new ArrayList<Grupo>();
	private ArrayList<Arbitro> listaArbitros = new ArrayList<Arbitro>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
	private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
	private ArrayList<Partido> listaPartidos = new ArrayList<Partido>();

	public BaseDatos(){

		Campeonato camp1 = new Campeonato(1992, "Francia", false);
		Campeonato camp2 = new Campeonato(1996, "Inglaterra", true);
		Campeonato camp3 = new Campeonato(1998, "Argentina", false);
		Campeonato camp4 = new Campeonato(2000, "Alemania", false);
		Campeonato camp5 = new Campeonato(2008, "Africa", true);
		Campeonato camp6 = new Campeonato(2010, "Colombia", true);
		Campeonato camp7 = new Campeonato(2018, "Rusia", true);
		listaCameonatos.add(camp1);
		listaCameonatos.add(camp2);
		listaCameonatos.add(camp3);
		listaCameonatos.add(camp4);
		listaCameonatos.add(camp5);
		listaCameonatos.add(camp6);
		listaCameonatos.add(camp7);
		
		
		Sede sed1 = new Sede(1, "Ekaterimburgo", "Óblast de Sverdlovsk",20);
		Sede sed2 = new Sede(2, "Kaliningrado", "Óblast de Kaliningrado",12);
		Sede sed3 = new Sede(3, "Kazán", "Tartaristán",24);
		Sede sed4 = new Sede(4, "Nizhni Nóvgorod", "Óblast de Nizhni Nóvgorod",18);
		Sede sed5 = new Sede(5, "Rostov del Don", "Óblast de Sverdlovsk",16);
		Sede sed6 = new Sede(6, "Ekaterimburgo", "Óblast de Volgogrado",14);
		listaSedes.add(sed1);
		listaSedes.add(sed2);
		listaSedes.add(sed3);
		listaSedes.add(sed4);
		listaSedes.add(sed5);
		listaSedes.add(sed6);
		
		
		
		Fase fs1 = new Fase(1, "Fase De Grupos");
		Fase fs2 = new Fase(2, "Octavos");
		Fase fs3 = new Fase(3, "Cuartos");
		Fase fs4 = new Fase(4, "Semifinal");
		Fase fs5 = new Fase(5, "3° y 4° Puesto");
		Fase fs6 = new Fase(6, "Final");
		
		listaFases.add(fs1);
		listaFases.add(fs2);
		listaFases.add(fs3);
		listaFases.add(fs4);
		listaFases.add(fs5);
		listaFases.add(fs6);
		
		Estadio est1 = new Estadio(1, "Central Lenin", sed1, 50000, "2018/04/02",fs1,"Colombia vs Alemania");
		Estadio est2 = new Estadio(2, "Spartak", sed2, 50000,"2018/05/02",fs2, "Brasil vs Peru");
		Estadio est3 = new Estadio(3, "Arena Baltika", sed3, 50000, "2018/05/06", fs3, "Ingralterra vs Egipto");
		Estadio est4 = new Estadio(4, "Kazán Arena", sed4, 50000, "2018/05/14",fs4, "Nueva Zelanda vs Argentina");
		Estadio est5 = new Estadio(5, "Volgogrado Arena", sed5, 50000, "2018/03/02",fs5, "Portugal vs España");
		Estadio est6 = new Estadio(6, "Mordovia Arena", sed6, 50000, "2018/05/22",fs6,"Colombia vs Japon");
		
		listaEstadios.add(est1);
		listaEstadios.add(est2);
		listaEstadios.add(est3);
		listaEstadios.add(est4);
		listaEstadios.add(est5);
		listaEstadios.add(est6);
		
		Grupo grup1 = new Grupo(1,"A");
		Grupo grup2 = new Grupo(2,"B");
		Grupo grup3 = new Grupo(3,"C");
		Grupo grup4 = new Grupo(4,"D");
		Grupo grup5 = new Grupo(5,"E");
		Grupo grup6 = new Grupo(6,"F");
		Grupo grup7 = new Grupo(7,"G");
		Grupo grup8 = new Grupo(8,"H");
		
		listaGrupos.add(grup1);
		listaGrupos.add(grup2);
		listaGrupos.add(grup3);
		listaGrupos.add(grup4);
		listaGrupos.add(grup5);
		listaGrupos.add(grup6);
		listaGrupos.add(grup7);
		listaGrupos.add(grup8);
		
		Arbitro alb1 = new Arbitro(1, "AL MIRDASI Fahad", 1.80, 32, "KSA", "AL_MIRDASI_Fahad.png", 3, 4, 2);
		Arbitro alb2 = new Arbitro(2, "FAGHANI Alireza", 1.72, 32, "USA", "AL_MIRDASI_Fahad.png", 5, 4, 2);
		Arbitro alb3 = new Arbitro(3, "SHUKRALLA Nawaf Abdulla", 1.83, 32, "KSA", "AL_MIRDASI_Fahad.png",6, 4, 2);
		Arbitro alb4 = new Arbitro(4, "ABID CHAREF Mehdi", 1.88, 32, "AUS", "AL_MIRDASI_Fahad.png", 3, 8, 1);
		Arbitro alb5 = new Arbitro(5, "PITANA Nestor", 1.78, 34, "JPA", "AL_MIRDASI_Fahad.png", 5, 4, 0);
		Arbitro alb6 = new Arbitro(6, "BRYCH Felix", 1.80, 23, "NIG", "AL_MIRDASI_Fahad.png", 3, 6, 0);
		Arbitro alb7 = new Arbitro(7, "MARCINIAK Szymon", 1.76, 28, "KSA", "AL_MIRDASI_Fahad.png", 2, 7, 2);
		
		listaArbitros.add(alb1);
		listaArbitros.add(alb2);
		listaArbitros.add(alb3);
		listaArbitros.add(alb4);
		listaArbitros.add(alb5);
		listaArbitros.add(alb6);
		listaArbitros.add(alb7);
		
		
		Usuario user1 = new Usuario(1, "DDS", "david99@hotmail.com", "123456");
		Usuario user2 = new Usuario(2, "DAL", "aldana@hotmail.com", "312313");
		Usuario user3 = new Usuario(3, "ALP", "alej92@hotmail.com", "345345");
		Usuario user4 = new Usuario(4, "RUD", "rudy89@hotmail.com", "154645");
		Usuario user5 = new Usuario(5, "FER", "fernando09@hotmail.com", "165463");
		
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		listaUsuarios.add(user3);
		listaUsuarios.add(user4);
		listaUsuarios.add(user5);
		
		Equipo eq1 = new Equipo(1, "Colombia", "Jose Pekerman", "escudo1.png");
		Equipo eq2 = new Equipo(2, "Brasil", "Dunga", "escudo2.png");
		Equipo eq3 = new Equipo(3, "Francia", "Griezman", "escudo3.png");
		Equipo eq4 = new Equipo(4, "Perú", "JGareca", "escudo4.png");
		Equipo eq5 = new Equipo(5, "Rusia", "Petrunsky", "escudo5.png");
		Equipo eq6 = new Equipo(6, "Portugal", "Carlinho", "escudo6.png");
		Equipo eq7 = new Equipo(7, "España", "Del Bosque", "escudo7.png");
		Equipo eq8 = new Equipo(8, "Egipto", "zalah", "escudo8.png");
		
		listaEquipos.add(eq1);
		listaEquipos.add(eq2);
		listaEquipos.add(eq3);
		listaEquipos.add(eq4);
		listaEquipos.add(eq5);
		listaEquipos.add(eq6);
		listaEquipos.add(eq7);
		listaEquipos.add(eq8);
		
		Jugador jug1 = new Jugador(1, "Falcao", 1.78, 30,9, "falcao.png", eq1);
		Jugador jug2 = new Jugador(2, "Neymar", 1.75, 26,10 ,"Neymar.png", eq2);
		Jugador jug3 = new Jugador(3, "Benzema", 1.84, 29,9, "Benzema.png", eq3);
		Jugador jug4 = new Jugador(4, "Paolo Guerrero", 1.88, 31,11, "Paolo.png", eq4);
		Jugador jug5 = new Jugador(5, "Surickyg", 1.78, 30,8, "Surickyg.png", eq5);
		Jugador jug6 = new Jugador(6, "C.Ronaldo", 1.85, 31,7, "Ronaldo.png", eq6);
		
		listaJugadores.add(jug1);
		listaJugadores.add(jug2);
		listaJugadores.add(jug3);
		listaJugadores.add(jug4);
		listaJugadores.add(jug5);
		listaJugadores.add(jug6);
		
		
		Partido part1 = new Partido(1, "06/18/2018", eq1, eq2, est1, alb1, fs1, 1);
		Partido part2 = new Partido(2, "06/22/2018", eq2, eq3, est2, alb2, fs1, 1);
		Partido part3 = new Partido(3, "06/23/2018", eq1, eq4, est3, alb3, fs1, 1);
		Partido part4 = new Partido(4, "06/25/2018", eq5, eq6, est4, alb4, fs1, 1);
		Partido part5 = new Partido(5, "06/28/2018", eq3, eq5, est5, alb5, fs1, 1);
		
		listaPartidos.add(part1);
		listaPartidos.add(part2);
		listaPartidos.add(part3);
		listaPartidos.add(part4);
		listaPartidos.add(part5);
	}
	
	//permite verificar si la base de datos esta instanciada o no
	public static BaseDatos getInstance()
	{
		
		if(bdLocal == null){
			
			bdLocal = new BaseDatos();
		}
		return bdLocal;
	}

	public ArrayList<Campeonato> getListaCameonatos() {
		return listaCameonatos;
	}

	public ArrayList<Sede> getListaSedes() {
		return listaSedes;
	}

	public ArrayList<Estadio> getListaEstadios() {
		return listaEstadios;
	}

	public ArrayList<Fase> getListaFases() {
		return listaFases;
	}
	
	public ArrayList<Grupo> getListaGrupos() {
		return listaGrupos;
	}

	public ArrayList<Arbitro> getListaArbitros() {
		return listaArbitros;
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}
	
	
	public ArrayList<Partido> getListaPartidos() {
		return listaPartidos;
	}

	public void agregandolo(Jugador jug){
		
		listaJugadores.add(jug);
	}
	
	
	
}
