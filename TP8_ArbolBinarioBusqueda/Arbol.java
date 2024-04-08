package TP8_ArbolBinarioBusqueda;

public class Arbol {
	
	private Nodo nodoRaiz;
	
	public Arbol() {
		this.nodoRaiz = new Nodo("Raiz", 8);
	}
	
	public void verArbol() {
		System.out.println("    ("+this.nodoRaiz.getValor()+""+")"+" ");
		
		this.nodoRaiz.verNodos();
		

	}
	
	public Nodo getNodo() {
		return this.nodoRaiz;
	}
	
	public static void main(String [] args) {
		Arbol ab = new Arbol();
		

		Nodo n1 = new Nodo("n1", 10);
		Nodo n2 = new Nodo("n1", 3);
		
		//primer nivel raiz y sus dos hijos
		
		
		ab.getNodo().addNodo(n1);
		ab.getNodo().addNodo(n2);
		

		//segundo nivel
		

		
	
		Nodo n3 = new Nodo("n2", 6);
		Nodo n4 = new Nodo("n2", 1);
		
		n1.addNodo(n3);
		n1.addNodo(n4);	
		
		Nodo n5 = new Nodo("n2", 14);
		
		n2.addNodo(n5);
		
		ab.verArbol();
		
	}
}
