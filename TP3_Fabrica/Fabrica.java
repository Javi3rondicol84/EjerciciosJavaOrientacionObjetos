package TP3_Fabrica;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fabrica {
	private Mueble [] mu;
	private Stock [] stock;
	
	public Fabrica() {
		this.mu = new Mueble[1];
		this.stock = new Stock[1];
		this.inicializarMueble();
		this.inicializarStock();
	}
	
	public void inicializarMueble() {
		for(int i = 0; i < mu.length; i++) {
			mu[i] = new Mueble();
		}
	}
	
	public void inicializarStock() {
	for(int i = 0; i < stock.length; i++) {
		  stock[i] = new Stock();
		}
	}
	
	public double calcularCostoTotalStock() {
		int suma = 0;
		double costoTotal = 0;
		for(int i = 0; i < stock.length; i++) {
			  suma += stock[i].getCantidad_disponible();	  
		}
		
		//try catch con switch eligiendo si quiere usar el precio de costo o el precio de venta
		
		costoTotal = suma * this.mu[0].getPrecio_costo();
		
		return costoTotal;
	}
	
	
	public void aniadirMueble() {
		double precio_costo;
		String color;
		String tipo_madera;
		double peso;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			for(int i = 0; i < mu.length; i++) {	
				System.out.println("Introduce el precio de fabricacion");
				precio_costo = Double.valueOf(entrada.readLine());
				mu[i].setPrecio_costo(precio_costo);
				
				System.out.println("Introduce el color");
				color = entrada.readLine();
				mu[i].setColor(color);
				
				System.out.println("Introduce el tipo de madera");
				tipo_madera = entrada.readLine();
				mu[i].setTipo_madera(tipo_madera);
				
				System.out.println("Introduce el ");
				peso  = Double.valueOf(entrada.readLine());
				mu[i].setPeso(peso);
			}
			
			
		}
		catch(Exception exc) {
			
		}
		

		
	}
	
	public void guardarProductoEnStock() {
		String nombre_producto;
		int cantidad_disponible;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			for(int i = 0; i < stock.length; i++) {
				System.out.println("Introduce el nombre del producto");
				nombre_producto = entrada.readLine();
				stock[i].setNombre_producto(nombre_producto);
				
				System.out.println("Introduce la cantidad disponible");
				cantidad_disponible = Integer.valueOf(entrada.readLine());
				stock[i].setCantidad_disponible(cantidad_disponible);
				
			}
			
			
		}
		catch(Exception exc) {
			
		}
		
	}
	
	
	
}
