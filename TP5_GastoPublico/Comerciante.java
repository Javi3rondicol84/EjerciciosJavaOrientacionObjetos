package TP5_GastoPublico;

public class Comerciante extends Contribuyente {
	private int facturacion_ventas;
	public double porcen_mont_fijo;
	public double porcen_mont_ventas;
	
	public Comerciante() {
		super();
		this.setFacturacion_ventas(1000);
		this.setPorcen_mont_fijo(0.5);
		this.setPorcen_mont_ventas(3.5);
	}

	public int getFacturacion_ventas() {
		return facturacion_ventas;
	}

	public void setFacturacion_ventas(int facturacion_ventas) {
		this.facturacion_ventas = facturacion_ventas;
	}
	
	@Override
	public double getMonto_Impuesto() {
		
		return (super.getMonto_Impuesto() * this.getPorcen_mont_fijo()) + (this.getFacturacion_ventas() * this.getPorcen_mont_ventas());
	}

	public double getPorcen_mont_fijo() {
		return porcen_mont_fijo;
	}

	public void setPorcen_mont_fijo(double porcen_mont_fijo) {
		this.porcen_mont_fijo = porcen_mont_fijo;
	}

	public double getPorcen_mont_ventas() {
		return porcen_mont_ventas;
	}

	public void setPorcen_mont_ventas(double porcen_mont_ventas) {
		this.porcen_mont_ventas = porcen_mont_ventas;
	}
	
	
}
