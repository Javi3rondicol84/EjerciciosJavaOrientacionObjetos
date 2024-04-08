package TP7_V2_Streaming;

public class Main {

	public static void main(String [] args) {
		
		FiltroPeliculaDuraccionMenor duraccionMenor = new FiltroPeliculaDuraccionMenor(120);
		
		FiltroNOT noTieneGenero = new FiltroNOT(new FiltroPeliculaContieneGenero("comedia"));
		
		FiltroAND politica = new FiltroAND(duraccionMenor, noTieneGenero);
		
		Plataforma streaming = new Plataforma(politica);
		
		Pelicula pl1 = new Pelicula("titulo1", "sinopsis1", "director1", 2017, 100, 21);
		
		pl1.addGenero("comedia");
		
		System.out.println(streaming.esRentable(pl1));
	}
	
}
