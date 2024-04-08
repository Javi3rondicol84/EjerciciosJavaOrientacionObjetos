package TP7_Streaming;

public class FTituloContiene extends Filtro {
	private String palabra;
	
	public FTituloContiene(String palabra) {
		this.palabra = palabra;
	}
	
	
	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getTitulo().contains(this.palabra);
	}

}
