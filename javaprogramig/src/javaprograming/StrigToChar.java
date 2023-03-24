package javaprograming;

import java.util.Scanner;

public class StrigToChar {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char[]c=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.println(c[i]);
		}

	}

}

