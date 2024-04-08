package TP9_BazarAladin;

public class FPesoSuperior extends Filtro {
	private double peso;
	
	public FPesoSuperior(double peso) {
		this.peso = peso;
	}
	
	@Override
	public boolean cumple(Elemento elemento) {
		return elemento.getPeso() > this.peso;
	}

}
