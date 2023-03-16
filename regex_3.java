package Expression;

import java.util.regex.Pattern;

public class regex_3 {
public static void main(String[] args) {
	
	//Email Validation
	
	boolean b4= Pattern.matches("[a-z0-9+_.-]*@[a-z]*+\\.[a-z]{3}","skmoviz22@gamil.com");
	System.out.println(b4);
	
	///META Character
	// \d:- [0-9]
    //  \s:- white space character-----blank space
	//  \w:- [a-zA-Z0-9]
	boolean b5= Pattern.matches("\\w{9}","Anudip123");
	System.out.println(b5);
	}
}

