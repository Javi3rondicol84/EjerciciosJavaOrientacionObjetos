package TP3_Fabrica;

public class Stock {
	private String nombre_producto;
	private int cantidad_disponible;
	
	public Stock() {
		
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		
		if(nombre_producto.equals("Silla") || nombre_producto.equals("Mesa") || nombre_producto.equals("Banco")) {
			this.nombre_producto = nombre_producto;
		}
		else {
			System.out.println("Error, solo se venden sillas, mesas y bancos");
		}
		
		
	}

	public int getCantidad_disponible() {
		return cantidad_disponible;
	}

	public void setCantidad_disponible(int cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}
	
	

}
