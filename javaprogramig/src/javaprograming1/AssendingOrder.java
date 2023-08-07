package javaprograming1;

import java.util.Arrays;

public class AssendingOrder {

	public static void main(String[] args) {
		int []a= {14,10,20,30,40};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" , ");
			
		}
		System.out.println();
		System.out.println("-----------------------");
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" , ");
		}
		
	}

}
