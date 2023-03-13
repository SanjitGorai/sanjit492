package javaprograming;

import java.util.Scanner;

public class PalindromString1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		 String str = sc.nextLine();
		 String org_str = str;
		 String rev="";
		 
		 for(int i=0;i<org_str.length();i++) 
		 {
			 rev=org_str.charAt(i)+rev;
		 }
		 
		 
		 if(org_str.equals(rev)) {
			 System.out.println(rev+"  is a palindrom");
			 
		 }
		 else {
			System.out.println(rev+"  is not a palindrom");
		}
	}

}
