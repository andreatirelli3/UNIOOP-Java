package LibroJava;

public class LibroBSI extends Libro{
	protected int pagine;
	protected String genere;
	protected int codice;
	protected String officialCode;
	
	
	public LibroBSI(int p, String g, int c, String a, String t, int copy, int ac) {
		super(a,t,copy,ac);	// Il metoodo super richiamta il costruttore di Libro
		setPagine(p);
		setGenere(g);
		setCodice(c);
		setOfficialCode();
	}
	
	public void setPagine(int p) { pagine = p; }
	public void setGenere(String g) { genere = g; }
	public void setCodice(int c) { codice = c; }
	public void setOfficialCode() {
		officialCode = getGenere().charAt(0) + Integer.toString(getCodice());
	}
	
	public int getPagine() { return pagine; }
	public String getGenere() { return genere; }
	public int getCodice() { return codice; }
	public String getOfficialCode() { return officialCode; }
	
	public void stampa() {
		System.out.println("Libro BSI: \n" + "\tAutore: " + super.getAutore() + "\n\tTitolo: " + super.getTitolo() + "\n\tCodice: " + getCodice() + "\n\tDB Codice: " + getOfficialCode() + "\n\tGenere: " + getGenere() + "\n\tPagine: " + getPagine() + "\n\tCopie: " + super.getCopie());
	}
	
	@Override
	public String toString() {
		return "Libro BSI: \n" + "\tAutore: " + super.getAutore() + "\n\tTitolo: " + super.getTitolo() + "\n\tCodice: " + getCodice() + "\n\tDB Codice: " + getOfficialCode() + "\n\tGenere: " + getGenere() + "\n\tPagine: " + getPagine() + "\n\tCopie: " + super.getCopie();
	}
}
