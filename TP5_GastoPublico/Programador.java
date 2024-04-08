package TP5_GastoPublico;

public class Programador extends Contribuyente {
	private double facturacion_software;
	public double porcen_mont_fijo;
	public double porcen_mont_software;
	
	public Programador() {
		super();
		this.setFacturacion_software(1000);
		this.setPorcen_mont_fijo(0.2);
		this.setPorcen_mont_software(0.02);
	}

	public double getFacturacion_software() {
		return facturacion_software;
	}

	public void setFacturacion_software(double facturacion_software) {
		this.facturacion_software = facturacion_software;
	}

	public double getPorcen_mont_fijo() {
		return porcen_mont_fijo;
	}

	public void setPorcen_mont_fijo(double porcen_mont_fijo) {
		this.porcen_mont_fijo = porcen_mont_fijo;
	}

	public double getPorcen_mont_software() {
		return porcen_mont_software;
	}

	public void setPorcen_mont_software(double porcen_mont_software) {
		this.porcen_mont_software = porcen_mont_software;
	}
	
	@Override
	public double getMonto_Impuesto() {
		
		return (super.getMonto_Impuesto() * this.getPorcen_mont_fijo()) + (this.getFacturacion_software() * this.getPorcen_mont_software());
	}
	
}
