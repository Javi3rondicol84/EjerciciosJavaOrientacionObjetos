package AdicionalEjercicio;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private double descuento;
	protected ArrayList<String> autores;
	protected ArrayList<String> generos;
	private ArrayList<Producto> compras;
	
	public void aniadirProducto(Producto pp) {
		if(!compras.contains(pp)) {
			compras.add(pp);
		}
	}
	
	public void aniadirAutor(String at) {
		if(!autores.contains(at)) {
			autores.add(at);
		}
	}
	
	public void aniadirGenero(String gn) {
		if(!generos.contains(gn)) {
			generos.add(gn);
		}
	}
	
	public Cliente(String nombre, String apellido, int dni, String direccion, double descuento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		this.autores = new ArrayList<String> ();
		this.generos = new ArrayList<String>();
		this.compras = new ArrayList<Producto>();
	}
	
	public String toString() {
		
		return this.getNombre() + ":" + this.getApellido();
	}
	
	public double conocerPrecio(Producto pp) {
		
		return pp.getPrecio() - (pp.getPrecio() * (this.getDescuento()/100));
	}
	
	public boolean comproProducto(Producto pp) {
		return compras.contains(pp);
	}
	
	public boolean leGustaProducto(Producto pp) {
		return this.autores.contains(pp.getAutor());
	}
	
	@Override
	public boolean equals(Object o1) {
		
		try {
			Cliente cc = (Cliente) o1;
			
			return this.getNombre().equals(cc.getNombre()) && this.getApellido().equals(cc.getApellido()) && this.getDni() == cc.getDni() && this.getDescuento() == cc.getDescuento() && this.getDireccion().equals(cc.getDireccion());
			
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
}
