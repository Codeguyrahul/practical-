package String;


public class Tostring_eg {
 int rollno;
 
 String name,addr;
 Tostring_eg(int rollno, String name,String addr){
	 this.rollno=rollno;
	 this.name=name;
	 this.addr=addr;
	 
 }
 public String toString() {
	return rollno+" "+name+" "+addr;
	 
 }
 
 public static void main(String[] args) {
	 Tostring_eg s1= new Tostring_eg(1,"ram","mumbai");
	 Tostring_eg s2= new Tostring_eg(2,"raman","delhi");
	 System.out.println(s1);
	 System.out.println(s2);
}
}
