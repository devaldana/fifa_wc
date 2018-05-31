package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SedeMB {

	public ArrayList<Sede> listaDeSedes(){
		
		return BaseDatos.getInstance().getListaSedes();
	}
}
