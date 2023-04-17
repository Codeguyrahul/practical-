package CollectionEg;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {
public static void main(String[] args) {
	// creating map
	HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(101, "mango");
map.put(102, "mango");
map.put(103, "mango");
map.put(104, "mango");
map.put(null, null);
map.put(105, null);
map.put(106, "Apple");
map.put(109, "Lichi");

//traversing
for(Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
}

}
}
