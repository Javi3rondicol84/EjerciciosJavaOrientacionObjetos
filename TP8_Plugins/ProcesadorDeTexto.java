package TP8_Plugins;

public class ProcesadorDeTexto {
	
	public void ejecutarPlugin(Plugin plugin) {
		plugin.ejecutar();
	}

	public static void main(String [] args) {
		String texto = "Hola archivo";
		String path = "C:\\Users\\javie\\OneDrive\\Escritorio\\test\\documento.txt";

		
		ProcesadorDeTexto pr = new ProcesadorDeTexto();
		ContadorOcurrenciasPlugin plugin = new ContadorOcurrenciasPlugin("pepe pepe pepa", "pepe");
		ReemplazoTextoPlugin plugin2 = new ReemplazoTextoPlugin("pepe pepe pepa", "pepe", "otrotexto");
		EliminarPalabraPlugin plugin3 = new EliminarPalabraPlugin("pepe pepe pepe pepu", "pepu");
		GuardarArchivoPlugin plugin4 = new GuardarArchivoPlugin(texto, path); 
		
				pr.ejecutarPlugin(plugin4);
	}
	
	
}
