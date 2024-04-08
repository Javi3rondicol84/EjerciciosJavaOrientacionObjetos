package TP7_BusquedaDocumentos;

public class FiltroPorAutor extends Filtro {
	private String autor;
	
	public FiltroPorAutor(String autor) {
		this.autor = autor.toLowerCase();
	}

	@Override
	public boolean cumpleCondicion(Documento dt) {
		return dt.getAutores().contains(this.autor);
	}
}
