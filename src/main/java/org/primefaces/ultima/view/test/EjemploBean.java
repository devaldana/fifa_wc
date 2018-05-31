package org.primefaces.ultima.view.test;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EjemploBean {

	public List<String> getList() {
		
		return Arrays.asList("Aleja", "Douglas", "David");
	}
}
