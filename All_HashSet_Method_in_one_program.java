package CollectionEg;

//A HashSet is a collection of items where every item is unique,
//and it is found in the java.util package:

import java.util.HashSet;
public class All_HashSet_Method_in_one_program {
	public static void main(String[] args) {
		HashSet<String> cars= new HashSet<String>();
		
		
		//add items to it, use the add() method:
		  cars.add("Volvo");
		  cars.add("BMW");
		  cars.add("Ford");
		  cars.add("BMW");
		  cars.add("Mazda");
		  System.out.println(cars);
		  
		  
//	To find out how many items there are, use the size method:
		System.out.println("item :"+cars.size());  
		  
//To check whether an item exists in a HashSet,
//use the contains() method:		 
		  System.out.println("check Ford exists in a HashSet:"+cars.contains("Ford"));
		 
//	Loop through the items of an HashSet with a for-each loop:
		  for (String i : cars) {
			  System.out.println(i);
			}		  
		  
		  
		  
//To remove an item, use the remove() method:
		  cars.remove("Volvo");
		  System.out.println("Ater remove volvo from hashset"+cars);
		  
//To remove all items, use the clear() method:
		  cars.clear();
		  System.out.println("clear list:"+cars);
		  
	}

}
