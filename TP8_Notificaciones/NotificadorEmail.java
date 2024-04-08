package TP8_Notificaciones;

public class NotificadorEmail implements Notificador {
	private String emailEnvio;
	private String emailRecepcion;
	
	public NotificadorEmail (String emailEnvio, String emailRecepcion){
		this.emailEnvio = emailEnvio;
		this.emailRecepcion = emailRecepcion;
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

	public String getEmailEnvio() {
		return emailEnvio;
	}

	public void setEmailEnvio(String emailEnvio) {
		this.emailEnvio = emailEnvio;
	}

	public String getEmailRecepcion() {
		return emailRecepcion;
	}

	public void setEmailRecepcion(String emailRecepcion) {
		this.emailRecepcion = emailRecepcion;
	}

	
	
}
