package javaprograming;

import java.util.Scanner;

public class PalimdromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you String");
		
		String str=sc.next();
		String org_str=str;
		
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
       if(org_str.equals(rev)) 
       {
    	   System.out.println(org_str+" It is a Palindrom String");
       }
       else {
    	   System.out.println(org_str+" It is not a Palindrom String");
    	   
       }
	}

}
