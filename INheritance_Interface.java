package Assignment;
interface Parent{
	void show();
}
interface child extends Parent{
	void display();
}
class child1 implements child{
	public void show() {
		System.out.println("parent interface method");
	}
	
	public void display() {
		System.out.println("child interface method");
	}
}
public class INheritance_Interface {
public static void main(String[] args) {
	child1 object =new child1();
	object.display();
	object.show();
}
}
