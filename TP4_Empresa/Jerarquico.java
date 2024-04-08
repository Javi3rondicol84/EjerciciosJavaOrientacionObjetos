package TP4_Empresa;

import java.util.ArrayList;

public class Jerarquico extends Persona{
	private int num_legajo;
	private double sueldo;
	private ArrayList <Empleado> empleado;
	private int cant_empleado = 1;
	
	public Jerarquico() {
		this.setNum_legajo(11111);
		this.setSueldo(10000);
		this.setCargo("Jefe");
		this.empleado = new ArrayList<Empleado>();
		this.inicializarEmpleado();
	}
	
	
	
	public ArrayList<Empleado> getEmpleado() {
		return empleado;
	}



	public void inicializarEmpleado() {
		for(int i = 0; i < this.getCant_empleado(); i++) {
			this.empleado.add(new Empleado());
		}
	}
	
	public void verEmpleado() {
		
		System.out.println("Empleados a cargo: ");
		for(Empleado empleados : this.empleado) {
			System.out.println("Nombre: " +empleados.getNombre() +", Numero legajo: "+ empleados.getNum_legajo());
		}
		
	}
	
	public static void main(String [] args) {
		Jerarquico jerarquico = new Jerarquico();
		jerarquico.verEmpleado();
	}
	
	
	
	public int getCant_empleado() {
		return cant_empleado;
	}

	public void setCant_empleado(int cant_empleado) {
		this.cant_empleado = cant_empleado;
	}

	public void setEmpleado(ArrayList<Empleado> empleado) {
		this.empleado = empleado;
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
