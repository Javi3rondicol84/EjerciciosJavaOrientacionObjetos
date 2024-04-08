package TP5_HarryPotter_V2;

import java.util.ArrayList;

public class CasaPura extends Casa{
	
	public CasaPura() {
		super();
	}
	
	@Override
	public boolean esApto(Alumno al) {
		ArrayList<String> cual_alums = al.obtenerCualidades();
		int suma = 0;
		
		for(int i = 0; i < this.cualidades.size(); i++) {
			
			if(cual_alums.contains(this.cualidades.get(i))) {
				suma++;
			}
			
		}
		
		if(suma == this.cualidades.size() && esSangrePura(al)) {
			return true;
		}
		
		
		return false;
	}
	
	public boolean esSangrePura(Alumno al) {
		ArrayList<String> fams_alums = al.obtenerFamiliares();
		
		for(int i = 0; i < fams_alums.size(); i++) {
			if(this.getNombre().equals(fams_alums.get(i))) {
				System.out.println("El Alumno "+al.getNombre()+" es Sangre Pura, tiene un familiar en la casa "+this.getNombre());
				return true;
			}
		}
		
		System.out.println("El Alumno "+al.getNombre()+" No es Sangre Pura, no tiene un familiar en la casa "+this.getNombre());
		return false;
	}
	
}
