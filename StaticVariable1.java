package method;

 class StaticVariable1 {
int rollno;
String name;
float fee;
static String college="SRM";

 StaticVariable1( int rollno,String name,float fee ){
	this.rollno= rollno;
	this.name=name;
	this.fee=fee;
}
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+college);
}
public class StaticVariable{
public static void main(String[] args) {
	StaticVariable1 s1=	new StaticVariable1(111," pallabi",5000);
	StaticVariable1 s2= new StaticVariable1(555,"amit",6000);
	s1.display();
	s2.display();
}

}
}
