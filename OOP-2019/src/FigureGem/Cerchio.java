package FigureGem;

/**
 * 
 * @author andreatirelli
 *
 * Classe figlia di Figura, per la rappresentazione generale di un cerchio
 */
public class Cerchio extends Figura{
	/**
	 * Raggio del cerchio
	 */
	private float r;
	
	/**
	 * Costruttore del cerchio
	 * @param r
	 */
	public Cerchio(float r) {
		this.r = r;
	}
	
	/**
	 * Calcolo del perimetro
	 */
	public void Perimetro() {
		setPerimetro((float)(2*Math.PI * r));
	}
	
	/**
	 * Calcolo dell'area del cerchio
	 */
	public void Area() {
		setArea((float)(Math.PI * r * r));
	}
}
