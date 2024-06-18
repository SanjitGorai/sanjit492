package MainCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("1");
		al.add("BMW");
		al.add("Audi");
		al.add("Houndai");
		al.add("Suzuki");
		
		System.out.println(al);
		
		
		for(String el:al) {
			System.out.println(el);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}

}
