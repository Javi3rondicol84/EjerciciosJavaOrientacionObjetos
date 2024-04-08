package TP5_Pila;

import java.util.ArrayList;

public class Pila {
	ArrayList <Object> elementos;
	
	public Pila() {
		elementos = new ArrayList<Object>();
		
		
	}
	
	public void push(Object o) {
		this.elementos.add(o);
	}
	
	public void top() {
		int tam = elementos.size();
		if(tam > 0) {
			System.out.println(elementos.get(tam-1));
		}
		else {
			System.out.println("la pila está vacia");
		}
		
	}
	
	public Object pop() {
		int tam = elementos.size()-1;
		Object element = elementos.get(tam);
		
		elementos.remove(tam);
		
		return element;
	}
	
	public int size() {
		return this.elementos.size();
	}
	
	public ArrayList<Object> copy() {
		ArrayList<Object> copia = new ArrayList<Object>(elementos);
		
		return copia;
	}
	
	public ArrayList<Object> reverse() {
		ArrayList<Object> copia = new ArrayList<Object>();
		
		
		for(int i = this.size()-1; i >= 0; i--) {
			copia.add(elementos.get(i));
		}
		
		
		return copia;
	}
	
	public static void main(String [] args) {
		String hola = "puesto";
		String hola2 = "puesto2";
		String hola3 = "puesto3";
		
		Pila pila = new Pila();
		
		pila.push(hola);
		pila.push(hola2);
		pila.push(hola3);
		
		ArrayList <Object> copia;
		
		copia = pila.copy();
		System.out.println(copia);

		Object element;
		element = pila.pop();
		
		System.out.println(element + " retornado");
	
		
		copia = pila.copy();
		System.out.println(copia);
		
	}
	
}
