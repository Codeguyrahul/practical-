package CollectionEg;

import java.util.HashMap;

public class HashMap_2nd {
	public static void main(String[] args) {
		HashMap<String,Integer> hp=new HashMap<String,Integer>();
		
		hp.put("Sujal", 18);
		hp.put("Devki", 31);
		hp.put("komal", 21);
		hp.put("Rahul", 23);
		
		for(String i:hp.keySet()) {
			System.out.println("key:-"+i +" "+"Value:"+hp.get(i));
		}
	}

}
