package CopyFile;

import java.io.*;

public class Copy {

	public static void main(String[] args) {
		System.out.println(new File(".").getAbsolutePath());
		
		FileInputStream fin = null;
		FileOutputStream fot = null;
		try {
			System.out.println(args[0] + " - " + args[1]);
			fin = new FileInputStream(args[0]);
			fot = new FileOutputStream(args[1]);
			
			byte[] buffer = new byte[1024];
            int noOfBytes = 0;
 
            System.out.println("Copying file using streams");
 
            while ((noOfBytes = fin.read(buffer)) != -1) {
                fot.write(buffer, 0, noOfBytes);
            }
            
            /*
             * int c
             * 
             * while((c=fin.read()) != -1)
             * 		fot.write(c);
             */
             fin.close();
             fot.close();
			
		}catch(Exception e) {
			System.out.println("Errore!\n" + e);
		}	
	}

}
