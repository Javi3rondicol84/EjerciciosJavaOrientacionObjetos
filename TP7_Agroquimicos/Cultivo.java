package TP7_Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
	//HAY ATRIBUTOS COMPARTIDOS
	private ArrayList<ProductoQuimico> productosProhibidos;
	private String nombre;
	private ArrayList<Enfermedad> enfermadesFrecuentes;
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermadesFrecuentes = new ArrayList<Enfermedad>();
		this.productosProhibidos = new ArrayList<ProductoQuimico>();
		this.enfermedadesDefault();
		this.productosProhibidosDefault();
	}
	
	public void productosProhibidosDefault() {
		ProductoQuimico pq = new ProductoQuimico("Asbesto");
		this.productosProhibidos.add(pq);
	}

	public void aniadirEnfermedadFrecuente(Enfermedad ef) {
		if(!this.enfermadesFrecuentes.contains(ef)) {
			this.enfermadesFrecuentes.add(ef);
		}
		
	}
	
	public void aniadirProductoProhibido(ProductoQuimico pq) {
		if(!this.productosProhibidos.contains(pq)) {
			this.productosProhibidos.add(pq);
		}
	}
	
	public void enfermedadesDefault() {
		Enfermedad ef = new Enfermedad("Cochinilla");
		this.enfermadesFrecuentes.add(ef);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean productoEsUtil(ProductoQuimico pq) {
		return !this.productosProhibidos.contains(pq); //corregir, va en productos un arreglo de cultivos prohibidos
	}
	
	@Override
	public boolean equals(Object obj) {
		Cultivo cv = (Cultivo) obj;
		try {
			if(this.getNombre().equals(cv.getNombre())) {
				return true;
			}
		}
		catch(Exception e) {
			
		}
		
		return false;
	}
}
