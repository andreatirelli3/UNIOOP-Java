package FigureGem;

/**
 * 
 * @author Andrea Tirelli
 *
 * Classe astratta padre per la creazione delle figure
 */
public abstract class Figura {
	/**
	 * Perimetro della figura
	 */
	private float P;
	/**
	 * Area della figura
	 */
	private float A;
	
	/**
	 * Metodo per impostare il perimetro della figura
	 * @param P
	 */
	public void setPerimetro(float P) {
		this.P = P;
	}
	
	/**
	 * Metodo per impostare l'area della figura
	 * @param A
	 */
	public void setArea(float A) {
		this.A = A;
	}
	
	public abstract void Perimetro();
	
	public abstract void Area();
	
	/**
	 * Metodo per la stampa della informazioni basi di una figura
	 */
	@Override
	public String toString() {
		return "Perimetro= " + this.P +"\nArea= " + this.A;
	}
}
