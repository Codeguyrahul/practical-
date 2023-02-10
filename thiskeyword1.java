package method;

 class thiskeyword {

int id;
String ename;
double salary;

 thiskeyword(int id ,String ename, double salary){
	 this.id=id;
	 this.salary=salary;
	 this.ename=ename;
	 
 } void display() {
	 System.out.println(id+" "+ename+" "+salary);
 }
 public class thiskeyword1{
	 public static void main(String[] args) {
		 thiskeyword s1=new thiskeyword(101,"rahul",50000);
		 thiskeyword s2=new thiskeyword(102,"radhika",4000);
		 s1.display();
		 s2.display();
		 
	}
 }
 }