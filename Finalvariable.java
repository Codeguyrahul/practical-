package cognizant.shapes;
// final variable cannot change the value of the final variable
public class Finalvariable {
	final int value =50;//final variable
void display() {
	System.out.println(value);
	// we cn't change the value of final variable 
	// value=70;//compile time error
}
public static void main(String[] args) {
	 Finalvariable fv=new  Finalvariable();
	 fv.display();
}
}
