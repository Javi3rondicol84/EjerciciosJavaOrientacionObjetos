package TP4_Sueldos;

public class Sistema {
	
	private Empleado empleado;
	private Empleado_horas_extra extra;
	private Empleado_por_comision comision;
	
	public Sistema() {
		this.empleado = new Empleado();
		this.extra = new Empleado_horas_extra();
		this.comision = new Empleado_por_comision();
	}
	
	public void verSalarioPorEmpleado() {
		System.out.println("A un empleado se le debe pagar "+ empleado.getSalarioFijoSemanal() +" al finalizar la semana");
		System.out.println("A un empleado con horas extra se le debe pagar "+ extra.getSalarioFijoSemanal() +" al finalizar la semana");
		System.out.println("A un empleado de comision se le debe pagar "+ comision.getSalarioFijoSemanal() +" al finalizar la semana");
	}
	
	public static void main(String [] args) {
		Sistema sist = new Sistema();
		sist.verSalarioPorEmpleado();
	}
	
}
