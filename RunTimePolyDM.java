package polymorphism;
//runtime polymorphism not achieved by data member
public class RunTimePolyDM {
	public static void main(String[] args) {
		papa_mamma object;
		object =new children();
		System.out.println(object.Priority);
	}

}
class papa_mamma{ // parent class
	String Priority="High";
}
class children extends papa_mamma{//child class
String Priority="Super_High";
}
