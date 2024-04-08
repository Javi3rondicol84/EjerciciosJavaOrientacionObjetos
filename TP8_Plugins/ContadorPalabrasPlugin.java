package TP8_Plugins;

public class ContadorPalabrasPlugin extends Plugin {
	private String texto;
	private int cant_palabras;
	
	public ContadorPalabrasPlugin(String texto) {
		super(texto);
		
		this.cant_palabras = 0;
		this.texto = texto;
	}

	@Override
	public void ejecutar() {
		
		String [] textoDividido = this.texto.split(" ");

		this.cant_palabras = textoDividido.length;
		
		System.out.println("El texto tiene "+this.cant_palabras+" palabras");
	}

	public int getCant_palabras() {
		return cant_palabras;
	}

	
}
