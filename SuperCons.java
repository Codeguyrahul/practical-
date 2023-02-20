package cognizant.shapes;

class Shape2{//parent class
	//constructor of parents class
	Shape2(){
		System.out.println("hello");
		
	}
}
class Size2 extends Shape2{//child class
	Size2(){
		//constructor of the child class
		super();
		//invoke immediate parent class constructor line no?
		System.out.println("hi");
	}
}
public class SuperCons {
public static void main(String[] args) {
	Size2 obj=new Size2();//creating obj of child class
	
}
}
