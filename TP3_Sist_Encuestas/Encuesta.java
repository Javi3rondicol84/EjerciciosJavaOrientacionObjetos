package TP3_Sist_Encuestas;

public class Encuesta {  
	private Pregunta [] preg; //tiene un conjunto de preguntas
	private Encuestado [] persona; //personas encuestadas
//	private String nombre;
	private boolean se_respondio;

	public Encuesta() {
		this.preg = new Pregunta[3];
		this.persona = new Encuestado[5];
		this.setSe_respondio(false); //por defecto no se respondieron
		this.inicializarPreg();
		this.inicializarPersona();
		this.asignarPreguntas();
		this.asignarDatosPersona();
	}
	
	public void inicializarPreg() {
		for(int i = 0; i < preg.length; i++) {
			preg[i] = new Pregunta();
		}
	}
	
	public void inicializarPersona() {
		for(int i = 0; i < persona.length; i++) {
			persona[i] = new Encuestado();
		}
	}
	
	
	public void asignarPreguntas() {
		
		preg[0].setNombre_pregunta("¿Cual es su deporte favorito?");
		preg[1].setNombre_pregunta("¿cual es su trabajo?");
		preg[2].setNombre_pregunta("¿cual es su hobbie favorito?");
		
	}
	
	public void asignarDatosPersona() {
		
		persona[0].setDNI(3333);
		persona[0].setNombre("John");
		persona[1].setDNI(4444);
		persona[1].setNombre("Juan");
		persona[2].setDNI(3333);
		persona[2].setNombre("Josefina");
		persona[3].setDNI(5555);
		persona[3].setNombre("Luis");
		persona[4].setDNI(4444);
		persona[4].setNombre("Chris");	
		
		//solo 3 deberian responder la encuesta

	}
	
	
	
	//una persona solo responde encuestas distintas, no puede responder la misma si por ej persona[0].dni==4444 y persona[3].dni==4444
	public void personaRespondeEncuestasDistintas() {
		int indice = 0;
		int indice2 = 0;
		int dni = 0;
		int aux = 0;
		while(indice < persona.length) { 
			dni = persona[indice].getDNI();
			while((indice2 < persona.length)) {
				
				if(aux == 0) {
					
					persona[indice2].respondeEncuesta(preg);
					
					aux = 1;
				}
					if(dni != persona[indice2].getDNI()) {
						persona[indice2].respondeEncuesta(preg);
					}
				
			
				
				indice2++;
			}
		
			indice++;
		}
		
	}

	public boolean getSe_respondio() {
		return se_respondio;
	}

	public void setSe_respondio(boolean se_respondio) {
		this.se_respondio = se_respondio;
	}
	

}



/*public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
*/