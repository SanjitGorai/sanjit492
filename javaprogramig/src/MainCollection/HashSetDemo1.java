package MainCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();

		//HashSet<Integer>hs=new HashSet<>();

		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);

		System.out.println(hs);  //[null, A, 100, 16.4, welcome, true]

		hs.remove(16.4);
		System.out.println(hs);  //[null, A, 100, welcome, true]

		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains("xyz"));

		System.out.println(hs.isEmpty());

		//Iterating from ForeachLoop

		for(Object e:hs) {
			System.out.println(e);
		}

		//using Iteratig()
		System.out.println("---------------------------");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
