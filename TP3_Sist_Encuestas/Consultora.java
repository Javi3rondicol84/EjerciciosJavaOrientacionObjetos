package TP3_Sist_Encuestas;

// UNA SOLA ENCUESTA POR PERSONA

public class Consultora { //se encarga de realizar encuestas
	private Empleado [] empleado; //cada empleado realiza encuestas, se desea saber cuantas encuestas hizo un empleado
	//guardar en metodo la cantidad de encuestas realizadas por el empleado
	
	//la consultura guarda empleados, que a su vez dichos empleados realizan encuestas.
	
	public Consultora(){
		this.empleado = new Empleado[1];
		this.inicializarEmpleado();
	}
	
	public void inicializarEmpleado() {
		
		for(int i = 0; i < empleado.length; i++) {
			empleado[i] = new Empleado();
		}
		
		this.asignarValoresEmpleado();
	}
	
	public void asignarValoresEmpleado() {
		this.empleado[0].setNombre("Markus");
		//this.empleado[1].setNombre("Rodrigo");
	}
	
	public void empleadoRealizaEncuesta() {
		
		for(int i = 0; i < empleado.length; i++) {
			empleado[i].RealizarEncuesta();
		}
	}
	
	//dar plus a salario del empleado segun la cantidad de encuestas respondidas (sumar los boolean true por encuesta)

	public void darPlusSalarioEmpleado() {
		for(int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i].obtenerEncuestasRealizadas());
		}
	}
	
	public static void main(String [] args) {
	    Consultora consul = new Consultora();
		
		consul.empleadoRealizaEncuesta();
		
		consul.darPlusSalarioEmpleado();

	}
	
}






/*
public void setNamesEncuestasAndShow() {
	
	enc[0].setNombre("Juan");
	enc[1].setNombre("Pepe");
	enc[2].setNombre("Tomas");
	
}

public void showNamesEncuesta() {
	
	for(int i = 0; i < enc.length; i++) {
		
		System.out.println(enc[i].getNombre());
	}
	
}

public static void main(String [] args) {
	Consultora cons = new Consultora();
	
	cons.showNamesEncuesta();
}

*/

