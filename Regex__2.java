package Expression;
import java.util.regex.*;
public class Regex__2 {
	public static void main(String[] args) {
		 boolean b1 =Pattern.matches("[A-Za-z0-9]{12,}", "Anudip123ppp");
		 System.out.println(b1);
		 boolean b2 = Pattern.matches("[A-Za-z0-9-@+.]{19,}","Pallabi.Anudip@2023");
	System.out.println(b2);
	boolean b3 = Pattern.matches("[0-9]{10}","7505845982");
	System.out.println(b3);
	}

}
