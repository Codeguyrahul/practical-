package Assignment;

interface Employee{
	void salary();
}
interface Developer{
	void Bonus();
	
}
 class Trainer1 implements Developer,Employee{
	public void Bonus() {
		System.out.println("Bonus will ne 10% of salary");
	}
	
	
	@Override
	public void salary() {
		System.out.println(" SAlary incremental");

		
	}
}

public class Multiple_interface {
public static void main(String[] args) {
	Trainer1 obj=new Trainer1 ();
	obj.salary();
	
	
}
}
