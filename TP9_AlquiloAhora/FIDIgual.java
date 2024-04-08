package TP9_AlquiloAhora;

public class FIDIgual extends Filtro {
	int id;
	
	public FIDIgual(int id) {
		this.id = id;
	}

	@Override
	public boolean cumple(Item item) {
		return item.getID() == id;
	}
	
	
}
