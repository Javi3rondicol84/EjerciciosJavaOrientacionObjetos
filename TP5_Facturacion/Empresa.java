package TP5_Facturacion;

import java.util.ArrayList;

public class Empresa {
	private ArrayList <Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void verSumaGastosSalarios() {
		double suma = 0;
		
		for(Empleado emp : empleados) {
			suma += emp.getSueldoMensual();
		}
	}
	
	public void aniadirEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}
