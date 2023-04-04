package IO;
// we can read single character- using FileInputStream
import java.io.FileInputStream;
public class SingleCharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f = new FileInputStream("H:\\IO2.txt")	;
		
		int i=f.read();{
		System.out.println((char)i);
	}
	f.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
