package TP7_V2_Streaming;

public class FiltroPeliculaGrabadaAntesDeAño extends Filtro {
	private int año;
	
	public FiltroPeliculaGrabadaAntesDeAño(int año) {
		this.año = año;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getAñoEstreno() < this.año;
	}
	
	

}
