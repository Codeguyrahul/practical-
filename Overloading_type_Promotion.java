package cognizant.shapes;

public class Overloading_type_Promotion {
void add(long a,int b) {
	System.out.println(a+b);
}
void add(int a, int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Overloading_type_Promotion obj= new Overloading_type_Promotion ();
	obj.add(2, 3);
	obj.add(10,20,30);
}
}
