package TP9_SistemaArchivos;

public class FTamanioMayor extends Filtro {
	private int tamanio;
	
	public FTamanioMayor(int tamanio) {
		this.tamanio = tamanio;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return elemento.getTamanio() > this.tamanio;
	}

}
