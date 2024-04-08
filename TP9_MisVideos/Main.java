package TP9_MisVideos;

public class Main {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("CocinaTotal", 2017, "autor1@gmail.com");
		Usuario user2 = new Usuario("BenMarkus", 2015, "autor2@gmail.com");

		Video video = new Video(user1);
		Video video2 = new Video(user2);
		
		video.setMeGusta(200);
		video2.setMeGusta(350);
		
		video.setDuraccion(200);
		video2.setDuraccion(500);
		
		video.addTag("tag1");
		video.addTag("tag2");
		video.addTag("tag3");
		
		video2.addTag("tag4");
		video2.addTag("tag5");
		video2.addTag("tag6");
		
		PlayList lista = new PlayList("PlayList1", 5);
		
		lista.addElemento(video);
		lista.addElemento(video2);
		
		ComparadorNombreUsuario comp = new ComparadorNombreUsuario();
		FMasDeXMeGusta filtro = new FMasDeXMeGusta(20);
		
		System.out.println("Lista: ");
		System.out.println(lista.buscar(filtro, comp)); 
		System.out.println();
		System.out.println("Categorias: ");
		System.out.println(lista.getCategorias());
		System.out.println();
		System.out.println("Duraccion Playlist");
		System.out.println(lista.getDuraccion());
		System.out.println();
		System.out.println("Cantidad de Videos: ");
		System.out.println(lista.getCantidadVideos());
		
	}

}
