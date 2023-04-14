package CollectionEg;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
public static void main(String[] args) {
	Deque<String> dq= new ArrayDeque<String>();
	dq.add("Ram");
	dq.add("Karan");
	dq.add("Ajay");
	dq.add("Shyam");
	dq.add("Madhuri");
	dq.add("Om");
	//dq.add(null);// nut not allowed
	
	System.out.println(dq);
	
	dq.addFirst("Shree");
	dq.addLast("Riya");
	System.out.println("New list:");
	for(String s1:dq) {
		System.out.println(s1);
	}
	
	dq.removeFirst();
	dq.removeLast();
	System.out.println("new list after removal:");
	for(String s2:dq) {
		System.out.println(s2);
	}
	
}
}
