package TP5_HarryPotter;

import java.util.ArrayList;

public class CasaPura extends Casa {
	private ArrayList<Alumno> alumnos;
	private ArrayList<Cualidad> cualidades;
	
	public CasaPura() {
		super();
	}
	
	@Override
	public boolean cumpleRequisitoExtra(Alumno alumno) {
		boolean esSangrePura = false;
		ArrayList<Familiar> fami_alumno = alumno.obtenerFamiliares();
		int indice = 0;
		
		while((indice < fami_alumno.size()) && (!esSangrePura)) {
			if(fami_alumno.get(indice).getNombreCasa().equals(this.getNombre())) {
				esSangrePura = true;
				System.out.println("El Alumno "+alumno.getNombre()+" es Sangre Pura, tiene un familiar en la casa "+this.getNombre());
			}
			
			indice++;
		}
		
		return esSangrePura;
	}
}
