package cognizant.shapes;

class Shape{
	String name="circle";
}
class Size extends Shape{
	String name="no size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperVi {
public static void main(String[] args) {
	Size obj=new Size();
	obj.print();
}
}
