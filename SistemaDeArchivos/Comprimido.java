package SistemaDeArchivos;

public class Comprimido extends Carpeta {
	private Double tasa_compresion;
	
	public Comprimido(String nombre ,Double tasa_comp) {
		super(nombre);
		this.tasa_compresion = tasa_comp;
	}

	public Double getTasa_compresion() {
		return super.getTamanio() * tasa_compresion;
	}

	public void setTasa_compresion(Double tasa_compresion) {
		this.tasa_compresion = tasa_compresion;
	}
	
	

}
