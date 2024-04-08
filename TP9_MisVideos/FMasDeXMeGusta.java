package TP9_MisVideos;

public class FMasDeXMeGusta extends Filtro {
	private int meGusta;
	
	public FMasDeXMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}
	@Override
	public boolean cumple(Video video) {
		return video.getMeGusta() > this.meGusta;
	}
}
