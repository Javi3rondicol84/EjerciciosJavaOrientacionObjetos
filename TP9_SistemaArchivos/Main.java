package TP9_SistemaArchivos;

public class Main {
	
	public static void main(String [] args) {
		 Carpeta raiz = new Carpeta("\\", null, null);

	        Carpeta tudai = new Carpeta("Tudai", null, null);
	        Carpeta primero = new Carpeta("1er anio", null, null);
	        raiz.addElemento(tudai);
	        tudai.addElemento(primero);

	        Archivo calendario = new Archivo("Calendario.pdf", 500.5, null, null);
	        tudai.addElemento(calendario);

	        Carpeta prog2 = new Carpeta("Prog2", null, null);
	        primero.addElemento(prog2);

	        Archivo parcial =  new Archivo("Parcial.doc", 100.0, null, null);
	        Archivo recu = new Archivo("Recuperatorio.pdf", 800.0, null, null);
	        prog2.addElemento(parcial);
	        prog2.addElemento(recu);

	        System.out.println("Tamanio de la raiz "+raiz.getTamanio());
	        System.out.println("Tamanio de Prog2 "+prog2.getTamanio());
	        System.out.println("Cantidad de elementos de la raiz "+raiz.getCantElementos());




	        Comprimido examenesViejos = new Comprimido("examenes.zip",0.5, null, null);

	        Archivo parcial2 =  new Archivo("Parcial2.doc", 400.0, null, null);
	        Archivo recu2 = new Archivo("Recuperatorio2.pdf", 600.0, null, null);
	        examenesViejos.addElemento(parcial2);
	        examenesViejos.addElemento(recu2);

	        prog2.addElemento(examenesViejos);

	        System.out.println(prog2.getTamanio());

	        AccesoDirecto linkAProg2 = new AccesoDirecto(prog2, null, null);
	        System.out.println(linkAProg2);

	        System.out.println(raiz);
	        
	        FNombreContiene ft = new FNombreContiene("Parcial");
	        ComparadorNombre comp = new ComparadorNombre();
	        
	        System.out.println(raiz.buscar(ft, comp));
	       
	        System.out.println("\n Filtro por tamanio mayor a x y orden por tamanio");
	        
	        FTamanioMayor ft2 = new FTamanioMayor(500);
	        
	        ComparadorTamanio compTamanio = new ComparadorTamanio();
	        
	        System.out.println(raiz.buscar(ft2, compTamanio.reversed()));
	    
	        
	        //SECCION COPIA
	        
//	        
//	        //original parcial archivo
//	        System.out.println(parcial2);
//	        
//	        Archivo parcial2Copia = parcial2.copia();
//	        
//	        parcial2Copia.setNombre("ssdsd");
//	        
//	        System.out.println("nombre cambiado a parcial: ");
//	        System.out.println(parcial2.getNombre());
//	        
//	        System.out.println("nombre cambiado a copia: ");
//	        System.out.println(parcial2Copia.getNombre());
//	        
//	        System.out.println("Comprimido: ");
//	        Comprimido examenesViejosCopia = examenesViejos.copia(); 
//	        
//	        System.out.println("nombre cambiado a examenesViejosCopia, y ver tasa: ");
//
//	        examenesViejosCopia.setNombre("dsaasdasdad");
//	        
//	        System.out.println(examenesViejos.getNombre());
//	        
//	        System.out.println("nombre cambiado a Comprimido Copia, y ver tasa: ");
//	        
//	        System.out.println(examenesViejosCopia.getNombre());
//	        
//	        System.out.println("ver tasa: ");
//	        System.out.println(examenesViejos.getTasa_compresion());
//	        System.out.println(examenesViejosCopia.getTasa_compresion());
//	        
//	        System.out.println("ver lista: ");
//	        System.out.println(examenesViejos);
//	        System.out.println(examenesViejosCopia.getTasa_compresion());
//	        
//	        examenesViejos.verLista();
//	        examenesViejosCopia.verLista();

	    
	}

}
