package javaprograming2;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int ar[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("eter the value");
		
		
		for (int i = 0; i < ar.length; i++) {
		ar[i]=	sc.nextInt();
			
//			System.out.println(ar[i]);
		}
		for (int i = 0; i < ar.length; i++) {
//			ar[i]=	sc.nextInt();
				
				System.out.println(ar[i]);
			}
	}
	

}
