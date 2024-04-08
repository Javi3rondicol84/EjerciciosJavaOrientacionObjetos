package TP9_AlquiloAhora;

import java.util.Comparator;

public class ComparadorID implements Comparator<Item>{

	@Override
	public int compare(Item it1, Item it2) {
		
		return it1.getID() - it2.getID();
	}
}
