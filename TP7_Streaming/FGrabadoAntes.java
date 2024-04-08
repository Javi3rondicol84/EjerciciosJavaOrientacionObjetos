package TP7_Streaming;

public class FGrabadoAntes extends Filtro {
	private int a�o;
	
	public FGrabadoAntes(int a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getA�o_estreno() < this.a�o;
	}

}
