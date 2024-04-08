package TP7_BusquedaDocumentos;

import java.util.ArrayList;

public class Coleccion {
	private ArrayList<Documento> documentos;
	
	public Coleccion() {
		this.documentos = new ArrayList<Documento>();
		
	}
	
	public static void main(String [] args) {
		Coleccion cl = new Coleccion();
		
/*		FContenidoTengaXPalabras ft = new FContenidoTengaXPalabras(2);
		String contenido = "palabra1, palabra2, palabra3";
		
		Documento dt = new Documento("titulo", contenido);
		
		System.out.println(ft.cumpleCondicion(dt));
	*/
		String contenido = "palabra1, palabra2, palabra3";
		
		Documento dt = new Documento("doc1", contenido);
		Documento dt2 = new Documento("doct2", contenido);
	
		cl.aniadirDocumentoColeccion(dt);
		cl.aniadirDocumentoColeccion(dt2);
		
		String palabra = "doc";
		
		FiltroPalabraEnTitulo ft = new FiltroPalabraEnTitulo(palabra);
		FiltroPorAutor ftAutor = new FiltroPorAutor("autor1");
		FPersonalizado ftPer = new FPersonalizado("doc1", "autor1", 2);
		
		cl.buscar(ft);
		cl.buscar(ftAutor);
		cl.buscar(ftPer);
		
		
	}
	
	public void buscar(Filtro ft) {
		
		for(int i = 0; i < this.documentos.size(); i++) {
			if(ft.cumpleCondicion(this.documentos.get(i))) {
				System.out.println(this.documentos.get(i));
			}
		}
		
		System.out.println();
	}
	
	public void aniadirDocumentoColeccion(Documento dt) {
		if(!this.documentos.contains(dt)) {
			this.documentos.add(dt);
		}
		
	}
	
}
