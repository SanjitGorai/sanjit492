package javaprograming;

import java.util.HashMap;
import java.util.Map;

public class Occ {

	public static void main(String[] args) {
			String str="prassad";
			char []ch=str.toCharArray();
			Map<Character, Integer>dup=new HashMap<>();
			for(char key:ch) {
				if(dup.containsKey(key)) {
					dup.put(key, dup.get(key)+1);
				}
				else {
					dup.put(key, 1);
				}
			}
			for(Map.Entry<Character,Integer>entry:dup.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
			}			
	}
}
