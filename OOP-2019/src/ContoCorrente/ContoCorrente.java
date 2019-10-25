package ContoCorrente;

import java.util.*;

public class ContoCorrente {
	private int CC;		// Codice Conto Corrente
	private int saldo;	// Saldo attuale
	private List<Integer> movimenti;	// Movimenti conto
	private int counterMovimenti;	// Totale movimenti
	
	public ContoCorrente(int c, int s) {	// Cotruttore con parametri dell'oggetto ContoCorrente
		setCC(c);
		setSaldo(s);
		movimenti = new ArrayList<>();
		
	}
	
	public void setCC(int c) { CC = c; }
	public void setSaldo(int s) {saldo = s; }
	public void setCounter(int m) { counterMovimenti = m; }
	
	public int getCC() { return CC; }
	public int getSaldo() { return saldo; }
	public List<Integer> getMovimenti() { return movimenti; }
	public int getCounter() { return counterMovimenti; }
	
	public boolean prelievo(int qt) {
		if(getSaldo() - qt >= 0) {
			setSaldo(getSaldo() - qt);
			getMovimenti().add(-qt);
			setCounter(getCounter() + 1);
			return true;
		}
		return false;
	}
	
	public void versamento(int v) {
		setSaldo(getSaldo() + v);
		getMovimenti().add(v);
		setCounter(getCounter() + 1);
	}
	
	public void stampaMove() {
		int i = 1;
		for(Integer n : getMovimenti()) {
			System.out.println("Movimenti Totali= " + getCounter() + "\n");
			System.out.println("Movimento n= " + i + " : " +  n + "\n");
			i++;
		}
	}
}
