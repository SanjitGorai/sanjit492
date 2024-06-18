package javaprogramaning3;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		String str="prasadssp";
		char ch[]=str.toCharArray();
		HashMap<Character, Integer>dup=new HashMap<>();
		for(char key:ch) {
			if(dup.containsKey(key)) {
				dup.put(key, dup.get(key)+1);
			}else {
				dup.put(key, 1);
			}
		}
		System.out.println(dup);
		for(Map.Entry<Character, Integer>c:dup.entrySet()) {
			if(c.getValue()>=2) {
				System.out.println(c.getKey()+"="+c.getValue());
			}
		}
	}

}
