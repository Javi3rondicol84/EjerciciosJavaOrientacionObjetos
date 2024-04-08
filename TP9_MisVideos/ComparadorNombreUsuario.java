package TP9_MisVideos;

import java.util.Comparator;

public class ComparadorNombreUsuario implements Comparator<Video>{

	@Override
	public int compare(Video v1, Video v2) {
		return v1.getUsuario().getNombreUsuario().compareTo(v2.getUsuario().getNombreUsuario());
	}
	
}
