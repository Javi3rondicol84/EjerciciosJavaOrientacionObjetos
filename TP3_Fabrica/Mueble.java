package TP3_Fabrica;

public class Mueble {
	private double precio_venta;
	private double precio_costo;
	private String color;
	private String tipo_madera;
	private double peso;
	private double aumento = 1.35;
	
	public Mueble() {
		
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = this.precio_costo * this.aumento;
	}

	public double getPrecio_costo() {
		return precio_costo;
	}

	public void setPrecio_costo(double precio_costo) {
		this.precio_costo = precio_costo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo_madera() {
		return tipo_madera;
	}

	public void setTipo_madera(String tipo_madera) {
		this.tipo_madera = tipo_madera;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
