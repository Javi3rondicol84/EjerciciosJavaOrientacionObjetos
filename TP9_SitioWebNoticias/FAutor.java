package TP9_SitioWebNoticias;

public class FAutor extends Filtro {

	private String autor;
	
	public FAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getAutor().equals(this.autor);
	}

}
