package MainCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		int var1 = 5, var2 = 5;

		System.out.println(var1++); //5

		System.out.println(++var2); //6

		System.out.println(var2--); //6
		
		System.out.println(10 + 20 + "interviewjava");  //30interviewjava

		System.out.println("interviewjava" + 10 + 20);  //interviewjava1020
		
		int []a  ={ 0 ,  1 , 2 ,  3 ,  4  ,  5  } ;

		int []a1 ={  4 ,  7 , 8 , 9 , 10 , 1 };  //1,4
		
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a1.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
	
	}

}
