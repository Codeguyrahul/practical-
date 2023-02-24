package polymorphism;


public class RunTimePolymorphsim {
public static void main(String[] args) {
	 Java_student js;
	 js= new Hemant();
	 System.out.println(" hemant quality is:"+js.quality());
}
		
		
	} 

class Java_student{
	String quality() {
		return null;
	}
}
class Hemant extends Java_student{
	String quality() {
		return "Active";
	}
}
class Sana extends Java_student{
	String quality() {
		return "sweet";
	}
}
class vijay extends Java_student{
	String quality() {
		return "brave";
	}
}
class Ben extends Java_student{
	String quality() {
		return "Active";
	}
}