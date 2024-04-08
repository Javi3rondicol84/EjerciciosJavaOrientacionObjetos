package TP6_Alquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Item {
	private LocalDate fecha_venc;
	private String nombre;
	
	public Item() {
		this.fecha_venc = LocalDate.of(2024, 7, 7);
	}
	

	public Item(LocalDate fecha) {
		this.fecha_venc = fecha;
	}
	

	public abstract boolean itemPuedeSerAlquilado();
	
	@Override
	public String toString() {
		return "Item: "+ this.getNombre();
	}
	
	@Override
	public boolean equals(Object o1) {
		
		try {
			Item it = (Item) o1;
			
			return this.getNombre().equals(it);
		}
		catch(Exception e) {
		}
		
		return false;
	}
	
	
	public boolean estaVencido() {
		
		LocalDate actual = LocalDate.now();

		
		return actual.isAfter(this.fecha_venc);
	}

	public LocalDate getFecha_venc() {
		return fecha_venc;
	}

	public void setFecha_venc(LocalDate fecha_venc) {
		this.fecha_venc = fecha_venc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
