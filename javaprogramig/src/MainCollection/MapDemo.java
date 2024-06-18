package MainCollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
			Map<Integer, String> m=new HashMap<>();
			m.put(101, "Virat");
			m.put(102, "Rohit");
			m.put(103, "Gill");
			m.put(104, "Kishan");
			m.put(105, "Dhoni");
			
		/*	System.out.println(m);
			
			for(Object key:m.values()) {
				System.out.println(key);
			}
			for(Object key:m.keySet()) {
				System.out.println(key+" "+m.get(key));
			} */
			
			for(Map.Entry ent:m.entrySet()) {
				System.out.println(ent.getKey()+" "+ent.getValue());
			}
	}

}
