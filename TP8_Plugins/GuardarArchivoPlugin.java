package TP8_Plugins;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin extends Plugin{

	private String textoAGuardar;
	private String path;
	
	public GuardarArchivoPlugin(String textoAGuardar, String path) {
		super(textoAGuardar);
		this.textoAGuardar = textoAGuardar;
		this.path = path;
	}

	@Override
	public void ejecutar() {
		try {
			Files.write(Paths.get(path), textoAGuardar.getBytes());
			} catch (IOException e) {
			System.out.println(e);
			}

		
	}

	

}
