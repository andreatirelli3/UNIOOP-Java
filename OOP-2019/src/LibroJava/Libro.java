package LibroJava;


public class Libro {
	private String autore;	// Autore del libro
	private String titolo;	// Titolo del libro
	private int copie;		// Copie a disposizione per i prestiti
	private int actcopie;	// Copie disponibili del libro
	
	
	// public Libro() {}
	
	// Cotruttore con parametri per l'inizializzazione dell'oggetto
	public Libro(String a, String t, int c, int ac) {
		setAutore(a);
		setTitolo(t);
		setCopie(c);
		setActualCopie(ac);
	}
	
	public void setAutore(String a) { autore = a; }		  // Accedi al autore del libro
	public void setTitolo(String t) { titolo = t; }		  // Accedi al titolo del libro
	public void setCopie(int c) { copie = c; }			  // Accedi alle copie messe a disposizioni del libro
	public void setActualCopie(int ac) { actcopie = ac; } // Accedi alle copie disponibili del libro
	
	public String getAutore() { return autore; }	// Ritorna l'autore del libro
	public String getTitolo() { return titolo; }	// Ritorna il titolo del libro
	public int getCopie() { return copie; }			// Ritorna il numero di copie messe a disposizione del libro
	public int getActualCopie() { return actcopie; }// Ritorna il numero di copie disponibili del libro
	
	
	public boolean Take() {	// Metodo per il prestito del libro
		if(getCopie() < 1) return false;	// Ritorna Falso se il libro non è disponibile
		else setCopie(getCopie() - 1); // Toglie una copia dall'inventario dell'oggetto
		return true;	// Libro disponibile
	}
	
	public boolean returnBook() {	// Restituisce il libro
		if (getActualCopie() + 1 > getCopie()) return false;	// Se il libro non può rientrare nella libreria
		setCopie(getCopie() + 1);	// Incrementa le copie disponbili di +1
		return true;
	}
}
