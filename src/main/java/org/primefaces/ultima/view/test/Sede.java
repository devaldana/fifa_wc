package org.primefaces.ultima.view.test;

public class Sede {
			
			private int id;
			private String nombre;
			private String region;
			private int temperatura;
			
			public Sede() {}

			public Sede(int id, String nombre, String region, int temperatura) {
				super();
				this.id = id;
				this.nombre = nombre;
				this.region = region;
				this.temperatura = temperatura;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getRegion() {
				return region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public int getTemperatura() {
				return temperatura;
			}

			public void setTemperatura(int temperatura) {
				this.temperatura = temperatura;
			}
			
			
}
