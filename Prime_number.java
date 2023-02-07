package method;
import java.util.*;

public class Prime_number {
public static void main(String []args) {
	int num;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the any number");
	num=sc.nextInt();
	Prime_number(num);
}
   static void Prime_number(int num) {
	// TODO Auto-generated method stub
	
 
	
	int count=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			count++;
			break;
		}
	}
	if(count==2) {
		System.out.println("is prime no");
	}else {
		System.out.println("is not prime no");
	}
	
	
	
}
}
