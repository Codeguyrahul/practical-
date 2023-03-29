package THread;

public class DeamonEG extends Thread{
public void run() {
	if(Thread.currentThread().isDaemon()) {
	System.out.println("i am Deamon");
	
}
else{
	System.out.println(Thread.currentThread().getName());
	System.out.println("i am user");
}}
public static void main(String[] args) {
	DeamonEG t= new DeamonEG();
	DeamonEG t1= new DeamonEG();
	DeamonEG t2= new DeamonEG();
	t.setDaemon(true);
	t1.setDaemon(true);
	
	t.start();
	t1.start();
	t2.start();
}
}

