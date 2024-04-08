package TP1.copy;


public class Persona {
	private String name;
	private String lastname;
	private int dni;
	private int age;
	private double height;
	private double weight;
	private String sex;
	
	private String date;
	 // LocalDate fechaActual = LocalDate.now();

	
	
	
	public Persona (int dni){
		this.dni = dni;
		this.setName("N");
		this.setLastName("N");
		this.setDate("01/01/2000");
		this.setHeight(1.0);
		this.setWeight(1.0);
		this.setSex("Femenino");
    }
	
	public Persona (int dni, String name, String lastname){
		this(dni);
		this.setName(name);
		this.setLastName(lastname);
	}
	
	public Persona (int dni, String name, String lastname, int age){
		this(dni, name, lastname);
		this.setAge(age);
	}
	
	public Persona (int dni, String name, String lastname, int age, String date){
		this(dni, name, lastname, age);
		this.setDate(date);

	}
	
	public Persona (int dni, String name, String lastname, int age, String date, double height){
		this(dni, name, lastname, age, date);
		this.setHeight(height);
	}
	
	public Persona (int dni, String name, String lastname, int age, String date, double height, double weight){
		this(dni, name, lastname, age, date, height);
		this.setWeight(weight);
	}
	
	public Persona (int dni, String name, String lastname, int age, String date, double height, double weight, String sex){
		this(dni, name, lastname, age, date, height, weight);
		this.setSex(sex);
	}
	
	
	
	/* METHODS */
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 2) {
			System.out.println("La altura debe ir en CM");
		}
		else {
			this.height = height;
		}
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double calculateIMC() {		
		return this.getWeight()/(this.getHeight()*this.getHeight());
	}

	public void seeCondition(double IMC) {
		
		System.out.println(IMC);
		if(IMC < 18.5) {
			System.out.println("Debe aumentar de peso");
		}
		else if (IMC > 25.0){
			System.out.println("debe bajar de peso");
		}
		else {
			System.out.println("Esta en forma");
		}
		
	}
	
	public void seeBirthday() {
		
		if(this.date == "01/01/2000") {
			System.out.println("está cumpliendo años");
		}
		else {
			System.out.println("no cumple años");
		}
		
	}
	
	public void isAdult() {
		
		if(this.age > 18) {
			System.out.println("es mayor de edad");
		}
		else {
			System.out.println("no es mayor de edad");
		}
		
	}
	
	public void canVote() {
		if(this.age > 16) {
			System.out.println("puede votar");
		}
		else {
			System.out.println("no puede votar");
		}
	}
	
	public void isCoherent() {
		if((this.date == "01/01/2000") && (this.age == 23)) {
			System.out.println("la edad coincide con la fecha predeterminada");
		}
		else {
			System.out.println("la edad no coincide");
		}
	}
	
	public void seeInformation() {
		System.out.print("| DNI: "+ this.dni +"| Nombre: "+ this.name + "| Fecha: "+this.date+"\n| Edad: "+this.age+" | Peso: "+this.weight+"| Altura: "+this.height+"\n");
	}
	
}
