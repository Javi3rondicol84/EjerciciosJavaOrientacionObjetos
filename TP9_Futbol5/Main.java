package TP9_Futbol5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Club cb = new Club();
		
	
		
		Socio s1 = new Socio("Zu", "aezz", 40, false);
		Socio s2 = new Socio("Cst", "lopez", 15, true);
		Socio s3 = new Socio("Darah", "guñezz", 35, true);
		Socio s4 = new Socio("Ueoge", "nuñez", 35, false);
		Socio s5 = new Socio("Abeb", "pep", 35, true);
		Socio s6 = new Socio("Biouo", "nuñez", 35, false);
		
		Alquiler a1 = new Alquiler(LocalDate.of(2022, 10, 20), 250, 1);
		Alquiler a2 = new Alquiler(LocalDate.of(2022, 8, 2), 2000, 2);
		Alquiler a3 = new Alquiler(LocalDate.of(2022, 9, 10), 500, 3);
		
		Alquiler a4 = new Alquiler(LocalDate.of(2022, 9, 20), 300, 4);
		Alquiler a5 = new Alquiler(LocalDate.of(2021, 5, 15), 600, 5);
		Alquiler a6 = new Alquiler(LocalDate.of(2022, 8, 30), 500, 6);
		
		s1.addAlquiler(a1);
		s1.addAlquiler(a1);
		s1.addAlquiler(a1);
		s1.addAlquiler(a2);
		s1.addAlquiler(a3);
		
		s2.addAlquiler(a2);
		s2.addAlquiler(a2);
		s2.addAlquiler(a2);
		s2.addAlquiler(a2);
		s2.addAlquiler(a2);
		s2.addAlquiler(a4);
		s2.addAlquiler(a6);
		
		s3.addAlquiler(a2);
		s3.addAlquiler(a3);
		s3.addAlquiler(a4);
		s3.addAlquiler(a5);
		s3.addAlquiler(a6);
		s3.addAlquiler(a4);

		s4.addAlquiler(a5);
		s4.addAlquiler(a1);
		s4.addAlquiler(a2);
		
		s5.addAlquiler(a3);
		s5.addAlquiler(a4);
		s5.addAlquiler(a3);
		
		s6.addAlquiler(a3);
		s6.addAlquiler(a4);
		s6.addAlquiler(a3);
		
		
		cb.addSocio(s1);
		cb.addSocio(s2);
		cb.addSocio(s3);
		cb.addSocio(s4);
		cb.addSocio(s5);
		cb.addSocio(s6);
				
		ComparadorEdad ordenEdad = new ComparadorEdad();
		ComparadorTotalAlquileresID ordenAlquileres = new ComparadorTotalAlquileresID(2);
		ComparadorNombre ordenNombre = new ComparadorNombre();
		ComparadorApellido ordenApellido = new ComparadorApellido();
		
		FiltroCuotaImpaga fc = new FiltroCuotaImpaga();
		FiltroPrecioSuperior fs = new FiltroPrecioSuperior(100);
		
		ComparadorCompuesto ordenAlFab = new ComparadorCompuesto(ordenApellido, ordenNombre);
		
		ComparadorCuotasPagas ordenMorosos = new ComparadorCuotasPagas();
		
		ComparadorCompuesto ordenMorososAlfebetico = new ComparadorCompuesto(ordenMorosos.reversed(), ordenAlFab);
		
		ArrayList<Socio> lista = cb.buscar(fs, ordenMorososAlfebetico);
		
		for(int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i) + ", cant alquileres: "+lista.get(i).getCantidadTotalAlquiler(2));
			
		}

	}

}
