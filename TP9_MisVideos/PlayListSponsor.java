package TP9_MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public class PlayListSponsor extends PlayList {
	private Video videoSponsor;
	
	public PlayListSponsor(String titulo, double tiempoCarga, Video videoSponsor) {
		super(titulo, tiempoCarga);
		this.videoSponsor = videoSponsor;
	}

	public void setVideoSponsor(Video videoSponsor) {
		this.videoSponsor = videoSponsor;
	}
	
	@Override
	public ArrayList<Video> buscar(Filtro filtro, Comparator<Video> comp) {
		ArrayList<Video> lista = new ArrayList<Video>();
		
		if(this.videoSponsor != null) {
			lista.add(0, this.videoSponsor);
		}
		
		for(int i = 0; i < this.elementos.size(); i++) {
			lista.addAll(this.elementos.get(i).buscar(filtro, comp));
		}
		
		
		
		return lista;
	}
	
}
