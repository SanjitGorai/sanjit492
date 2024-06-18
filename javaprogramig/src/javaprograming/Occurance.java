package javaprograming;

import java.util.HashMap;
import java.util.Map;
public class Occurance {

	public static void main(String[] args) {
			String str="sanjitprasadgorai";
			char ch[]=str.toCharArray();
			Map<Character,Integer>dup=new HashMap<>();
			for(Character key:ch) {
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
