package Exception_handling.Exception_handling;



public class throw_Key {
	public static void check(int marks) {
		if(marks<60) {
			throw new ArithmeticException(" u are not eligible for this course");
			
		}
		else {
			System.out.println("u are eligible");
		}
		
		
	}public static void main(String[] args) {
		check(78);
		check(45);
	}

}
