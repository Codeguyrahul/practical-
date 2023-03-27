package THread;


 class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }}

 class OddThread extends Thread {
    public void run() {
        try {
            // wait for the even thread to complete
            Thread_Eg t = new Thread_Eg();
            t.start();
            t.join();

            // print odd numbers
            for (int i = 1; i <= 100; i += 2) {
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
 public class Thread_Eg{
	    public static void main(String[] args) {
	        // create an instance of the odd thread and start it
	        OddThread oddThread = new OddThread();
	        oddThread.start();
	    }

		public void join() {
			// TODO Auto-generated method stub
			
		}

		public void start() {
			// TODO Auto-generated method stub
			
		}}
       
