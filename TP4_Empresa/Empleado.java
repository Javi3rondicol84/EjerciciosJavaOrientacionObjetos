package TP4_Empresa;

public class Empleado extends Persona{
	private int num_legajo;
	private double sueldo;
	
	public Empleado() {
		this.setNum_legajo(23232);
		this.setSueldo(1000);
		this.setCargo("Empleado");
	}
	
	public int getNum_legajo() {
		return num_legajo;
	}
	public void setNum_legajo(int num_legajo) {
		this.num_legajo = num_legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
