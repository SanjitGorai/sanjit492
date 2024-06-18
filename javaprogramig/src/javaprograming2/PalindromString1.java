package javaprograming2;

import java.util.Scanner;

public class PalindromString1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			rev=str.charAt(i)+rev;
		}if(org_str.equals(rev)) {
			System.out.println("it is a palindrom ");
		}else
			System.out.println("it is not a palindrom ");
	}

}
