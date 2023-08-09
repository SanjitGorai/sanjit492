package javaprograming2;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
			int n,r,arm=0;
			
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter The Number");
			n=sc.nextInt();
			int c=n;
			while(n>0) {
				r=n%10;
				arm=(r*r*r)+arm;
				n=n/10;
			}
			if(c==arm) {
				System.out.println("It is an ArmStrong");
			}else
			System.out.println("It is not an ArmStrong");
			
	}

}
