package TP8_ArbolBinarioBusqueda;

import java.util.ArrayList;

public class Nodo implements Comparable<Nodo>{
	private String nombre;
	private int valor;
	private ArrayList<Nodo> nodosHijos;
	private static int MAX = 2;
	
	public Nodo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
		this.nodosHijos = new ArrayList<Nodo>();
	}

	@Override
	public int compareTo(Nodo nodo) {
	
		return this.getValor() - nodo.getValor();
	}
	
	public void addNodo(Nodo nodo) {
		if(!this.nodosHijos.contains(nodo) && this.nodosHijos.size() < this.MAX) {
			

				if(this.compareTo(nodo) < 0) {
					this.nodosHijos.add(nodo);
				}
				else if(this.compareTo(nodo) > 0) {
					this.nodosHijos.add(0, nodo);
				}
			
			
		}
		else {
			System.out.println("El tiene ya tiene dos hijos");
		}
	
	}
	
	public void verNodos() {
		this.verPropios();
		for(int i = 0; i < this.nodosHijos.size(); i++) {

			
			this.nodosHijos.get(i).verNodos();
		}
		
	}
	
	public void verPropios() {
		for(int i = 0; i < this.nodosHijos.size(); i++) {
			System.out.print("("+this.nodosHijos.get(i).getValor()+")"+ "\t");
		}
	}

	
	
	
	public String toString() {
		return this.getNombre() + " " + this.getValor();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
		if(nodosHijos.isEmpty()) {
			this.nombre = "Hoja";
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	
}
