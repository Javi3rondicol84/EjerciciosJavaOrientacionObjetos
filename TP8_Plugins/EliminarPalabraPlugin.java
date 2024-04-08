package TP8_Plugins;

public class EliminarPalabraPlugin extends Plugin {

	private String texto;
	private String palabra;
	
	public EliminarPalabraPlugin(String texto, String palabra) {
		super(texto);
		this.palabra = palabra;
		this.texto = texto;
	}

	@Override
	public void ejecutar() {
		

		String [] textoDividido = this.texto.split(" ");
		
		for(int i = 0; i < textoDividido.length; i++) {
			if(textoDividido[i].equals(this.getPalabra())) {
				
				textoDividido[i] = "";
			}
		}
		
		
		this.eliminarPalabras(textoDividido);
		
		System.out.println(this.getTexto());
		
		
	}
	
	public void eliminarPalabras(String [] textoDividido) {
		
		String nuevoTexto = "";
		
		for(int i = 0; i < textoDividido.length; i++) {
			
			if(i == 0) {
				nuevoTexto += textoDividido[i];
			}
			else {
				nuevoTexto += " " + textoDividido[i];
			}
			
		}
		
		this.setTexto(nuevoTexto);
	}
	


	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	

	



}
