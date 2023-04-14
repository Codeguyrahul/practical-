package CollectionEg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityqueueEg {
	public static void main(String[] args) {
		PriorityQueue<String> queue =new PriorityQueue<String>();
	queue.add("Prakash");
	queue.add("Hanbai");
	queue.add("Sankhajit");
	queue.add("hassan");
	queue.add("bumba");
	queue.add("owashim");
	queue.add("tanmoy");
	
	System.out.println("head:"+queue.element());
	System.out.println("Queue:"+queue);
	System.out.println("head:"+queue.peek());
	System.out.println("Queue:"+queue);
	
	System.out.println("Iterating the elements");
	Iterator itr =queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("head"+queue.poll());
	System.out.println("Queue:"+queue);
	System.out.println("head:"+queue.remove());
	System.out.println("Queue:"+queue);
	
	
	}

}
