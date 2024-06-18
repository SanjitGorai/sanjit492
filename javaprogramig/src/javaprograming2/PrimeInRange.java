package javaprograming2;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n;
		
		n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int count =0;
			for (int j = 1; j < i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==i) {
				System.out.println(i+ " prime");
			}else
				System.out.println(i +" not prime");
		}
	}

}
