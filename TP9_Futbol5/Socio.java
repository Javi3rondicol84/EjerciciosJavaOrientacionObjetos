package TP9_Futbol5;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean pagoUltimaCuota;
	private ArrayList<Alquiler> alquileres;
	
	public String toString() {
		return "Nombre: "+this.getNombre()+", Apellido: "+this.getApellido()+", Edad: "+this.edad+", Pago: "+this.isPagoUltimaCuota();
	}
	
	public Socio(String nombre, String apellido, int edad, boolean pagoUltimaCuota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pagoUltimaCuota = pagoUltimaCuota;
		this.alquileres = new ArrayList<Alquiler>();
	}
	
	
	public void addAlquiler(Alquiler al) {
		this.alquileres.add(al);
	}
	
	
	public boolean equals(Object obj) {
		Socio sc = (Socio) obj;
				
		try {
			if(this.getNombre().equals(sc.getNombre()) && this.getApellido().equals(sc.getApellido())) {
				return true;
			}
			
		}
		catch(Exception exc) {
			
		}
		
		return false;
	}
	

	
	public boolean alquiloCanchaId(int id) {
		
		for(int i = 0; i < this.alquileres.size(); i++) {
			if(this.alquileres.get(i).getID() == id) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean pagoPrecioSuperior(int precio) {
		
		for(int i = 0; i < this.alquileres.size(); i++) {
			if(this.alquileres.get(i).getPrecio() > precio) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getCantidadTotalAlquiler(int id) {
		
		int suma = 0;
		
		for(int i = 0; i < this.alquileres.size(); i++) {
			if(this.alquiloCanchaId(id)) {
				suma++;
			}
		}
		
		return suma;
	}
	
	public void veralquileres() {
		for(int i = 0; i < this.alquileres.size(); i++) {
			System.out.println(this.alquileres.get(i).getID());
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isPagoUltimaCuota() {
		return pagoUltimaCuota;
	}
	public void setPagoUltimaCuota(boolean pagoUltimaCuota) {
		this.pagoUltimaCuota = pagoUltimaCuota;
	}

	@Override
	public int compareTo(Socio sc) {
		return this.getApellido().compareTo(sc.getApellido());
	}
	
	

}
