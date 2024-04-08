package AdicionalEjercicio;

import java.util.ArrayList;

public class ClienteExigente extends Cliente {

	public ClienteExigente(String nombre, String apellido, int dni,
			String direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean leGustaProducto(Producto pp) {
		int i = 0;
		boolean existeGenero = false;
		ArrayList<String>generosProducto = pp.obtenerGeneros();
		
		while((i < generosProducto.size()) && (!existeGenero)) {
			
			if(this.generos.contains(generosProducto.get(i))) {
				existeGenero = true;
			}
			
		}
		
		return this.autores.contains(pp.getAutor()) && existeGenero;
	}
	
}
