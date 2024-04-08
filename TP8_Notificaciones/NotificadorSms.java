package TP8_Notificaciones;

public class NotificadorSms implements Notificador {
	private String num;
	
	public NotificadorSms (String numeroTelefono){
		this.num = numeroTelefono;
	}
	
	@Override
	public void enviarNotificacion(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNotificacion(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	
	
}
