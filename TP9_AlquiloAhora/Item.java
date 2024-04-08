package TP9_AlquiloAhora;

import java.util.ArrayList;
import java.util.Comparator;

public class Item extends ItemGeneral {
	private double valor;
	private int antiguedadMeses;
	private int ID;
	private String descripcion;
	
	public Item(String nombre) {
		super(nombre);
	}
	
	public Item(String nombre, double valor, int antiguedadMeses, int iD, String descripcion) {
		super(nombre);
		this.valor = valor;
		this.antiguedadMeses = antiguedadMeses;
		ID = iD;
		this.descripcion = descripcion;
	}


	@Override
	public ArrayList<Item> buscar(Filtro filtro, Comparator<Item> comp) {
		ArrayList<Item> lista = new ArrayList<Item>();
		
		if(filtro.cumple(this)) {
			lista.add(this);
		}
		
		return lista;
	}
	
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getAntiguedadMeses() {
		return antiguedadMeses;
	}
	public void setAntiguedadMeses(int antiguedadMeses) {
		this.antiguedadMeses = antiguedadMeses;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
		public String toString() {
		return "Item: "+this.getNombre() + ", Precio: "+this.getValor()+", ID: "+this.getID();
	}
}
