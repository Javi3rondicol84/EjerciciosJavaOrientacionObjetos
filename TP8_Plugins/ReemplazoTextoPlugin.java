package TP8_Plugins;

public class ReemplazoTextoPlugin extends Plugin {
	private String texto;
	private String palabra;
	private int cant_palabras;
	private String palabraAColocar;
	
	public ReemplazoTextoPlugin(String texto, String palabra, String palabraAColocar) {
		super(texto);
		
		this.palabra = palabra;
		this.cant_palabras = 0;
		this.texto = texto;
		this.palabraAColocar = palabraAColocar;
	}

	@Override
	public void ejecutar() {
		
		String [] textoDividido = this.texto.split(" ");
		
		for(int i = 0; i < textoDividido.length; i++) {
			if(textoDividido[i].equals(this.getPalabra())) {
				textoDividido[i] = this.getPalabraAColocar();
			}
		}
			
		this.reemplazarTexto(textoDividido);
		
	}
	
	public void reemplazarTexto(String [] textoDividido) {
		String textoNuevo = "";
		
		for(int i = 0; i < textoDividido.length; i++) {
			
			textoNuevo += " " + textoDividido[i];
		}
		
		System.out.println(textoNuevo);
		
	}
	
	

	public int getCant_palabras() {
		return cant_palabras;
	}

	public String getPalabra() {
		return palabra;
	}

	public String getPalabraAColocar() {
		return palabraAColocar;
	}
	
	
}
