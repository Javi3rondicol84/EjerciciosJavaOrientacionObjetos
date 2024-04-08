package TP9_MisVideos;

public class FContieneTag extends Filtro {
	private String tag;
	
	public FContieneTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public boolean cumple(Video video) {
		return video.contieneTag(this.tag);
	}

}
