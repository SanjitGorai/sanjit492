package javaprograming;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int sum;
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+i;
				}
			}
			if(sum==i) {
				System.out.println(i+" is a perfact number");
			}
		}

	}

}
