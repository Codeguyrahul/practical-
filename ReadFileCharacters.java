package IO;
import java.io.FileInputStream;
//we can read all character- using FileInputStream
public class ReadFileCharacters {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object
            FileInputStream f= new FileInputStream("H:\\\\IO3.txt");

            // Read all characters from the file and print them to the console
            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
            }
            

            // Close the stream
                f.close();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
} 





