package Exception_handling.Exception_handling;

public class Finally_block {
public static void main(String[] args) {
	

	// exception not occure
	try {
		int a= 4/2;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	// exception occure but not handled
	try {
		int a= 4/0;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		int a= 4/0;
		System.out.println(a);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Always finally block will excute");
	}
}}

