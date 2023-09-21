package javaprograming;

import java.util.HashMap;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		
		HashMap h1=new HashMap();
		h1.put(1, "naveen");
		h1.put(2, "rakesh");
		h1.put(3, "pramod");
		h1.put(4, "ashith");
		h1.put(5, "praveen");
		
		Set s= h1.keySet();
		for(Object i:s) {
			System.out.println(i);
			
		}
		

	}

}
