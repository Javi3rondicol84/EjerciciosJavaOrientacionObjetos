package TP4_Alarma_Sensorial;

public class Sensor {
	private boolean se_rompio_vidrio;
	private boolean se_abrio_puerta_ventana;
	private boolean se_detecto_movimiento;
	private String zona_control;
	
	public Sensor() {
		this.zona_control = "Comedor";
		this.setSe_abrio_puerta_ventana(false);
		this.setSe_rompio_vidrio(false);
		this.setSe_detecto_movimiento(false);
	}
	

	public String getZona_control() {
		return zona_control;
	}

	public void setZona_control(String zona_control) {
		this.zona_control = zona_control;
	}

	public boolean getSe_rompio_vidrio() {
		return se_rompio_vidrio;
	}

	public void setSe_rompio_vidrio(boolean se_rompio_vidrio) {
		this.se_rompio_vidrio = se_rompio_vidrio;
	}

	public boolean getSe_abrio_puerta_ventana() {
		return se_abrio_puerta_ventana;
	}

	public void setSe_abrio_puerta_ventana(boolean se_abrio_puerta_ventana) {
		this.se_abrio_puerta_ventana = se_abrio_puerta_ventana;
	}

	public boolean getSe_detecto_movimiento() {
		return se_detecto_movimiento;
	}

	public void setSe_detecto_movimiento(boolean se_detecto_movimiento) {
		this.se_detecto_movimiento = se_detecto_movimiento;
	}
	
	
}
