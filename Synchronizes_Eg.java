package THread;

 class Sthread_test {
synchronized void display(int num) {
	for(int i=1;i<5;i++) {
		System.out.println(num+1);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
public class Synchronizes_Eg{
public static void main(String[] args) {
	Sthread_test obj= new Sthread_test();
	
	//ist thread object t1
	Thread t1= new Thread() {
		public void show() {
			obj.display(2);
		}
	};
	
	// 2nd thread object t2
	Thread t2= new Thread() {
		public void show() {
			obj.display(2);
		}
	};
	
	t1.start();
	t2.start();
	
}	
}
