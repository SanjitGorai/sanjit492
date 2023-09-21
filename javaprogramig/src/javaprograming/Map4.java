package javaprograming;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map4 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h1=new HashMap<>();
		h1.put("Rahul", 180);
		h1.put("Virat", 160);
		h1.put("Sachin", 150);
		h1.put("Dhoni", 190);
		h1.put("Raina", 200);
		h1.put("Yuvraj", 230);
		h1.put("Gill", 200);
		
		System.out.println(h1);
		Set<Entry<String, Integer>> s = h1.entrySet();
		
		for(Map.Entry<String, Integer> i:s) {
			System.out.println(i);
		}
		
		
	}
}
