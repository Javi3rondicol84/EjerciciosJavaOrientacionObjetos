package TP9_SitioWebNoticias;

public class FTamanioMayorTexto extends Filtro {
	private int tamanio;
	
	public FTamanioMayorTexto(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTexto().length() > this.tamanio;
	}
}
