package FigureGem;

public class MainTester {

	public static void main(String[] args) {
		// Polimorfismo
		Figura f[] = new Figura[5];
		f[0] = new Triangolo(14, 16, 16, 15);
		f[1] = new Triangolo(15, 15, 15, 15);
		f[2] = new Rettangolo(10, 8);
		f[3] = new Quadrato(10);
		f[4] = new Cerchio(20);
		
		for(int i = 0; i < f.length; i++) {
			// Polimorfismo perché in runtime cambia la funzione di 
			// Perimetro e Area in base all'oggetto assegnato nell'array Figura
			f[i].Perimetro();
			f[i].Area();
			System.out.println(f[i]);
		}		
	}

}
