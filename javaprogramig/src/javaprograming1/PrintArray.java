package javaprograming1;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		String a[]= {"Sanjit","Suman","Shankar","Sachin"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a));
		
		int arr[][]= {{10,20},{30,40}};
		System.out.println(Arrays.deepToString(arr));
		
	}

}
