package javaprograming;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int n,a,arm=0;
		n=sc.nextInt();
		int c=n;
		while(n>0) {
			
			a=n%10;
			arm=(a*a*a)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("it is an arm "+arm);
		}
	}

}
