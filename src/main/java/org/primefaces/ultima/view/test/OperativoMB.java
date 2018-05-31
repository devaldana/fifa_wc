package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OperativoMB {

	private ArrayList<String> listaEncuentros = new ArrayList<String>();
	private ArrayList<String> listaTipoGol = new ArrayList<String>();
	

	public ArrayList<String> mostrarPartidos() {

		ArrayList<Equipo> lista = BaseDatos.getInstance().getListaEquipos();

		for (int i = 0; i < lista.size(); i++) {

			Equipo actual = lista.get(i);
			Equipo actualD = lista.get(++i);

			listaEncuentros.add(actual.getNombre() + " vs " + actualD.getNombre());
		}
		return listaEncuentros;
	}
	
	public ArrayList<String> listaDeTipoGol()
	{
		String[] tipoGol = {"Penal","Tiro Libre","Autogol"};
		
		for (int i = 0; i < tipoGol.length; i++) {
			
			String actual = tipoGol[i];
			
			listaTipoGol.add(actual);
		}
		return listaTipoGol;
		
	}
	
	public void agregarNumeroGoles()
	{
		
	}
	
	public ArrayList<String> getListaEncuentros() {
		return listaEncuentros;
	}

	public void setListaEncuentros(ArrayList<String> listaEncuentros) {
		this.listaEncuentros = listaEncuentros;
	}
	
	public ArrayList<String> getListaTipoGol() {
		return listaTipoGol;
	}

	public void setListaTipoGol(ArrayList<String> listaTipoGol) {
		this.listaTipoGol = listaTipoGol;
	}

	public static void main(String[] args) {

		OperativoMB nuevo = new OperativoMB();

		System.out.println(nuevo.listaDeTipoGol());

	}
	
	

}
