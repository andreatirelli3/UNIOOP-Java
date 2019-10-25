package FigureGem;

/**
 * 
 * @author andreatirelli
 *
 * Classe figlia di Figura, per la rappresentazione generale di un quadrato
 */
public class Quadrato extends Rettangolo{
	
	/**
	 * Costruttore del quatrato dove viene passata il singolo lato
	 * @param l
	 */
	public Quadrato(float l){
		super(l, l);
	}
	
	/**
	 * Calcolo del perimetro
	 */
	public void Perimetro() {
		super.setPerimetro(super.getBase() * 4);
	}
}
