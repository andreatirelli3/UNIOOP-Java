package LibroJava;

public class MainTest {
	
	public static void main(String[] args) {
		LibroBSI l = new LibroBSI(200, "Prova", 100, "Io", "Prova Java", 10, 15);
		
		l.stampa();
		
		System.out.println(l.toString());
	}

}
