package TP9_MisVideos;

public class FMasDeXVisualizaciones extends Filtro {
	private int visualizaciones;
	
	public FMasDeXVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	@Override
	public boolean cumple(Video video) {
		return video.getVisualizaciones() > this.visualizaciones;
	}

}
