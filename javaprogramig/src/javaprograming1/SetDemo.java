package javaprograming1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HasfSet doesn't maintain Order
		Set<String>set=new HashSet<String>();
		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		System.out.println(set);
		
		for(String Hset:set) {
			System.out.println(Hset);
		}
		
		//LinkedList -> It maintain the Order in which the element the added
		Set<String>lHset=new LinkedHashSet<String>();
		System.out.println("Linkedlist");
		lHset.add("BMW");
		lHset.add("Audi");
		lHset.add("Honda");
		for(String Hset:lHset) {
			System.out.println(Hset);
		}
		
		//TreeSet -> It maintain the natural Sorting 1,2,3 Alphabetical
		
		Set<String>tSet=new TreeSet<String>();
		tSet.add("BMW");
		tSet.add("Audi");
		tSet.add("Honda");
		System.out.println("TreeSet");
		for(String Hset:tSet) {
			System.out.println(Hset);
		}
		
		
		List<String>list=new ArrayList<String>();
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		
		System.out.println("ArrayList");
		for(String Hset:list) {
			System.out.println(Hset);
	}
	
	}	

}
