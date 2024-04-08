package TP2_Sistema_Gastos_V2;

public class Ciudad { //ver gastos de ciudad(objeto gasto) y cuanto recaudan con impuestos de la ciudad(objeto impuestos).
	private String nombre;
	private int habitante;
	private int imp1;
	private int imp2;
	private int imp3;
	private int imp4;
	private int imp5;
	private int gasto_mantenimiento;
	
	public Ciudad() {
		this.imp1 = 1000;
		this.imp2 = 1000;
		this.imp3 = 1000;
		this.imp4 = 1000;
		this.imp5 = 1000;
		this.gasto_mantenimiento = 25000;
		this.nombre = "Tandil";
		this.habitante = 100000;

	}
	
	public int obtenerRecaudacion() {
		return this.imp1 + this.imp2 + this.imp3 + this.imp4 + this.imp5;
	}

	
	public boolean esDeficitaria() { //gasta mas que lo que recauda
		return this.obtenerRecaudacion() < this.getGasto_Mantenimiento();
	}

	
	//setters getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitante() {
		return habitante;
	}

	public void setHabitante(int habitante) {
		this.habitante = habitante;
	}

	public int getImp1() {
		return imp1;
	}

	public void setImp1(int imp1) {
		this.imp1 = imp1;
	}

	public int getImp2() {
		return imp2;
	}

	public void setImp2(int imp2) {
		this.imp2 = imp2;
	}

	public int getImp3() {
		return imp3;
	}

	public void setImp3(int imp3) {
		this.imp3 = imp3;
	}

	public int getImp4() {
		return imp4;
	}

	public void setImp4(int imp4) {
		this.imp4 = imp4;
	}

	public int getImp5() {
		return imp5;
	}

	public void setImp5(int imp5) {
		this.imp5 = imp5;
	}

	public int getGasto_Mantenimiento() {
		return gasto_mantenimiento;
	}

	public void setGasto_Mantenimiento(int gasto_mantenimiento) {
		this.gasto_mantenimiento = gasto_mantenimiento;
	}
	
	
	
	
}
