package cognizant.shapes;

class Base{//parent class
	public int add(int a ,int b) {//non static method
		System.out.println(" in the  base class");
		return a+b;
	}
	public static void print () {//static method
		System.out.println("in the base class");
	}
}

class Derived extends Base{//child class
	// this method overrides add() of Base class 
	//because it not a static method
	public int add(int a, int b) {
		System.out.println("in the child class");
		return a+b;
	}
	//this method is hidden  by print ()in base

public static void print () {
		System.out.println("in the child class");
	}
}

public class StaticOveridding {
public static void main(String[] args) {
	Base obj= new Derived();
	//here derive's add() is called
	//according to overidding rules.
	//Because a static method can't be overridden
	//it use base's print instead
	System.out.println(obj.add(4, 5));
	
	obj.print();
	
}
}
