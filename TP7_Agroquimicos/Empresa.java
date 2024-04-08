package TP7_Agroquimicos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<ProductoQuimico> prodsQuimicos;
	
	public Empresa() {
		this.prodsQuimicos = new ArrayList<ProductoQuimico>();
	}
	
	//aniaidr productos quimicos
	
	public void aniadirProductoQuimico(ProductoQuimico pq) {
		if(!this.prodsQuimicos.contains(pq)) {
			this.prodsQuimicos.add(pq);
		}
	}
	
	public void verListadoAgroQuimicosEnfermedad(Enfermedad ef) {
		
		ArrayList<ProductoQuimico> productosUtiles = new ArrayList<ProductoQuimico>();
		for(int i = 0; i < this.prodsQuimicos.size(); i++) {
			if(this.prodsQuimicos.get(i).trataEnfermedad(ef)) {
				productosUtiles.add(this.prodsQuimicos.get(i));
				System.out.println("Producto: " + this.prodsQuimicos.get(i));
			}
		}
	}
	
	public void verListadoAgroQuimicosDadoCultivoEnfermedad(Cultivo cv, Enfermedad ef) {
		ArrayList<ProductoQuimico> productosUtiles = new ArrayList<ProductoQuimico>();
		
		for(int i = 0; i < this.prodsQuimicos.size(); i++) {
			
			if(cv.productoEsUtil(this.prodsQuimicos.get(i)) && this.prodsQuimicos.get(i).trataEnfermedad(ef)) {
				productosUtiles.add(this.prodsQuimicos.get(i));
				System.out.println("Producto: " + this.prodsQuimicos.get(i));
			}
			
		}
		
	}
	
	public static void main(String [] args) {
		Empresa es = new Empresa();
		ProductoQuimico pq = new ProductoQuimico("etc");
		ProductoQuimico asbesto = new ProductoQuimico("Asbesto");
		es.aniadirProductoQuimico(pq);
		es.aniadirProductoQuimico(asbesto);
		Enfermedad ef = new Enfermedad("Cochinilla");
		es.verListadoAgroQuimicosEnfermedad(ef);
		
		Cultivo cv = new Cultivo("Trigo");
		
		
		es.verListadoAgroQuimicosDadoCultivoEnfermedad(cv, ef);
	}
	
}
