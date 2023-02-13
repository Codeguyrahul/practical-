package inheritance;

public class MultilevelInheritance {
public static void main(String[] args) {
	SIChild2 child =new SIChild2();
	child.display();
	child.show();
	child.print();
	
}
}

class SIParent1{// parent class
	void show() {
		System.out.println("show the details");
	}
}
	

 class SIChild1 extends SIParent1{
	void display() {
		System.out.println("Display the result");
	}
}
class SIChild2 extends SIChild1{
	void print() {
		System.out.println("print the output");
	}
}
