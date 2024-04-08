package TP6_Alquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
	private ArrayList<Cliente> clientes;
	
	public Alquiler() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	//VER TEMA VEHICULOS SOLO PARA UN CLIENTE, SI HAY OTROS CLIENTES YA CON DICHO VEHICULO, ESTE NO PUEDE ANIADIRSE OTRA VEZ
	//CONTAINS(VEHICULO/ITEM);
	
	public static void main(String [] args) {
		
		LocalDate f1 = LocalDate.of(2023, 9, 26);
		LocalDate f2 = LocalDate.of(2023, 9, 28);
		LocalDate f3 = LocalDate.of(2023, 9, 30);
		
		Alquiler al = new Alquiler();
		Vehiculo ve = new Vehiculo(20, "Marca 1", "sdsd3434", "naftero", "Coche generico", f1);
		Pelicula pe = new Pelicula("Pelicula1", 2, f3);
		Cliente cl = new Cliente();
		Cliente cl2 = new Cliente();
		cl2.setNombre("Marcos");
		ve.setTipo_vehiculo("Naftero");
		
		al.alquilarItemACliente(pe, cl);
		al.alquilarItemACliente(pe, cl2);
		System.out.println();
		al.alquilarItemACliente(ve, cl);
		al.alquilarItemACliente(ve, cl2);

		al.aniadirCliente(cl);
		al.aniadirCliente(cl2);
		al.verItemsAlquiladosClientes();
		
	}
	
	public void aniadirCliente(Cliente ct) {
		if(!this.clientes.contains(ct)) {
			this.clientes.add(ct);
		}
	}
	
	
	public void alquilarItemACliente(Item it, Cliente ct) { //poner fecha de vencimiento
		ct.alquilaItem(it);
	}
	
	public void verItemsAlquiladosClientes() {
		ArrayList<Item> items;
		
		if(!this.clientes.isEmpty()) {
			for(int i = 0; i < this.clientes.size(); i++) {
				items = this.clientes.get(i).obtenerItemsAlquilados();
				
				System.out.println("Items del cliente "+this.clientes.get(i).getNombre()+ ":");
				verItemsCliente(items);
				System.out.println();
			}
		}
		else {
			System.out.println("No hay clientes guardados en el registro");
		}

	}
	
	
	
	private void verItemsCliente(ArrayList<Item> items) {
		for(int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getNombre());
		}
	}
	
	
	
	
	//funcionalidad necesaria para permitir conocer quiénes son los clientes que poseen alquileres vencidos.

	public void verClientesAlquilerVencido() {
		
		for(int i = 0; i < this.clientes.size(); i++) {
			
			if(tieneItemsVencidos(this.clientes.get(i))) {
				System.out.println("El cliente "+this.clientes.get(i).getNombre()+" tiene alquileres vencidos");
			}
			
		}
		
	}
	
	
	public boolean tieneItemsVencidos(Cliente cl) {
		ArrayList<Item> items = cl.obtenerItemsAlquilados();
		
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i).estaVencido()) {
				return true;
			}
		}
		
		return false;
	}


	
	
}
