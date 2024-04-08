package TP4_Seleccion;

import java.time.LocalDate;

public class Contingente {
	private String nombre;
	private String apellido;
	private int pasaporte;
	private LocalDate fecn;
	private String estado;
	private boolean disponible;
	private String rol;
	//constante con estados
	//poner objeto seleccion
	
	public Contingente() {
		this.fecn = LocalDate.of(2000,  8, 23);
		this.setNombre("Juan");
		this.setApellido("Apellido");
		this.setPasaporte(121212);
	
	}
	

	public void verSiEstaDisponible() {
		if(this.getDisponible()) {
			System.out.println("El "+ this.getRol() + " " + this.getNombre() + " esta disponible.");
		}
		else {
			System.out.println("El "+ this.getRol() + " " + this.getNombre() + " NO esta disponible.");
		}
	}
	
	
	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		
		if(estado.equals("Viajando") || estado.equals("En concentracion") || estado.equals("En pais de origen")) {
			this.estado = estado;
			if((this.getEstado().equals("En pais de origen")) && !(this.getEstado().equals("En concentracion"))) {
				this.setDisponible(true);
			}
			else {
				this.setDisponible(false);
			}
		}
		else {
			System.out.println("El estado solo puede ser 'viajando', 'en concentracion', o 'en pais de origen'");
		}
		
	
	}



	public boolean getDisponible() {
		return disponible;
	}



	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		if(rol.equals("Futbolista") || rol.equals("Entrenador") || rol.equals("Masajista")) {
			this.rol = rol;
		}
		else {
			System.out.println("El rol debe ser futbolista, entrenador o masajista");
			this.rol = "Contingente";
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

	public int getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}

	public LocalDate getFecn() {
		return fecn;
	}

	public void setFecn(LocalDate fecn) {
		this.fecn = fecn;
	}
	
	public static void main(String [] args) {
		Futbolista futbol = new Futbolista();
		Entrenador entrenador = new Entrenador();
		Masajista masajista = new Masajista();
		
		futbol.verSiEstaDisponible();
		entrenador.verSiEstaDisponible();
		masajista.verSiEstaDisponible();

	}

	
	
}
