package javaprograming;

import java.util.Scanner;

public class PrimeNumber1 {

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
				System.out.println("It is Prime");
			}else
				System.out.println("It is Not Prime");
	}

}
