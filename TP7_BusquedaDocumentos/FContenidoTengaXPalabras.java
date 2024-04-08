package TP7_BusquedaDocumentos;

public class FContenidoTengaXPalabras extends Filtro {
	private int cant_palabras;
	
	public FContenidoTengaXPalabras(int cant_palabras) {
		this.cant_palabras = cant_palabras;
	}

	@Override
	public boolean cumpleCondicion(Documento dt) {
		String [] cant_pal = dt.getContenido_textual().split(" ");
		
		return cant_pal.length >= this.cant_palabras;
	}
}
