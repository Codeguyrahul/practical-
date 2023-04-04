package IO;

import java.io.FileOutputStream;


public class WriteStringFOS1 {

	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream("H:\\IO1.txt");
		
			f.write(82);//byte to 
			f.close();
			System.out.println("Done");
		}catch(Exception e){
			System.out.println(e);
			
		}
		
	}

}
