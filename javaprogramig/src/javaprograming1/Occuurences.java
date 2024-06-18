
package javaprograming1;

import java.util.HashMap;
import java.util.Map;

public class Occuurences {
       public static void main(String[] args) {
		String str="sanjitgorai";
		char ch[]=str.toCharArray();
		Map<Character,Integer>dup=new HashMap<>();
		for(char key:ch) {
			if(dup.containsKey(key)) {
				dup.put(key, dup.get(key)+1);
			}else {
				dup.put(key, 1);
			}
		}
		System.out.println(dup);
	}
}
