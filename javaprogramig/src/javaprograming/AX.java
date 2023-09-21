package javaprograming;

import java.util.HashMap;

public class AX {

	public static void main(String[] args) {
		int b[]= {1,2,1,1,2,3,40};
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i:b) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
				

	}

}
