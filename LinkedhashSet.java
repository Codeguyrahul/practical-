package CollectionEg;

import java.util.LinkedHashSet;

public class LinkedhashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("two");
		lhs.add("one");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		
		System.out.println("original list:"+lhs);
		//removing specific element from the above mentioned list
		System.out.println("update list:"+lhs);
		//six is not present
		//return false
		System.out.println(lhs.remove("six"));
		
	}

}
