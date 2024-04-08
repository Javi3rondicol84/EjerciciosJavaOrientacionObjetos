package TP4_Alarma;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
		
		if(this.getSe_rompio_vidrio() || this.getSe_abrio_puerta_ventana() || this.getSe_detecto_movimiento()) {
			this.luz.Encender();
		}
	}
	
}
