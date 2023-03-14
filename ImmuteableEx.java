package String;



public class ImmuteableEx {
public static void main(String[] args) {
	String str="PAllabi";
	str.concat("bhaduri");// insert the string at the end
	str=str.concat("bhaduri");// it will print pallabi bhaduri
	System.out.println(str);// it will print pallabi only because string
}
}
