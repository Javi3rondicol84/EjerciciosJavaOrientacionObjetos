package TP5_Facturacion;

public class EmpleadoBonista extends Empleado{
	private double bono;
	private int cant_ventas;
	private int min_ventas;
	
	public EmpleadoBonista() {
	
	}
	
	@Override
	public double getSueldoMensual() {
		if(this.getCant_ventas() >= this.getMin_ventas()) {
			return super.getSueldoMensual() + this.getBono();
		}
		else {
			return super.getSueldoMensual();
		}
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	public int getCant_ventas() {
		return cant_ventas;
	}

	public void setCant_ventas(int cant_ventas) {
		this.cant_ventas = cant_ventas;
	}

	public int getMin_ventas() {
		return min_ventas;
	}

	public void setMin_ventas(int min_ventas) {
		this.min_ventas = min_ventas;
	}
	
	
}
