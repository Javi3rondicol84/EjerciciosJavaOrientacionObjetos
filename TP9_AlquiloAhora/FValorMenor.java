package TP9_AlquiloAhora;

public class FValorMenor extends Filtro {
	int valor;
	
	public FValorMenor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean cumple(Item item) {
		return item.getValor() < this.valor;
	}

}
