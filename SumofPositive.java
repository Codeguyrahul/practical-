package conditionalloops;
import java.util.Scanner;

public class SumofPositive {
public static void main(String[] args) {
	int sum=0;
	int number=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number1=sc.nextInt();
	while(number>=0) {
		sum+=number;
		System.out.println("enter the number");
		number=sc.nextInt();
	}
	System.out.println("sum is:+"+ sum);
	sc.close();
}
}
