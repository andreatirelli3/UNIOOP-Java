package Elettric;

public abstract class DispEll {
	private String marca;
	private String modello;
	private int core;
	private String so;
	
	public DispEll(String marca, String modello, int core, String so) {
		this.marca = marca;
		this.modello = modello;
		this.core = core;
		this.so = so;
	}
	
	void setMarca(String m) { marca = m; }
	void setModello(String m) { modello = m; }
	void setCore(int core) { this.core = core; }
	void setSO(String so) { this.so = so; }
	
	@Override
	public String toString() {
		return "Marca: " + this.marca + "\nModello: " + this.modello + "\nCore: " + this.core + "\nSistema Operativo: " + this.so;
	}
}
