package Exception_handling.Exception_handling;

public class throwKeyword {
	public static void checksum(int num) {
		 if (num<0){
		 
			throw new ArithmeticException("Number is negative");
		 }
		 else {
			 System.out.println("Number is positive");
		 }
	}
	public static void main(String[] args) {
		checksum(3);
		System.out.println("executed");
	}

}
