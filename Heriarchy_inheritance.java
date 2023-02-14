package Inheritance2;
  class Vehicle1{
	  void running() {
		  System.out.println("running mode on");
	  }
  }
  class Car1 extends Vehicle1 {
	  void run() {
		  System.out.println("car run mode on");
		  
	  }
  }
  class Bike1 extends Vehicle1 {
	  void speed() {
		  System.out.println("speed is very high");
	  }
	  
  }
public class Heriarchy_inheritance {
public static void main(String[] args) {
	Bike1 b= new Bike1();
	b.running();
	b.speed();
	Car1 c =new Car1();
	c.running();
	c.run();
	
}
}
