package TP9_AlquiloAhora;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Item>{
	private Comparator<Item> comp1;
	private Comparator<Item> comp2;
	
	public ComparadorCompuesto(Comparator<Item> comp1, Comparator<Item> comp2) {
		this.comp1 = comp1;
		this.comp2 = comp2;
	}

	@Override
	public int compare(Item it1, Item it2) {
		int resultado = comp1.compare(it1, it2);
		
		if(resultado != 0) {
			return 1;
		}
		else {
			return comp2.compare(it1, it2);
		}
		
	}
	
	
}
