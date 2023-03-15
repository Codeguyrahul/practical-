package Expression;
import java.util.regex.*;
public class Regex_1 {
public static void main(String[] args) {
// 1st way
	Pattern p= Pattern.compile("..s");
	Matcher m= p.matcher("khs");
	boolean b= m.matches();
	
	//2nd way
	boolean b2=Pattern.compile(".s").matcher("kjh").matches();
	
	// 3rd way
	boolean b3= Pattern.matches("..s", "ks");
	System.out.println(b+" "+b2+" "+b3);
	
	
	//character class

	
	boolean s1= Pattern.matches("[a-zA-Z]", "A");//for only single character// in this upper & lower case it dozen matter but if take character than u can only take character ,if u take no then should be  no
	boolean s2= Pattern.matches("[pqr]", "s");//for only single character//should be match character and take only one
	boolean s3= Pattern.matches("[^abc]", "r");//for only single character//in this type if abc the character than it will show false and if u take different character then it show true
	System.out.println(s1+""+s2+""+s3);
}
}
