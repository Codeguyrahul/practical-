package Exception_handling.Exception_handling;

public class Throws_with_con {
	String name;
	int age;
	 public  Throws_with_con(String name, int age)throws Exception{
		 if(age < 18) {
		 throw new Exception("Age should be more than 18");
		 
	 }
	 this.name = name;
	 this.age= age;
	 

}
public static void main(String args[]) throws Exception{
	Throws_with_con obj = new Throws_with_con("Pallabi",25);
	System.out.println(obj.name+" "+obj.age);
}}
