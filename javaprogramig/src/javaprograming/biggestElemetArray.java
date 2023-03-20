package javaprograming;

import java.util.Scanner;

public class biggestElemetArray {

	public static void main(String[] args) {
		int ar[]= {23,45,15,19,28};
		int big=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big) 
				big=ar[i];
			
		}
		System.out.println(big);

	}

}
