package TP7_Streaming;

public class FGrabadoAntesYDuraccionMenor extends Filtro {
	
	private int a�o;
	private int duraccion;
	
	public FGrabadoAntesYDuraccionMenor(int a�o, int duraccion) {
		this.a�o = a�o;
		this.duraccion = duraccion;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return new FAND(new FGrabadoAntes(this.a�o), new FDuraccionMenor(this.duraccion)).cumple(pl);
	}

}
