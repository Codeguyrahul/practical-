package Exception_handling;

public class Differnet_type_of_uncheckedExcep {
	public void display() {// method
		// before try- catch block
		String a="i am error";
		System.out.println(a);
		
		try {
			int i= 50/0;//Arithmetic exception
			System.out.println(i);
			
			// null pointer Exception
			String s= null;
			//after exception can't excute the other lines
			System.out.println(s.length());
			// ArrayIndexoutBound Exception
			int arr[]= new int[5];
			arr[7]=10;
			
			// number format exception
			String s1="riya";
			int n = Integer.parseInt(s1);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// after try-catch block
		String b= "the end";
		System.out.println(b);// i am error+i can not be handle
		
	}
	public static void main(String[] args) {
		Differnet_type_of_uncheckedExcep ep = new Differnet_type_of_uncheckedExcep();
		ep.display();
	}

}


