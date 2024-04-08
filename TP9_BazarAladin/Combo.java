package TP9_BazarAladin;

import java.util.ArrayList;

public class Combo extends Elemento {
	protected ArrayList<Elemento> elementos;
	private Filtro criterioArmarCombo;
	protected double tope_descuento;
	protected double descuento;
	
	public Combo(String nombre, Filtro criterio, double tope_descuento, double descuento) {
		super(nombre);
		this.elementos = new ArrayList<Elemento>();
		this.criterioArmarCombo = criterio;
		this.tope_descuento = tope_descuento;
		this.setDescuento(descuento);
	}
	
	public double getTope_descuento() {
		return tope_descuento;
	}


	public void setTope_descuento(double tope_descuento) {
		this.tope_descuento = tope_descuento;
	}




	public double getDescuento() {
		return descuento;
	}




	public void setDescuento(double descuento) {
		if(this.descuento < this.tope_descuento) {
			this.descuento = descuento;
		}
		else {
			System.out.println("El descuento no puede superar el tope de "+this.tope_descuento);
		}
		
	}




	public void setCriterio(Filtro criterio) {
		this.criterioArmarCombo = criterio;
	}
	
	public void addElemento(Elemento elemento) {
		if((!elementos.contains(elemento)) && this.criterioArmarCombo.cumple(elemento)) {
			this.elementos.add(elemento);
		}
		else {
			System.out.println("El elemento "+elemento.getNombre()+" no cumple el criterio.");
		}
	}
	

	@Override
	public double getPrecio() {
		double suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += (this.elementos.get(i).getPrecio() - (this.elementos.get(i).getPrecio() * this.getDescuento()));
		}
		
		return suma;
	}

	
	public Producto getProductoMenorPrecio() {
		double precioMenor = 0;
		Producto producto;
		Producto productoMenor = new Producto(null, null);
		
		for(int i = 0; i < this.elementos.size(); i++) {
			producto = this.elementos.get(i).getProductoMenorPrecio();
			if(precioMenor < producto.getPrecio()) {
				precioMenor = producto.getPrecio();
				productoMenor = producto;
			}
		}
		
		
		return productoMenor;
	}
	
	
	@Override
	public int getCantidadTotalProductos() {
		int cantidad = 1; 
		
		for(int i = 0; i < this.elementos.size(); i++) {
			cantidad += this.elementos.get(i).getCantidadTotalProductos();
		}
		
		return cantidad;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro ft) {
		ArrayList<Elemento> lista = new ArrayList<Elemento>();
		
		if(ft.cumple(this)) {
			lista.add(this);
		}
		
		for(int i = 0; i < this.elementos.size(); i++) {
			lista.addAll(this.elementos.get(i).buscar(ft));
		}
		
		
		return lista;
	}
	
	public ArrayList<String> getCategorias() {
		ArrayList<String> categorias = new ArrayList<String>();
		ArrayList<String> resultadoParcial;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			resultadoParcial = this.elementos.get(i).getCategorias();
			this.addCategoriasNoRepetidas(categorias, resultadoParcial);
		}
		
		
		return categorias;
	}
	
	public void addCategoriasNoRepetidas(ArrayList<String> categorias, ArrayList<String> resultParcial) {
		
		for(int i = 0; i < resultParcial.size(); i++) {
			if(!categorias.contains(resultParcial.get(i))) {
				categorias.add(resultParcial.get(i));
			}
		}
		
	}

	@Override
	public double getPeso() {
		double suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getPeso();
		}
		
		return suma;
	}
	
	public int getCantidadProductos() {
		
		int suma = 0;
		
		for(int i = 0; i < this.elementos.size(); i++) {
			suma += this.elementos.get(i).getCantidadProductos();
		}
		
		return suma;
	}
	
	public boolean tieneCategoria(String palabra) {
		return this.getCategorias().contains(palabra);
	}
	
}
