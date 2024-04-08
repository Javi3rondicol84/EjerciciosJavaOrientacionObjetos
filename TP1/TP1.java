package TP1;

public class TP1 {
	public static void main(String [] args) {
				
		Electrodomestico el = new Electrodomestico();
		
		el.setWeight(14);
		el.setEnergyConsume(2000);
		
		el.isLowConsume();
		
		System.out.println("El balance es: "+el.calculateBalance());
		
		el.isHighEnd();
		
		PuntoGeometrico punto = new PuntoGeometrico();
		

		
		System.out.println(punto.calculateEuclidianDistance());
		
	}
}
