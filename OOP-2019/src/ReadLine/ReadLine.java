package ReadLine;

import java.io.*;

public class ReadLine {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Inserire un argomento!");
			System.exit(0);
		}
		
		File f = null;
		FileWriter fw = null;
		try {
			f = new File(args[0] + ".txt");
			fw = new FileWriter(f);	
		} catch(IOException e) {
			System.out.println("Errore nell'apertura del file!\n" + e);
		}
		
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader b = new BufferedReader(in);
			String input = "";
			System.out.println("Inserire i dati desiderati; per uscire digitare la stringa 'FINE' keysensitive");
			
			input = b.readLine();
			while(!input.equals("FINE")) {
				fw.write(input);
				fw.write("\n");
				input = b.readLine();
			}
			
			System.out.println("Fine scrittura!");
			fw.close();
		} catch(IOException e) {
			System.out.println("Errore nella scrittura del file!\n" + e);
		} catch(Exception e) {
			System.out.println("Errore in esecuzione!\n" + e);
		}	
	}

}
