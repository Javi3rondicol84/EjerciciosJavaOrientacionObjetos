package TP7_Streaming;

public class Plataforma {
	private Catalogo ct;
	
	public Plataforma() {
		this.ct = new Catalogo();
	}
	
	public Plataforma(Catalogo ct) {
		this.ct = ct;
	}
	
	public static void main(String [] args) {
		Catalogo ct = new Catalogo();
		String comedia = "comedia";
		String infantil = "infantil";
		String documental = "documental";
		
		Pelicula pl = new Pelicula("Batman 2", "secuela de batman", "director3", 2016, 200, 20);
		Pelicula plRentable = new Pelicula("Batman 3", "secuela de batman", "director3", 2020, 100, 20);
		plRentable.aniadirGenero(infantil);
		plRentable.aniadirGenero(documental);
		plRentable.aniadirGenero(comedia);
		plRentable.removerGenero(comedia);
		
		ct.aniadirPelicula(pl);
		ct.aniadirPelicula(plRentable);
		
		ct.buscarEnCatalogo(new FNoTieneDirector("director2"));
		
		ct.peliculaEsRentable(plRentable);
		
		CriterioAñoMenor ct2 = new CriterioAñoMenor(2016);
		
		System.out.println("Criterio cambiado a Año menor a 2016");
		
		ct.cambiarCriterio(ct2);
		
		ct.peliculaEsRentable(plRentable);
		
	}
}
