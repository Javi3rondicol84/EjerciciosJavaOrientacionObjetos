package TP7_BusquedaDocumentos;

public class FContenidoTienePalabra extends Filtro {
	private String palabra;
	
	public FContenidoTienePalabra(String palabra) {
		this.palabra = palabra;
	}
	
	@Override
	public boolean cumpleCondicion(Documento dt) {
		return dt.getContenido_textual().contains(this.palabra);
	}

}
