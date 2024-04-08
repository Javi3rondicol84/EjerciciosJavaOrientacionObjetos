package AdicionalEjercicio;

import java.util.ArrayList;

public class Libreria {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;
	
	public Libreria() {
		this.clientes = new ArrayList<Cliente>();
		this.productos = new ArrayList<Producto>();
	}
	
	public static void main(String [] args) {
		
		Libreria lib = new Libreria();
		
		Cliente cl = new Cliente("pepe", "pepe2", 23232, "wddsd", 23);
		Cliente cl2 = new Cliente("pepe", "pepe2", 23232, "wddsd", 23);
		Producto p1 = new Producto("prod", 23, "juan", 23, "prod");
		Producto p2 = new Producto("prod", 23, "juan", 23, "prod");
		
		System.out.println(cl);
		
		lib.aniadirCliente(cl);
		lib.aniadirCliente(cl2);
		lib.aniadirProducto(p1);
		lib.aniadirProducto(p2);
		
		lib.conocerPrecioParaCliente(p1, cl);
		
		cl.aniadirProducto(p1);
		
		lib.yaComproProducto(p1, cl);
	}
	
	public void aniadirCliente(Cliente cc) {
		
		if(!clientes.contains(cc)) {
			clientes.add(cc);
		}
		else {
			System.out.println("El cliente no se anadio, ya se encuentra en la lista");
		}
		
	}
	
	public void aniadirProducto(Producto pp) {
		
		if(!productos.contains(pp)) {
			productos.add(pp);
		}
		else {
			System.out.println("El producto no se anadio, ya se encuentra en la lista");
		}
		
	}
	
	public void conocerPrecioParaCliente(Producto pp, Cliente cc) {
		System.out.println("El precio del producto para el cliente es de "+cc.conocerPrecio(pp));
	}
	
	public void yaComproProducto(Producto pp, Cliente cc) {
		if (cc.comproProducto(pp)) {
			System.out.println("El cliente ya compró el producto");
		}
		else {
			System.out.println("El cliente NO compró el producto");
		}
	}
		
	public void leGustaProducto(Producto pp, Cliente cc) {
		if(cc.leGustaProducto(pp)) {
			System.out.println("Al cliente le gusta el producto");
		}
		else {
			System.out.println("Al cliente NO le gusta el producto");
		}
	}
	
	public ArrayList<Cliente> listadoClientesLesGustaProducto(Producto pp) {
		ArrayList<Cliente> listado = new ArrayList<Cliente>();
		
		for(int i = 0; i < clientes.size(); i++) {
			
			if(this.clientes.get(i).leGustaProducto(pp)) {
				listado.add(clientes.get(i));
			}
			
		}
		
		return listado;
	}
	
	
}
