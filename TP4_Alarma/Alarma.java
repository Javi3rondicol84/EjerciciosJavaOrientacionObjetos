package TP4_Alarma;

public class Alarma {
	private boolean se_rompio_vidrio;
	private boolean se_abrio_puerta_ventana;
	private boolean se_detecto_movimiento;
	private Timbre timbre;
	
	public Alarma() {
		this.setSe_rompio_vidrio(false);
		this.setSe_abrio_puerta_ventana(true);
		this.setSe_detecto_movimiento(false);
		this.timbre = new Timbre();
		this.comprobar();
	}
	
	public Alarma(int hola) {
		this.setSe_rompio_vidrio(false);
		this.setSe_abrio_puerta_ventana(true);
		this.setSe_detecto_movimiento(false);
		this.timbre = new Timbre();
		this.comprobar();
	}
	
	public void comprobar() {
		
		if(this.getSe_rompio_vidrio() || this.getSe_abrio_puerta_ventana() || this.getSe_detecto_movimiento()) {
			timbre.hacerSonar();
		}
		
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
	
	
	public static void main(String [] args) {
		AlarmaLuminosa alarma = new AlarmaLuminosa();
		//Alarma alarma = new Alarma();
		
	}
	
}
