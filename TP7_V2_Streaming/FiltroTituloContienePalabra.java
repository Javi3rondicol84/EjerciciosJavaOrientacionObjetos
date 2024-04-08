package TP7_V2_Streaming;

public class FiltroTituloContienePalabra extends Filtro {
	private String subString;
	
	public FiltroTituloContienePalabra(String titulo) {
		this.subString = titulo;
	}

	@Override
	public boolean cumple(Pelicula pl) {
		return pl.getTitulo().contains(this.subString);
	}

	
	
}
