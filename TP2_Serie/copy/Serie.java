package TP2_Serie.copy;

import java.time.LocalDate;

//series, temporadas, capitulo
public class Serie {
	private Temporada[] temp; //a su vez tiene episodios
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	LocalDate ld = LocalDate.now();
	
	public Serie() { //constructor vacio con valores por defecto para los atributos de una serie
		this.temp = new Temporada[2]; //cantidad de temporadas por serie
		
		this.inicializarTemporadas(); //inicializar temporadas para que su valor no sea NULL y evitar error nullPointerException Error
		
		this.titulo = "the walking dead";
		this.descripcion = "serie de zombis";
		this.creador = "robert kirtman";
		this.genero = "zombis";
	}
	
	//constructor con parametros para los atributos incluyendo cantidad de temporadas por serie
	public Serie(int cant_temp, String titulo, String descripcion, String creador, String genero) { 
		this.temp = new Temporada[cant_temp];
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}
	
	public void inicializarTemporadas() { //inicializar temporadas para que no sean NULL
		for(int i = 0; i < temp.length; i++) {
			temp[i] = new Temporada();
		}
	}
	
	
	public int obtenerTotalEpisodiosVistosSerie() { //obtener total episodios vistos por cada temporada de la serie
		int suma = 0;
		int cant = 0;
		int indice = 0;
	
		while(indice < temp.length) { 
			
			cant = this.temp[indice].getTotalEpisodiosVistos();
				
			suma += cant;
				
			indice++;
		}
		
		return suma;
	}
	
	public void verTotalEpisodiosVistosSerie() { //ver total episodios vistos por cada temporada de la serie
		int suma = 0;
		
		suma = this.obtenerTotalEpisodiosVistosSerie();
		
		System.out.println("el total de episodios vistos de todas las temporadas de la serie es de: "+suma);
		
	}
	
	public void obtenerPromedioCalificacionesSerie() { //obtener promedio de calificaciones de episodios por todas las temporadas en total(promedio de la serie)
		this.cargarCalificacionesEpisodiosSerie(); //cargar calificaciones para poder hacer un promedio con valores que no sean 0
		
		double suma = 0;
		int indice = 0;
		
		while(indice < temp.length) {
			
			suma += this.temp[indice].getTotalCalificacionesEpisodiosTemporada();
			
			indice++;
		}
		
		suma /= temp.length;
		
		System.out.println("el promedio de calificaciones de la serie es de: "+suma);
		
	}
	
	public void seVieronTodosLosEpisodios() { //ver si se vieron todos los episodios de la serie.
		//para ello, debe coincidir la cantidad de episodios vistos con la cantidad total de episodios por todas las temporadas de la serie
		
		int indice = 0;
		int totalEpisodiosVistos = 0;
		int episodiosTotales = 0;
		
		//obtener todos los episodios vistos, para este ej, se toman en cuenta solo los episodios vistos para los promedios
		totalEpisodiosVistos = this.obtenerTotalEpisodiosVistosSerie();  
		
		
		while(indice < temp.length) {
			
			episodiosTotales += this.temp[indice].getTotalEpisodios();
			
			indice++;
		}
		
		
		if(totalEpisodiosVistos == episodiosTotales) { 
			System.out.println("Se vieron todos los episodios de la serie: totalEpisodiosVistos: "+totalEpisodiosVistos+" y el total de episodios vistos y no vistos es de: "+episodiosTotales);
		}
		else {
			System.out.println("NO Se vieron todos los episodios de la serie: totalEpisodiosVistos: "+totalEpisodiosVistos+" y el total de episodios vistos y no vistos es de: "+episodiosTotales);
		}
		
	}
	
	public void cargarCalificacionesEpisodiosSerie() { //cargar calificaciones a cada episodio de cada temporada de la serie
		
		for(int i = 0; i < temp.length; i++) {
			this.temp[i].cargarCalificacionesEpisodios();
		}
		
	}

	
	//setters y getters
	
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
