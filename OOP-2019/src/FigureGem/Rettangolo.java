package FigureGem;

/**
 * 
 * @author andreatirelli
 * 
 * Classe figlia di Figura, per la rappresentazione generale di un rettangolo
 *
 */
public class Rettangolo extends Figura{
	/**
	 * Base del rettangolo
	 */
	private float base;
	/**
	 * Altezza del rettangolo
	 */
	private float h;
	
	/**
	 * Costruttore del rettangolo dove vengono passati Base e Altezza di esso
	 * @param b
	 * @param h
	 */
	public Rettangolo(float b, float h) {
		base = b;
		this.h = h;
	}
	
	/**
	 * Otteniamo il valore della base del triangolo
	 * @return
	 */
	public float getBase() { return this.base; }
	
	/**
	 * Calcolo del perimetro del rettangolo
	 */
	public void Perimetro() {
		setPerimetro((base + h) * 2);
	}
	
	/**
	 * Calcolo dell'area del rettangolo
	 */
	public void Area() {
		setArea(base + h);
	}
}
