package method;

 class StaticMethod {
	int rollno;
	String name;
	float fee;
	static String college="MIT";
	static void change() {
		college="ITC";
	}
	 StaticMethod(int rollno, String name,float fee){
		 this.rollno=rollno;
		 this.fee=fee;
		 this.name=name;
	 }
	 void display() {
		 System.out.println(rollno+" "+name+"fee"+" "+college);
	 }
	 public class StaticMethod1{
		 public static void main(String[] args) {
			StaticMethod.change();
			
			StaticMethod s1=new StaticMethod(102,"ram",3000);
			StaticMethod s2=new StaticMethod(222,"sham",3000);
			s1.display();
			s2.display();
		}
	 }
	

}
