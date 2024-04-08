package practico6Ej1SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private ArrayList<Item> itemAlquiladosCliente;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		itemAlquiladosCliente = new ArrayList<>();
	}
	
	public void addItemAlquiladoCliente(Item i) {
		itemAlquiladosCliente.add(i);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Item> getitemAlquiladosCliente(){
		return new ArrayList<Item>(itemAlquiladosCliente); //hago el arreglo de items sin usar for...
	}

	public String toString () {
		return this.getNombre();
	}
	public boolean miAlquilerEstaVencido(LocalDate f1, LocalDate f2) {
		return f1.isAfter(f2);
	}
}
