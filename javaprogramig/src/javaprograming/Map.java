package javaprograming;

import java.util.Collections;
import java.util.HashMap;

public class Map {

	

	public static void main(String[] args) {
		
		HashMap h1=new HashMap(); 
		h1.put(1, "Naveen");
		h1.put(1, "Sanjit ");
		h1.put(3, "Pramod");
		h1.put(4, "Ashith");
		h1.put(5, "Naveen");
		
//		System.out.println(h1);
//		System.out.println(h1.size());
//		
//		h1.put(2, "manoj");
//		System.out.println(h1);
//		
//		h1.put(6, "Ashith");
//		System.out.println(h1);
//		System.out.println(h1.size());
//		
//		h1.clear();
//		System.out.println(h1);
//		System.out.println(h1.size());
		
		for(Object ob:h1.values()) {
			System.out.println(ob);
		}
		
		for(Object obj:h1.keySet()) {
			System.out.println(obj);
		}
		
		
	}

}
