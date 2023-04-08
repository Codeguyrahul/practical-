package CollectionEg;

import java.util.LinkedList;

public class All_linkedlist_method_in_one_program {
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("kamna");
		ll.add("Malti");
		ll.add("Kamini");
		ll.add("Priyanka");
		ll.add("Isha");
		ll.add("Savita bhabhi");
		System.out.println("print all element of LinkedList:"+ll);
		
		 //  add the item to the beginning  ,use addFirst() Method
	   
	    ll.addFirst("Mazda");
	    System.out.println("add new element at the first:"+ll);
	    
	    //Add an item to the end of the list, by using addlast() method
	    ll.addLast("Pinki");
	    System.out.println("add new new at the last of the list:"+ll);
	    
	    //	Remove an item from the beginning of the list. by using removefirst() method
	    ll.removeFirst();
	    System.out.println("Remove an item from the beginning of the list:"+ll);
	    
	    //	Remove an item from the end of the list, by using removeLast() method
	    ll.removeLast();
	    System.out.println("Remove an item from the end of the list:"+ll);
	    
	    //Get the item at the beginning of the list,by using ref.getfirst() method
	    ll.getFirst();
	    System.out.println("Get the item at the beginning of the list"+ll);
	    
	    //	Get the item at the end of the list, by using ref.getlast() method
	    ll.getLast();
	    System.out.println("Get the item at the end of the list"+ll);
				}

}
