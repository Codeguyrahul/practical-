package Exception_handling.Exception_handling;

public class MultiCatch {
static void myFunc() {
	try {
		int i = 50/0;//Arithmetic // 50/2
		System.out.println(i);
		int arr[]=new int [3];
		arr[7]=24;
	}
	catch(ArithmeticException e) {
		System.out.println("only 1st Airthmetic exception will execute");
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("now array index out of bound will oocure");
		
	}
	finally {
		System.out.println("i am finally block");
	}
	
}
public static void main(String[] args) {
	myFunc();
}
}
