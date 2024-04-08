package TP7_V2_Agroquimicos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<ProductoQuimico> productos;
	
	public Empresa() {
		this.productos = new ArrayList<ProductoQuimico>();
	}
	
	public void addProductoQuimico(ProductoQuimico pq) {
		if(!this.productos.contains(pq)) {
			this.productos.add(pq);
		}
		
	}
	
	public ArrayList<ProductoQuimico> obtenerListaProductosTratanEnfermedad(Enfermedad ef) {
		ArrayList<ProductoQuimico> lista = new ArrayList<ProductoQuimico>();
		
		for(int i = 0; i < this.productos.size(); i++) {
			if(this.productos.get(i).trataEnfermedad(ef)) {
				lista.add(productos.get(i));
			}
		}
		
		return lista;
	}
	
	public ArrayList<ProductoQuimico> obtenerListaProductosTratanEnfermedad(Cultivo cv, Enfermedad ef) {
		ArrayList<ProductoQuimico> lista = new ArrayList<ProductoQuimico>();
		
		for(int i = 0; i < this.productos.size(); i++) {
			
			if(!this.productos.get(i).desaconsejaCultivo(cv) && this.productos.get(i).trataEnfermedad(ef)) {
				lista.add(this.productos.get(i));
			}
		}
		
		return lista;
	}
	
}
