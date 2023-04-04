package IO;
import java.io.*;
// read the data from my source file by using BufferedInputStream
public class BufferedIS {
	public static void main(String[] args) {
	      try {
	            // Create a FileInputStream object
	            FileInputStream f= new FileInputStream("H:\\\\IO4.txt");
	            BufferedInputStream b= new BufferedInputStream(f);
	            // Read all characters from the file and print them to the console
	            int ch;
	            while ((ch = b.read()) != -1) {
	                System.out.print((char) ch);
	            }
	            

	            // Close the stream
	                f.close();
	                b.close();
	        } catch (Exception e) {
	           System.out.println(e);
	        }
	}

}
