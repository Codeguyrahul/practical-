package method;
import java.util.*;
public class Method1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		//take number from user
		int num=sc.nextInt();
		findevenodd(num);
		
	}

	public static void findevenodd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			System.out.println(num+" "+"even");
		}
		else {
			System.out.println(num+" "+"odd");
		}
	}

}
