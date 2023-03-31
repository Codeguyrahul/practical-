package Test2;


public class ThreadEg4 extends Thread {
   // initiated run method for Thread
   public void run()
   {
       System.out.println("Thread Started Running...");
   }
   public static void main(String[] args)
   {
	   ThreadEg4 g1 = new ThreadEg4();

       // Invoking Thread using start() method
       g1.start();
   }
}