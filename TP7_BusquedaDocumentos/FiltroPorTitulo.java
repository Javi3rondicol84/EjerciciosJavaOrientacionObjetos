package TP7_BusquedaDocumentos;

public class FiltroPorTitulo extends Filtro {
	private String titulo;
	
	public FiltroPorTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public boolean cumpleCondicion(Documento dt) {
		return dt.getTitulo().equals(this.titulo);
	}
	
	
}
