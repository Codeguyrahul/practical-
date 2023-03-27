package THread;


//class EvenThread extends Thread{
//	
//
//	public void run() {
//		 for (int i = 2; i <= 100; i += 2) {
//	 
//		 try {
//	      Thread.sleep(500);
//	            System.out.println("even" +i);
//	        }
//		 catch(InterruptedException e) {
//			 System.out.println(e);
//		 }
//	    }
//}
//
//class OddThread extends Thread{
//	 public void run() {
//		 for (int j = 1; j <= 100; j += 2) {
//	
//	        try {
//	            // wait for the even thread to complete
//	        	Thread.sleep(1000);
//	            // print odd numbers
//	         
//	                System.out.println("odd:"+j);
//	            }
//	         catch (InterruptedException e) {
//	           System.out.println(e);
//	        }
//		 }   
//}}
//public class Thread_Main {
//public static void main(String[] args) {
//	EvenThread t= new EvenThread();
//	   OddThread t1 = new OddThread();
//       t.start();
//       try {
//    	   t.join();
//       }catch(InterruptedException e) {
//    	   System.out.println(e);
//       }
//       t1.start();
//     
//       
//}
//}
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            try {
                Thread.sleep(500);
                System.out.println("even" +i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread_2 extends Thread {
    public void run() {
        for (int j = 1; j <= 100; j += 2) {
            try {
                // wait for the even thread to complete
                Thread.sleep(1000);
                // print odd numbers
                System.out.println("odd:"+j);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread_example4 {
    public static void main(String[] args) {
        EvenThread t= new EvenThread();
        OddThread_2 t1 = new OddThread_2();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t1.start();
    }
}
