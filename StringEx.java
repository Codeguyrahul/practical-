package String;



public class StringEx {

	public void show() {
		char[]arr= {'j','a','v','a'};
		System.out.println(arr);
		String s= new String(arr);
		System.out.println("value is:"+s);
		
				}
	public void MyFunction() {
		String s1 ="pallabi";
		String s2= new String(s1);
		System.out.println(s2);
		
	}
	public static void main(String []args) {
		StringEx str= new StringEx();
		str.show();
		str.MyFunction();
	}
}
