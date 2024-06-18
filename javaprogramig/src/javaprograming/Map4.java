package javaprograming;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map4 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h1=new HashMap<>();
		
		h1.put(101, "Dhoni");
		h1.put(102, "Virat");
		h1.put(103, "Sachin");
		h1.put(104, "Gill");
		h1.put(105, "Dhawan");
		
		System.out.println(h1);
		
		for(Map.Entry entry: h1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		}
		
		
	}

