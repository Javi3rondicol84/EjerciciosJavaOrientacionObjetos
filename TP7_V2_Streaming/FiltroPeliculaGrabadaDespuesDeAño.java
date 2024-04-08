package TP7_V2_Streaming;

public class FiltroPeliculaGrabadaDespuesDeAño extends Filtro {
	
	private int año;
	
	public FiltroPeliculaGrabadaDespuesDeAño(int año) {
		this.año = año;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getAñoEstreno() > this.año;
	}

}
