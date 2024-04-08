package TP8_Plugins;

public abstract class Plugin implements IPlugin {
	private String texto;
	
	public Plugin(String texto) {
		this.texto = texto;
	}
	
	@Override
	public abstract void ejecutar();
	
}
