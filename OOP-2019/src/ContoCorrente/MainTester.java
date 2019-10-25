package ContoCorrente;

public class MainTester {

	public static void main(String[] args) {
		ContoCorrente A = new ContoCorrente(100, 1000);
		ContoCorrente B = new ContoCorrente(40, 500);
		
		if(A.prelievo(5000)) {
			System.out.println("Ok!");
		} else {
			System.out.println("Operazione negata");
		}
		
		if(B.prelievo(100)) {
			System.out.println("Ok!");
		} else {
			System.out.println("Operazione negata");
		}
		
		A.versamento(10000);
		B.versamento(5000);
		
		if(A.prelievo(5000)) {
			System.out.println("Ok!");
		} else {
			System.out.println("Operazione negata");
		}
		
		A.stampaMove();
		B.stampaMove();
	}
}
