package javaprograming2;

import java.util.Arrays;

public class AssendingOrderInArray {
	
	public static void main(String[] args) {
		
	
	int []a= {20,50,10,90,80};
	int temp;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) { 
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" , ");
	}
	
	
	
	
}
}