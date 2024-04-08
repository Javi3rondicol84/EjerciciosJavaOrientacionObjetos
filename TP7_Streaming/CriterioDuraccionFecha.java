package TP7_Streaming;

public class CriterioDuraccionFecha extends Criterio {
	private static int a�o = 2017;
	private static int minutosDuraccion = 120;
	private static String genero1 = "comedia";
	private static String genero2 = "infantil";
	private static String genero3 = "documental";


	@Override
	public boolean cumpleCriterio(Pelicula pl) {
		return ( (pl.getMinutosDuraccion() < this.minutosDuraccion) && (!pl.obtenerGeneros().contains(this.genero1)) )
				&& ( (pl.getA�o_estreno() > this.a�o) || (pl.obtenerGeneros().contains(this.genero2)) || (pl.obtenerGeneros().contains(this.genero3)));
	
	}

}
