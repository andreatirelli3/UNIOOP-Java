package IOString;

import java.io.*;

public class WriteNum {
	public static void main(String[] args) {
		FileOutputStream fot = null;
		int num[] = {1, 2, 3, 4, 5};
		System.out.println(new File(".").getAbsolutePath());
		
		try {
			fot = new FileOutputStream(args[0]);
			DataOutputStream ot = new DataOutputStream(fot);
			
			for(int e:num) {
				ot.writeInt(e);
			}
			
			ot.close();
		}catch(Exception e) {
			
		}
	}

}
