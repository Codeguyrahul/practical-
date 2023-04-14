package CollectionEg;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg1 {
	public static void main(String[] args) {
		Deque<String> deque= new ArrayDeque<String>();
		deque.add("pallabi");
		deque.add("subhrajit");
		deque.add("Mamta");
		deque.add("Monami");
		deque.offerFirst("Anju");
		System.out.println("After offer first");
		//traversing
		for(String str:deque) {
			System.out.println(str);
		}
		deque.offerLast("Monalisa");
		System.out.println("After offer last");
		//traversing
		for(String str1:deque) {
			System.out.println(str1);
		}
		//deque.peek & deque.peekfirst same as peek()
System.out.println("peek:"+deque.peek());
System.out.println("peek first:"+deque.peekFirst());
System.out.println("peek last:"+deque.peekLast());
System.out.println("After peek");
for(String str2:deque) {
	System.out.println(str2);
	}
//deque.poll() 
System.out.println("poll:"+deque.poll());
System.out.println("poll first:"+deque.pollFirst());
System.out.println("poll last:"+deque.pollLast());
System.out.println("After poll");
for(String str3:deque) {
	System.out.println(str3);
}
	}

}
