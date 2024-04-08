package TP4_Sueldos;

public class Empleado_por_comision extends Empleado {
	
	private double porcentaje_ventas;
	
	public Empleado_por_comision() {
		this.setPorcentaje_ventas(0.25);
	}

	public double getPorcentaje_ventas() {
		return porcentaje_ventas;
	}

	public void setPorcentaje_ventas(double porcentaje_ventas) {
		this.porcentaje_ventas = porcentaje_ventas;
	}
	
	public double getComisionVentas() {
		return this.porcentaje_ventas * this.getCantidad_ventas_realizadas();
	}
	
	@Override
	public double getSalarioFijoSemanal() {
		return super.getSalarioFijoSemanal() + this.getComisionVentas();
	}
	
	
}
