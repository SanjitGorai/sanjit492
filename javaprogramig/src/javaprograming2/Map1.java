package javaprograming2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String>name=new HashMap<>();
		name.put(12, "Rahul");
		name.put(25, "Manoj");
		name.put(40, "Rajeev");
		name.put(20, "Sanjay");
		name.put(50, "Bikash");
		
		System.out.println(name);
	}

}
