package TP9_SitioWebNoticias;

public class FTitulo extends Filtro {
	private String titulo;
	
	public FTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getTitulo().equals(this.titulo);
	}

}
