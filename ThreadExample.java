package THread;
// creating thread by extending thread class
public class ThreadExample  extends Thread{
	
	public void run() {
		System.out.println(" i am thread... thread is running");
	}
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();// move the thread to the active state
		t.setName("pallabi");
		String s= t.getName();
		System.out.println(s);
	}

}
