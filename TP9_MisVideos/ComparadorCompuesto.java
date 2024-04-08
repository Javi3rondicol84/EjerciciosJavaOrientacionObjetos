package TP9_MisVideos;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Video>{
	private Comparator<Video> comp1;
	private Comparator<Video> comp2;

@Override
	public int compare(Video v1, Video v2) {
		int resultado = comp1.compare(v1, v2);
		
		if(resultado != 0) {
			return 1;
		}
		else {
			return comp2.compare(v1, v2);
		}
	
	}

}
