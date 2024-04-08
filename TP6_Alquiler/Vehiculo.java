package TP6_Alquiler;

import java.time.LocalDate;

public class Vehiculo extends Item{
	private static boolean estaAlquilado;
	private String marca;
	private int kms;
	private String patente;
	private String tipo_vehiculo;
	
	public Vehiculo() {
		this.setKms(200);
		this.setMarca("Marca X");
		this.setPatente("P3s22");
		this.setTipo_vehiculo("naftero");
		this.setNombre("Coche Generico");
	}
	
	public Vehiculo(int km, String marca, String patente, String tipo_vehiculo, String nombre, LocalDate fecha) {
		super(fecha);
		this.setKms(km);
		this.setMarca(marca);
		this.setPatente(patente);
		this.setTipo_vehiculo(tipo_vehiculo);
		this.setNombre(nombre);
	}
	
	public void setEstaAlquilado(boolean estaAlquilado) {
		this.estaAlquilado = estaAlquilado;
	}

	@Override
	public boolean itemPuedeSerAlquilado() {
		
		if(this.isEstaAlquilado()) {
			return false;
		}
		else {
			this.setEstaAlquilado(true);
			return true;
		}
		
	}
	
	

	public static boolean isEstaAlquilado() {
		return estaAlquilado;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_veh) {
		String tipo_vehiculo_min = tipo_veh.toLowerCase();
		if(tipo_vehiculo_min.equals("electrico") || tipo_vehiculo_min.equals("naftero") || tipo_vehiculo_min.equals("diesel")) {
			this.tipo_vehiculo = tipo_veh;
		}
		else {
			System.out.println("El Tipo de Vehiculo debe ser electrico, naftero o diesel");
		}
		
	}
	
	

}
