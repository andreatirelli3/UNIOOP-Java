package Serializzazione;

import java.io.*;

public class Serializza {
	public void serializza(String file) {
		FileOutputStream f = null;
		ObjectOutputStream os = null;
		try {
			f = new FileOutputStream(file);
		} catch(IOException e) {
			System.out.println("Errore apertura del file!\n" + e);
		}
		
		try {
			os = new ObjectOutputStream(f);
			Punto p = new Punto(2, 5); // Per ES 3 sostituire con un array
			os.writeObject(p);
			os.close();
		} catch(IOException e) {
			System.out.println("Errore apertura file!\n" + e);
		} catch(Exception e) {
			System.out.println("Errore in esecuzione!\n" + e);
		}		
	}
	
	public void deserializza(String file) {
		FileInputStream f = null;
		ObjectInputStream is = null;
		try {
			f = new FileInputStream(file);
		} catch(IOException e) {
			System.out.println("Errore apertura del file!\n" + e);
		}
		
		try {
			is = new ObjectInputStream(f);
			Punto p = (Punto)is.readObject(); // Per ES 3 sostituire con un array
			System.out.println(p.toString());
		} catch(IOException e) {
			System.out.println("Errore apertura file!\n" + e);
		} catch(ClassNotFoundException e) {
			System.out.println("Errore, classe non trovata!\n" + e);
		} catch(Exception e) {
			System.out.println("Errore in esecuzuone!\n" + e);
		}
	}
}
