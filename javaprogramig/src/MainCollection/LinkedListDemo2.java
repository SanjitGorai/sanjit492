package MainCollection;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l=new LinkedList();
		new_l.add(l);
	    System.out.println(new_l);
	    
	  //  new_l.removeAll(l);
	    
	   Collections.sort(l,Collections.reverseOrder());
	   System.out.println(l);
	
	
	
	}

}
