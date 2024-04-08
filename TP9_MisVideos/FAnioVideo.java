package TP9_MisVideos;

public class FAnioVideo extends Filtro {
	private int anio;
	
	public FAnioVideo(int anio) {
		this.anio = anio;
	}
	@Override
	public boolean cumple(Video video) {
		return video.getAñoPublicacion() == this.anio;
	}
}
