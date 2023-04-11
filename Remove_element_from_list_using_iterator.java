package CollectionEg;
import java.util.ArrayList;
import java.util.Iterator;
public class Remove_element_from_list_using_iterator {


	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	 // Make a collection

	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
		
	

	
	//The iterator() method can be used to get an Iterator for any collection:
	 // Get the iterator
	Iterator<Integer> it= numbers.iterator();
	 while(it.hasNext()) {
	      Integer i = it.next();
	      if(i <10) {
	        it.remove();
	      }
	    }
	 System.out.println(numbers);
}}
