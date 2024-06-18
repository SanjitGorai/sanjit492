package MainCollection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(100);
		l.add("welcome");
		l.add(15.4);
		l.add(true);
		l.add(null);
		System.out.println(l);  //[100, welcome, 15.4, true, null]

		System.out.println(l.size());//5

		//remomeElement
		l.remove(null);
		System.out.println(l);  //[100, welcome, 15.4, true]

		//inset new element in 3 position

		l.add(3,"Myelement");
		System.out.println(l);  //[100, welcome, 15.4, Myelement, true]

		//retriving the value
		System.out.println(l.get(1));  //welcome


		//change the nvalue
		l.set(4, "sanjit");
		System.out.println(l); // [100, welcome, 15.4, Myelement, sanjit]

		//contains
		System.out.println(l.contains("sanjit"));  //true

		//Iterating the value in for loop     

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

		//using forEachLoop
		for(Object e:l) {
			System.out.println(e);
		}


		//using Itration Method                 //  100
												//  welcome
		Iterator it=l.iterator();               //  15.4
		while(it.hasNext()) {					//  Myelement
			System.out.println(it.next());		//  sanjit
		}










	}

}
