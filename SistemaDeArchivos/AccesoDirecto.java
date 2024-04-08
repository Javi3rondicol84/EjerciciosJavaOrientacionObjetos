package SistemaDeArchivos;

public class AccesoDirecto extends Elemento {

	private static final Double TAMANIO = 1.0;
	private Elemento referencia;
	private static final String PREFIJO = "Acceso directo a ";
	
	public AccesoDirecto(Elemento referenciado) {
		super(PREFIJO + referenciado.getNombre());
		this.referencia = referenciado;
		
	}
	
	@Override
	public Double getTamanio() {
		return TAMANIO;
	}

}
