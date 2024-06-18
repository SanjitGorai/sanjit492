package javaprograming2;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		int ar[]= {4,5,6,3,1};
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(ar[ar.length-2]);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
	}

}
