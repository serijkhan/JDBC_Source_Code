package collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("sameer");
		ll.add(40);
		ll.add(null);
		ll.add("sameer");
		System.out.println(ll);
		
		ll.add(0,"java");
		System.out.println(ll);
		
		ll.set(0, "oracle");
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		ll.addFirst("Sameer");
		System.out.println(ll);
	}

}
