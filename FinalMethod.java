package cognizant.shapes;
//final key word
// final method-- cannot override the final method
class FinalMethod1{// parent class 
	final void display() {// create a final method
		System.out.println(" this is a final method");
	}
}
class Child1 extends FinalMethod1{// child class name
	// try to override final method
	// final void display() {// create a final method  ,,but it show error
	//System.out.println(" this is a final method");
}


public class FinalMethod {
public static void main(String[] args) {
	Child1 obj = new Child1();
	obj.display();
}
}
