package TP8_Plugins;

public class ContadorOcurrenciasPlugin extends Plugin {
	private String texto;
	private String palabra;
	private int cant_palabras;
	
	public ContadorOcurrenciasPlugin(String texto, String palabra) {
		super(texto);
		
		this.palabra = palabra;
		this.cant_palabras = 0;
		this.texto = texto;
	}

	@Override
	public void ejecutar() {
		
		String [] textoDividido = this.texto.split(" ");
		
		for(int i = 0; i < textoDividido.length; i++) {
			if(textoDividido[i].equals(this.getPalabra())) {
				this.cant_palabras++;
			}
		}
			
		System.out.println("El texto tiene "+this.cant_palabras+" ocurrencias de la palabra "+this.palabra);
		System.out.println(textoDividido);
	}

	public int getCant_palabras() {
		return cant_palabras;
	}

	public String getPalabra() {
		return palabra;
	}
	
}
