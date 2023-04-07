package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {
	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();
		al.add("Rose");
		al.add("Sunflower");
		al.add("Lily");
		al.add("Daisy");
		al.add("Ritu");
		al.add("hemant");
		al.add("annaya");
		
		
		Collections.sort(al);// sorting method in collection
		System.out.println("Sorting:-");
		for(String name:al) {
			System.out.println(name);
		}
		
		
		String element= al.get(2);
		System.out.println("Get index:"+ element);
		System.out.println("Array List is:"+al.isEmpty());//is empty()
		
		String element1=al.remove(4);
		System.out.println("remove index:"+ element1);
		System.out.println("traversing using for loop");
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
