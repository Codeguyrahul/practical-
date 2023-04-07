package CollectionEg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Rose");
	al.add("Sunflower");
	al.add("Lily");
	al.add("Daisy");
	al.add("Marigold");
	al.add("Tulip");
	al.add("Jasmine");
	
	// converting of list to array
	System.out.println("List of array");
	String[] arr = al.toArray(new String[al.size()]);
	for(String s: arr) {// traversing using for each
		System.out.println(s);
	}
	//array to list
	System.out.println("Array to list");
	List<String> all = new ArrayList<String>();
	all=Arrays.asList(arr);//aslist method convert array to list
	System.out.println(all);
}
}
