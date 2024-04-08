package TP7_Viveros;

import java.util.ArrayList;

public class Vivero {
	private ArrayList<Planta> plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<Planta>();
	}
	
	public void aniadirPlanta(Planta pl) {
		if(!this.plantas.contains(pl)) {
			this.plantas.add(pl);
		}
	}
	
	public void ofrecerPlantasConRequerimiento(Requerimiento rm) {
		
		for(int i = 0; i < this.plantas.size(); i++) {
			if(rm.cumpleRequerimiento(this.plantas.get(i))) {
				System.out.println(this.plantas.get(i));
			}
		}
		
		System.out.println();
	}
	
	public static void main(String [] args) {
		Vivero vr = new Vivero();
		
		RClasificacion rf = new RClasificacion("Epipremnum");
		RNombreCientificoIncluyePalabra rf2 = new RNombreCientificoIncluyePalabra("aureum");
		RInteriorPocoRiego rf3 = new RInteriorPocoRiego(3);

		
		Planta pl = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", "de interior", 3, 2);
		Planta pl2 = new Planta("Epipremnum sdsdsd", "Epipremnum", "Araceae", "Monocotyledoneae", "de exterior", 3, 4);
		
		vr.aniadirPlanta(pl);
		vr.aniadirPlanta(pl2);
		
		vr.ofrecerPlantasConRequerimiento(rf);
		vr.ofrecerPlantasConRequerimiento(rf2);
		vr.ofrecerPlantasConRequerimiento(rf3);
		
		
		
	}
	
}
