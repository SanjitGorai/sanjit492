package javaprograming1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int n,p,r=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		System.out.println("Enter the power");
		p=sc.nextInt();
		for (int i = 1; i <=p; i++) {
			
			r=r*n;
			
		}
		
		System.out.println(r);
	}

}
