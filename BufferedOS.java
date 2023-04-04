package IO;
import java.io.*;

/* write information in the BuferedOutPut object which is connected to the fileOutPutStream object.*/
public class BufferedOS {
public static void main(String[] args) {
	try {
		// we connected one stream (FileOutPutStream) with another(fileOutputStream)
		FileOutputStream f = new FileOutputStream("H:\\IO4.txt");// destination
		BufferedOutputStream b= new BufferedOutputStream(f);
		String s= "welcome to coding World";
		byte b1[]=s.getBytes();// converting string into byte array
		f.write(b1);
		b.flush();// Flushes the data of one stream and send it into another
		f.close();
		b.close();
		System.out.println("done");

	}catch(Exception e) {
		System.out.println(e);
	}
}
}


