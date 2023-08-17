package javaprograming2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			int n;
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("It is a PrimeNumbur");
				
			}else
				System.out.println("It is not a primeNumber");
	}

}
