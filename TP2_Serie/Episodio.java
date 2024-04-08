package TP2_Serie;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;
	private int negativo = -1;
	
	public Episodio() { //constructor base
		this.calificacion = 0;
		this.flag = true; //puestos todos los episodios como vistos por default
	}
	
	public Episodio(String titulo, String descripcion, boolean flag, int calificacion) { //constructor con todos los atributos
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = flag;
		this.calificacion = calificacion;
	}
	
	
	public Episodio(int calificacion) { //constructor con solo la calificacion
		this.calificacion = calificacion;
	}

	public void ingresarCalificacionEpisodio() {  //introducir calificacion a un episodio
		int calif = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("ingrese un valor entre 1 y 5");
			if(calif > 0 || calif < 5) {
				calif = Integer.valueOf(entrada.readLine());
				this.calificacion = calif;
			}
			else {
				System.out.println("El valor debe estar entre 1 y 5");
			}
		
		}
		catch(Exception exc) {
			
		}
		
	}
	
	
	public int getCalificacion() { //obtener calificacion
		return this.calificacion;
	}
		
	//setters y getters
	
	public void setFlag(boolean flag) { //colocar flag
		if(flag) { //el episodio se vió
			this.flag = flag;
		}
		else { //el episodio no se vió
			this.calificacion = this.negativo; //si el episodio no se vio, la calificacion será un valor negativo (-1);
		}
	
	}
	
	public boolean getFlag() { //obtener flag
		return this.flag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
