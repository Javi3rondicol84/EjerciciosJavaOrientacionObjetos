package TP2_Serie;

public class Temporada {
	private Episodio ep[];
	
	public Temporada() { //constructor vacio con valor por defecto para la cantidad de episodios por temporada
		this.ep = new Episodio[2]; //cantidad de episodios por temporada
		this.inicializarEpisodios(); //inicializar episodios del arreglo de eps para que no sean NULL
	}
	
	public Temporada(int cant_ep) { //constructor para elegir cantidad de episodios por temporada
		this.ep = new Episodio[cant_ep];
		this.inicializarEpisodios();
	}
	
	public void inicializarEpisodios() { //inicializar todos los episodios dentro del arreglo de episodios, para que no sean NULL
		
		for(int i = 0; i < ep.length; i++) {
			ep[i] = new Episodio();
		}
		
	}
	
	
	public void obtenerPromedioCalificacionesTemporada() { //obtener promedio de calificaciones de episodios de la temporada
		this.cargarCalificacionesEpisodios(); //cargar calificaciones primero para luego poder obtener un promedio
		
		int suma = 0;
		int indice = 0;
		
		while(indice < ep.length) {
			
			if(ep[indice].getFlag()) { //solo se toman en cuenta calificaciones de episodios vistos
				suma += ep[indice].getCalificacion();
			}
			indice++;
		}
		
		suma /= ep.length;
		
		System.out.println("El promedio es: " + suma);
		
	}
	
	
	
	
	public void cargarCalificacionesEpisodios() { //ingresar calificaciones a cada episodio(si se vió)
 
		for(int i = 0; i < ep.length; i++) {
			if(ep[i].getFlag()) { //ingresar calificaciones solo a los episodios vistos
				ep[i].ingresarCalificacionEpisodio();
			}
			
		}
		
	}
	
	public void verTotalEpisodiosVistos() { //ver todos los episodios vistos por temporada
		
		int suma = 0;
		
		suma = this.getTotalEpisodiosVistos(); //obtenidos episodios vistos para mostrarlos en pantalla

		System.out.println("el total de episodios vistos en esta temporada es de: "+suma);
		
	}
	 
	public int getTotalEpisodiosVistos() { //obtener todos los episodios vistos por temporada
		//ingresar set episodios vistos con valor random
		int suma = 0;
		
		for(int i = 0; i < this.ep.length; i++) {
			
			if(this.ep[i].getFlag()) {
				suma++;
			}

		}
		
		return suma;
	}
	
	public int getTotalEpisodios() { //obtener total de episodios por temporada usando el tamaño del arreglo de episodios
		return ep.length;
	}
	
	public int getTotalCalificacionesEpisodiosTemporada() {   //obtener suma total de calificaciones de episodios por temp, para hacer un promedio
		int indice = 0;
		int suma = 0;
		
		while(indice < ep.length) {
			
			suma += this.ep[indice].getCalificacion();
			
			indice++;
		}
		
		
		return suma;
	}
	
}
