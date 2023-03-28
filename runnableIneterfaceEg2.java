package Runnable;

public class runnableIneterfaceEg2 implements Runnable {
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args) {
		Runnable ri= new runnableIneterfaceEg2();
		Thread t= new Thread(ri,"pallabi");
		t.start();
		String s= t.getName();
		System.out.println(s);
		
		
		
	}

}
