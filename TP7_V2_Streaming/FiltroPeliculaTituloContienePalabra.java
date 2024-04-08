package TP7_V2_Streaming;

public class FiltroPeliculaTituloContienePalabra extends Filtro {
	private String subString;
	
	public FiltroPeliculaTituloContienePalabra(String titulo) {
		this.subString = titulo;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getTitulo().contains(this.subString);
	}

	
	
}
