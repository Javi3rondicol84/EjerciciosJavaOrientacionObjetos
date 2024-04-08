package TP6_Alquiler;

import java.time.LocalDate;

public class Pelicula extends Item {
	private String informacion;
	private int cant_copias_disponibles;
	
	public Pelicula() {
		super();
		this.setNombre("Pelicula Matrix");
		this.setCant_copias_disponibles(2);
	}
	
	public Pelicula(String nombre, int cant, LocalDate fecha) {
		super(fecha);
		this.setNombre(nombre);
		this.setCant_copias_disponibles(cant);
	}
	
	@Override
	public boolean itemPuedeSerAlquilado() {
		if(this.getCant_copias_disponibles() > 0) {
			this.setCant_copias_disponibles(this.getCant_copias_disponibles() - 1);
			return true;
		}
		
		return false;
	}


	public String getInformacion() {
		return informacion;
	}


	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}


	public int getCant_copias_disponibles() {
		return cant_copias_disponibles;
	}


	public void setCant_copias_disponibles(int cant_copias_disponibles) {
		this.cant_copias_disponibles = cant_copias_disponibles;
	}
	
	

}
