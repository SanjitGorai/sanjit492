package javaprograming;

import java.util.Iterator;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number");
		int n;
		int count=0;
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is prime");
		}else
			System.out.println("It is Not prime");
	}

}
