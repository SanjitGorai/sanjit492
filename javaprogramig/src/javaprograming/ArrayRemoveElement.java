package javaprograming;

public class ArrayRemoveElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int index = 2;
		int[] arr1 = new int[arr.length - 1];
		// System.out.println(arr1.length);
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				arr1[i] = arr[i];
			}
			else if(i>index) {
				arr1[i-1]=arr[i];
			}
		}
		for (int x : arr1) {
			System.out.println(x);
		}

	}

}
