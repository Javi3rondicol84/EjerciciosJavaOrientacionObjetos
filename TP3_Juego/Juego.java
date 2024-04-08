package TP3_Juego;

public class Juego {

	private Jugador [] jugador;
	
	public Juego() {
		
		jugador = new Jugador[2];
		this.inicializarJugador();
	}
	
	public void inicializarJugador() {
		
		for(int i = 0; i < jugador.length; i++) {
			if(jugador[i] == null) {
				jugador[i] = new Jugador();
			}
		}
		
		jugador[0].setNombre("Juan");
		jugador[1].setNombre("Marco");
		
		jugador[1].getPersonaje().setAlter_ego("Batman");
		jugador[1].getPersonaje().getHabilidades().setFuerza(7000);
	}
	
	
	public void enfrentarPersonajes() {
		
		if(this.jugador[0].getPersonaje().getHabilidades().getFuerza() > this.jugador[1].getPersonaje().getHabilidades().getFuerza()) {
			System.out.println(jugador[0].getNombre() + " le ganó a "+ jugador[1].getNombre() + " usando a "+jugador[0].getPersonaje().getAlter_ego()+ " contra "+jugador[1].getPersonaje().getAlter_ego());
		}
		else if(this.jugador[0].getPersonaje().getHabilidades().getFuerza() == this.jugador[1].getPersonaje().getHabilidades().getFuerza()) {
			System.out.println("Empate");
		}
		else {
			System.out.println(jugador[1].getNombre() + " le ganó a "+ jugador[0].getNombre() + " usando a "+jugador[1].getPersonaje().getAlter_ego()+ " contra "+jugador[0].getPersonaje().getAlter_ego());
		}
		
		
				
	}
	
	public static void main(String [] args) {
		Juego juego = new Juego();
		
		juego.enfrentarPersonajes();
	}
	
}
