package TP9_MisVideos;

public class FAutor extends Filtro {
	private String autor;
	
	public FAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public boolean cumple(Video video) {
		return video.getUsuario().getNombreUsuario().equals(this.autor);
	}
}
