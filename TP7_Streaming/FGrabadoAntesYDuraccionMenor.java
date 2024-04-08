package TP7_Streaming;

public class FGrabadoAntesYDuraccionMenor extends Filtro {
	
	private int año;
	private int duraccion;
	
	public FGrabadoAntesYDuraccionMenor(int año, int duraccion) {
		this.año = año;
		this.duraccion = duraccion;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return new FAND(new FGrabadoAntes(this.año), new FDuraccionMenor(this.duraccion)).cumple(pl);
	}

}
