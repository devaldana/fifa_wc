package org.primefaces.ultima.view.test;

public class Arbitro {
			
		private int id;
		private String nombre;
		private double estatura;
		private int edad;
		private String nacionalidad;
		private String foto;
		private int patidosPitados;
		private int tarjetasAmarillas;
		private int tarjetasRojas;
		
		public Arbitro() {}

		public Arbitro(int id, String nombre, double estatura, int edad, String nacionalidad, String foto,
				int patidosPitados, int tarjetasAmarillas, int tarjetasRojas) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.estatura = estatura;
			this.edad = edad;
			this.nacionalidad = nacionalidad;
			this.foto = foto;
			this.patidosPitados = patidosPitados;
			this.tarjetasAmarillas = tarjetasAmarillas;
			this.tarjetasRojas = tarjetasRojas;
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

		public double getEstatura() {
			return estatura;
		}

		public void setEstatura(double estatura) {
			this.estatura = estatura;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public int getPatidosPitados() {
			return patidosPitados;
		}

		public void setPatidosPitados(int patidosPitados) {
			this.patidosPitados = patidosPitados;
		}

		public int getTarjetasAmarillas() {
			return tarjetasAmarillas;
		}

		public void setTarjetasAmarillas(int tarjetasAmarillas) {
			this.tarjetasAmarillas = tarjetasAmarillas;
		}

		public int getTarjetasRojas() {
			return tarjetasRojas;
		}

		public void setTarjetasRojas(int tarjetasRojas) {
			this.tarjetasRojas = tarjetasRojas;
		}
		
		
}
