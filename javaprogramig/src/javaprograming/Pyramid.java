package javaprograming;

import java.util.Iterator;

public class Pyramid {

	public static int getIndex(String s) {// tittat

		for (int i = 1; i < s.length(); i++) {

			char c = s.charAt(i);
			if ((int) c >= 65 && (int) c <= 90) {
				return i;

			}
		}
		return 0;

	}

	public static void main(String[] args) {
		String s = "TitTat";
		int index=getIndex(s);
		getFinalString(s,index);

	}

	private static void getFinalString(String s, int index) {
		// TODO Auto-generated method stub
		int l=s.length();
		String s1="";
		while(i)
			
			s1=s1+s.charAt(i);
			System.out.print(s1);
			
		
		for (int j = index; j <l; i++) {
			s1=s1+s.charAt(j);
			System.out.print(s1);
		}
		System.out.println();
		}
	}

}
