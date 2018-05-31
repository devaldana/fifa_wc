package org.primefaces.ultima.view.test;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CampeonatoMB {

	
	public ArrayList<Campeonato> listaDeCampeonatos(){
		
		return BaseDatos.getInstance().getListaCameonatos();
	}

}
