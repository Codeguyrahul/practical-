package CollectionEg;


//Import the ArrayList class and the Iterator class


import java.util.ArrayList;
import java.util.Iterator;

public class All_Iterator_method_in_one_program {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		
		// Make a collection
	al.add("Naruto");
	al.add("Demon Salyer");
	al.add("Blue lock");
	al.add("Death Note");
	
	//The iterator() method can be used to get an Iterator for any collection:
	 // Get the iterator
	Iterator<String> it= al.iterator();

	// Print the first item
	System.out.println(it.next());
	
	
	//To loop through a collection, use the hasNext() and next() methods of the Iterator:
	
	while(it.hasNext()) {
		System.out.println("Anime list:"+it.next());
		
		
	
	      
	}}
	}


