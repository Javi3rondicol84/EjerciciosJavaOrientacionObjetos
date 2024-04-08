package TP7_Streaming;

public class FGrabadoAntes extends Filtro {
	private int año;
	
	public FGrabadoAntes(int año) {
		this.año = año;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getAño_estreno() < this.año;
	}

}
