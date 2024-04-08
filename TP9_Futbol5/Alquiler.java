package TP9_Futbol5;

import java.time.LocalDate;

public class Alquiler {
	private LocalDate fecha;
	private int precio;
	private int ID;
	
	public Alquiler(LocalDate fecha, int precio, int id) {
		this.fecha = fecha;
		this.precio = precio;
		this.ID = id;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	
}
