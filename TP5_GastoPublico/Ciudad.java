package TP5_GastoPublico;

import java.util.ArrayList;

public class Ciudad { //ver gastos de ciudad(objeto gasto) y cuanto recaudan con impuestos de la ciudad(objeto impuestos).
	private String nombre;
	private int habitante;
	ArrayList <Contribuyente> contribuyente;
	private int gasto_mantenimiento;
	
	public Ciudad() {
		this.contribuyente = new ArrayList<Contribuyente>();
		this.gasto_mantenimiento = 25000;
		this.nombre = "Tandil";
		this.habitante = 100000;
		this.aniadirContribuyentesPorDefecto();
	}
	
	public void aniadirContribuyenteCiudad(Contribuyente contribuyente) {
		this.contribuyente.add(contribuyente);
	}
	
	public void aniadirContribuyentesPorDefecto() {
		Contribuyente c1 = new Contribuyente();
		Comerciante c2 = new Comerciante();
		Programador c3 = new Programador();
		
		this.contribuyente.add(c1);
		this.contribuyente.add(c2);
		this.contribuyente.add(c3);
	}
	
	public double obtenerRecaudacion() {
		double recaudacion = 0;
		
		for(Contribuyente cont : contribuyente) {
			recaudacion += cont.getMonto_Impuesto();
		}
		
		return recaudacion;
	}

	
	public boolean esDeficitaria() { //gasta mas que lo que recauda
		return this.obtenerRecaudacion() < this.getGasto_Mantenimiento();
	}

	
	//setters getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitante() {
		return habitante;
	}

	public void setHabitante(int habitante) {
		this.habitante = habitante;
	}

	public int getGasto_Mantenimiento() {
		return gasto_mantenimiento;
	}

	public void setGasto_Mantenimiento(int gasto_mantenimiento) {
		this.gasto_mantenimiento = gasto_mantenimiento;
	}
	
	
	
	
}
