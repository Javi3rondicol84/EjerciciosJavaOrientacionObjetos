package TP7_V2_Streaming;

public class FiltroPeliculaGrabadaDespuesDeA�o extends Filtro {
	
	private int a�o;
	
	public FiltroPeliculaGrabadaDespuesDeA�o(int a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getA�oEstreno() > this.a�o;
	}

}
