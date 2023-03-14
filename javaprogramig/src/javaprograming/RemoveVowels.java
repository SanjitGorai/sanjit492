package javaprograming;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the String");

		String str = sc.nextLine();
		String ms="";
		String v ="AEIOUaeiou";
		for(int i=0;i<str.length();i++) {

			char ch =str.charAt(i);
			if(v.indexOf(ch)==-1) {
				ms=ms+ch;

			}
		}

		System.out.println(ms);
	}

}
