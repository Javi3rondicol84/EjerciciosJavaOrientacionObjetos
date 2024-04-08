package TP6_Alquiler;

import java.util.ArrayList;

public class Cliente {
	private ArrayList<Item> itemsAlquilados;
	private String nombre;
	
	public Cliente() {
		this.itemsAlquilados = new ArrayList<Item>();
		this.setNombre("Juan");
	}
 	
	public void alquilaItem(Item it) {
		if(it.itemPuedeSerAlquilado() && !it.estaVencido()) {
			this.itemsAlquilados.add(it);
			System.out.println(it.getNombre() + " Alquilado al Cliente "+this.nombre);
		}
		else {
			System.out.println("el item "+it.getNombre()+" no puede ser alquilado al cliente "+this.getNombre());
		}
	}
	
	public void removerItem(Item it) {
		if(this.itemsAlquilados.contains(it)) {
			this.itemsAlquilados.remove(it);
		}
	}
	
	public ArrayList<Item> obtenerItemsAlquilados() {
		ArrayList<Item> copia = new ArrayList<Item>(this.itemsAlquilados);
		
		return copia;
	}
	
	public void setItemsAlquilados(ArrayList<Item> itemsAlquilados) {
		this.itemsAlquilados = itemsAlquilados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object o1) {
		
		try {
			Cliente cl = (Cliente) o1;
			
			return this.getNombre().equals(cl);
		}
		catch(Exception e) {
		}
		
		return false;
	}
	
	
}
