package javaprograming;

import java.util.HashMap;
import java.util.Map;
public class Occurance2 {

	public static void main(String[] args) {
		String str="sanjitprasadsanjit";
		char ch[]=str.toCharArray();
		Map<Character,Integer>dup=new HashMap<>();
		for(char key:ch) {
			if(dup.containsKey(key)) {
				dup.put(key, dup.get(key)+1);
			}
			else {
				dup.put(key, 1);
			}
		}
		System.out.println(dup);
	}

}
