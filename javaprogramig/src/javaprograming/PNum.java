package javaprograming;

import java.util.Scanner;

public class PNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		
		int n=sc.nextInt();//121
		int rev=0,temp=n;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
		}
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println(temp +" it is apalindrom");
		}
		else {
			System.out.println(temp+" it is not a palindrom");
		}
	}

}
