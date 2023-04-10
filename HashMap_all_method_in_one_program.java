package CollectionEg;

//Import the HashMap class
import java.util.HashMap;

public class HashMap_all_method_in_one_program {
public static void main(String[] args) {
 // Create a HashMap object called capitalCities
 HashMap<String, String> capitalCities = new HashMap<String, String>();

 // Add keys and values (Country, City)
 //add items to it, use the put() method:
 capitalCities.put("England", "London");
 capitalCities.put("Germany", "Berlin");
 capitalCities.put("Norway", "Oslo");
 capitalCities.put("USA", "Washington DC");
 System.out.println("List of item: "+capitalCities);
 
 
 //To access a value in the HashMap, use the get() method and refer to its key
 
 System.out.println(capitalCities.get(/*"Access a value in the HashMap:"+*/"Germany"));
 
 
//To find out how many items there are, use the size() method:
System.out.println("items there are:"+capitalCities.size());

 
//Loop through the items of a HashMap with a for-each loop.
 // Use the keySet() method if you only want the keys, 
 //and use the values() method if you only want the values:

//print keys
for(String i: capitalCities.keySet()) {
	System.out.println("we can get acess the key of list by using 'keyset': "+i);
}


//Print values
for (String i : capitalCities.values()) {
System.out.println("we can get acess the value of list by using 'values':"+i);
}


//Print keys and values
for (String i : capitalCities.keySet()) {
System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
 
 

 //To remove an item, use the remove() method and refer to the key:
 
 capitalCities.remove("USA");
 System.out.println("After Remove an item from HashMap list:"+capitalCities);
}
}
