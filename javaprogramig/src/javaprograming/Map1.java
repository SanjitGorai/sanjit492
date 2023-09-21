package javaprograming;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> h1=new HashMap<>();
		h1.put(10, "Hello");
		h1.put(2, "Hi");
		h1.put(8, "Bye");
		h1.put(18, "tata");
		
		System.out.println(h1.containsKey(8));
		System.out.println(h1.containsValue("Hi"));
		System.out.println(h1.get(2));
		h1.remove(8);
		System.out.println(h1);

	}

}
