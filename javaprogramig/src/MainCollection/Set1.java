package MainCollection;

import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("Dhoni");
		hs.add("Arun");
		hs.add("Dhoni");
		hs.add("Sanjit");
		hs.add("Ravi");
		hs.add("Virat");

		 System.out.println(hs);
		for(String key:hs) {
			{
				System.out.println(key); 
			}

		}

	}

}
