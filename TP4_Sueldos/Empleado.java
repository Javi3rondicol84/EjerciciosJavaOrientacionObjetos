package TP4_Sueldos;

public class Empleado {
	protected double salarioFijoSemanal;
	protected int horas_trabajadas;
	protected int cantidad_ventas_realizadas;

	public Empleado() {
		this.setSalarioFijoSemanal(300);
		this.setHoras_trabajadas(56);
		this.setCantidad_ventas_realizadas(10);
	}
	
	public double getSalarioFijoSemanal() {
		return salarioFijoSemanal;
	}

	public void setSalarioFijoSemanal(double salarioFijoSemanal) {
		this.salarioFijoSemanal = salarioFijoSemanal;
	}

	public int getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(int horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
	}

	public int getCantidad_ventas_realizadas() {
		return cantidad_ventas_realizadas;
	}

	public void setCantidad_ventas_realizadas(int cantidad_ventas_realizadas) {
		this.cantidad_ventas_realizadas = cantidad_ventas_realizadas;
	}
}
