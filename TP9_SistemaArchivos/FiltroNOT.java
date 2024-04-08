package TP9_SistemaArchivos;

public class FiltroNOT extends Filtro {
	private Filtro filtro;
	
	public FiltroNOT(Filtro filtro) {
		this.filtro = filtro;
	}
	
	@Override
	public boolean cumple(ElementoSA elemento) {
		return !this.filtro.cumple(elemento);
	}

}
