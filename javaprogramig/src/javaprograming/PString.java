package javaprograming;

import java.util.Scanner;

public class PString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String org_str=str;
		
		String rev="";
		//int len=str.length();
		for(int i=0;i<str.length();i++) {
			
			rev= str.charAt(i)+rev;
		}
		if(org_str.equals(rev)) {
			System.out.println(rev+"  Is a palindrom");
		}
		else {
			System.out.println(rev+" Is not a palindrom");
		}

	}

}
