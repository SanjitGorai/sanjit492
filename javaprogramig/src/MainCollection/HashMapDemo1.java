package MainCollection;

import java.security.KeyStore.Entry;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Set;

import javaprograming.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap m=new HashMap<>();
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "David");
		m.put(105, "Tye");
		
		System.out.println(m);   //{101=John, 102=Scott, 104=mary, 105=Tye}
		
		System.out.println(m.get(102)); //Scott
		
		m.remove(105);
		System.out.println(m);  //{101=John, 102=David, 103=Scott, 104=mary}
		
		
		//Retrive only key
		
		System.out.println(m.keySet());
		
		//Retrive only Value
		
		System.out.println(m.values());
		
		//itarating only key from ForEach Loop
		
		for(Object key:m.keySet()) {
			System.out.println(key);
		}
		
		//itarating only Value from ForEach Loop
		
		for(Object value:m.values()) {
			System.out.println(value);
		}
		
		//using Itaration Method
		
		Set s = m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			  Entry entry =(Entry) it.next();
			
			
			  
		}
		
		
		
		
		
		
		
		
	}

}
