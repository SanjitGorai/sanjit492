package javaprograming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int sum;
		int a=sc.nextInt();
		for(int i=1;i<=100;i++) {
			sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+i;				 
				}
			}			
			if(sum==i) {
				System.out.println(i+" is a Prime number");
			}
		}
          
	}

}
