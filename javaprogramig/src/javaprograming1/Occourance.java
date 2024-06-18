package javaprograming1;

import java.util.HashMap;

public class Occourance {

	public static void main(String[] args) {
		String str="my name is sanjit prasad gorai";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
		char ch[]=str1.toCharArray();
		
		HashMap<Character, Integer>dup=new HashMap<>();
		for(char key:ch) {
			if(dup.containsKey(key)) {
				dup.put(key, dup.get(key)+1);
			}else {
				dup.put(key,1);
			}
		}
		System.out.println(dup);
	}

}
