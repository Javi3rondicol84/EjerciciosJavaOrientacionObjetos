package TP9_BazarAladin;

import java.util.ArrayList;

public class Producto extends Elemento {
	private double peso;
	private Calculador calculador;
	private ArrayList<String> categorias;
	
	public Producto(String nombre, Calculador calculador) {
		super(nombre);
		this.calculador = calculador;
		this.categorias = new ArrayList<String>();
	}
	
	public boolean tieneCategoria(String palabra) {
		return this.categorias.contains(palabra);
	}
	
	public void addCategoria(String categoria) {
		if(!this.categorias.contains(categoria)) {
			this.categorias.add(categoria);
		}
	}

	public boolean equals(Object obj) {
		Producto producto = (Producto) obj;
		
		try {
			return this.getNombre().equals(producto.getNombre()) && this.getPeso() == producto.getPeso() && this.getPrecio() == producto.getPrecio(); 
		}
		catch(Exception exc) {
			return false;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Nombre: "+this.getNombre() + ", Precio: "+this.getPrecio()+", Peso: "+this.getPeso();
	}

	public double getPrecio() {
		return this.calculador.calcularCostoAlquiler();
	}
	
	@Override
	public int getCantidadTotalProductos() {
		return 1;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro ft) {
		ArrayList<Elemento> lista = new ArrayList<Elemento>();
		
		if(ft.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}

	private void setCategorias(ArrayList<String> categorias) {
		this.categorias = categorias;
	}
	
	@Override
	public ArrayList<String> getCategorias() {
		return new ArrayList<String>(this.categorias);
	}
	
	public Producto getProductoMenorPrecio() {
		Producto copia = new Producto(this.getNombre(), this.calculador);
		copia.setCategorias(this.getCategorias());
		return copia;
	}

	@Override
	public int getCantidadProductos() {
		return 1;
	}
	
}
