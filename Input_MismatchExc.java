package Exception_handling.Exception_handling;

import java.util.Scanner;

public class Input_MismatchExc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any two number:");
		try {
			int x= sc.nextInt();
			
			int y=sc.nextInt();		
			System.out.println("result:"+ x/y);
			}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("only take integer (1 to 9)");
		}
		
	}
	

}