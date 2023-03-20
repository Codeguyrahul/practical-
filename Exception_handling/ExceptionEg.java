package Exception_handling;

public class ExceptionEg {
	public void display() {// method
		// before try- catch block
		String a="i am error";
		System.out.println(a);
		
		try {
			int i= 50/0;//Arithmetic exception
			String s= "riya";
			//after exception can't excute the other lines
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// after try-catch block
		String b= "i cannot be handle";
		System.out.println(a+" "+b);// i am error+i can not be handle
		
	}
	public static void main(String[] args) {
		ExceptionEg ep = new ExceptionEg();
		ep.display();
	}

}
