package MainCollection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("dog");
		l.add("cat");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l);
		
		l.addFirst("Tiger");
		System.out.println(l);
		
		l.addLast("Elephant");
		System.out.println(l);
		
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		
	}

}
