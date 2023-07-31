package javaprograming1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nubmer");
		String s= sc.next();
		int p=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			p=(int) Math.pow(Integer.valueOf(String.valueOf(s.charAt(i))),3);
			sum=sum+p;
		}
		if(String.valueOf(sum).equals(s)) {
			System.out.println("Is ArmStrong");
		}else {
			System.out.println("Is not ArmStrong");
		}
	}

}
