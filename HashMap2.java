package CollectionEg;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
public static void main(String[] args) {
	// creating map
	HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(101, "mango");
map.put(102, "orange");
map.put(103, "Banana");
map.put(104, "Chiku");
map.put(null, null);
map.put(105, null);
map.put(106, "Apple");
map.put(109, "Lichi");

//traversing
for(Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());}
	System.out.println("----------------------------------");
	map.putIfAbsent(107, "CustardApple");
	map.putIfAbsent(101, "Watermelon");
	
	for(Map.Entry m: map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	map.remove(105);
	System.out.println(map);
	


}
}

