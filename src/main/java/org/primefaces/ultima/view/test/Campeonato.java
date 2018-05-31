package org.primefaces.ultima.view.test;

public class Campeonato {

	
		private int anio;
		private String nombre;
		private boolean estado;
		
		public Campeonato() {
			
		}

		public Campeonato(int anio, String nombre, boolean estado) {
			super();
			this.anio = anio;
			this.nombre = nombre;
			this.estado = estado;
		}

		public int getAnio() {
			return anio;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		
		
}
