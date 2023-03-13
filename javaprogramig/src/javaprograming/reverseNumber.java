package javaprograming;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int num= sc.nextInt();
		
		//logic 1
	//	int rev=0;
	/*	while(num!=0) 
		{
			rev=rev*10 + num%10;
			num = num/10;
		} 
		
		logic 2
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse(); */
		
		//logic 3
		StringBuilder sbl =new StringBuilder();
		StringBuilder rev = sbl.append(num);
		sbl.reverse();
		System.out.println("Reverse number is :-  "+rev);
	}

}
