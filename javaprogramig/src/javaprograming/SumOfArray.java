package javaprograming;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,7,8};
		int sum=0;
		
	/*	for(int i=0;i<=a.length-1;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("sum of array "+sum); 
		
		for(int value:a) 
		{
			System.out.println(value);
		}*/
		Arrays.stream(a).forEach(i->System.out.println(i));
		
	}
}

