package method;

public class Example_def_para {
	int a;
	int b;
	Example_def_para(int num1,int num2){
	a=num1;
	b=num2;	 
	 }
	 void show() {
		 int mul=a*b;
		 System.out.println("multiplication of two number:"+ mul);
		 }
	 public static void main(String[] args) {
		 Example_def_para d= new  Example_def_para(30,10);
		
		
		 d.show();
		
	 }
}
