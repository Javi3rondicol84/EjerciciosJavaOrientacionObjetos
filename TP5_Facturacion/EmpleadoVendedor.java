package TP5_Facturacion;

public class EmpleadoVendedor extends Empleado {
	private double porcen_extra_ventas;
	private double cant_ventas;
	
	public EmpleadoVendedor() {
		
	}
	
	@Override
	public double getSueldoMensual() {
		return super.getSueldoMensual() + (this.getCant_ventas() * this.getPorcen_extra_ventas());
	}

	public double getPorcen_extra_ventas() {
		return porcen_extra_ventas;
	}

	public void setPorcen_extra_ventas(double porcen_extra_ventas) {
		this.porcen_extra_ventas = porcen_extra_ventas;
	}

	public double getCant_ventas() {
		return cant_ventas;
	}

	public void setCant_ventas(double cant_ventas) {
		this.cant_ventas = cant_ventas;
	}
	
	
}
