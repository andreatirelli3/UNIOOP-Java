package FigureGem;

/**
 * 
 * @author andreatirelli
 * 
 * Classe figlia di Figura, per la rappresentazione generale di un triangolo
 *
 */
public class Triangolo extends Figura{
	/**
	 * Array delle informazioni del trinagolo
	 * In l[0] Sarà presente SEMPRE l'altezza del triangolo
	 * In l[1] Sarà presente SEMPRE la base del triangolo
	 */
	private float l[];
	
	/**
	 * Costruttore dove vengono passati i lati del trinagolo e l'altezza
	 * l1 = Base
	 * h = Altezza
	 * @param l1
	 * @param l2
	 * @param l3
	 * @param h
	 */
	public Triangolo(float l1, float l2, float l3, float h) {
		this.l = new float[4];
		this.l[0] = h;
		if(l1 == l2 && l2 == l3)
			this.l[1] = this.l[2] = this.l[3] = l1;
		else {
			this.l[1] = l1;
			this.l[2] = l2;
			this.l[3] = l3;
		}
	}
	
	/**
	 * Calcolo del Perimetro
	 */
	public void Perimetro() {
		setPerimetro(l[1] + l[2] + l[3]);
	}
	
	/**
	 * Calcolo dell'Area
	 */
	public void Area() {
		setArea((l[1] * l[0])/2);
	}
}
