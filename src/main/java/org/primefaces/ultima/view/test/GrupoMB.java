package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GrupoMB {
	
	public ArrayList<Grupo> listaGrupos()
	{
		return BaseDatos.getInstance().getListaGrupos();
	}
}
