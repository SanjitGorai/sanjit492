package javaprograming1;

import java.util.Scanner;

public class EvenOdd {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the num");
		int n;
		int sum=0;
		n=sc.nextInt();

		if(n%2==0) {
			for(int i=0;i<=n;i=i+2) {
				sum=sum+i;
			}

		}else{
			for(int i=1;i<=n;i=i+2)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}
