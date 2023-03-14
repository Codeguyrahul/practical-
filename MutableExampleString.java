package String;

public class MutableExampleString {
	public static void my() {
		
		// string buffer
	StringBuffer s =new StringBuffer("hello");
	 s.append("world");
	 System.out.println("sting is:"+ s);
	 s.insert(2, "riya");
	 System.out.println("insert is:"+s);
	 s.replace(1, 3,"java");
	 System.out.println("replace is:"+s);
	 System.out.println("capacity is:"+s.capacity());
// string builder
	 
	 StringBuilder s1=new StringBuilder("world");
	 s1.replace(1, 3,"java");
	 System.out.println("replace is:"+s1);
	 s1.delete(1, 3);
	 System.out.println("delete is:"+s1);
	 s1.reverse();
	 System.out.println("reverse is:"+s1);
	 
}
	public static void main(String []args) {
		my();
	}
	}
