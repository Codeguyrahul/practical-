package String;

public class Reverse_String {
	  public static void main(String[] args) {
		   String originalStr = "hello i am rahul";
		    String reversedStr = " ";
		    System.out.println("Original string: " + originalStr);
		        
		    for (int i = 0; i < originalStr.length(); i++) {
		      reversedStr = originalStr.charAt(i) + reversedStr;
		    }
		    
		    System.out.println("Reversed string: "+ reversedStr);
		  }
		

}
