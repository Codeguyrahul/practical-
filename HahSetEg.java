package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HahSetEg {
	//allowing null value
public static void main(String[] args) {
	Set<String> s= new HashSet<String>();
	s.add("Ac");
	s.add("Pencil");
	s.add("Mouse");
	s.add("Phone");
	s.add(null);//allow all element
	s.add("Ac");
	s.add("Bottle");
	s.add("EarPhone");
	s.add("Pen");
	
	Iterator<String> itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
