package CollectionEg;

import java.util.HashSet;

public class HasshSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet();
		hs.add("ram");
		hs.add("rima");
		hs.add("Shyam");
		hs.add("ramesh");
		System.out.println("orginal list:"+hs);
		//removing specific element from hash set
		hs.remove("ram");
		System.out.println("After invoking remove:"+hs);
		
		HashSet<String> set= new HashSet();
		set.add("pallabi");
		set.add("rahul");
		System.out.println("new set:"+set);
		set.addAll(set);
		System.out.println(""+set);
		
	}

}
