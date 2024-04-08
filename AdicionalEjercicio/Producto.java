package AdicionalEjercicio;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double precio;
	private String autor;
	private int cant_paginas;
	private String resumen;
	private ArrayList<String> generos;
	
	public Producto(String nombre, double precio, String autor, int cant_paginas, String resumen) {
		this.nombre = nombre;
		this.precio = precio;
		this.autor = autor;
		this.cant_paginas = cant_paginas;
		this.resumen = resumen;
		this.generos = new ArrayList<String>();
	}
	
	public ArrayList<String> obtenerGeneros() {
		ArrayList<String> copia = new ArrayList<String>(generos);
		
		return copia;
	}
	
	@Override
	public boolean equals(Object o1) {
		
		try {
			Producto p1 = (Producto)o1;
			
			return this.nombre.equals(p1.getNombre()) && this.getPrecio() == p1.getPrecio() && this.autor.equals(p1.getAutor()) && this.getCant_paginas() == p1.getCant_paginas() && this.getResumen().equals(p1.getResumen());
			
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
	
	
	//setters getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCant_paginas() {
		return cant_paginas;
	}

	public void setCant_paginas(int cant_paginas) {
		this.cant_paginas = cant_paginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
