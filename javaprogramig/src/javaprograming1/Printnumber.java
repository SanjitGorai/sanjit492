package javaprograming1;

import java.util.Scanner;

public class Printnumber {

	public  int add(int a,int b) {
		return a+b;
	}

	public int test1(int a,int b,String type) {
		if(type.equalsIgnoreCase("add")) {
			return add(a,b);
		}else {
			return  subtract(a,b);
		}		
	}
	public static int subtract(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		Printnumber obj= new Printnumber();	
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<2) {
			System.out.println("enter the two Value");
			int a=sc.nextInt();	
			int b=sc.nextInt();
			System.out.println("Which operation you want");
			String str=sc.next();
			if(str.equalsIgnoreCase("add")) {
				System.out.println(obj.test1(a, b, str));
			}else if(str.equalsIgnoreCase("subtract")) {
				System.out.println(obj.test1(a, b, str));
			}else   {
				if(i==1) {
					System.out.println("sorry");
				}else {
					System.out.println("try again");
				}			
				i++;
				
			}		
		}
		System.out.println("out of the loop");		
	}

}
