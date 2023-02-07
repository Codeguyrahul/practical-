package method;

public class Parameterized_cons {
	int age;
	String name;
	 Parameterized_cons(int a,String b){
		 age=a;
		 name=b;
		 
	 }
	 void show() {
		 System.out.println(age+" "+name);}
	 public static void main(String[] args) {
		 Parameterized_cons d= new  Parameterized_cons(50,"karan");
		 Parameterized_cons d1= new  Parameterized_cons(25,"rohit");
		 Parameterized_cons d2= new  Parameterized_cons(21,"roma");
		 d.show();
		 d1.show();
		 d2.show();
	 }
}