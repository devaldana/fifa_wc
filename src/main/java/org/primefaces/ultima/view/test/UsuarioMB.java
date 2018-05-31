package org.primefaces.ultima.view.test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioMB {
		
	
	public ArrayList<Usuario> listaUsuarios(){
		
		return BaseDatos.getInstance().getListaUsuarios();
	}
}
