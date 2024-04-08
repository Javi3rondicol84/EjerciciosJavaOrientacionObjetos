package TP9_AlquiloAhora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComboArmado extends ItemGeneral {
	private ArrayList<ItemGeneral> itemsAlquiler;
	
	public ComboArmado(String nombre) {
		super(nombre);
		this.itemsAlquiler = new ArrayList<ItemGeneral>();
	}

	public void addItemGeneral(Item item) {
		if(!this.itemsAlquiler.contains(item)) {
			this.itemsAlquiler.add(item);
		}
	}
	
	@Override
	public ArrayList<Item> buscar(Filtro filtro, Comparator<Item> comp) {
		ArrayList<Item> lista = new ArrayList<Item>();
		
		for(int i = 0; i < this.itemsAlquiler.size(); i++) {
			lista.addAll(this.itemsAlquiler.get(i).buscar(filtro, comp));
		}
		
		if(comp != null) {
			Collections.sort(lista, comp);
		}
		
		return lista;
	}
}
