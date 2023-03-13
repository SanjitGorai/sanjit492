package javaprograming;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
	 	String str="Sanjit";
		String rev ="";
	/*	int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
		 rev=rev+str.charAt(i);	
		} 
		
		//Using Character araay
		char a[] =str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		} */
		
		//using stringbuffer
		StringBuffer sb=new StringBuffer(str);
		 StringBuffer rev1 = sb.reverse();
		
		System.out.println("Reverse String: "+rev1);
		
	}
}
