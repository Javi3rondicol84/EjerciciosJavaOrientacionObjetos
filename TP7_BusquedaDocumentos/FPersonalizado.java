package TP7_BusquedaDocumentos;
//que tenga un titulo exacto y contenga x autor y el contenido tenga al menos x palabras
public class FPersonalizado extends Filtro {
	private String titulo; 
	private String autor;
	private int cant_palabras;
	
	public FPersonalizado(String titulo, String autor, int cant_palabras) {
		this.titulo = titulo;
		this.autor = autor;
		this.cant_palabras = cant_palabras; 
	}

	@Override
	public boolean cumpleCondicion(Documento dt) {
		FiltroPorTitulo ft = new FiltroPorTitulo(this.titulo);
		FiltroPorAutor ft2 = new FiltroPorAutor(this.autor);
		FContenidoTengaXPalabras ft3 = new FContenidoTengaXPalabras(2);
		return new FiltroAND(ft, ft2).cumpleCondicion(dt) && ft3.cumpleCondicion(dt);
	}
	
	

}
