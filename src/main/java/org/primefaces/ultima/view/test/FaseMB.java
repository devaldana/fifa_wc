package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FaseMB {
		
	public ArrayList<Fase> listaFases()
	{
		return BaseDatos.getInstance().getListaFases();
	}
}
