package TP4_Sueldos;

public class Empleado_horas_extra extends Empleado {
	private int extra;
	
	public Empleado_horas_extra() {
		this.setExtra(2);
	}
	
	public void setExtra(int extra) {
		this.extra = extra;
	}
	
	public int getExtra() {
		return extra;
	}
	
	public double getMontoExtra() {
		return this.getHoras_trabajadas() * this.getExtra();
	}
	
	@Override
	public double getSalarioFijoSemanal() {
		return super.getSalarioFijoSemanal() + this.getMontoExtra();
	}
}
