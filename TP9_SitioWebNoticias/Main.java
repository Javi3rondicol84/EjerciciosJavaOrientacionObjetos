package TP9_SitioWebNoticias;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Seccion categoria = new Seccion("General"); //primer categoria
		
		Seccion seccion1 = new Seccion("Espectaculo");
		
		Noticia not1 = new Noticia("Link 1");
		
		categoria.addContenido(seccion1);
		
		not1.setTitulo("noticia 1");
		not1.setAutor("autor");
		
		seccion1.addContenido(not1);
		
		Seccion seccion2 = new Seccion("Divorcio");
		Noticia not2 = new Noticia("Link 2");
		not2.setTitulo("noticia 2");
		not2.setAutor("autor");
		
		seccion1.addContenido(seccion2);
		
		seccion2.addContenido(not2);
		
		Seccion seccion3 = new Seccion("Deporte");
		Noticia not3 = new Noticia("Link 3");
		not3.setTitulo("noticia 3");
		not3.setAutor("autor");
		
		seccion3.addContenido(not3);
		
		categoria.addContenido(seccion3);
		
		ArrayList <Noticia> lista =  categoria.buscarNoticias(new FAutor("autor"));
		
		System.out.println(lista);
		
		System.out.println(categoria.obtenerListadoSitio());
		
		System.out.println(categoria.getCantidadNoticias());
	}

}
