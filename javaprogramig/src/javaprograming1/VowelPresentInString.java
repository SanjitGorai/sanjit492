package javaprograming1;

import java.util.Scanner;

public class VowelPresentInString {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter String");
//		String str= sc.nextLine();
		String str="sanjitgorai";
		int count =0;
		String v ="AEIOUaeiou";
		for(int i=0;i<str.length();i++ ){
			char ch=str.charAt(i);

			if(v.indexOf(ch)>=0) {
				count++;
			}

		}
		System.out.println(count);
	}

}




