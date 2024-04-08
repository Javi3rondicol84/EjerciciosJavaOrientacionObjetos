package TP3_Sist_Encuestas;

public class Pregunta { //pregunta para encuesta
	private String nombre_pregunta;
	private String respuesta_pregunta;

	
	public Pregunta() {
		this.setNombre_pregunta("¿Cual es tu nombre?");
	}
	



	public String getNombre_pregunta() {
		return nombre_pregunta;
	}

	public void setNombre_pregunta(String nombre_pregunta) {
		this.nombre_pregunta = nombre_pregunta;
	}

	public String getRespuesta_pregunta() {
		return respuesta_pregunta;
	}

	public void setRespuesta_pregunta(String respuesta_pregunta) {
		this.respuesta_pregunta = respuesta_pregunta;
	}


	
	
}
